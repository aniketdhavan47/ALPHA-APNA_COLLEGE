import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/services/auth.service';
import { HttpService } from 'src/app/services/http.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent implements OnInit {
  constructor(
    private router: Router,
    private authService: AuthService,
    private httpService: HttpService
  ) {}

  ngOnInit(): void {}

  login(formData: any) {
    // local service
    // if (this.authService.loginUser(formData.value)) {
    //   alert('Login Successful');
    //   this.router.navigate(['profile']);
    // } else {
    //   alert('Login Failed');
    // }

    //httpService
    this.httpService.login(formData.value).subscribe((res: any) => {
      if (res['success']) {
        this.httpService.localStore(res['data']);
        alert('Login Successful');
        this.router.navigate(['profile']);
      } else {
        alert('Login Failed');
      }
    });
  }
}
