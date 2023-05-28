import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class HttpService {
  apiUrl: string = 'http://localhost:3000/api/';
  // Http Options
  httpHeader = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' }),
  };
  constructor(private http: HttpClient) {}

  register(registerdata: any) {
    return this.http.post(
      this.apiUrl + 'register',
      registerdata,
      this.httpHeader
    );
  }

  login(logindata: any) {
    return this.http.post(this.apiUrl + 'login', logindata, this.httpHeader);
  }

  localStore(data: any) {
    localStorage.setItem('user', JSON.stringify(data));
    return true;
  }

  getLocalData() {
    if (localStorage.getItem('user')) {
      let localData = JSON.parse(localStorage.getItem('user') || '');
      return localData;
    } else {
      return false;
    }
  }

  logout() {
    localStorage.removeItem('user');
    return true;
  }
}
