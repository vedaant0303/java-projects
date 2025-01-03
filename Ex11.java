


import java.util.Scanner;

public class Ex11 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int name;
        String pass;
        System.out.println("Enter the loginid:");
        name = sc.nextInt();

       
           // System.out.println("Enter the password:");
           System.out.println("Enter the password:");
           pass = sc.nextInt();
            if(pass)
            {   
               
                System.out.println("Login Successful");

            }
            else
            {
                System.out.println("Enter the corect password");

            }

        
    }
}
