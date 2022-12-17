/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication76;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.Random;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaApplication76 extends Application {

    public static void main(String[] args) {
        launch(args);
        
    }
    @Override
    public void start(Stage stage) throws Exception {
        stage.setWidth(800);
        stage.setHeight(600);
        stage.setResizable(false);
        stage.show();
        
        VBox root = new VBox();
        Scene scena = new Scene(root);
        stage.setScene(scena);
        
        Button taster = new Button("Klikni me");
        root.getChildren().add(taster);
        
        
        
        
    }   
        
}
        
//        List heroes_list = new ArrayList();
//        heroes_list.add("peter");
//        heroes_list.add("sally");
//        heroes_list.set(1,"diablo");
//        for (int i = 0; i < heroes_list.size(); i++) {
//            System.out.println(heroes_list.get(i));
//        }
        
//        
//      int [][] multiArray = new int [3][2];
//        System.out.println(multiArray.length);
////        int [] pozitivni    = {};
////        int [] negativni    = {};
////        int brojac=0;
////        for (int i = 0; i < array.length; i++) {
////            if(array[i]<0)
////                brojac++;
////        }
////        pozitivni= new int [array.length-brojac];
////        negativni= new int [brojac];
////        for (int i = 0,p=0,n=0; i < array.length; i++) {
////            if (array[i]<0) {
////                negativni[n++]=array[i];
////            }
////            else    
////                pozitivni[p++]=array[i];
////        }
////        
////        System.out.println(Arrays.toString(array));
////        System.out.println(Arrays.toString(pozitivni));
////        System.out.println(Arrays.toString(negativni));
//        
//        String [] strings = {"Heart", "Cherry", "Coin", "Melon", "Jocker"};
//        Random r = new Random();
//        System.out.println(Arrays.toString(strings));
//        for (int i = 0; i < strings.length; i++) {
//            System.out.println(strings[r.nextInt(5)]);
//        }
    
    

