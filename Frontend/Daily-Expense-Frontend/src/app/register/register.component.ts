import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss'],
})
export class RegisterComponent {

  userName : string = "";
  userEmail : string = "";
  userPassword : string = "";

  route: string | undefined;

  constructor(private router: Router , private http: HttpClient) {
    this.route = router.url;
  }

  backLogin() {
    this.router.navigate(['/']);
  }

  save()
  {

    if(this.userName === "" || this.userEmail ==="" || this.userPassword ==="")
    {
      alert("Please Enter Valid Input !!");
    }
    else{
      let bodyData = {
        "userName" : this.userName,
        "userEmail" : this.userEmail,
        "userPassword" : this.userPassword
      };
      this.http.post("http://localhost:8080/api/v1/users/saveusers",bodyData,{responseType: 'text'}).subscribe((resultData: any)=>
      {
          console.log(resultData);
          alert("User Registered Successfully");
          //this.router.navigateByUrl('/home');
          this.userName = "";
          this.userEmail = "";
          this.userPassword = "";
          this.router.navigate(['/dashboard'],{queryParams:{name:resultData}});
      });
    }

  }
}
