
package jlist;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Main {

    static JFrame myFrame;
    public static void main(String[] args) {
//        MyForm form = new MyForm();
//        form.setVisible(true);
        myFrame = new JFrame();
        Object[] data = new Object[] {"Apple", "Orange", "Peach", "Grape"};
        JList jl = new JList(data);
        JScrollPane jsp = new JScrollPane(jl);
//        jl.addListSelectionListener(new ListSelectionListener() {
//        public void valueChanged(ListSelectionEvent e) {
//         if(!e.getValueIsAdjusting())
//         {
//          List vals = ((JList) e.getSource()).getSelectedValuesList();
//          for(Object val : vals)
//           System.out.println(val);
//         }
//        }
//        });
//        jl.setLayoutOrientation(JList.HORIZONTAL_WRAP);
//        jl.setVisibleRowCount(-1);
        myFrame.add(jsp);
        myFrame.setSize(400,300);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLocationRelativeTo(null);
        myFrame.setVisible(true);
    }
}