import { Component } from '@angular/core';

@Component({
  selector: 'app-budget-page',
  templateUrl: './budget-page.component.html',
  styleUrls: ['./budget-page.component.scss']
})
export class BudgetPageComponent {

  title : any ;
  price : any ;

  ft : any = [];
  fp : any = [];

  Finalincome:any =0 ;
  income:any;

  addexp(t:any,p:any){
    this.ft.push(t) ;
    this.fp.push(p) ;

    if(this.Finalincome>0)
    {
      alert("Expense Added ..");
      this.Finalincome = this.Finalincome-p ;
      this.title = "";
      this.price = "";
    }
    else if(this.price>0){
      this.Finalincome = 0 ;
      alert("Your Expenses are Increse Please Manage it ...");
    }
    else{
      alert("Please Add some Expense");
    }


  }

  addincome(num:any){
    this.Finalincome = num ;
    this.income = "";
  }
}
