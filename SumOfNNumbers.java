/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

// Write a Java program to calculate the sum of natural numbers up to a given positive integer 'n'.
import java.util.Scanner;
class SumOfNNumbers {
    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the number: ");
       int n=sc.nextInt();
    
       
       int sum=0;
        for(int i=0;i<=n;i++){
            sum= sum + i;
        }
        System.out.print(sum);
    }
}