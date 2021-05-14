package day1;

public class Calculator {

    public static void main(String[] args) {
        //Class name (Ref) =new class(class object)
        Calculator result = new Calculator();

        //showing addition value
        result.add(10.68645, 206789);
        result.add(20.678996758976989, 67.8765434567890);

        result.sub(20.65463, 509.76544567);
        result.sub(130, 101);
        //print substraction result
        // int val=cal.sub(20,5);
        //System.out.println(val);

        result.mul(45.456789, 78.22345);
        //print multiplicatin result
        //int val1=cal.mul(44,66);
        //System.out.println(val1);

        result.div(20.4664, 105879.66789);
        //print division result in decimal
        //float val2= cal.div(20,10);
        //System.out.println(val2);

        result.mod(45.23456, 67);
        //print  remainder result in decimal
        //float val3= cal.mod(6,20);
        //System.out.println(val3);


    }

    //access Modifiers ReturnType MethodName(Parameters){Body}
    public void add(double x, double y) {
        //addition function
        double sum = x + y;
        System.out.println("Addition=" + sum);

    }

    public void sub(double x, double y) {
        //substration function
        double substraction = x - y;
        System.out.println("substraction=" + substraction);
        //return substraction;

    }

    public void mul(double x, double y) {
        //multiplication function
        double multiplication = x * y;
        System.out.println("multiplication =" + multiplication);
        // return multiplication;

    }

    public void div(double x, double y) {
        //division function
        double division = x / y;
        System.out.println("division =" + division);
        //return division;
    }

    public void mod(double x, double y) {
        //remainder function
        double remainder = x % y;
        System.out.println("remainder =" + remainder);
        //return  remainder;
    }
}
