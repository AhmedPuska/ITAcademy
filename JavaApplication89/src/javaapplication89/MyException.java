/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication89;
public class MyException extends Exception {
    @Override
    public String toString(){
        return "Something nice";
    }
    @Override
    public String getMessage() {
        return "Some nice custom message";
    }
}
