package basic;

public class Method2 {
	public static void main(String[] args) {
		print("KIM", 20);
		print("LEE", 23);
		print("KIM", "LEE");
	}

	public static void print(String text, int a) {
		System.out.println(text + a);
	}

	public static void print(String text, String text2) {
		System.out.println(text + " & " + text2);
	}
}
