
import java.util.*;

class GetInput{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Your name: ");

		String name = s.nextLine();

		System.out.print("Your name is: "+name);
	}
}