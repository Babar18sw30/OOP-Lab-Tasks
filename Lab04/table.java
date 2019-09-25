import java.util.*;

class Table{
	public static void main(String sw31[]){
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the number of table ");
		int num = s.nextInt();

		System.out.print("Enter The first number of table");
		int first = s.nextInt();

		System.out.print("Enter last Number of the table");
		int end = s.nextInt();

		for(int i = first; i <= end; i++){
			System.out.println(num+"x"+i+" = "+num*i);
		}
	}
}