function displayTime (){
var dateTime= new Date();
var hrs = dateTime.getHours();
var mins = dateTime.getMinutes();
var secs = dateTime.getSeconds();
var Session = document.getElementById('Session');

// if (hrs >12){
//     hrs= hrs -12;
// }

if (hrs>12) {
    Session.innerHTML='PM'
} else {
    Session.innerHTML='AM'
}

document.getElementById('Stunde').innerHTML=hrs
document.getElementById('Minute').innerHTML=mins
document.getElementById('Sekunde').innerHTML=secs
}

setInterval(displayTime,10);
