import { Component, OnInit } from '@angular/core';
import { Conducteur } from 'src/app/model/conducteur';
import { ConducteurService } from 'src/app/service/conducteur.service';

@Component({
  selector: 'app-mono-form',
  templateUrl: './mono-form.component.html',
  styleUrls: ['./mono-form.component.css']
})
export class MonoFormComponent implements OnInit {

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
