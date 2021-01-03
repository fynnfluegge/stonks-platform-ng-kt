import { trigger, state, style, transition, animate } from '@angular/animations';

export const TableAnimations = {
  animations: [
    trigger('cellValueChangedAnimation', [

      transition(':increment', [
        animate('1s cubic-bezier(0.35, 0, 0.25, 1)', style({color: '#39FF14'})),
      ]),

      transition(':decrement', [
        animate('1s cubic-bezier(0.35, 0, 0.25, 1)', style({color: '#f7022a'}))
      ])
    ]),
    trigger('cellValueFadeoutIncrementAnimation', [

      state('false', style({color: 'black'})),
      state('true', style({color: '#39FF14'})),

      transition('true => false', [
        animate('1s cubic-bezier(0.35, 0, 0.25, 1)', style({color: 'black'})),
      ])
    ]),
    trigger('cellValueFadeoutDecrementAnimation', [

      state('false', style({color: 'black'})),
      state('true', style({color: '#f7022a'})),

      transition('true => false', [
        animate('1s cubic-bezier(0.35, 0, 0.25, 1)', style({color: 'black'})),
      ])
    ])
  ]
};
