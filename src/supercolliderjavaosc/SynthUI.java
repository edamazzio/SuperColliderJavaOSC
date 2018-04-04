/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supercolliderjavaosc;

import com.illposed.osc.OSCBundle;
import com.illposed.osc.OSCMessage;
import com.illposed.osc.OSCPacket;
import com.illposed.osc.OSCPort;
import com.illposed.osc.OSCPortOut;
import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author damazio
 */
public class SynthUI extends javax.swing.JFrame {
    boolean allOn = false;
    boolean s1On = false;
    boolean s2On = false;
    boolean s3On = false;
    private OSCPortOut oscPort;
    private String freqParameter = "freq";
    private String s1Name = "bass", s2Name = "vibrato", s3Name = "chords";
    private int node1 = 1000, node2 = 10001, node3 = 1002;


    /**
     * Creates new form NewJFrame
     */
    public SynthUI() {
        initComponents();
        try {
            this.oscPort = new OSCPortOut();
        } catch (SocketException | UnknownHostException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        s1FreqTXT = new javax.swing.JTextField();
        s1OffBTN = new javax.swing.JButton();
        s1OnBTN = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        s2OnBTN = new javax.swing.JButton();
        s2OffBTN = new javax.swing.JButton();
        jSlider2 = new javax.swing.JSlider();
        jLabel5 = new javax.swing.JLabel();
        s2FreqTXT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        s3OnBTN = new javax.swing.JButton();
        s3OffBTN = new javax.swing.JButton();
        jSlider3 = new javax.swing.JSlider();
        s3FreqTXT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        s1AmpSlider = new javax.swing.JSlider();
        s1AmpTXT = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        s2AmpSlider = new javax.swing.JSlider();
        s2AmpTXT = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        s3AmpSlider = new javax.swing.JSlider();
        s3AmpTXT = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Bass Synth");

        jSlider1.setMajorTickSpacing(1);
        jSlider1.setMaximum(244);
        jSlider1.setValue(244);

        jLabel3.setText("Frequency (Hz)");

        s1FreqTXT.setText("244.0");
        s1FreqTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1FreqTXTActionPerformed(evt);
            }
        });

        s1OffBTN.setText("Off");
        s1OffBTN.setEnabled(s1On);
        s1OffBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1OffBTNActionPerformed(evt);
            }
        });

        s1OnBTN.setText("On");
        s1OnBTN.setEnabled(!s1On);
        s1OnBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1OnBTNActionPerformed(evt);
            }
        });

        jLabel4.setText("Vibrato Synth");

        s2OnBTN.setText("On");
        s2OnBTN.setEnabled(!s2On);
        s2OnBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2OnBTNActionPerformed(evt);
            }
        });

        s2OffBTN.setText("Off");
        s2OffBTN.setEnabled(s2On);
        s2OffBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2OffBTNActionPerformed(evt);
            }
        });

        jSlider2.setMajorTickSpacing(1);
        jSlider2.setMaximum(20000);
        jSlider2.setMinimum(20);
        jSlider2.setValue(244);
        jSlider2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider2StateChanged(evt);
            }
        });

        jLabel5.setText("Frequency (Hz)");

        s2FreqTXT.setText("244.0");
        s2FreqTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2FreqTXTActionPerformed(evt);
            }
        });

        jLabel6.setText("Chords Synth");

        s3OnBTN.setText("On");
        s3OnBTN.setEnabled(!s3On);
        s3OnBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3OnBTNActionPerformed(evt);
            }
        });

        s3OffBTN.setText("Off");
        s3OffBTN.setEnabled(s3On);
        s3OffBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3OffBTNActionPerformed(evt);
            }
        });

        jSlider3.setMajorTickSpacing(1);
        jSlider3.setMaximum(127);
        jSlider3.setValue(48);
        jSlider3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider3StateChanged(evt);
            }
        });

        s3FreqTXT.setText("48");
        s3FreqTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3FreqTXTActionPerformed(evt);
            }
        });

        jLabel7.setText("Midi Note (0, 127)");

        jLabel8.setText("Amp (0-1)");

        s1AmpSlider.setMajorTickSpacing(1);

        s1AmpTXT.setText("1.0");
        s1AmpTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1AmpTXTActionPerformed(evt);
            }
        });

        jLabel9.setText("Amp (0-1)");

        s2AmpSlider.setMajorTickSpacing(1);

        s2AmpTXT.setText("1.0");
        s2AmpTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2AmpTXTActionPerformed(evt);
            }
        });

        jLabel10.setText("Amp (0-1)");

        s3AmpSlider.setMajorTickSpacing(1);

        s3AmpTXT.setText("1.0");
        s3AmpTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3AmpTXTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(s1FreqTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(s1OnBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s1OffBTN)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(s2FreqTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(s2OnBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s2OffBTN)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSlider3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(s3FreqTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(s3OnBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s3OffBTN))
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(s1AmpSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(s1AmpTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(s2AmpSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(s2AmpTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(s3AmpSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(s3AmpTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(s3FreqTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(s3OnBTN)
                            .addComponent(s3OffBTN))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSlider3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(s2FreqTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(s2OnBTN)
                            .addComponent(s2OffBTN))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(s1FreqTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(s1OnBTN)
                            .addComponent(s1OffBTN))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(s1AmpTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(s1AmpSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(s2AmpTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(s2AmpSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(s3AmpTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(s3AmpSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(153, 153, 153))
        );

        jSlider1.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                JSlider mySlider = (JSlider) e.getSource();
                if (mySlider.getValueIsAdjusting()) {
                    float freq = (float) mySlider.getValue();
                    s1FreqTXT.setText(String.valueOf(freq));
                    sendFreqToSynth(freq, node1);
                    //doPrintValue(freq);
                    //doSendSlider(freq, 1000);
                }
            }

        });
        jSlider2.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                JSlider mySlider = (JSlider) e.getSource();
                if (mySlider.getValueIsAdjusting()) {
                    float freq = (float) mySlider.getValue();
                    s2FreqTXT.setText(String.valueOf(freq));
                    //doPrintValue(freq);
                    //doSendSlider(freq, 1000);
                }
            }

        });
        jSlider3.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                JSlider mySlider = (JSlider) e.getSource();
                if (mySlider.getValueIsAdjusting()) {
                    float freq = (float) mySlider.getValue();
                    s3FreqTXT.setText(String.valueOf(freq));
                    //doPrintValue(freq);
                    //doSendSlider(freq, 1000);
                }
            }

        });
        s1AmpSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                JSlider mySlider = (JSlider) e.getSource();
                if (mySlider.getValueIsAdjusting()) {
                    float freq = (float) mySlider.getValue();
                    s1AmpTXT.setText(String.valueOf(freq/100.0));
                    //doPrintValue(freq);
                    //doSendSlider(freq, 1000);
                }
            }

        });
        s2AmpSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                JSlider mySlider = (JSlider) e.getSource();
                if (mySlider.getValueIsAdjusting()) {
                    float freq = (float) mySlider.getValue();
                    s2AmpTXT.setText(String.valueOf(freq/100.0));
                    //doPrintValue(freq);
                    //doSendSlider(freq, 1000);
                }
            }

        });
        s3AmpSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                JSlider mySlider = (JSlider) e.getSource();
                if (mySlider.getValueIsAdjusting()) {
                    float freq = (float) mySlider.getValue();
                    s3AmpTXT.setText(String.valueOf(freq/100.0));
                    //doPrintValue(freq);
                    //doSendSlider(freq, 1000);
                }
            }

        });

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void s1FreqTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1FreqTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s1FreqTXTActionPerformed

    private void s1OffBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1OffBTNActionPerformed
        this.s1On = false;
        this.s1OffBTN.setEnabled(false);
        this.s1OnBTN.setEnabled(true);
        doSendOff(node1);
    }//GEN-LAST:event_s1OffBTNActionPerformed

    private void s1OnBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1OnBTNActionPerformed
        this.s1On = false;
        this.s1OffBTN.setEnabled(true);
        this.s1OnBTN.setEnabled(false);
        doSendOn(Float.parseFloat((s1FreqTXT.getText())), node1, s1Name);
    }//GEN-LAST:event_s1OnBTNActionPerformed

    private void s2OnBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2OnBTNActionPerformed
        this.s2On = false;
        this.s2OffBTN.setEnabled(true);
        this.s2OnBTN.setEnabled(false);
        doSendOn(Float.parseFloat((s1FreqTXT.getText())), node2, s2Name);
    }//GEN-LAST:event_s2OnBTNActionPerformed

    private void s2OffBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2OffBTNActionPerformed
        this.s2On = false;
        this.s2OffBTN.setEnabled(false);
        this.s2OnBTN.setEnabled(true);
         doSendOff(node2);
    }//GEN-LAST:event_s2OffBTNActionPerformed

    private void s2FreqTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2FreqTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s2FreqTXTActionPerformed

    private void jSlider2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider2StateChanged
        // Empty
    }//GEN-LAST:event_jSlider2StateChanged

    private void s3OnBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3OnBTNActionPerformed
        this.s3On = false;
        this.s3OffBTN.setEnabled(true);
        this.s3OnBTN.setEnabled(false);
        // TODO Enable s3
    }//GEN-LAST:event_s3OnBTNActionPerformed

    private void s3OffBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3OffBTNActionPerformed
        this.s3On = false;
        this.s3OffBTN.setEnabled(false);
        this.s3OnBTN.setEnabled(true);
        // TODO Disable s3
    }//GEN-LAST:event_s3OffBTNActionPerformed

    private void jSlider3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider3StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jSlider3StateChanged

    private void s3FreqTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3FreqTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s3FreqTXTActionPerformed

    private void s1AmpTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1AmpTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s1AmpTXTActionPerformed

    private void s2AmpTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2AmpTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s2AmpTXTActionPerformed

    private void s3AmpTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3AmpTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s3AmpTXTActionPerformed

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

                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    //break;
                }
                System.out.println(info.getName());
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SynthUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SynthUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SynthUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SynthUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SynthUI().setVisible(true);
            }
        });
    }
    
    private void sendFreqToSynth(Float freq, int node){
        List<Object> args = new ArrayList<Object>(3);
            args.add(node);
            args.add("freq");
            args.add(freq);
            OSCMessage msg = new OSCMessage("/n_set", args);
            try {
                oscPort.send(msg);
            } catch (Exception e) {
                showError("Couldn't send");
            }
    }
    
    protected void showError(String anErrorMessage) {
        // tell the JOptionPane to showMessageDialog
        JOptionPane.showMessageDialog(this, anErrorMessage);
}
    
    private void doSendOn(float freq, int node, String synthName) {

        List<Object> args = new ArrayList<>(6);
        args.add(synthName);
        args.add(node);
        args.add(1);
        args.add(0);
        args.add("freq");
        args.add(freq);
        OSCMessage msg = new OSCMessage("/s_new", args);

        try {
            oscPort.send(msg);
        } catch (IOException ex) {
            showError("Couldn't send");
        }
    }
    
    public void doSendOff(int node) {
        // send an OSC message to free the node 1000
        List<Object> args = new ArrayList<>(1);
        args.add(node);
        OSCMessage msg = new OSCMessage("/n_free", args);

        try {
            oscPort.send(msg);
        } catch (IOException e) {
            showError("Couldn't send");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSlider jSlider3;
    private javax.swing.JSlider s1AmpSlider;
    private javax.swing.JTextField s1AmpTXT;
    private javax.swing.JTextField s1FreqTXT;
    private javax.swing.JButton s1OffBTN;
    private javax.swing.JButton s1OnBTN;
    private javax.swing.JSlider s2AmpSlider;
    private javax.swing.JTextField s2AmpTXT;
    private javax.swing.JTextField s2FreqTXT;
    private javax.swing.JButton s2OffBTN;
    private javax.swing.JButton s2OnBTN;
    private javax.swing.JSlider s3AmpSlider;
    private javax.swing.JTextField s3AmpTXT;
    private javax.swing.JTextField s3FreqTXT;
    private javax.swing.JButton s3OffBTN;
    private javax.swing.JButton s3OnBTN;
    // End of variables declaration//GEN-END:variables
}