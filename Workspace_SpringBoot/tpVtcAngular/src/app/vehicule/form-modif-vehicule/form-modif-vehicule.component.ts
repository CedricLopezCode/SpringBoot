import { Component, OnInit } from '@angular/core';
import { Vehicule } from 'src/app/model/vehicule';
import { VehiculeService } from 'src/app/service/vehicule.service';

@Component({
  selector: 'app-form-modif-vehicule',
  templateUrl: './form-modif-vehicule.component.html',
  styleUrls: ['./form-modif-vehicule.component.css']
})
export class FormModifVehiculeComponent implements OnInit {

  vehiAModif!: Vehicule;

  constructor(private servVehi: VehiculeService) { }

  ngOnInit(): void {

    this.servVehi.recupVehiculeAModifier(2).subscribe(
      data => {this.vehiAModif = data;}
    );
  }

}
