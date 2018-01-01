package com.visam.training.day4;


public class Test {
public static void main (String args[])
{
	Employe e1 = new Employe();
	e1.hello();
	
	Accountant a = new Accountant();
	a.hello();
	a.run();
	a.doSomething();
	
	Employe e = new Accountant(); //UpCasting (By default)
	e.hello();
	e.run();
	
	((Accountant) e).doSomething(); //DownCasting
	
}
}
