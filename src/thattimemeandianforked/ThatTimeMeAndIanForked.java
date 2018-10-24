/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thattimemeandianforked;

/**
 *
 * @author bts11
 */import java.util.*;
public class ThatTimeMeAndIanForked {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("how long can you fork for?");
      Random ran = new Random();
      int time = ran.nextInt(100)+1;
      System.out.print(time +" minutes\n\n\n can't you do better?");
      System.out.print("eh It's me Ian.");
      
    }
    
}
