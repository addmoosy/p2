/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author dongw
 */
public class p1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      try{
          Scanner sc = new Scanner(System.in);
          boolean end  =false;
          while(!end){
              int[] tri={sc.nextInt(),sc.nextInt(),sc.nextInt()};
              if(tri[0]==0&&tri[1]==0&&tri[2]==0){
                  end = true;
                  sc.close();
                  System.out.println("Program was terminated by user");
              }else{
                  
                 System.out.println(triangle(tri)+"\n Provide three side lengths - 0  0 0 to terminate"); 
              }
              
          }
      }catch(Exception e){
          System.out.println("Invalid Input");
      }
    }
    public static String triangle(int tri[]){
        int max=0;
        String result = "Triangle possilbe: ";
        for (int i = 0; i < tri.length-1; i++) {
           if(tri[i]>tri[i+1]){
               max=tri[i];
               tri[i]=tri[i+1];
               tri[i+1]=max;
           }
           if(tri[i]<=0||tri[i+1]<=0){
               return "triangle cannot be formed";
           }
        }
        if(tri[0]+tri[1]<=tri[2]){
            return "triangle cannot be formed";
        }
        
        
        if(tri[0]==tri[1]&&tri[1]==tri[2]){
            result = result+"equilateral";
        }else if(tri[0]==tri[1]||tri[1]==tri[2]||tri[0]==tri[2]){
            result = result+"isosceles";
        }else{
            result = result+"scalene";
        }
        
        
        if(Math.pow(tri[0], 2)+Math.pow(tri[1], 2)==Math.pow(tri[2], 2)){
            result = result+" and right.";
        }else if(Math.pow(tri[0], 2)+Math.pow(tri[1], 2)>Math.pow(tri[2], 2)){
             result = result+" and acute.";
        }else{
             result = result+" and obtuse.";
        }
            return result;
    }
    
}
