import java.util.*;

class sorting{

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);  
		System.out.println("Enter A array");

		int size = 10;	


		int[] arr = new int[size];
		for(int i = 0; i < arr.length; i++){
			arr[i] = s.nextInt();
		}
	
		for(int i = 0; i < arr.length; i++){
			int ptr = 0;
			while(ptr < arr.length-1){
				
				if(arr[ptr] > arr[ptr+1]){
					
					int temp = arr[ptr];
					arr[ptr] = arr[ptr+1];
					arr[ptr+1] = temp;
				}
				ptr ++;
			}
			
		}
		System.out.print("After Sorting: ");
		for(int k = 0; k < arr.length; k++){
			System.out.print(arr[k]+" ");
		}
	} 
}