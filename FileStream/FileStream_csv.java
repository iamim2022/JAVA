package FileStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream_csv {
	public static void main(String[] args) throws IOException {
		FileOutputStream output = new FileOutputStream("C:\\Users\\kopo\\Desktop\\out.csv");
		for (int i = 1; i < 11; i++) {
			String data = i + "," + "切积";
			output.write(data.getBytes());
		}
		output.close();
	}
}


/*
<积己颇老>
Line #1
Line #2
Line #3
Line #4
Line #5
Line #6
Line #7
Line #8
Line #9
Line #10
*/