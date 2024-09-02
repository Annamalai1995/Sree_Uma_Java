package Fundamental.OOPS.Inheritance;
class Bank
{
    public  void trasaction()
    {
        int amount=50000;
        int deposit=20000;
        int res=amount+deposit;
        System.out.println("Aval balance:"+res);
    }

}
class access extends Bank
{
    public  void bank_access()
    {
        int amt=10000;
        int dep=15000;
        int output=amt-dep;
        System.out.println("withdraw:"+output);
    }

}
public class Single {
    public static void main(String[] args) {
        //Single ss=new Single();
        access aa= new access();
        aa.bank_access();
        aa.trasaction();
    }
}
