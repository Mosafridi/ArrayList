/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysexerises;
import java.util.Scanner;
import java.util.ArrayList; 
/**
 *
 * @author DEll
 */
public class ArraysExerises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
       int[][] list = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                System.out.println(list[i][j]+"  ");  
                
            }
            
        }
       
       ArrayList<Object> al = new ArrayList<Object>();
       
       al.add(String.valueOf(1));
       al.add("HelloWorld");
       al.add(String.valueOf(2));
       al.add("Welcome");
       
        for (int i = 0; i < list.length; i++) {
            System.out.println(al.get(i)+ " ");
            
        }
       ArrayList<Integer> ar = new ArrayList<Integer>();
       ar.add(1);
        ar.add(2);
         ar.add(3);
          ar.add(4);
           ar.add(5);
       
           for (int i = 0; i < list.length; i++) {
               
                   System.out.println(ar.get(i)+ " ");
                   
               
            
        }
       
        
    }
    
}
