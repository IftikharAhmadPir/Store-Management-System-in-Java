/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Perchase.java
 *
 * Created on May 29, 2013, 5:37:09 PM
 */

/**
 *
 * @author pc world
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Perchase extends javax.swing.JFrame {
DbConn obj = new DbConn();
    /** Creates new form Perchase */
    public Perchase() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtproductname = new javax.swing.JTextField();
        txtpurchaseprice = new javax.swing.JTextField();
        txtpname = new javax.swing.JTextField();
        txtquantity = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtsellerid = new javax.swing.JTextField();
        CMBpurchase = new javax.swing.JComboBox();
        txtsellername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtstock = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtrecno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnpurchase = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtproductname.setEditable(false);

        jLabel9.setText("Recption Number");

        CMBpurchase.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Item" }));
        CMBpurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMBpurchaseActionPerformed(evt);
            }
        });

        jLabel5.setText("Purchaser Name");

        jLabel4.setText("Quantity");

        txtstock.setEditable(false);

        jLabel7.setText("Seller @ ID");

        jLabel3.setText("Purchase Price");

        jLabel11.setText("Stock");

        jLabel6.setText("Seller Name");

        jLabel2.setText("Product ID");

        jLabel8.setText("Product Name");

        btnpurchase.setText("Purchase");
        btnpurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpurchaseActionPerformed(evt);
            }
        });

        jLabel1.setText("Copyrights © Iftikhar shah");

        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18));
        jLabel12.setText("    IFTIKHAR MEDICAL STORE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnpurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel11))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtpurchaseprice, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                                    .addComponent(txtquantity, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtsellerid, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(CMBpurchase, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtrecno, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                        .addComponent(txtproductname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                                        .addComponent(txtstock)
                                        .addComponent(txtsellername)
                                        .addComponent(txtpname))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtrecno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CMBpurchase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(txtproductname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtpurchaseprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsellername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsellerid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(44, 44, 44)
                .addComponent(btnpurchase)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CMBpurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMBpurchaseActionPerformed
        try {
            String id = (String) CMBpurchase.getSelectedItem();
            String query = "Select ProductName,  Stock from Product where ProductID = '" + id + "'";
            ResultSet rs = obj.Search(query);
            if (rs.next()) {
                txtproductname.setText(rs.getString("ProductName"));
                txtstock.setText(rs.getString("Stock"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Perchase.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_CMBpurchaseActionPerformed

    private void btnpurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpurchaseActionPerformed
        String recption= txtrecno.getText();
        String id= (String) CMBpurchase.getSelectedItem();
        String name= txtproductname.getText();
        String stock= txtstock.getText();
        String price=txtpurchaseprice.getText();
        String quantity=txtquantity.getText();
        String pname = txtpname.getText();
        String sellername =txtsellername.getText();
        String sellerid= txtsellerid.getText();
        
        int pstock= Integer.parseInt(txtstock.getText());
        int pquantity= Integer.parseInt(txtquantity.getText());
        if(pquantity>0) {
            int newstock= pstock+pquantity;
            String query= "Update Product set Stock='"+newstock+"' where ProductID='"+id+"'";

            boolean r= obj.UDI(query);
           if(r==true)
           {
               JOptionPane.showMessageDialog(null,"Updated");
               String queryp= "INSERT INTO Purchase VALUES('"+recption+"','"+id+"','"+name+"','"+stock+"','"+price+"','"+quantity+"','"+pname+"','"+sellername+"','"+sellerid+"')";
               boolean rs= obj.UDI(queryp);
               if(rs)
                   JOptionPane.showMessageDialog(null,"Sucesfully Added");
               else
                   JOptionPane.showMessageDialog(null,"Could not Insert");
              }
        }
        txtrecno.setText("");
        txtpurchaseprice.setText("");
        txtquantity.setText("");
        txtpname.setText("");
        txtsellername.setText("");
        txtsellerid.setText("");
        
}//GEN-LAST:event_btnpurchaseActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       String query= "Select ProductID from Product";
       ResultSet rs = obj.Search(query);
        try {
            while (rs.next()) {
                CMBpurchase.addItem(rs.getString("ProductID"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Perchase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perchase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CMBpurchase;
    private javax.swing.JButton btnpurchase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtpname;
    private javax.swing.JTextField txtproductname;
    private javax.swing.JTextField txtpurchaseprice;
    private javax.swing.JTextField txtquantity;
    private javax.swing.JTextField txtrecno;
    private javax.swing.JTextField txtsellerid;
    private javax.swing.JTextField txtsellername;
    private javax.swing.JTextField txtstock;
    // End of variables declaration//GEN-END:variables

}
