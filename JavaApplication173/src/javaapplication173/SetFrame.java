package javaapplication173;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingWorker;

public class SetFrame extends JFrame{
    SwingWorker sw;  
    boolean start;  
    Object appTime;  
    long razlika;  
    
    
    private JCheckBox box1;
    private JCheckBox box2;
    private JTextField tf1;
    private JTextField tf2;
    private JLabel label1;
    private JLabel label2;
   
    
    public SetFrame() {
        initComponents();
//        this.appTime = jSpinner1.getValue();
    }
    
    public void initComponents() {
        box1 = new JCheckBox();
        box2 = new JCheckBox();
        
        box1.setText("on time");
        box1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                jCheckBox1ItemStateChanged(ie);
            }
        });
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Applikacija");
        setSize(new Dimension(500, 400));
        box2.setText("countdown(mins)");
        box2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                jCheckBox2ItemStateChanged(ie);
            }
        });
        SpringLayout layout = new SpringLayout();
        getContentPane().setLayout(layout);
        layout.addLayoutComponent(this, appTime);
//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());  
//      getContentPane().setLayout(layout);  
//      layout.setHorizontalGroup(  
//        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
//        .addGroup(layout.createSequentialGroup
//            .addGap(56, 56, 56)  
//          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)  
//            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()  
////              .addComponent(speedLabel)  
//              .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))  
//            .addGroup(layout.createSequentialGroup()  
//              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)  
//                .addGroup(layout.createSequentialGroup()  
//                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)  
////                    .addComponent(chooseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                    .addComponent(box1)  
//                    .addComponent(box2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))  
//                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)  
//                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
////                    .addComponent(jSpinner2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)  
////                    .addComponent(jSpinner1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
////                    .addComponent(colorLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
//                  )
//                )
////                .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)  
//                .addGroup(layout.createSequentialGroup()  
//                  .addGap(0, 0, Short.MAX_VALUE)  
////                  .addComponent(startButton)  
//                  .addGap(18, 18, 18)  
////                  .addComponent(stopButton)
//                )
//              )  
//              .addGap(57, 57, 57))))  
//      );  
//      layout.setVerticalGroup(  
//        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
//        .addGroup(layout.createSequentialGroup()  
//          .addGap(50, 50, 50)  
//          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)  
//            .addComponent(box1)  
////            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//          )  
//          .addGap(18, 18, 18)  
//          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)  
//            .addComponent(box2)  
////            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//          )
//          .addGap(36, 36, 36)  
//          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)  
////            .addComponent(chooseButton)  
////            .addComponent(colorLabel)
//          )
//          .addGap(35, 35, 35)  
////          .addComponent(speedLabel)  
////          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)  
////          .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//          .addGap(38, 38, 38)  
//          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)  
////            .addComponent(stopButton)  
////            .addComponent(startButton)
//          )
////          .addContainerGap(66, Short.MAX_VALUE)
//        )  
//      );  
    
      pack();  
//    }// </editor-fold>   
        
    }
    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {                        
      box1.setEnabled(false);  
//      jSpinner2.setEnabled(false);  
    }
    private void jCheckBox2ItemStateChanged(java.awt.event.ItemEvent evt) {                        
      box2.setEnabled(false);  
//      jSpinner1.setEnabled(false);  
    }
    
//    private javax.swing.JButton chooseButton;  
//    private javax.swing.JLabel colorLabel;  
//    private javax.swing.JCheckBox jCheckBox1;  
//    private javax.swing.JCheckBox jCheckBox2;  
//    private javax.swing.JSlider jSlider1;  
//    private javax.swing.JSpinner jSpinner1;  
//    private javax.swing.JSpinner jSpinner2;  
//    private javax.swing.JLabel speedLabel;  
//    private javax.swing.JButton startButton;  
//    private javax.swing.JButton stopButton;  
    
}
    
    
//    public SetFrame() {  
//      initComponents();  
//      //this.appTime = new java.util.Date();  
//      this.appTime = jSpinner1.getValue();  
//    }  
//    
//    /**  
//25:     * This method is called from within the constructor to initialize the form.  
//26:     * WARNING: Do NOT modify this code. The content of this method is always  
//27:     * regenerated by the Form Editor.  
//28:     */  
//    @SuppressWarnings("unchecked")  
//    // <editor-fold defaultstate="collapsed" desc="Generated Code">               
//    private void initComponents() {  
//    
//      jCheckBox1 = new javax.swing.JCheckBox();  
//      jCheckBox2 = new javax.swing.JCheckBox();  
//      jSpinner1 = new javax.swing.JSpinner();  
//      jSpinner2 = new javax.swing.JSpinner();  
//      chooseButton = new javax.swing.JButton();  
//      colorLabel = new javax.swing.JLabel();  
//      speedLabel = new javax.swing.JLabel();  
//      jSlider1 = new javax.swing.JSlider();  
//      stopButton = new javax.swing.JButton();  
//      startButton = new javax.swing.JButton();  
//    
//      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);  
//      setTitle("TA \\ Settings");  
//      setBackground(new java.awt.Color(44, 62, 80));  
//      setSize(new java.awt.Dimension(500, 400));  
//    
//      jCheckBox1.setBackground(new Color (44,62,80));  
//      jCheckBox1.setForeground(java.awt.Color.white);  
//      jCheckBox1.setText("On time:");  
//      jCheckBox1.addItemListener(new java.awt.event.ItemListener() {  
//        public void itemStateChanged(java.awt.event.ItemEvent evt) {  
//          jCheckBox1ItemStateChanged(evt);  
//        }  
//      });  
//      jCheckBox1.addActionListener(new java.awt.event.ActionListener() {  
//        public void actionPerformed(java.awt.event.ActionEvent evt) {  
//          jCheckBox1ActionPerformed(evt);  
//        }  
//      });  
//    
//      jCheckBox2.setBackground(new Color (44,62,80));  
//      jCheckBox2.setForeground(java.awt.Color.white);  
//      jCheckBox2.setText("Countdown (mins):");  
//      jCheckBox2.addItemListener(new java.awt.event.ItemListener() {  
//        public void itemStateChanged(java.awt.event.ItemEvent evt) {  
//          jCheckBox2ItemStateChanged(evt);  
//        }  
//      });  
//    
//      jSpinner1.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.MINUTE));  
//      jSpinner1.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner1, "HH:mm:ss"));  
//    
//      jSpinner2.setModel(new javax.swing.SpinnerNumberModel());  
//    
//      chooseButton.setText("Choose color");  
//      chooseButton.addActionListener(new java.awt.event.ActionListener() {  
//        public void actionPerformed(java.awt.event.ActionEvent evt) {  
//          chooseButtonActionPerformed(evt);  
//        }  
//      });  
//    
//      colorLabel.setForeground(java.awt.Color.white);  
//      colorLabel.setText("No color selected");  
//    
//      speedLabel.setForeground(java.awt.Color.white);  
//      speedLabel.setText("Speed (ms):");  
//    
//      jSlider1.setBackground(new Color (44,62,80));  
//      jSlider1.setForeground(java.awt.Color.white);  
//      jSlider1.setMajorTickSpacing(400);  
//      jSlider1.setMaximum(3000);  
//      jSlider1.setMinimum(100);  
//      jSlider1.setMinorTickSpacing(200);  
//      jSlider1.setPaintLabels(true);  
//      jSlider1.setPaintTicks(true);  
//      jSlider1.setValue(1550);  
//    
//      stopButton.setText("Stop");  
//      stopButton.addActionListener(new java.awt.event.ActionListener() {  
//        public void actionPerformed(java.awt.event.ActionEvent evt) {  
//          stopButtonActionPerformed(evt);  
//        }  
//      });  
//    
//      startButton.setText("Start");  
//      startButton.addActionListener(new java.awt.event.ActionListener() {  
//        public void actionPerformed(java.awt.event.ActionEvent evt) {  
//          startButtonActionPerformed(evt);  
//        }  
//      });  
//    
//      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());  
//      getContentPane().setLayout(layout);  
//      layout.setHorizontalGroup(  
//        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
//        .addGroup(layout.createSequentialGroup()  
//          .addGap(56, 56, 56)  
//          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)  
//            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()  
//              .addComponent(speedLabel)  
//              .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))  
//            .addGroup(layout.createSequentialGroup()  
//              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)  
//                .addGroup(layout.createSequentialGroup()  
//                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)  
//                    .addComponent(chooseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)  
//                    .addComponent(jCheckBox1)  
//                    .addComponent(jCheckBox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))  
//                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)  
//                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
//                    .addComponent(jSpinner2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)  
//                    .addComponent(jSpinner1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)  
//                    .addComponent(colorLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))  
//                .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)  
//                .addGroup(layout.createSequentialGroup()  
//                  .addGap(0, 0, Short.MAX_VALUE)  
//                  .addComponent(startButton)  
//                  .addGap(18, 18, 18)  
//                  .addComponent(stopButton)))  
//              .addGap(57, 57, 57))))  
//      );  
//      layout.setVerticalGroup(  
//        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
//        .addGroup(layout.createSequentialGroup()  
//          .addGap(50, 50, 50)  
//          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)  
//            .addComponent(jCheckBox1)  
//            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))  
//          .addGap(18, 18, 18)  
//          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)  
//            .addComponent(jCheckBox2)  
//            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))  
//          .addGap(36, 36, 36)  
//          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)  
//            .addComponent(chooseButton)  
//            .addComponent(colorLabel))  
//          .addGap(35, 35, 35)  
//          .addComponent(speedLabel)  
//          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)  
//          .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)  
//          .addGap(38, 38, 38)  
//          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)  
//            .addComponent(stopButton)  
//            .addComponent(startButton))  
//          .addContainerGap(66, Short.MAX_VALUE))  
//      );  
//    
//      pack();  
//    }// </editor-fold>              
//    
//    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {                        
//      jCheckBox2.setEnabled(false);  
//      jSpinner2.setEnabled(false);  
//    }                        
//    
//    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {                        
//      // TODO add your handling code here:  
//    }                       
//    
//    private void jCheckBox2ItemStateChanged(java.awt.event.ItemEvent evt) {                        
//      jCheckBox1.setEnabled(false);  
//      jSpinner1.setEnabled(false);  
//    }                        
//    
//    private void chooseButtonActionPerformed(java.awt.event.ActionEvent evt) {                         
//      JColorChooser jcc = new JColorChooser();  
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
//    }                        
//    
//    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {                        
//        
//      jCheckBox1.setEnabled(false);  
//      jCheckBox2.setEnabled(false);  
//      jSpinner1.setEnabled(false);  
//      jSpinner2.setEnabled(false);  
//      chooseButton.setEnabled(false);  
//      speedLabel.setEnabled(false);  
//      jSlider1.setEnabled(false);  
//      startButton.setEnabled(false);  
//        
////      Data d = new Data();  
//        
////      d.setColor(colorLabel.getBackground());  
////      d.setSpeed(jSlider1.getValue());  
//        
//      if (jCheckBox1.isSelected()){  
//        start = true;  
//        Object set = jSpinner1.getValue();  
//        String setTime = new SimpleDateFormat("HH:mm:ss").format(set);  
//        String appTime1 = new SimpleDateFormat("HH:mm:ss").format(appTime);  
//        try {  
//          SimpleDateFormat form = new SimpleDateFormat("HH:mm:ss");  
//          Date d1 = form.parse(setTime);  
//          Date d2 = form.parse(appTime1);  
//          razlika = d1.getTime() - d2.getTime();  
//        } catch (Exception e) {  
//          JOptionPane.showMessageDialog(null, e.getMessage());  
//        }           
//          
//        sw = new SwingWorker() {  
//          @Override  
//          protected Object doInBackground() throws Exception {  
//            Thread.sleep(razlika);  
////            ColorFrame.startTheShow();  
//            while(start){  
////              ColorFrame.cf.getContentPane().setBackground(d.getColor());  
////              Thread.sleep(d.getSpeed());  
//////              ColorFrame.cf.getContentPane().setBackground(new Color (44,62,80));  
////              Thread.sleep(d.getSpeed());  
//            }     
//            return null;   
//          }  
//          @Override  
//          protected void done () {  
//            JOptionPane.showMessageDialog(null,"Thanks for watching!");  
////            ColorFrame.cf.dispose();  
////            d.setColor(null);  
//            jSpinner1.setValue(new java.util.Date());  
//            start = false;  
//          }  
//        };  
//        sw.execute();  
//      }  
//        
//      else if (jCheckBox2.isSelected()) {  
////        d.setTime2((Integer)jSpinner2.getValue());  
//        start = true;  
//        sw = new SwingWorker() {         
//          @Override  
//          protected Object doInBackground() throws Exception {  
////            Thread.sleep(d.getTime2()*60000);  
////            ColorFrame.startTheShow();  
//            while(start){  
////              ColorFrame.cf.getContentPane().setBackground(d.getColor());  
////              Thread.sleep(d.getSpeed());  
////              ColorFrame.cf.getContentPane().setBackground(new Color (44,62,80));  
////              Thread.sleep(d.getSpeed());  
//            }   
//            return null;  
//          }  
//          @Override  
//          protected void done () {  
//            JOptionPane.showMessageDialog(null,"Thanks for watching!");  
////            ColorFrame.cf.dispose();  
////            d.setColor(null);  
//            start = false;  
//          }  
//        };  
//        sw.execute();  
//      }  
//      else {  
//        JOptionPane.showMessageDialog(this, "No checkbox selected!");  
//      }  
//        
//    }                        
//    
//    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {                        
//      sw.cancel(false);  
//      jCheckBox1.setEnabled(true);  
//      jCheckBox2.setEnabled(true);  
//      jSpinner1.setEnabled(true);  
//      jSpinner2.setEnabled(true);  
//      chooseButton.setEnabled(true);  
//      speedLabel.setEnabled(true);  
//      jSlider1.setEnabled(true);  
//      startButton.setEnabled(true);  
//      colorLabel.setBackground(null);  
//      colorLabel.setText("No color selected");  
//    }                       
//    
//    /**  
//     * @param args the command line arguments  
//     */  
//    public static void main(String args[]) {  
//      /* Set the Nimbus look and feel */  
//      //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">  
//      /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.  
//309:       * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html   
//310:       */  
//      try {  
//        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {  
//          if ("Nimbus".equals(info.getName())) {  
//            javax.swing.UIManager.setLookAndFeel(info.getClassName());  
//            break;  
//          }  
//        }  
//      } catch (ClassNotFoundException ex) {  
//        java.util.logging.Logger.getLogger(SetFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);  
//      } catch (InstantiationException ex) {  
//        java.util.logging.Logger.getLogger(SetFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);  
//      } catch (IllegalAccessException ex) {  
//        java.util.logging.Logger.getLogger(SetFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);  
//      } catch (javax.swing.UnsupportedLookAndFeelException ex) {  
//        java.util.logging.Logger.getLogger(SetFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);  
//      }  
//      //</editor-fold>  
//    
//      /* Create and display the form */  
//      java.awt.EventQueue.invokeLater(new Runnable() {  
//        public void run() {  
//          new SetFrame().setVisible(true);  
//        }  
//      });  
//    }  
//    
//    // Variables declaration - do not modify             
//    private javax.swing.JButton chooseButton;  
//    private javax.swing.JLabel colorLabel;  
//    private javax.swing.JCheckBox jCheckBox1;  
//    private javax.swing.JCheckBox jCheckBox2;  
//    private javax.swing.JSlider jSlider1;  
//    private javax.swing.JSpinner jSpinner1;  
//    private javax.swing.JSpinner jSpinner2;  
//    private javax.swing.JLabel speedLabel;  
//    private javax.swing.JButton startButton;  
//    private javax.swing.JButton stopButton;  
//    // End of variables declaration        
//}