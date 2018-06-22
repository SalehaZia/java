package day3;
// swap two numbers
import java.util.Scanner;

public class SwaNum {
    int a,b;
    //function to swap two numbers
    public  void swap(SwaNum swp)
    {
        int temp;
        temp=swp.a;
        swp.a=swp.b;
        swp.b=temp;
    }
    public static void main(String s[])
    {
    	SwaNum objSwp= new SwaNum();
       
            Scanner sc=new Scanner(System.in);
             
            System.out.print("Enter first  number: ");
            objSwp.a=sc.nextInt();
             
            System.out.print("Enter second number: ");
            objSwp.b=sc.nextInt();
             
            objSwp.swap(objSwp);
            System.out.println("After swapping  a: " + objSwp.a + ", b: " + objSwp.b);
       
    }
}
