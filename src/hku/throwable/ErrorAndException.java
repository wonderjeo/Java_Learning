package hku.throwable;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ErrorAndException {
	private void throwError() {
		throw new StackOverflowError();
	}
	private void throwCheckedException() throws IOException {
		throw new FileNotFoundException();
	}
	private void throwRuntimeException() {
		throw new RuntimeException();
	}
	public static void main(String[] args) throws IOException {
		ErrorAndException eae = new ErrorAndException();
		ArrayList<Integer> al = new ArrayList<Integer>();
		eae.throwCheckedException();
		eae.throwError();
		eae.throwRuntimeException();
	}
}
