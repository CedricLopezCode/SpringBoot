import { Component, OnInit } from '@angular/core';
import { Vehicule } from 'src/app/model/vehicule';
import { VehiculeService } from 'src/app/service/vehicule.service';

@Component({
  selector: 'app-form-vehicule',
  templateUrl: './form-vehicule.component.html',
  styleUrls: ['./form-vehicule.component.css']
})
export class FormVehiculeComponent implements OnInit {

  vehiculeAAjouter: Vehicule = new Vehicule();

  constructor(private vehiService: VehiculeService) { }

  ngOnInit(): void {
  }

  onSubmit(): void{
    this.vehiService.createVehicule(this.vehiculeAAjouter).subscribe(
      data => {
        console.log(data);
        this.vehiculeAAjouter= new Vehicule();
        window.location.reload();
      }
    );
  }

}
