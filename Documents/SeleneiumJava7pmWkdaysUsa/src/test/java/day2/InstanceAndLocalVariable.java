package day2;



public class InstanceAndLocalVariable
{
    //Instance Variable/ Global Variable
       static String city="Atlanta";

    public static void main(String[] args)
    {
       InstanceAndLocalVariable gl= new InstanceAndLocalVariable();
        gl.studentadmin();
       System.out.println(gl.city);

        System.out.println(city);
        studentRank();


    }
    // non static method
     public  void studentadmin()
     {

        //LocalVariable
        String university="GeorgiaTech";
        System.out.println(university);
        System.out.println(city);
    }

    //static method
    public static void studentRank()
    {

        System.out.println(city);
    }

}
