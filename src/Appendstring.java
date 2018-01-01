
public class Appendstring {

	public void appendMethod(String s1, String s2) {
		String s3 = s1 + s2;
		System.out.println(s3);
		
	}

public static void main(String args[]) {
	Appendstring as = new Appendstring();
	as.appendMethod("Hello","World");
}
}
