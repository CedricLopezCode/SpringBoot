import { Component, OnInit } from '@angular/core';
import { Conducteur } from 'src/app/model/conducteur';
import { ConducteurService } from 'src/app/service/conducteur.service';

@Component({
  selector: 'app-form-cond',
  templateUrl: './form-cond.component.html',
  styleUrls: ['./form-cond.component.css']
})
export class FormCondComponent implements OnInit {

  condAAjouter = new Conducteur();

  constructor(private serviCond: ConducteurService) { }

  ngOnInit(): void {
  }

  onSubmit(): void{
    this.serviCond.createConducteur(this.condAAjouter).subscribe(
      data => {
        console.log(data);
        this.condAAjouter = new Conducteur();
        window.location.reload();
      }
    );
  }

}
