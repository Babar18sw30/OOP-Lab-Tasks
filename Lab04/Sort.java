import java.util.*;
class sort{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter A Random Array");
		int size = 10;
		int[] arr = new int[size];
		for(int i = 0; i < arr.length; i++){
			arr[i] = s.nextInt();
		}
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length-1; j++){
				//arr = 2, 3, 1
				if(arr[j] > arr[j+1]){
					//swapping
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
		}
		System.out.print("After Sorting");
		for(int k = 0; k < arr.length; k++){
			System.out.print(arr[k]+" ");
		}
	} 
}