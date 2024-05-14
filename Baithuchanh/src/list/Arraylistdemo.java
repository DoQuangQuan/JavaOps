package list;

import java.util.ArrayList;

public class Arraylistdemo {
    public static void main(String[] args) {
        ArrayList<String>arrayListString = new ArrayList<String>();
            arrayListString.add("Java");
            arrayListString.add("PHP");

            System.out.println("cac phan tu co trong arraylist la : ");
            //  cách 1: for(int i = 0 ; i < arrayListString.size() ;i++ ){
         // System.out.print(arrayListString.get(i) + "\t");      
          //  }
          for(String alpha : arrayListString ){ // vòng for cải tiến 
             System.out.print(alpha + "\t");      
              }
    }
}
