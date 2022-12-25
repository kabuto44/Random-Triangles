/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.randomtriangles;
import java.util.ArrayList;
import java.io.PrintWriter;
/**
 *
 * @author Max
 */
public class Simulation {
    private static String path;
    public static void setPath(String p){
        path = p;
    }
    public static void simulate(int trials) throws Exception{
        try{
        PrintWriter writer = new PrintWriter(path, "UTF-8");
        for(int i=0; i < trials; i++){
          double x1 = Math.random();
          double x2 = Math.random();
          double x3 = Math.random();
          double y1 = Math.random();
          double y2 = Math.random();
          double y3 = Math.random();
          double s1 = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
          double s2 = Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
          double s3 = Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
          if(s1==0&&s2==0&&s3==0){
              writer.println(-1);
          } else {
              writer.println(Math.min(s1,Math.min(s2,s3))/Math.max(s1,Math.max(s2,s3)));
          }
        }
        writer.close();
        } catch (Exception e){
            throw e;
        }
    }
}
