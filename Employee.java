// Name:Vedaant Ambolkar
// Roll no:5
// Exp no:01


import java.util.Scanner;
class Employee
{     
      public static void main(String args[])
           { 
              int empno;
              String empname;
              double basic;
              double DA;
              double HRA;
              int CCA;
              double PF;
              int PT;
              Scanner sc=new Scanner(System.in);
              
                
               System.out.println("Enter empno:");
            empno = sc.nextInt();

                System.out.println("Enter empname");
              empname= sc.next();

                  System.out.println("Enter basic");
               basic=sc.nextDouble();
              
           DA=0.70*basic;
           HRA=0.3*basic;
           CCA=24;
           PF=0.1*basic;
            PT=100 ;
        
       double gross=(DA+HRA+CCA+PF+PT+basic);
       double net=(DA+HRA+CCA+basic);
           
           
           
                          
              System.out.println("GROSS ="+gross);
           System.out.println("NET ="+net);
            
       sc.close();
           }

}                
                  
         