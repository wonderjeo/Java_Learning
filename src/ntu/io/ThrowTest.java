package ntu.io;

public class ThrowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			throw new ArithmeticException();
		} catch (ArithmeticException ae) {
			// TODO: handle exception
			System.out.println(ae);
		}
		try {
			throw new ArrayIndexOutOfBoundsException();
		} catch (ArithmeticException ai) {
			// TODO: handle exception
			System.out.println(ai);
		}
		try {
			throw new StringIndexOutOfBoundsException();
		} catch (StringIndexOutOfBoundsException si) {
			// TODO: handle exception
			System.out.println(si);
		}
	}

}
