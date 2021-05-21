package day4;

public class Forloops4 {


    public static void main(String[] args) {

                        // 0,      1  ,     2,      3,       4
        String [] std = {"Aman","teju","Satya","Jotika","Arvind","Arun","Jayshree"};

        System.out.println("Array count "+std.length);

        // Enhanced for loop collections List, set, Map, Arrays

        for(String ref :std ){
            if(ref.equals("Arvind")){
                System.out.println("Match found!");
                continue;
            }else{
                System.out.println(" Not Match");
            }

        }

//        for(int i=0;i<std.length;i++){
//            System.out.println(std[i]);
//        }

    }
}
