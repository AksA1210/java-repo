
//Even or odd
import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();
        if (a%2 == 0)
        {
            System.out.print(a); 
            System.out.print(" is even "); 
        }
        else
        {
            System.out.print(a); 
            System.out.print(" is odd "); 
        }
    }
}    
