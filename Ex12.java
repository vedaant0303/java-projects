// Name:Vedaant Ambolkar
// Roll no:5
// Exp no:12

class Even extends Thread
{
    public void run()
    {
        try
        {
            for(int i=2;i<20;i=i+2)
            {
                System.out.println("Even number is " +i);
                sleep(1000);
            
            }
        }
         catch(Exception e)
            {
            }
        }      
}
 class Odd extends Thread
 {
        public void run()
        {
             try
        {
            for(int i=1;i<20;i=i+2)
            {
                System.out.println("Odd number is " +i);
                sleep(1000);
            
            }
        }
            
            catch(Exception e)
            {
                
            } } }
    class Ex12
    {
        public static void main(String args[])
        {
            Even t1=new Even();
            Odd t2=new Odd();
            t2.start();
            t1.start();
        }
    }
