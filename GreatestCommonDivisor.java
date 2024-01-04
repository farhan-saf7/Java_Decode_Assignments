import java.util.Scanner;
public class GreatestCommonDivisor
{
	public static void main(String[] args) {
	    
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the 1st number: ");
	    int n= sc.nextInt();
	    System.out.print("Enter the 2st number: ");
	    int m= sc.nextInt();
	    int gcd=1;
	    
    for(int i=2;i<=n && i<=m;i++){
        if(n%i==0 && m%i==0) 
            gcd=i;
            
    }
    System.out.println(gcd);
   
	}
}
