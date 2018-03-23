window.onload = function() {
  document.getElementById('enter').onclick = function(){
    year = new fullYear(prompt("Enter a year"));
    document.getElementById('number-of-days').innerHTML += year.numberOfDays;
    document.getElementById('year').innerHTML=year.name;
    var calendar = document.getElementById('calendar');
    for( month in year.months ) {
      monthDiv = document.createElement('div');
      monthDiv.setAttribute('class', 'monthDiv');
      calendar.appendChild(monthDiv);
      monthName = document.createTextNode(year.months[month].name);
      monthHeader = document.createElement('div');
      monthHeader.innerHTML=daysOfWeek;
      monthHeader.setAttribute('class', 'monthHeader')
      monthDiv.appendChild(monthName);
      monthDiv.appendChild(monthHeader);
      firstDay = year.months[month].firstDay;
      firstWeek = year.months[month].days.splice(0, (7 - firstDay));
      if(firstWeek.length != 0){
        firstWeekDiv = document.createElement('div');
        firstWeekDiv.setAttribute('class', 'firstWeekDiv');
        firstWeek.forEach(function(day){
          firstWeekDayDiv = document.createElement('div');  
          firstWeekDayDiv.setAttribute('class', 'firstWeekDayDiv');
          firstWeekDayDiv.innerHTML=day;
          firstWeekDiv.appendChild(firstWeekDayDiv);
        });
        monthDiv.appendChild(firstWeekDiv);
      }
      do {
        weekDiv = document.createElement('div');
        weekDiv.setAttribute('class', 'weekDiv');
        thisWeek = year.months[month].days.splice(0, 7);
        if(thisWeek.length > 0) {
          thisWeek.forEach(function(day){
            weekDayDiv = document.createElement('div')
            weekDayDiv.setAttribute('class', 'weekDayDiv');
            weekDayDiv.innerHTML=day;
            weekDiv.appendChild(weekDayDiv)
          });
          monthDiv.appendChild(weekDiv);
        }
      }
      while (thisWeek.length > 0);
    }
  }
}

function createDays(numberOfDays){
  array = [];
  for(var i = 1; i <= numberOfDays; i++){
    array.push(i);
  }
  return array;
}

var daysOfWeek = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];
daysOfWeek = daysOfWeek.join(' ')
// Date object representing the first day of the year in question
var firstOfYear = new Date(year.name, 0); 
// "Saturday" or whatever
var firstDayOfYear = daysOfWeek[firstOfYear.getDay()];
function fullYear(name) { 
  this.name = name;
  this.isLeapYear = (this.name % 100 === 0) ? (this.name % 400 === 0) : (this.name % 4 === 0);
  this.numberOfDays = this.isLeapYear ? 366 : 365;
  this.firstDay = new Date(name, 0).getDay();
  //firstDay = integer from 0 - 6
  this.days = [];
  counter = 1
  for(i=0; i<= (this.numberOfDays - 1); i++){
    this.days[i] = counter;
    counter ++;
  }
  this.months = {
    january: { name: 'January', days: createDays(31), firstDay: new Date(name, 0).getDay() },
    febuary: {name: 'February', days: createDays(this.isLeapYear ? 29 : 28), firstDay: new Date(name, 1).getDay()},
    march: {name: 'March', days: createDays(31), firstDay: new Date(name, 2).getDay()},
    april: {name: 'April', days: createDays(30), firstDay: new Date(name, 3).getDay()},
    may: {name: 'May', days: createDays(31), firstDay: new Date(name, 4).getDay()},
    june: {name: 'June', days: createDays(30), firstDay: new Date(name, 5).getDay()},
    july: {name: 'July', days: createDays(31), firstDay: new Date(name, 6).getDay()},
    august: {name: 'August', days: createDays(31), firstDay: new Date(name, 7).getDay()},
    september: {name: 'September', days: createDays(30), firstDay: new Date(name, 8).getDay()},
    october: {name: 'October', days: createDays(31), firstDay: new Date(name, 9).getDay()},
    november: {name: 'November', days: createDays(30), firstDay: new Date(name, 10).getDay()},
    december: {name: 'December', days: createDays(31), firstDay: new Date(name, 11).getDay()}
  }
}
