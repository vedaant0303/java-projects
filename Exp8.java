// Name:Vedaant Ambolkar
// Roll no:5
// Exp no:08


class Teacher
{
   String n;
   int teaching_exp;
   String department;
   
   Teacher(String n, int teaching_exp, String department)
  {
    this.n=n;
    this.teaching_exp=teaching_exp;
    this.department=department;
  }
  public void display()
 {
   System.out.println(" name of teacher is :"+ n);
   System.out.println(" teaching experience:"+ teaching_exp);
   System.out.println(" teacher department : "+ department);
 }
}

class Professor extends Teacher
 {
    String research_area;
  Professor(String n, int teaching_exp, String department, String  research_area)
  {
     super(n, teaching_exp, department);
     this.research_area=research_area;
 }
 public void display()
 {  super.display();
   System.out.println(" research area is :"+ research_area);
 } 
}
class Associate_Professor extends Teacher 
 {
    String publication;
  Associate_Professor(String n, int teaching_exp, String department, String  publication)
  {
     super(n, teaching_exp, department);
     this.publication=publication;
 }
 public void display()
 { super.display();
   System.out.println(" publication is :"+ publication);
 } 
}

class Assistant_Professor extends Teacher
{
   String subject;
  Assistant_Professor(String n, int teaching_exp, String department, String subject)
  {
     super(n, teaching_exp, department);
     this.subject=subject;
 }
 public void display()
 { super.display();
   System.out.println(" subject  is :"+ subject);
 } 
}
class Exp8
{
   public static void main(String[] args) 
   {
     Teacher t=new Teacher("ichansh",20,"Machine lernig");
     Professor p=new Professor("kranti",10,"CSEDS","COMPUTER GRAPHICS");
     Associate_Professor aap=new Associate_Professor("ganesh",30,"CSEDS","MATHS BOOK OF ART");
    Assistant_Professor asp=new Assistant_Professor("Maya",30,"c++","Data science");
   
        t.display();
        System.out.println();
        p.display();
        System.out.println();
        aap.display();
        System.out.println();
        asp.display();
        System.out.println();
     }
}
    

   
   
 
