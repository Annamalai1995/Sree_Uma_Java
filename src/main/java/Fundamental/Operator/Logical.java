package Fundamental.Operator;

public class Logical {
    public static void main(String[] args) {

        String Name = "priya";
        String Name1 = "priya";
        String Name2 = "Gowthami";
        System.out.println((Name == Name1) && (Name2 == Name1));
        System.out.println((Name == Name1) || (Name2 == Name1));
        int alpha=55;
        int gamma=55;
        System.out.println(!(alpha==gamma));
    }
}