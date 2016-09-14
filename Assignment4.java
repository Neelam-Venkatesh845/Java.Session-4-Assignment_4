import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {

		String original, reverse = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a name to reverse");
		original = sc.next();

		int length = original.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);

		System.out.println("Reverse of entered name is: " + reverse);

		sc.close();
	}

}
