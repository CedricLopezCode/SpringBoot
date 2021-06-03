import { Component, OnInit } from '@angular/core';
import { Vehicule } from 'src/app/model/vehicule';
import { AssociationService } from 'src/app/service/association.service';

@Component({
  selector: 'app-liste-vehiss-cond',
  templateUrl: './liste-vehiss-cond.component.html',
  styleUrls: ['./liste-vehiss-cond.component.css']
})
export class ListeVehissCondComponent implements OnInit {

  listeVehissCond!: Vehicule[];

  constructor(private assocService : AssociationService) { }

  ngOnInit(): void {
    this.assocService.listeVehiculeSansConducteur().subscribe(
      data => {this.listeVehissCond = data;}
    );
  }
}
