
import java.io.IOException;
import java.io.PrintWriter;


public class FileHandlingExampleN {
	public static void main(String[] args) throws IOException {
		
		PrintWriter printWriter =new PrintWriter("abs.txt");
		printWriter.write(100);
		printWriter.print(100);
		
		printWriter.close();
	}


}
