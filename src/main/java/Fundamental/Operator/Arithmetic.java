package Fundamental.Operator;

public class  Arithmetic {
    public void Sum()  // Method creation
    {

        int briyani=190;
        int parotta=20;
        int gravy;
        //Arithmetic: +,/,*,-,%

        gravy=briyani+parotta;
        System.out.println("sum:"+gravy);
        gravy=briyani-parotta;
        System.out.println("Sub:"+gravy);
        gravy=briyani*parotta;
        System.out.println("MUL:"+gravy);
        gravy=briyani/parotta;
        System.out.println("Div:"+gravy);
        gravy=briyani%parotta;
        System.out.println("Modulo"+gravy);




    }
    public static void main(String[] args) {
        Arithmetic aa= new Arithmetic();
        aa.Sum();
    }
}
