import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { PeopleService } from './people.service'
import { AppRoutingModule } from './app-routing.module'


import { AppComponent } from './app.component';
import { PeopleListComponent } from './people-list/people-list.component';
import { PersonDetailsComponent } from './person-details/person-details.component';

 
@NgModule({
  declarations: [
    AppComponent,
    PeopleListComponent,
    PersonDetailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [PeopleService],
  bootstrap: [AppComponent]
})
export class AppModule { }
