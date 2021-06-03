import { Component, OnInit } from '@angular/core';
import { Conducteur } from 'src/app/model/conducteur';
import { AssociationService } from 'src/app/service/association.service';

@Component({
  selector: 'app-liste-condss-vehi',
  templateUrl: './liste-condss-vehi.component.html',
  styleUrls: ['./liste-condss-vehi.component.css']
})
export class ListeCondssVehiComponent implements OnInit {

  listeCondssVehi!: Conducteur[];

  constructor(private servAssoc: AssociationService) { }

  ngOnInit(): void {
    this.servAssoc.listeConducteursSansVehicule().subscribe(
      data => {this.listeCondssVehi = data;}
    );
  }

}
