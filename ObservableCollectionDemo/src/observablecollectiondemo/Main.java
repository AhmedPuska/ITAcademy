/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observablecollectiondemo;

import java.util.Observable;
import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

public class Main {

    public static void main(String[] args) {
        
        ObservableList<String> list = FXCollections.observableArrayList();

        list.addListener(new ListChangeListener<String>() {
            @Override
            public void onChanged(ListChangeListener.Change change) {
                while (change.next()) {
                    if (change.wasPermutated()) {
                        System.out.println("Permutated from " + change.getFrom() + " to " + change.getTo());
                    } else if (change.wasUpdated()) {
                        System.out.println("Updated from " + change.getFrom() + " to " + change.getTo());
                    } else if (change.wasReplaced()) {
                        System.out.println("Replaced from " + change.getFrom() + " to " + change.getTo());
                    } else {
                        if (change.wasRemoved()) {
                            System.out.println("Removed from " + change.getFrom() + " to " + change.getTo());
                        } else if (change.wasAdded()) {
                            System.out.println("Added from " + change.getFrom() + " to " + change.getTo());
                        }
                    }
                }
            }

        });

        list.addAll("one", "two", "three");
        list.removeAll("one", "three");

    }
}