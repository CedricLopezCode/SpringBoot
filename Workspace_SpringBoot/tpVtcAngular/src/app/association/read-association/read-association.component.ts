import { Component, OnInit } from '@angular/core';
import { Association } from 'src/app/model/association';
import { AssociationService } from 'src/app/service/association.service';

@Component({
  selector: 'app-read-association',
  templateUrl: './read-association.component.html',
  styleUrls: ['./read-association.component.css']
})
export class ReadAssociationComponent implements OnInit {

  constructor(private servAssoc: AssociationService) { }
  
  allAssociations!: Association[];

  ngOnInit(): void {
    this.servAssoc.listeAllAssociations().subscribe(
      data => {this.allAssociations = data;}
    );
  }

}
