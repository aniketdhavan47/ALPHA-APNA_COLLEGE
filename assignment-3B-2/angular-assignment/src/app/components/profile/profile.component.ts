import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/services/auth.service';
import { HttpService } from 'src/app/services/http.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css'],
})
export class ProfileComponent implements OnInit {
  userData: any;
  constructor(
    private router: Router,
    private authService: AuthService,
    private httpService: HttpService
  ) {
    // this.userData = this.authService.getProfile();
    if (!this.httpService.getLocalData) {
      this.router.navigate(['login']);
    } else {
      this.userData = this.httpService.getLocalData();
    }
  }

  ngOnInit(): void {}

  logout() {
    if (this.httpService.logout()) {
      alert('Logout Successfully');
      this.router.navigate(['login']);
    }
  }
}
