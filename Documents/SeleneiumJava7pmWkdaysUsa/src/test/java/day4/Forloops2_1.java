package day4;

import java.util.concurrent.SynchronousQueue;

public class Forloops2_1 {


    public static void main(String[] args) {

                        // 0,      1  ,     2,      3,       4
        String [] std = {"Aman","teju","Satya","Jotika","Arvind","Arun","Jayshree"};

        System.out.println("Array count "+std.length);

        for(int i=0;i<std.length;i++){
            System.out.println(std[i]);
        }

        System.out.println("*******************");


        for(int i=std.length-1;i>=0;i--){
            System.out.println(std[i]);
        }

    }
}
