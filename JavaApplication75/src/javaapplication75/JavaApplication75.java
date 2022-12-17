/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

/**
 *
 * @author user
 */
public class JavaApplication75 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String incoming_string = "1-peter-150"; 
        User user = User.parse(incoming_string); 
        System.out.println(user); 
        
// TODO code application logic here
    }
    
}
