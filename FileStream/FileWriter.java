package FileStream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter ("C:\\Users\\kopo\\Desktop\\out.txt", false);  //true�� append�� �� �������� �߰�, false�� �������ϳ�������� ù���κ��� ����
		for(int i = 11; i <16; i++) {
			String data = "Line #" + i + "\n";
			fw.write(data);
		}
		fw.close();
	}
}


/*
<���� out.txt>
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

<�� ���������ο� ������ �� out.txt>
Line #11
Line #12
Line #13
Line #14
Line #15

<���� �����ϸ� 11~15�� 3�� �����ȴ�.>
Line #11
Line #12
Line #13
Line #14
Line #15
Line #11
Line #12
Line #13
Line #14
Line #15
Line #11
Line #12
Line #13
Line #14
Line #15
*/