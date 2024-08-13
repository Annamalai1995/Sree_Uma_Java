package Fundamental.Variables;


public class Demo_variables {
   //int a=10;
   //Types of variables
    //1.Instance 2.Local 3.Global 4.Static
     static  String place="salem";
     float Salary=6.5F;  //Global


    public void Details()   //Local
    {
        int age=28;
        String Ofc_name="Zealous";
        System.out.println("Age :"+age);
        System.out.println("OFFICE Name:"+Ofc_name);
        System.out.println("Salary:"+Salary);
        System.out.println("Place :"+place);
    }





   public static void main(String[] args) {
      String Name="Annamalai";  //Instance
       System.out.println("MY name Is :"+Name);
       System.out.println(Name);

       //Create Object
       //classname objectname = new Classname;
       Demo_variables dd= new Demo_variables();
       dd.Details();
      // System.out.println("Salary:"+Salary);
       System.out.println("PLACE :"+place);
   }
}
