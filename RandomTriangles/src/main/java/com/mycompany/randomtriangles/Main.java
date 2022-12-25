/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.randomtriangles;
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter file path to write data to:");
        //default: results.txt
        Scanner s = new Scanner(System.in);
        String p = s.nextLine();
        try{
            Simulation.setPath(p);
            System.out.println("Enter trials");
            int i = s.nextInt();
            Simulation.simulate(i);
        } catch (Exception e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
}
