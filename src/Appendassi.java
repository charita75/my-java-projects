//import java.lang.StringBuffer;
public class Appendassi {
public static void main (String args[]) {
	String s1 = "Hello";
	String s2 = "World";

	//StringBuffer s3;
	StringBuilder s3;
		
	//StringBuffer sbuff = new StringBuffer();
	StringBuilder sbuff = new StringBuilder();
	//Appendassi sbuff = new Appendassi();
	
	s3 = sbuff.append(s1).append(s2);
	System.out.println(s3);
}
}
