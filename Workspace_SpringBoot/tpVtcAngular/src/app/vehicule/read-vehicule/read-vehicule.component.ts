import { Component, OnInit } from '@angular/core';
import { Vehicule } from 'src/app/model/vehicule';
import { VehiculeService } from 'src/app/service/vehicule.service';

@Component({
  selector: 'app-read-vehicule',
  templateUrl: './read-vehicule.component.html',
  styleUrls: ['./read-vehicule.component.css']
})
export class ReadVehiculeComponent implements OnInit {

  allVehicules!: Vehicule[];

  constructor(private serviceVehi: VehiculeService) { }

  ngOnInit(): void {

    this.serviceVehi.listeAllVehicules().subscribe(
      data => {
        console.log(data);
        this.allVehicules = data;
      }
    );
  }

}
