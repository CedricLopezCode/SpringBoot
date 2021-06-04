import { Component, OnInit } from '@angular/core';
import { Conducteur } from 'src/app/model/conducteur';
import { Vehicule } from 'src/app/model/vehicule';
import { AssociationService } from 'src/app/service/association.service';

@Component({
  selector: 'app-form-modif-association',
  templateUrl: './form-modif-association.component.html',
  styleUrls: ['./form-modif-association.component.css']
})
export class FormModifAssociationComponent implements OnInit {

  listeCondSansVehi!: Conducteur[];
  listeVehiSansCond!: Vehicule[];

  constructor(private serviceAssoc: AssociationService) { }

  ngOnInit(): void {
    this.serviceAssoc.listeConducteursSansVehicule().subscribe(
      data => {this.listeCondSansVehi = data;}
    );
    this.serviceAssoc.listeVehiculeSansConducteur().subscribe(
      data => {this.listeVehiSansCond = data;}
    );
  }
}
