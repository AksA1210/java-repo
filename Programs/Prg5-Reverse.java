

import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();
        int rev=0;
        while (a!=0)
        {
            int rem=a%10;
            rev=rev*10+rem;
            a=a/10;
        }
        System.out.print("The reverse of the number is : "); 
        System.out.print(rev); 
    }
}    

//better code ( zeroes at the beginning wont work but in all other cases it will )

import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();
        int rev=0;
        System.out.print("The reverse of the number is : "); 
        while (a!=0)
        {
            int rem=a%10;
            rev=rev*10+rem;
            if (rev==0)
            {
                System.out.print(rev); 
                a=a/10;
            }
            else
            {
                a=a/10;
               
            }
            
        }
        System.out.print(rev); 
    }
}    

