import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Conducteur } from 'src/app/model/conducteur';
import { ConducteurService } from 'src/app/service/conducteur.service';

@Component({
  selector: 'app-read-cond',
  templateUrl: './read-cond.component.html',
  styleUrls: ['./read-cond.component.css']
})
export class ReadCondComponent implements OnInit {

  allConducteurs!: Conducteur[];

  constructor(private serviceCond: ConducteurService, private router: Router) { }

  ngOnInit(): void {
    
    this.serviceCond.listeAllConducteurs().subscribe(
      data => {
        console.log(data);
        this.allConducteurs = data;
      }
    );
  }
  updateCond(id: number, value: any): void{
    this.router.navigate(['recupCondAModif', id]);
   // console.log(id);
  }

}
