/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.u1a3_robertchen;

/**
 *
 * @author julia
 */
public class ArrayProgram extends javax.swing.JFrame {
    String userInput;
    int number, times = 0;
    int[] array = new int[20];
    /**
     * Creates new form ArrayProgram
     */
    public ArrayProgram() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        prompt = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        output = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listOutput = new javax.swing.JTextArea();
        sum = new javax.swing.JButton();
        sumEven = new javax.swing.JButton();
        sumOdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 0, 51));
        title.setText("Integer Sums");

        prompt.setText("Enter an integer:");

        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        remove.setText("Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        output.setEditable(false);

        listOutput.setColumns(20);
        listOutput.setRows(5);
        jScrollPane1.setViewportView(listOutput);

        sum.setText("Sum");
        sum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumActionPerformed(evt);
            }
        });

        sumEven.setText("Sum of Even");
        sumEven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumEvenActionPerformed(evt);
            }
        });

        sumOdd.setText("Sum of Odd");
        sumOdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumOddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(prompt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(remove)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sumOdd)
                                    .addComponent(sumEven))
                                .addGap(50, 50, 50))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(sum)
                                .addGap(64, 64, 64))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(title)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prompt)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add)
                    .addComponent(remove))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(sum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sumEven)
                        .addGap(26, 26, 26)
                        .addComponent(sumOdd)
                        .addGap(26, 26, 26)))
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumActionPerformed
        int sum = 0;
        
        for (int i = 0; i < array.length; i++) {  
           sum += array[i];  
        }  
        output.setText("The sum of all the numbers are: " + sum);
    }//GEN-LAST:event_sumActionPerformed

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        userInput = input.getText();
         
        try {
            number = Integer.parseInt(userInput);
            if (number > 0) {
                times += 1;
                array[times] = number;
                listOutput.append(Integer.toString(array[times]) + "\n"); 
            } else {
                output.setText("Invalid input. Please enter a positive integer.");
            }
        } 
        catch (Exception e) {
            output.setText("Invalid input. Please enter a positive integer.");
        }
    }//GEN-LAST:event_addActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        userInput = input.getText();
        boolean check = false;
        
        try {
            number = Integer.parseInt(userInput);
            if (number > 0) {
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == number) {
                        check = true;
                        break;
                    }
                }
            }
            if (check == false) {
                output.setText("Number does not exist in array.");
            } else {
                times -= 1;
                for (int n = 0; n < array.length; n++) {
                    if (array[n] == number) {
                        array[n] = 0;
                        break; 
                    }
                }
                for (int x = 1; x < array.length; x++) {
                    if (array[x - 1] == 0) {
                        array[x - 1] = array[x];
                        array[x] = 0; 
                    }
                }
                listOutput.setText("");
                for (int y = 0; y < array.length; y++) {
                    if (array[y] != 0) {
                        listOutput.append(Integer.toString(array[y]) + "\n");
                    }
                }
            }
        }
        catch (Exception e) {
            output.setText("Invalid input. Please enter a positive integer.");
        }
    }//GEN-LAST:event_removeActionPerformed

    private void sumEvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumEvenActionPerformed
        int sumEven = 0;
        String even = "";
        
        for (int i = 0; i < array.length; i++) {  
           if (array[i] != 0 && array[i] % 2 == 0) {
               sumEven += array[i];
               even += Integer.toString(array[i]) + ", ";
               output.setText("The even integer(s) is/are: " + even + "and the sum of all even integers are: " + sumEven);
           } else if (array[i] != 0 && array[i] % 2 == 1) {
               output.setText("There are no even numbers");
           }  
        } 
    }//GEN-LAST:event_sumEvenActionPerformed

    private void sumOddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumOddActionPerformed
        int sumOdd = 0;
        String odd = "";
        
        for (int i = 0; i < array.length; i++) {  
           if (array[i] != 0 && array[i] % 2 == 1) {
               sumOdd += array[i];
               odd += Integer.toString(array[i]) + ", ";
               output.setText("The odd integer(s) is/are: " + odd + "and the sum of all odd integers are: " + sumOdd);
           } else if (array[i] != 0 && array[i] % 2 == 0) {
               output.setText("There are no odd numbers");
           } 
        } 
    }//GEN-LAST:event_sumOddActionPerformed

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
            java.util.logging.Logger.getLogger(ArrayProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArrayProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArrayProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArrayProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArrayProgram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField input;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea listOutput;
    private javax.swing.JTextField output;
    private javax.swing.JLabel prompt;
    private javax.swing.JButton remove;
    private javax.swing.JButton sum;
    private javax.swing.JButton sumEven;
    private javax.swing.JButton sumOdd;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
