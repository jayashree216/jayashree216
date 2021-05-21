package day4;

public class Forloops3 {


    public static void main(String[] args) {

                        // 0,      1  ,     2,      3,       4
        String [] std = {"Aman","teju","Satya","Jotika","Arvind","Arun","Jayshree"};

        System.out.println("Array count "+std.length);

        // Enhanced for loop collections List, set, Map, Arrays

        for(String ref :std ){
            System.out.println(ref);
        }

//        for(int i=0;i<std.length;i++){
//            System.out.println(std[i]);
//        }

    }
}
