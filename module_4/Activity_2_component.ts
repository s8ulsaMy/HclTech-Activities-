import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html'
})
export class AppComponent {

  today = new Date();

  price = 1234.5;

  text = "Angular Pipes Example";

  num = 3.141592;

  percentValue = 0.75;

}
