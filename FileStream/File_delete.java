package FileStream;

import java.io.File;
import java.io.IOException;

public class File_delete {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\kopo\\Desktop\\out.txt");
		System.out.println(file.exists());
		if (file.exists()) {
			file.delete();	
		}
		System.out.println(file.exists());
	}
}
