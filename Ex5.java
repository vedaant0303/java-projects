// Name:Vedaant Ambolkar
// Roll no:5
// Exp no:05



import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String temp;

        System.out.println("ENTER THE NUMBER");
        n = sc.nextInt();
        temp = Integer.toString(n); 
        for (int i = 0; i < temp.length(); i++) {
            char topt = temp.charAt(i);
            n = Character.getNumericValue(topt);

            switch (n) {
                case 0:
                    System.out.print(" Zero");
                    break;
                case 1:
                    System.out.print(" One");
                    break;
                case 2:
                    System.out.print(" Two");
                    break;
                case 3:
                    System.out.print(" Three");
                    break;
                case 4:
                    System.out.print(" Four");
                    break;
                case 5:
                    System.out.print(" Five");
                    break;
                case 6:
                    System.out.print(" Six");
                    break;
                case 7:
                    System.out.print(" Seven");
                    break;
                case 8:
                    System.out.print(" Eight");
                    break;
                case 9:
                    System.out.print(" Nine");
                    break;
            }
        }
    }
}
