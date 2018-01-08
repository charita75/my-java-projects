package com.visam.training.day2;

public class IsPrime {
public boolean checkPrime(int n) {
	for (int i=2; i<n-1; i++) 
	{
		if (n%i == 0) {
			return false;
		}
	}
	return true;
}

public static void main(String args[]) {
	IsPrime ip = new IsPrime();
	System.out.println(ip.checkPrime(4));
}
}
