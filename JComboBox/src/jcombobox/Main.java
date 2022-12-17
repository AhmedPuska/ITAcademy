package jcombobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main {

//    static class City
//    {
//        public int id;
//        public String name;
//
//        public City(int id, String name)
//        {
//            this.id = id;
//            this.name = name;
//        }
//
//        @Override
//        public String toString()
//        {
//            return this.name;
//        }
//    }
//    static JFrame f;
    
    public static void main(String[] args) {
        MyForm form = new MyForm();
        form.setVisible(true);
//        f = new JFrame("OVO");
//        f.setSize(400,300);
//        JComboBox jcb = new JComboBox();
//        JPanel panel = new JPanel();
//        panel.add(jcb);
//        jcb.addItem(new City(1, "London"));
//        jcb.addItem(new City(2, "Paris"));
//        jcb.addItem(new City(3, "New York"));
//        jcb.addItem(new City(4, "Juneau"));
////        jcb.addActionListener(new ActionListener() {
////        public void actionPerformed(ActionEvent e) {
////
////         City selectedCity = (City) ((JComboBox)e.getSource()).getSelectedItem();
////         JOptionPane.showMessageDialog(null, selectedCity.id);
////        }
////       });
//        jcb.addItemListener(new ItemListener() {
//        public void itemStateChanged(ItemEvent e) {
//
//         if(e.getStateChange() != ItemEvent.SELECTED)
//          return;
//
//         City selectedCity = (City) e.getItem();
//         JOptionPane.showMessageDialog(null, selectedCity.id);
//        }
//       });
//        f.add(panel);
//        f.setVisible(true);
    }
}