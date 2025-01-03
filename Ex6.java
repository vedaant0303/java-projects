// Name:Vedaant Ambolkar
// Roll no:5
// Exp no:06


import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r;
        int c;
        int i;
        int j;
        int k;
        System.out.println("enter the number of rows and colums");
        r=sc.nextInt();
        c=sc.nextInt();
        int A[][]=new int[r][c];
        System.out.println("enter the number of elements in the matrix A");
        for( i=0;i<=r-1;i++)
        {
            for( j=0;j<=c-1;j++)
            {
            System.out.println("enter the valus");
            A[i][j]=sc.nextInt();
            }

        }
        System.out.println("the matrix A is :");
        for( i=0;i<=r-1;i++)
        {
            for( j=0;j<=c-1;j++)
            {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("enter the number of rows and colums");
        r=sc.nextInt();
        c=sc.nextInt();
        int B[][]=new int[r][c];
        System.out.println("enter the number of elements in the matrix B");
        for( i=0;i<=r-1;i++)
        {
            for( j=0;j<=c-1;j++)
            {
            System.out.println("enter the valus");
            B[i][j]=sc.nextInt();
            }

        }
        System.out.println("the matrix B is :");
        for( i=0;i<=r-1;i++)
        {
            for( j=0;j<=c-1;j++)
            {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("the product of the two matrix is C");
        int C[][]=new int[10][10];
        for( i=0;i<=r-1;i++)
        {
            for(j=0;j<=c-1;j++)
            {
                for(k=0;k<=r-1;k++)
                {
                    
                     C[i][j] += A[i][k] * B[k][j];
                    
                }
 
            }
            
        }
        for( i=0;i<=r-1;i++)
        {
            for( j=0;j<=c-1;j++)
            {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class strBuffer
{
public static void main(String[] args) {
   StringBuffer str=new StringBuffer("vedaant" + "ambolkar");
   System.out.println("original string is :" + str);
   System.out.println("original string length :" + str.length());
   for(int i=0;i<str.length();i++)
   {
    int p=i+1;
    System.out.println("charecter at position :" + p + "is" + str.charAt(i));
   } 

   String s="dinesh";
   str.insert(7,s);
   System.out.println("Modified string is" + str);

   String s1="pradnya samant";
   str.append(s1);
   System.out.println("Modified string is: " + str);

   str.setLength(100);
   System.out.println("Modified string of lenght 100:" + str);
   System.out.println("character at position 80:" + str.charAt(80));
   str.setLength(6);
   System.out.println("Modified string length:"+ str);
}
}