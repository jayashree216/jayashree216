package day4;

import java.io.*;

public class ReadTextFile

{

    public static void main(String[] args) throws IOException {


        String path = System.getProperty("user.dir")+ File.separator+"Test.txt";

        FileInputStream fis = new FileInputStream(path);

        BufferedReader bf = new BufferedReader(new InputStreamReader(fis));
//
//
//       String l1=  bf.readLine();
//        String l2=  bf.readLine();
//       System.out.println(l1);
//        System.out.println(l2);

//        for(int i=1; i<=5;i++){
//            System.out.println(bf.readLine());
//        }


        String x ="";
        while ((x = bf.readLine())!=null){
            System.out.println(x);
        }


    }
}
