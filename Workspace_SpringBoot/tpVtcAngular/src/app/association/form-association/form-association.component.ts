import { Component, OnInit } from '@angular/core';
import { Association } from 'src/app/model/association';
import { Conducteur } from 'src/app/model/conducteur';
import { Vehicule } from 'src/app/model/vehicule';
import { AssociationService } from 'src/app/service/association.service';

@Component({
  selector: 'app-form-association',
  templateUrl: './form-association.component.html',
  styleUrls: ['./form-association.component.css']
})
export class FormAssociationComponent implements OnInit {

  assocAAjouter = new Association();
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
  onSubmit(): void {
    this.serviceAssoc.createAssociation(this.assocAAjouter).subscribe(
      data => {
        console.log(data);
        this.assocAAjouter = new Association();
      }
    );
  }

}
