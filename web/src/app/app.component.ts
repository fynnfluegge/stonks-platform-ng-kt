import { Component } from '@angular/core';
import { Router } from '@angular/router';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html'
})
export class AppComponent {
  title = 'stonk-platform'
  showFiller = false
  viewmode = "list"

  constructor(private router: Router){
  }

  showList() {
    this.viewmode = "list"
    let segments = this.router.url.split('/')
    this.router.navigate(['list/' + segments[segments.length-1]])
  }

  showCards() {
    this.viewmode = "cards"
    let segments = this.router.url.split('/')
    this.router.navigate(['cards/' + segments[segments.length-1]])
  }

  showHeatmap() {
    this.viewmode = "heatmap"
    let segments = this.router.url.split('/')
    this.router.navigate(['heatmap/' + segments[segments.length-1]])
  }
}
