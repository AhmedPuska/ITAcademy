package choicebox.combobox.listview;

import javafx.util.StringConverter;

public class PersonStringConverter extends StringConverter<Person> {

    @Override
    public String toString(Person object) {
        return object == null ? null : object.getFirstName() + ", " + object.getLastName();
    }

    @Override
    public Person fromString(String string) {

        Person p = null;
        if (string == null) {
            return p;
        }
        int commaIndex = string.indexOf(",");
        if (commaIndex == -1) {

            p = new Person(string);
        } else {

            String firstName = string.substring(0, commaIndex);
            String lastName = string.substring(commaIndex + 2);

            commaIndex = lastName.indexOf(",");

            if (commaIndex == -1) {
                p = new Person(firstName, lastName);
            } else {
                int age = Integer.valueOf(lastName.substring(commaIndex + 2));
                lastName = lastName.substring(0, commaIndex);


                p = new Person(firstName, lastName, age);
            }

        }
        return p;

    }
    
} 