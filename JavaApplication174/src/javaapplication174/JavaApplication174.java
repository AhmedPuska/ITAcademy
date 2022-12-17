package javaapplication174;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import java.text.*;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFormattedTextField.AbstractFormatter;

public class JavaApplication174 extends JFrame/*extends JPanel
implements PropertyChangeListener*/{

/**
 * FormattedTextFieldDemo.java requires no other files.
 *
 * It implements a mortgage calculator that uses four
 * JFormattedTextFields.
 */

    //Values for the fields
//    private double amount = 100000;
//    private double rate = 7.5;  //7.5%
//    private int numPeriods = 30;
//
//    //Labels to identify the fields
//    private JLabel amountLabel;
//    private JLabel rateLabel;
//    private JLabel numPeriodsLabel;
//    private JLabel paymentLabel;
//
//    //Strings for the labels
//    private static String amountString = "Loan Amount: ";
//    private static String rateString = "APR (%): ";
//    private static String numPeriodsString = "Years: ";
//    private static String paymentString = "Monthly Payment: ";
//
//    //Fields for data entry
//    private JFormattedTextField amountField;
//    private JFormattedTextField rateField;
//    private JFormattedTextField numPeriodsField;
//    private JFormattedTextField paymentField;
//
//    //Formats to format and parse numbers
//    private NumberFormat amountFormat;
//    private NumberFormat percentFormat;
//    private NumberFormat paymentFormat;

//    public JavaApplication174() {
//        super(new BorderLayout());
//        setUpFormats();
//        double payment = computePayment(amount,
//                                        rate,
//                                        numPeriods);
//
//        //Create the labels.
//        amountLabel = new JLabel(amountString);
//        rateLabel = new JLabel(rateString);
//        numPeriodsLabel = new JLabel(numPeriodsString);
//        paymentLabel = new JLabel(paymentString);
//
//        //Create the text fields and set them up.
//        amountField = new JFormattedTextField(amountFormat);
//        amountField.setValue(new Double(amount));
//        amountField.setColumns(10);
//        amountField.addPropertyChangeListener("value", this);
//
//        rateField = new JFormattedTextField(percentFormat);
//        rateField.setValue(new Double(rate));
//        rateField.setColumns(10);
//        rateField.addPropertyChangeListener("value", this);
//
//        numPeriodsField = new JFormattedTextField();
//        numPeriodsField.setValue(new Integer(numPeriods));
//        numPeriodsField.setColumns(10);
//        numPeriodsField.addPropertyChangeListener("value", this);
//
//        paymentField = new JFormattedTextField(paymentFormat);
//        paymentField.setValue(new Double(payment));
//        paymentField.setColumns(10);
//        paymentField.setEditable(false);
//        paymentField.setForeground(Color.red);
//
//        //Tell accessibility tools about label/textfield pairs.
//        amountLabel.setLabelFor(amountField);
//        rateLabel.setLabelFor(rateField);
//        numPeriodsLabel.setLabelFor(numPeriodsField);
//        paymentLabel.setLabelFor(paymentField);
//
//        //Lay out the labels in a panel.
//        JPanel labelPane = new JPanel(new GridLayout(0,1));
//        labelPane.add(amountLabel);
//        labelPane.add(rateLabel);
//        labelPane.add(numPeriodsLabel);
//        labelPane.add(paymentLabel);
//
//        //Layout the text fields in a panel.
//        JPanel fieldPane = new JPanel(new GridLayout(0,1));
//        fieldPane.add(amountField);
//        fieldPane.add(rateField);
//        fieldPane.add(numPeriodsField);
//        fieldPane.add(paymentField);
//
//        //Put the panels in this panel, labels on left,
//        //text fields on right.
//        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
//        add(labelPane, BorderLayout.CENTER);
//        add(fieldPane, BorderLayout.LINE_END);
//    }
//
//    /** Called when a field's "value" property changes. */
//    public void propertyChange(PropertyChangeEvent e) {
//        Object source = e.getSource();
//        if (source == amountField) {
//            amount = ((Number)amountField.getValue()).doubleValue();
//        } else if (source == rateField) {
//            rate = ((Number)rateField.getValue()).doubleValue();
//        } else if (source == numPeriodsField) {
//            numPeriods = ((Number)numPeriodsField.getValue()).intValue();
//        }
//
//        double payment = computePayment(amount, rate, numPeriods);
//        paymentField.setValue(new Double(payment));
//    }
//
//    /**
//     * Create the GUI and show it.  For thread safety,
//     * this method should be invoked from the
//     * event dispatch thread.
//     */
//    private static void createAndShowGUI() {
//        //Create and set up the window.
//        JFrame frame = new JFrame("FormattedTextFieldDemo");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        //Add contents to the window.
//        frame.add(new JavaApplication174());
//
//        //Display the window.
//        frame.pack();
//        frame.setVisible(true);
//    }
    private JLabel colorLabel;
    private void chooseButtonActionPerformed(java.awt.event.ActionEvent evt) {                         
      JColorChooser jcc = new JColorChooser();  
      JDialog dialog = JColorChooser.createDialog(jcc, "Choose color", true, jcc, new ActionListener() {  
        @Override  
        public void actionPerformed(ActionEvent ae) {  
          Color c = jcc.getColor();  
          colorLabel.setText("Color selected");  
          colorLabel.setOpaque(true);  
          colorLabel.setBackground(c);  
        }  
      },null);  
      dialog.setVisible(true);  
    }
//    public void showDate() {
//        Date d = new Date();
//        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
//        invoicedate.setText(sf.format(d));
//        
//    }
//    public void kul() {
//        invoicedate = new JTextField();
//        invoicedate.setBounds(472, 55, 108, 32);
//    }
//    
//    private JTextField invoicedate = new JTextField();
    
    public class FormattedTextFieldVerifier extends InputVerifier {
     public boolean verify(JComponent input) {
         if (input instanceof JFormattedTextField) {
             JFormattedTextField ftf = (JFormattedTextField)input;
             AbstractFormatter formatter = ftf.getFormatter();
             if (formatter != null) {
                 String text = ftf.getText();
                 try {
                      formatter.stringToValue(text);
                      return true;
                  } catch (ParseException pe) {
                      return false;
                  }
              }
          }
          return true;
      }
      public boolean shouldYieldFocus(JComponent input) {
          return verify(input);
      }
  }
    
    public static void main(String[] args) throws ParseException {
        
        JTextField invoicedate = new JTextField();
        
//        Date d = new Date();
//        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
//        invoicedate.setText(sf.format(d));
//        invoicedate = new JTextField();
//        invoicedate.setBounds(472, 55, 108, 32);
        
        JFrame f = new JFrame();
        f.add(invoicedate);
        f.setVisible(true);
//        JFrame f = new JFrame();
//        JFormattedTextField field = new JFormattedTextField("Zdravo");
//        f.add(field);
//        f.setVisible(true);
//        int dialogButton = JOptionPane.showOptionDialog(null, "Choose option?", "Option dialog", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[] {"Settings", "Cancel"}, null); 
//        
//        switch(dialogButton) {
//            case JOptionPane.YES_OPTION:
//                SetFrame frame = new SetFrame();
//                frame.setSize(500, 400);  
//                frame.setLocation(100, 200);  
//                ImageIcon ii = new ImageIcon("E:\\rad\\java vjezbe\\JavaApplication171\\rgp.png");  
//                frame.setIconImage(ii.getImage());  
//                frame.getContentPane().setBackground(new Color(44, 62, 80));  
//                frame.setVisible(true);
//                break;
//            case JOptionPane.NO_OPTION:
//                System.exit(0);
//        }
//        JFrame f = new JFrame();
//        f.setSize(400,300);
//        f.setLayout(new FlowLayout());
//        
//        JCheckBox boc = new  JCheckBox();
//        JComboBox jComboBox = new JComboBox();
//        boc.setText("klikni");
//        JTextField jTextField1 = new JTextField();
//        jTextField1.setPreferredSize(new Dimension(130, 23));
//        JButton chooseButton = new JButton("Choose collor");
//        JLabel colorLabel = new JLabel();
//        
//        chooseButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                JColorChooser jcc = new JColorChooser();  
//      JDialog dialog = JColorChooser.createDialog(jcc, "Choose color", true, jcc, new ActionListener() {  
//        @Override  
//        public void actionPerformed(ActionEvent ae) {  
//          Color c = jcc.getColor();  
//          colorLabel.setText("Color selected");  
//          colorLabel.setOpaque(true);  
//          colorLabel.setBackground(c);  
//        }  
//      },null);  
//      dialog.setVisible(true);
//            }
//        });
//        DateFormat df = new SimpleDateFormat("HH:mm:ss");
////
//        Calendar c1 = Calendar.getInstance();
//        c1.setTime((Date) df.parse(jTextField1.getText()));
////
//        Calendar c2 = Calendar.getInstance();
////
//        int h1 = c1.get(Calendar.HOUR_OF_DAY);
//        int m1 = c1.get(Calendar.MINUTE);
//        int s1 = c1.get(Calendar.SECOND);
////
//        int h2 = c2.get(Calendar.HOUR_OF_DAY);
//        int m2 = c2.get(Calendar.MINUTE);
//        int s2 = c2.get(Calendar.SECOND);
////
//        String ss1 = Integer.toString(h1) + ":" + Integer.toString(m1) + ":" + Integer.toString(s1);
//        String ss2 = Integer.toString(h2) + ":" + Integer.toString(m2) + ":" + Integer.toString(s2);
////
//        Date d1 = df.parse(ss1);
//        Date d2 = df.parse(ss2);
////
//        long time = d1.getTime() - d2.getTime(); // vreme čekanja do početka "blinkanja"
//        int speed = jComboBox.getSelectedIndex() + 1; // brzina "binkanja"
//JButton v = new JButton("klik");
//v.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//               Timer t = new Timer((int) time, new ActionListener()
//        {
//            
//            
//            @Override
//            public void actionPerformed(ActionEvent e)
//            {
//                ColorFrame.startTheShow();
//            }
//        });
//               t.start();
//            }
//        });
//        Timer t = new Timer((int) time, new ActionListener()
//        {
//            
//            
//            @Override
//            public void actionPerformed(ActionEvent e)
//            {
//                ColorFrame.startTheShow();
////                ColorFrame c = new ColorFrame();
////                ColorFrame colorFrame = new ColorFrame();
////                colorFrame.setVisible(true); // prikazuje se novi ColorFrame - prozor koji ste pojavljuje posle time-sekundi, blinka color-bojom i speed-brzinom
//            }
//        });
//        t.start();
        
//        f.add(v);
//        
//        f.add(boc);
//        f.add(jTextField1);
//        f.add(chooseButton);
//        f.add(colorLabel);
//        
//        
//        f.setLocationRelativeTo(null);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setVisible(true);
        
        
//        //Schedule a job for the event dispatch thread:
//        //creating and showing this application's GUI.
//        SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                //Turn off metal's use of bold fonts
//	        UIManager.put("swing.boldMetal", Boolean.FALSE);
//                createAndShowGUI();
//            }
//        });
    }
//
//    //Compute the monthly payment based on the loan amount,
//    //APR, and length of loan.
//    double computePayment(double loanAmt, double rate, int numPeriods) {
//        double I, partial1, denominator, answer;
//
//        numPeriods *= 12;        //get number of months
//        if (rate > 0.01) {
//            I = rate / 100.0 / 12.0;         //get monthly rate from annual
//            partial1 = Math.pow((1 + I), (0.0 - numPeriods));
//            denominator = (1 - partial1) / I;
//        } else { //rate ~= 0
//            denominator = numPeriods;
//        }
//
//        answer = (-1 * loanAmt) / denominator;
//        return answer;
//    }
//
//    //Create and set up number formats. These objects also
//    //parse numbers input by user.
//    private void setUpFormats() {
//        amountFormat = NumberFormat.getNumberInstance();
//
//        percentFormat = NumberFormat.getNumberInstance();
//        percentFormat.setMinimumFractionDigits(3);
//
//        paymentFormat = NumberFormat.getCurrencyInstance();
//    }
}