function Figura(kolor,pozycja){
	this.kolor=kolor;
	this.pozycja=pozycja;
}
Figura.prototype.przesun=function(nowaPozycja){
	this.pozycja=nowaPozycja;
}

"Krolowa"
function Krolowa(kolor,pozycja){
	Figura.call(this,kolor,pozycja);
}
Krolowa.prototype = Object.create(Figura.prototype);
Krolowa.prototype.constructor = Krol;

var f=new Krolowa("czarny","D7");
alert(f.kolor);

"Goniec"
function Goniec(kolor,pozycja){
	Figura.call(this,kolor,pozycja);
}
Goniec.prototype = Object.create(Figura.prototype);
Goniec.prototype.constructor = Goniec;

var f=new Goniec("biały","D7");
alert(f.kolor);

"Krol"
function Krol(kolor,pozycja){
	Figura.call(this,kolor,pozycja);
}
Krol.prototype = Object.create(Figura.prototype);
Krol.prototype.constructor = Krol;

var f=new Krol("czarny","D7");
alert(f.kolor);
