package ntu.io;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length == 2) new CopyMaker().copy(args[0], args[1]);
		else
		{
			String src = "Hello.txt";
			String dest = "newHello.txt";
			new CopyMaker().copy(src, dest);
		}
	}

}
