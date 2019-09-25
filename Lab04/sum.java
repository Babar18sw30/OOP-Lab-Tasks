import java.util.*;

class Sum{
	public static void main(String sw31[]){
		Scanner s = new Scanner(System.in);

		System.out.print("Enter a Number: ");
		int num = s.nextInt();

		int sum = 0;

		for(int a = 1; a <= num; a++){
			sum += a;
		}

		System.out.print("Sum = "+ sum);
	}
}