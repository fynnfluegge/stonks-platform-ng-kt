import { trigger, state, style, transition, animate } from '@angular/animations';

export const TableAnimations = {
  animations: [
    trigger('cellValueChangedAnimation', [

      transition(':increment', [
        animate('1s cubic-bezier(0.35, 0, 0.25, 1)', style({color: '#39FF14'})),
        animate('1s cubic-bezier(0.35, 0, 0.25, 1)', style({color: 'black'}))
      ]),

      transition(':decrement', [
        animate('1s cubic-bezier(0.35, 0, 0.25, 1)', style({color: '#f7022a'})),
        animate('1s cubic-bezier(0.35, 0, 0.25, 1)', style({color: 'black'}))
      ])
    ]),
  ]
};
