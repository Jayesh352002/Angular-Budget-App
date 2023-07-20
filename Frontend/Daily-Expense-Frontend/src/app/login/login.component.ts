import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss'],
})
export class LoginComponent {

  userEmail : string = "";
  userPassword : string = "";

  route: string | undefined;
  constructor(private router: Router,private http: HttpClient )
  {
    this.route = router.url;
  }

  login()
  {
    if(this.userEmail === "" || this.userPassword=== ""){
      alert("Please Enter Valid Input !!");
    }

    else{
      let bodyData = {
        "userEmail": this.userEmail,
        "userPassword": this.userPassword,
      };

      this.http.post("http://localhost:8080/api/v1/users/loginusers",bodyData,{responseType: 'text'}).subscribe((resultData: any)=>
      {
        console.log(resultData);
        if (resultData == "Email Does Not Exists")
        {
          alert("Email not exits");
          this.userEmail = "";
          this.userPassword = "";

        }
        else if(resultData == "Login Success")
        {
          alert("Login Successfull");
          this.router.navigate(['/dashboard']);
          this.userEmail = "";
          this.userPassword = "";
        }
        else
        {
          alert("Incorrect Email and Password not match");
          this.userEmail = "";
          this.userPassword = "";

        }
      });
    }
  }
}
