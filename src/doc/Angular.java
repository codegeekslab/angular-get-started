package doc;
/*Angular

TypeScript is a typed superset of JavaScript that compiles to plain JavaScript. TypeScript is pure object oriented with classes, interfaces and statically typed like C#

TypeScript can help programmers to write object-oriented programs and have them compiled to JavaScript, both on server side and client side.

its failure to embrace the features of Object Orientation, strong type checking and compile-time error checks prevents JavaScript from succeeding at the enterprise level as a full-fledged server-side technology. TypeScript was presented to bridge this gap.

What is TypeScript?
By definition, “TypeScript is JavaScript for application-scale development.”

TypeScript is a strongly typed, object oriented, compiled language. It was designed by Anders Hejlsberg (designer of C#) at Microsoft. TypeScript is both a language and a set of tools.
TypeScript is a typed superset of JavaScript compiled to JavaScript. In other words, TypeScript is JavaScript plus some additional features.

part 1
1.src/main.ts (Bootsrap Main entry point)
	For starting point of your application  we use a bootstrapper. You can find the bootstrapping logic in the src/main.ts module.
	In this file we are setting up environment and importing app.module (which contains various modules and component)
2.app.module.ts (Module)
	Angular 2 modules and the new @NgModule decorator let us declare in one place all the dependencies and components of our application
	
	The NgModule decorator takes an object with the following information:
	
		-an imports array where you declare your module dependencies, for instance, browser, forms, routing or http. 
		-The BrowserModule used above contains all the dependencies necessary to run Angular 2 on a browser.
		-a declarations array where you declare the components and directives that belong to the current module.
		-a bootstrap array that identifies the root component that Angular 2 should use to bootstrap your application.
	
	In this example we import an AppComponent component from the app.component.ts module and set it as the root of our application.
3.app.component (Component)
	The component is the core building block of Angular 2 applications. It represents a reusable piece of UI that is usually depicted by a custom html element.
    A component is self contained and is constituted by at least a piece of html code that is known as template, 
    a class that encapsulates the data and interactions available to that template, and the aforementioned html element also known selector.
    It has an AppComponent class that is decorated by some metadata in the form a TypeScript decorator @Component which binds the class to its template,
    its styles and the app-root selector (Can you remember the <app-root> element from the index.html file?).

	This metadata tells Angular 2 that whenever you see an <app-root> html element you should render the template in templateUrl, with the styles in stylesUrls and in the context of the AppComponent class.

--ES6 brought classes to JavaScript amongst a host of other features.

***Start of app building***

  part 2
 Building of component
  1.Build a domail model
   -ng generate interface person ->This will create a modal "person.ts" in which we put atrributes like name weight hieght.
  2.creating a Component
  	- ng generate component --inline-template people-list This will generate a new folder people-list and will place a TypeScript and a style files within that folder
  	-new components will be prefixed with the app prefix
  	-now we’ve got a component that we can render using the <app-people-list>
  	-*ngFor for for loop
  	-Now we can update our AppComponent to display the list of StarWars people. We only need to update the app.component.html with <app-people-list></app-people-list>
  3 Including component in module
   -Indeed, in order to be able to use a component within another component you need to make your application aware of it. You can do that in the app.module.ts file, that is, in your Angular 2 module,
    Angular CLI has wired it up for you and saves you the need from remembering to do it yourself.
   part 2 (Moving logic to service)
   1.Creating a Service
    -ng generate service people it will create an empty service people.service.ts
    -extract the data access code from our PeopleListComponent into service-now service return the data from pojo
   2 Injecting(DI) from service into component
    - constructor(private peopleService: PeopleService) does the dependency injection
    --Next register your service to component- to make the PeopleService available throughout our app we can register it within the AppComponent component (providers: [PeopleService],) in app.component.ts
 part 3
 	1.The (click)="selectPerson(person)" event binding tells Angular 2 to call the selectPerson component method in people-list.componenet whenever a user clicks on the a element.
 	2.ngIf binding and selectedPerson.name is used in section to display user details.
 	3.Break into two components
 	4.ng g c -it -is person-details -->creates a person-details component  
 	5.now we have a component that represents person details and that we can reuse and compose with other components in our application. 
 	6.But how can we send in data so that person property gets some person to display? Or in other words, how can we bind a person to this component?We use the Angular 2 Input decorator:   
    7.import { Component, Input } from '@angular/core' and @Input() person: Person This will mark the person property as an input to the PersonDetailsComponent and will allow other components to send a person into the component.
     How? By using Angular 2 property bindings like this:
    <app-person-details [person]="selectedPerson"></app-person-details> and we can use this tag in PeopleListComponent 
 part 4
    
    
   
    
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

*/