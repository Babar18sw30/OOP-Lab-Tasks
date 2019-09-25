import java.util.*;
class Marksheet{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks In c++");
        float marks1 = sc.nextFloat();
        System.out.println("Enter Marks in Data Structure");
        float marks2 = sc.nextFloat();
        System.out.println("Enter Your Marks in Operating System");
        float marks3 = sc.nextFloat();
        float total = 0;
        total = marks1+marks2+marks3;
        System.out.println("Your Total Marks = "+total);
        float Percentage;
        Percentage = (total*100)/300;
        System.out.println("Your Percentage = "+ Percentage);
        if(Percentage >= 90){
            System.out.println("Grade: A");
        }
        else if(Percentage <= 89 && Percentage >= 80){
            System.out.println("Grade: B");
        }
        else if(Percentage <= 79 && Percentage >= 70){
            System.out.println("Grade C");
        }

        else if(Percentage <= 69 && Percentage >= 60){
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Fail");
        }
    }
}