package multiplicationTables;

public class multiplicationTables_OnlyWhile {
	public static void main(String[] args) {
		int i = 2;
		int j = 1;
		
		while (i <= 9) {
			while (j <= 9) {
				System.out.println(i + "X" + j + "=" + i * j);
				j++;
			}
			j = 1;
			i++;
		}
	}
}