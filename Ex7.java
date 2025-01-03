// Name:Vedaant Ambolkar
// Roll no:5
// Exp no:07


import java.util.*;
import java.util.Scanner;
import java.util.Vector;
class Ex7
{
    public static void main(String args[])
{
     Vector v = new Vector();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of strings:");
    int n=sc.nextInt();
    
    for(int i=0;i<n;i++)
    {
      System.out.println("Enter string"+ (i+1) +" is ");
     String str=sc.nextLine();
     v.add(str);
    }

  System.out.println("Enter the new string");
 String newString=sc.nextLine();
if(v.contains(newString))
{
   v.remove(newString);
   System.out.println("String" + newString + "removed");
}
else {
   v.add(newString); 
   System.out.println("String " + newString + " added");
}

}
}


