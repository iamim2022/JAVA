package FileStream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter ("C:\\Users\\kopo\\Desktop\\out.txt", false);  //true는 append라서 맨 마지막에 추가, false는 기존파일내용지우고 첫라인부터 적음
		for(int i = 11; i <16; i++) {
			String data = "Line #" + i + "\n";
			fw.write(data);
		}
		fw.close();
	}
}


/*
<기존 out.txt>
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

<맨 마지막라인에 덮어쓰기된 후 out.txt>
Line #11
Line #12
Line #13
Line #14
Line #15

<세번 실행하면 11~15가 3번 덮어쓰기된다.>
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