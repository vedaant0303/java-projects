// Name:Vedaant Ambolkar
// Roll no:5
// Exp no:09
 


interface InterfaceVehicle
{
    void start();
    void stop();
    void applybreak();
    void acceleration();
}
class Bicycle implements  InterfaceVehicle
{
   public void start()
   {
      System.out.println(" Start => BICYCLE IS STARTS BY PEDALING THE PEDAL");
    }
    public void stop()
   {
    System.out.println(" Stop => BICYCLE IS STOPED WHEN WE STOP THE PEDALING PROCESS");
    }
    public void applybreak()
    {
      System.out.println(" BREAK => THE BREAKS OF BICYCLE IS AT THE RIGHT SIDE OF THE HENDAL WHEN WE HAVE TO STOP THE BICYCLE WE USED BREAK");
    }
    public void acceleration()
    {
       System.out.println(" Acceleration => THE BICYCLE IS ACCELERATED WHEN THE PEDALING PROCESS IS FASTER");
   }
}


class Car implements  InterfaceVehicle
{
   public void start()
   {
      System.out.println(" Start => CAR IS STARTS BY INSEARTING CAR KEY INTO THE CAR");
    }
    public void stop()
   {
    System.out.println(" Stop => CAR IS STOPED WHEN WE USE BREAKS THAT ARE PLACED AT THE BOTTOM OF THE CARS FLOOR");
    }
    public void applybreak()
    {
      System.out.println(" BREAK => THE BREAKS OF THE CAR IS APPLIED BY THE PROCESS OF HYDROLICS ");
    }
    public void acceleration()
    {
       System.out.println(" Acceleration => THE CAR IS ACCELERATED WHEN THE DRIVER IS APPLYING THE ACCELERATION BUTTON WHICH IS PLACED AT THE SIDE OF THE BRAKS");
   }
}


class Bike implements  InterfaceVehicle
{
   public void start()
   {
      System.out.println(" Start => BIKE IS START BY PUTING THE BIKE KEY AND PRACEING THE SELF START BUTTON");
    }
    public void stop()
   {
    System.out.println(" Stop => BIKE IS STOPED WHEN WE APPLY BREAK WHICH IS AT BOTH SIDE OF AN HENDAL RIGHT SIDE IS FOR FRONT BREAK AND LEFT SIDE IS FOR BACK SIDE BREAK");
    }
    public void applybreak()
    {
      System.out.println(" BREAK => BY APPLYING BREAK THE BIKE IS STOPED");
    }
    public void acceleration()
    {
       System.out.println(" Acceleration => THE BIKE IS ACCELERATE WHEN THE RIGHT HENDAL IS ROTATED IN CLOCK WICE DIRECTION");
   }
}
 
class Ex9
{
  public static void main(String[] args)
    {
      InterfaceVehicle  b = new Bicycle();
      InterfaceVehicle  c = new Car();
      InterfaceVehicle  bi = new Bike();
       
        System.out.println(" \n Testing Bicycle:");
        b.start();
        b.acceleration();
        b.applybreak();
        b.stop();

        System.out.println("\n Testing Car:");
        c.start();
        c.acceleration();
        c.applybreak();
        c.stop();

        System.out.println("\n Testing Bike:");
        bi.start();
        bi.acceleration();
        bi.applybreak();
        bi.stop();
}
}
  

