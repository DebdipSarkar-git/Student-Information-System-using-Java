import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.sql.*;

public class F2 extends javax.swing.JFrame {

    int choice = 0;

    public F2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("                    INSERTION");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Enter Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Enter Roll No");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Enter Age");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Enter Course");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("SAVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {              
        JFrame frame = new JFrame("BACK");
        String roll = jTextField2.getText();
        String name = jTextField1.getText();
        String age = jTextField3.getText();
        String course = jTextField4.getText();
        
        int chk=0; 
        if (!roll.equals("") || !name.equals("") || !age.equals("") || !course.equals("")) {
          if(JOptionPane.showConfirmDialog(frame,"Go Back Without Saving?"  + "" + "","BACK",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
                dispose();
                new F1().setVisible(true);        // TODO add your handling code here:
            }//GEN-LAST:event_jButton1ActionPerformed
        }
	else {
        dispose();
		new F1().setVisible(true); 
	}
    }

    int nroll;
    int nage;
    String nname;
    String ncourse;
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        String roll = jTextField2.getText();
        String name = jTextField1.getText();
        String age = jTextField3.getText();
        String course = jTextField4.getText();
        
        int chk=0; 
        if (!roll.equals("") && !name.equals("") && !age.equals("") && !course.equals("")) {
            
            try {
                nroll=Integer.parseInt(jTextField2.getText());
                if(nroll <= 0) {
                    chk=1;
                    choice = 0;
                    repaint();
                    JOptionPane.showMessageDialog(null,"Change Roll","Warning",JOptionPane.WARNING_MESSAGE);
                }
            }
            
            catch(NumberFormatException nfe){
                nroll = 0;
                chk=1;
                choice = 0;
                repaint();
				JOptionPane.showMessageDialog(null,"Roll should be Numbers only","Warning",JOptionPane.WARNING_MESSAGE);
			}

            nname = jTextField1.getText();
			if(!nname.matches("^[a-zA-Z\\s]*$")){
                chk=1;
                choice = 0;
				JOptionPane.showMessageDialog(null,"Name should be Alphabets only","Warning",JOptionPane.WARNING_MESSAGE);
			}

            try{
				nage=Integer.parseInt(jTextField3.getText());
				if(nage<=0 || nage>=50) {
                    chk=1;
                    choice = 0;
                    repaint();
					JOptionPane.showMessageDialog(null,"Change Age","Warning",JOptionPane.WARNING_MESSAGE);
				}
			}
			catch(NumberFormatException nfe){
                nage = 0;
                chk=1;
                choice = 0;
                repaint();
				JOptionPane.showMessageDialog(null,"Age should be Numbers only","Warning",JOptionPane.WARNING_MESSAGE);
			}

			ncourse = jTextField4.getText();
			if(!ncourse.matches("^[a-zA-Z\\s\\.\\-]*$")){
                chk=1;
                choice = 0;
				JOptionPane.showMessageDialog(null,"Course should be Alphabets only","Warning",JOptionPane.WARNING_MESSAGE);
			}
        }
        else
        {
            chk=1;
            choice = 0;
            repaint();
            JOptionPane.showMessageDialog(null,"Fill up the empty Field","Warning",JOptionPane.WARNING_MESSAGE);
        }
        
        if (!roll.equals("") && chk == 0) {
          choice = 1;
          repaint();       
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 20)); 
        
        if(choice == 1) {
        
            Connection con = null;
            Statement stmt = null;
            ResultSet rs = null;

            String sql;

            try {
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                con = DriverManager.getConnection("jdbc:mysql://localhost/student", "root","babai@1999");
                stmt = con.createStatement();

                sql = "INSERT INTO student " + "VALUES (" + nroll + ", '" + nname + "', " + nage + ", '" + ncourse + "')";
                stmt.executeUpdate(sql);
                g.drawString("New record created!", 160, 300);
                TimeUnit.SECONDS.sleep(2);
                dispose();
                new F1().setVisible(true);
            }

            catch (SQLException ex){
                // handle any errors
                /*
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
                */

                if(ex.getErrorCode() == 1062) {
                    g.drawString("This Roll Number is taken. Please try another one!", 40, 300);
                    //System.out.println("This Roll Number is taken. Please try another one!");
                }

            }

            catch(Exception e){
                //Handle errors for Class.forName
                e.printStackTrace();
            }

            finally {

                if (rs != null) {
                    try {
                  
                        rs.close();
                    } catch (SQLException sqlEx) { } // ignore

                    rs = null;
                }

                if (stmt != null) {
                    try {
                        stmt.close();
                    } catch (SQLException sqlEx) { } // ignore

                    stmt = null;
                }
            }
        }
    }
    
    public static void main(String args[]) throws Exception {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(F2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
