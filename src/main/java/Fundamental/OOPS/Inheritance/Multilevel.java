package Fundamental.OOPS.Inheritance;
class Management
{
    public void Manage()
    {
        System.out.println("Nothing more than happiness");
    }


}
class Hod extends Management
{
    public  void Details()
    {
        System.out.println("CSE HOD:kavitha");
        System.out.println("EEE HOD:Anitha");
    }
}
class Advisor extends Hod
{
    public void A_details()
    {
        System.out.println("CSE Advisor:Uma");
        System.out.println("EEE Advisor:sathyasree");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Advisor ad= new Advisor();
        ad.Manage();
        ad.Details();
        ad.A_details();

    }

}
