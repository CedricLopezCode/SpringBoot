import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-vehicule',
  templateUrl: './vehicule.component.html',
  styleUrls: ['./vehicule.component.css']
})
export class VehiculeComponent implements OnInit {

  modifVehiEnCours = false;
  
  constructor() { }

  ngOnInit(): void {
  }

}
