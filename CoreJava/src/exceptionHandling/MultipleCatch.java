package exceptionHandling;

public class MultipleCatch {
	public static void main(String[] args) {
		// String name = "Trapti";
		String name = null;
		try {
			System.out.println("Length of name is  " + name.length());
			System.out.println("Character at 7th position is " + name.charAt(7));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String abhi choti hai!!");
		} catch (NullPointerException e) {
			System.out.println("Sundar sa nam nahi hai!!");
		} finally {
			System.out.println("Kshatriya hu mai!!");
		}
	}
}
