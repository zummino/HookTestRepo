import { Component, OnInit, OnDestroy, Input,  Output, EventEmitter } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { AppService } from '../app.service';
import { takeUntil } from 'rxjs/operators';
import { Subject } from 'rxjs';


@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(private appService: AppService) { }

  users: any[] = [];
  destroy$: Subject<boolean> = new Subject<boolean>();
  @Input() userCount = 0;
  @Output() getUsersEvent = new EventEmitter();


ngOnInit() {
	this.getAllUsers();
  }
  
  
   getAllUsers() {
    this.appService.getUsers().pipe(takeUntil(this.destroy$)).subscribe((users: any[]) => {
		this.userCount = users.length;
        this.users = users;
		this.getUsersEvent.emit('get all users');
    });
  }
  
  
   ngOnDestroy() {
    this.destroy$.next(true);
    this.destroy$.unsubscribe();
  }


}
