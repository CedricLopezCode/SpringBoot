import { Component, OnInit } from '@angular/core';
import { Conducteur } from 'src/app/model/conducteur';
import { ConducteurService } from 'src/app/service/conducteur.service';

@Component({
  selector: 'app-form-modif-cond',
  templateUrl: './form-modif-cond.component.html',
  styleUrls: ['./form-modif-cond.component.css']
})
export class FormModifCondComponent implements OnInit {

  CondAModifier!: Conducteur

  constructor(private serviceCond: ConducteurService) { }

  ngOnInit(): void {

    this.serviceCond.recupCondAModif(1).subscribe(
      data =>{
        console.log(data);
        this.CondAModifier = data;
      }
    );

  }

}
