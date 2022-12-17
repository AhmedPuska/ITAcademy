package javaapplication316;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javafx.util.converter.LocalDateTimeStringConverter;

public class JavaApplication316 {
    
    public static void passByReference(Person person) {
        person.ime = "Ahmed";
    }
    
    public static void passByValue(int x) {
        x = 25;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.ime = "Hamo";
        passByReference(person);
        System.out.println(person.ime);
        
        int x = 10;
        passByValue(x);
        System.out.println(x);
    }
    
}
