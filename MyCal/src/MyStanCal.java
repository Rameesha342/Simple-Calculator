
public class MyStanCal extends javax.swing.JFrame {
    double inp1;
    double inp2;
    double res;
    String ope;
   
    
    public MyStanCal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        text = new javax.swing.JTextField();
        Btn1 = new javax.swing.JButton();
        Btn2 = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        Btn5 = new javax.swing.JButton();
        Btn6 = new javax.swing.JButton();
        Btn7 = new javax.swing.JButton();
        Btn8 = new javax.swing.JButton();
        Btn9 = new javax.swing.JButton();
        Btn10 = new javax.swing.JButton();
        Btn11 = new javax.swing.JButton();
        Btn12 = new javax.swing.JButton();
        Btn13 = new javax.swing.JButton();
        Btn14 = new javax.swing.JButton();
        Btn15 = new javax.swing.JButton();
        Btn16 = new javax.swing.JButton();
        Btn17 = new javax.swing.JButton();
        Btn18 = new javax.swing.JButton();
        Btn19 = new javax.swing.JButton();
        Btn20 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("A & R's CALCULATOR"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        text.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFocusLost(evt);
            }
        });

        Btn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn1.setText("CE");
        Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1ActionPerformed(evt);
            }
        });

        Btn2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn2.setText("C");
        Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2ActionPerformed(evt);
            }
        });

        Btn3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn3.setForeground(new java.awt.Color(255, 0, 0));
        Btn3.setText("OF");
        Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3ActionPerformed(evt);
            }
        });

        Btn4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn4.setText("/");
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4ActionPerformed(evt);
            }
        });

        Btn5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn5.setText("8");
        Btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn5ActionPerformed(evt);
            }
        });

        Btn6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn6.setText("9");
        Btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn6ActionPerformed(evt);
            }
        });

        Btn7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn7.setText("_");
        Btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn7ActionPerformed(evt);
            }
        });

        Btn8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn8.setText("7");
        Btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn8ActionPerformed(evt);
            }
        });

        Btn9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn9.setText("5");
        Btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn9ActionPerformed(evt);
            }
        });

        Btn10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn10.setText("6");
        Btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn10ActionPerformed(evt);
            }
        });

        Btn11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn11.setText("× ");
        Btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn11ActionPerformed(evt);
            }
        });

        Btn12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn12.setText("4");
        Btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn12ActionPerformed(evt);
            }
        });

        Btn13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn13.setText("2");
        Btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn13ActionPerformed(evt);
            }
        });

        Btn14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn14.setText("3");
        Btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn14ActionPerformed(evt);
            }
        });

        Btn15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn15.setText("+");
        Btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn15ActionPerformed(evt);
            }
        });

        Btn16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn16.setText("1");
        Btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn16ActionPerformed(evt);
            }
        });

        Btn17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn17.setText(".");
        Btn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn17ActionPerformed(evt);
            }
        });

        Btn18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn18.setText("%");
        Btn18.setToolTipText("");
        Btn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn18ActionPerformed(evt);
            }
        });

        Btn19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn19.setText("=");
        Btn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn19ActionPerformed(evt);
            }
        });

        Btn20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn20.setText("0");
        Btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_textFocusLost

    private void Btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn5ActionPerformed
        String num=text.getText()+Btn5.getText();
        text.setText(num);
    }//GEN-LAST:event_Btn5ActionPerformed

    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed
      String bkspc=null;
      
      if(text.getText().length()>0)
      {
          StringBuilder s1=new StringBuilder(text.getText());
          s1.deleteCharAt(text.getText().length()-1);
          bkspc=s1.toString();
          text.setText(bkspc);
      }
    }//GEN-LAST:event_Btn1ActionPerformed

    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
        text.setText("");
    }//GEN-LAST:event_Btn2ActionPerformed

    private void Btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn8ActionPerformed
       String num=text.getText()+Btn8.getText();
        text.setText(num);
    }//GEN-LAST:event_Btn8ActionPerformed

    private void Btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn6ActionPerformed
        String num=text.getText()+Btn6.getText();
        text.setText(num);
    }//GEN-LAST:event_Btn6ActionPerformed

    private void Btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn12ActionPerformed
      String num=text.getText()+Btn12.getText();
        text.setText(num);
    }//GEN-LAST:event_Btn12ActionPerformed

    private void Btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn9ActionPerformed
       String num=text.getText()+Btn9.getText();
        text.setText(num);
    }//GEN-LAST:event_Btn9ActionPerformed

    private void Btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn10ActionPerformed
       String num=text.getText()+Btn10.getText();
        text.setText(num);
    }//GEN-LAST:event_Btn10ActionPerformed

    private void Btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn16ActionPerformed
     String num=text.getText()+Btn16.getText();
        text.setText(num);
    }//GEN-LAST:event_Btn16ActionPerformed

    private void Btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn13ActionPerformed
        String num=text.getText()+Btn13.getText();
        text.setText(num);
    }//GEN-LAST:event_Btn13ActionPerformed

    private void Btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn14ActionPerformed
     String num=text.getText()+Btn14.getText();
        text.setText(num);
    }//GEN-LAST:event_Btn14ActionPerformed

    private void Btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn20ActionPerformed
      String num=text.getText()+Btn20.getText();
        text.setText(num);
    }//GEN-LAST:event_Btn20ActionPerformed

    private void Btn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn17ActionPerformed
       String num=text.getText()+Btn17.getText();
        text.setText(num);
    }//GEN-LAST:event_Btn17ActionPerformed

    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Btn3ActionPerformed

    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
        inp1=Double.parseDouble(text.getText());
        text.setText("");
        ope="/";  
        
    }//GEN-LAST:event_Btn4ActionPerformed

    private void Btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn7ActionPerformed
        inp1=Double.parseDouble(text.getText());
        text.setText("");
        ope="-"; 
        
    }//GEN-LAST:event_Btn7ActionPerformed

    private void Btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn11ActionPerformed
       inp1=Double.parseDouble(text.getText());
        text.setText("");
        ope="*"; 
        
    }//GEN-LAST:event_Btn11ActionPerformed

    private void Btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn15ActionPerformed
        inp1=Double.parseDouble(text.getText());
        text.setText("");
        ope="+";    
    }//GEN-LAST:event_Btn15ActionPerformed

    private void Btn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn19ActionPerformed
        String Ans;
        inp2=Double.parseDouble(text.getText());
        if(ope=="+")
        {
          res=inp1+inp2;
          Ans=String.format("%.0f", res);
          text.setText(Ans);
        }
        else if(ope=="+")
        {
          res=inp1+inp2;
          Ans=String.format("%.0f", res);
          text.setText(Ans);
        }
        else if(ope=="-")
        {
          res=inp1-inp2;
          Ans=String.format("%.0f", res);
          text.setText(Ans);
        }
        else if(ope=="*")
        {
          res=inp1*inp2;
          Ans=String.format("%.0f", res);
          text.setText(Ans);
        }
        else if(ope=="/")
        {
          res=inp1/inp2;
          Ans=String.format("%.0f", res);
          text.setText(Ans);
        }
        else if(ope=="%")
        {
          res=inp1%inp2;
          Ans=String.format("%.0f", res);
          text.setText(Ans);
        }
        
        
        
        
        
        
    /*text.setText(text.getText()+" = ");
    String str=text.getText();
    String[] substr=str.split("\\s+");
    float inp1=Float.parseFloat(substr[0]);
    float inp2=Float.parseFloat(substr[2]);
    
    if(cal==1)
    {
       text.setText(text.getText()+" "+(inp1+inp2));
    }
    if(cal==2)
    {
        text.setText(text.getText()+" "+(inp1-inp2));
    }    
    if(cal==3)
    {
          text.setText(text.getText()+" "+(inp1*inp2));
    } 
    if(cal==4)
    {
            text.setText(text.getText()+" "+(inp1/inp2));
    }
    if(cal==5)
    {
            text.setText(text.getText()+" "+(inp1%inp2));
    }
    */
    }//GEN-LAST:event_Btn19ActionPerformed

    private void Btn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn18ActionPerformed
        inp1=Double.parseDouble(text.getText());
        text.setText("");
        ope="%";  
        
    }//GEN-LAST:event_Btn18ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyStanCal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn10;
    private javax.swing.JButton Btn11;
    private javax.swing.JButton Btn12;
    private javax.swing.JButton Btn13;
    private javax.swing.JButton Btn14;
    private javax.swing.JButton Btn15;
    private javax.swing.JButton Btn16;
    private javax.swing.JButton Btn17;
    private javax.swing.JButton Btn18;
    private javax.swing.JButton Btn19;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn20;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton Btn5;
    private javax.swing.JButton Btn6;
    private javax.swing.JButton Btn7;
    private javax.swing.JButton Btn8;
    private javax.swing.JButton Btn9;
    private javax.swing.JTextField text;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
