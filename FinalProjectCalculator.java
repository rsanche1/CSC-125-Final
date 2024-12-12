import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
/*/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import javax.swing.JTextField;

/**
 *
 * @author Ahmed and Rodrigo
 */
public class FinalProjectCalculatorTester extends javax.swing.JFrame {
    private double a;// first number
    private double b; // second number 
    private boolean isFirstNumberSet = false; // Tracks if 'a' has been set
    private String operator = ""; // To store the operator
    private boolean isNewInput = true; // shows if the input is a new number
    
   
    
    /**
     * Creates new form Calculator
     */
    public FinalProjectCalculatorTester() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        sqrtButton = new javax.swing.JButton();
        sevenButton = new javax.swing.JButton();
        fourButton = new javax.swing.JButton();
        oneButton = new javax.swing.JButton();
        expButton = new javax.swing.JButton();
        logButton = new javax.swing.JButton();
        eightButton = new javax.swing.JButton();
        fiveButton = new javax.swing.JButton();
        nineButton = new javax.swing.JButton();
        sixButton = new javax.swing.JButton();
        twoButton = new javax.swing.JButton();
        threeButton = new javax.swing.JButton();
        zeroButton = new javax.swing.JButton();
        divideButton = new javax.swing.JButton();
        multiplyButton = new javax.swing.JButton();
        subtractButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        equalButton = new javax.swing.JButton();
        dotButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
       
       

        sqrtButton.setText("√");
        sqrtButton.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                jButton1ActionPerformed(evt);
                if (isNewInput) {
                    a = Double.parseDouble(jTextField1.getText()); // Get the number for the square root
                    operator = "sqrt"; // Set the operator for square root
                    jTextField1.setText(""); // Clear the text field for the next input
                    isNewInput = false; 
                }

            }
        });

        sevenButton.setText("7");
        sevenButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {
                jTextField1.setText(jTextField1.getText() + "7");

            }
        });
        

        fourButton.setText("4");
        fourButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {
                jTextField1.setText(jTextField1.getText() + "4");

            }
        });
        
        
       

        oneButton.setText("1");
        oneButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae)
            {
                jTextField1.setText(jTextField1.getText() + "1");

            }
        });

        expButton.setText("^");
        expButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
             {
                if (isNewInput) {
                    a = Double.parseDouble(jTextField1.getText()); // Store the first number
                    operator = "^"; 
                    jTextField1.setText(""); // Clear the text field for the second number
                    isNewInput = false; 
                }
         
            }
        });

        logButton.setText("log");
        logButton.addActionListener(new java.awt.event.ActionListener() 
        {

            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                
                jButton6ActionPerformed(evt);
                if (isNewInput) {
                    a = Double.parseDouble(jTextField1.getText()); // Store the first number
                    operator = "log"; // Set the operator for logarithm
                    jTextField1.setText(""); // Clear the text field for the second number
                    isNewInput = false; 
                }
            }
        });

        eightButton.setText("8");
        eightButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae)
            {
                jTextField1.setText(jTextField1.getText() + "8");

            }
        });
        

        fiveButton.setText("5");
        fiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
                jTextField1.setText(jTextField1.getText() + "5");
            }
        });

        nineButton.setText("9");
        nineButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {
                jTextField1.setText(jTextField1.getText() + "9");

            }
        });

        sixButton.setText("6");
        sixButton.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
             {
                jButton10ActionPerformed(evt);
               jTextField1.setText(jTextField1.getText() + "6");
            }
        });

        twoButton.setText("2");
        twoButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae)
            {
                jTextField1.setText(jTextField1.getText() + "2");
       
            }
        });

        threeButton.setText("3");
        threeButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae)
            {
                jTextField1.setText(jTextField1.getText() + "3");

            }
        });

        zeroButton.setText("0");
        zeroButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {
                jTextField1.setText(jTextField1.getText() + "0");

            }
        });

        divideButton.setText("/");
        divideButton.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent ae)
            {   
                if (isNewInput) {
                    a = Double.parseDouble(jTextField1.getText()); // Store the first number
                    operator = "/"; // Set the operator
                    jTextField1.setText(""); // Clear the text field for the second number
                    isNewInput = false; 
                }
            }
        });

        multiplyButton.setText("*");
        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            { 
                if (isNewInput) {
                    a = Double.parseDouble(jTextField1.getText()); // Store the first number
                    operator = "*"; // Set the operator
                    jTextField1.setText(""); // Clear the text field for the second number
                    isNewInput = false; 
                }
            }
            
        });

        subtractButton.setText("-");
        subtractButton.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent ae)
            {
                if (isNewInput) {
                    a = Double.parseDouble(jTextField1.getText()); // Store the first number
                    operator = "-"; // Set the operator
                    jTextField1.setText(""); // Clear the text field for the second number
                    isNewInput = false; 
                }

            }
        });

        addButton.setText("+");
       addButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae)
            {
                if (isNewInput) {
                    a = Double.parseDouble(jTextField1.getText()); // Store the first number
                    operator = "+"; // Set the operator
                    jTextField1.setText(""); // Clear the text field for the second number
                    isNewInput = false;
                }

            }
        });

        deleteButton.setText("delete");
        deleteButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae)
            {
               jTextField1.setText("");
               
                operator = "";
                isNewInput = true;

            }
        });

        equalButton.setText("=");
        equalButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae)
            {
                if (!isNewInput) {
                    b = Double.parseDouble(jTextField1.getText()); // Get the second number
                    double result = 0;
        
                    // Perform calculation based on the operator
                    if (operator.equals("*"))
                     {
                        result = Operations.multiply(a, b);
                    } else if (operator.equals("+")) {

                        result = Operations.add(a, b);

                    } else if (operator.equals("-")) 
                    {
                        result = Operations.subtract(a, b);

                    } else if (operator.equals("/"))
                     {
                        result = Operations.divide(a, b);

                    } else if (operator.equals("^")) 
                    {
                        result = Operations.power(a, b);

                    } else if (operator.equals("log"))
                     {
                        result = Operations.log(a); // Log is handled with rounding
                        
                    } else if (operator.equals("sqrt")) {
                        result = Operations.squareRoot(a); // Square root operation
                    }
        
                    // Show the result
                    jTextField1.setText(String.valueOf(result));
                    isNewInput = true; // Set it back for the next calculation
                }
            }
        });

        dotButton.setText(".");
        dotButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae)
            {
                jTextField1.setText(jTextField1.getText() + ".");

            }
        });

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sevenButton)
                    .addComponent(sqrtButton)
                    .addComponent(fourButton)
                    .addComponent(oneButton)
                    .addComponent(zeroButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fiveButton)
                                .addGap(18, 18, 18)
                                .addComponent(sixButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(twoButton)
                                    .addComponent(dotButton))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(threeButton)
                                    .addComponent(equalButton))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(addButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(deleteButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(subtractButton)
                                .addGap(9, 9, 9))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(eightButton)
                            .addGap(18, 18, 18)
                            .addComponent(nineButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(multiplyButton))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(expButton)
                            .addGap(17, 17, 17)
                            .addComponent(logButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(divideButton))))
                .addContainerGap(144, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sqrtButton)
                    .addComponent(expButton)
                    .addComponent(logButton)
                    .addComponent(divideButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sevenButton)
                    .addComponent(eightButton)
                    .addComponent(nineButton)
                    .addComponent(multiplyButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fourButton)
                    .addComponent(fiveButton)
                    .addComponent(sixButton)
                    .addComponent(subtractButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(twoButton)
                    .addComponent(oneButton)
                    .addComponent(threeButton)
                    .addComponent(addButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zeroButton)
                    .addComponent(deleteButton)
                    .addComponent(equalButton)
                    .addComponent(dotButton))
                .addContainerGap(172, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        


   
  

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FinalProjectCalculatorTester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalProjectCalculatorTester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalProjectCalculatorTester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalProjectCalculatorTester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalProjectCalculatorTester().setVisible(true);
            }
        });
    
      
    
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton sqrtButton;
    private javax.swing.JButton sixButton;
    private javax.swing.JButton twoButton;
    private javax.swing.JButton threeButton;
    private javax.swing.JButton zeroButton;
    private javax.swing.JButton divideButton;
    private javax.swing.JButton multiplyButton;
    private javax.swing.JButton subtractButton;
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton equalButton;
    private javax.swing.JButton sevenButton;
    private javax.swing.JButton dotButton;
    private javax.swing.JButton fourButton;
    private javax.swing.JButton oneButton;
    private javax.swing.JButton expButton;
    private javax.swing.JButton logButton;
    private javax.swing.JButton eightButton;
    private javax.swing.JButton fiveButton;
    private javax.swing.JButton nineButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration                   
}


