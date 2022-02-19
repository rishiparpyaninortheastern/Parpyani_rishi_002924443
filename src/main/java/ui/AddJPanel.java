/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Car;
import model.Carhistory;

/**
 *
 * @author rishi
 */
public class AddJPanel extends javax.swing.JPanel {

    Carhistory ch;
    //ViewJPanel v;
    /**
     * Creates new form AddJPanel
     */
    public AddJPanel(Carhistory ob) {
        initComponents();
        this.ch= ob;
        //@override
        populateTable();
        
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        sno_txt = new javax.swing.JTextField();
        model_txt = new javax.swing.JTextField();
        seats_txt = new javax.swing.JTextField();
        year_txt = new javax.swing.JTextField();
        no_btn = new javax.swing.JCheckBox();
        yes_btn = new javax.swing.JCheckBox();
        submit_btn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        location_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        brand_txt = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        viewtbl = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        availableno_btn = new javax.swing.JCheckBox();
        availableyes_btn = new javax.swing.JCheckBox();
        update_btn = new javax.swing.JButton();
        Time = new javax.swing.JLabel();
        Update_btn1 = new javax.swing.JButton();
        choose_file = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setBackground(new java.awt.Color(204, 204, 204));

        sno_txt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        model_txt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        seats_txt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        seats_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seats_txtActionPerformed(evt);
            }
        });

        year_txt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        no_btn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        no_btn.setText("No");
        no_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_btnActionPerformed(evt);
            }
        });

        yes_btn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        yes_btn.setText("Yes");
        yes_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yes_btnActionPerformed(evt);
            }
        });

        submit_btn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        submit_btn.setText("Submit");
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Location");

        location_txt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Add Car Details");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Brand");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Serial no");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Model");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Seats");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Maintainence");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Year");

        brand_txt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        viewtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Serialno", "brand", "model", "location", "maintainence", "year", "Seats", "Available"
            }
        ));
        jScrollPane3.setViewportView(viewtbl);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Available");

        availableno_btn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        availableno_btn.setText("No");
        availableno_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableno_btnActionPerformed(evt);
            }
        });

        availableyes_btn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        availableyes_btn.setText("Yes");
        availableyes_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableyes_btnActionPerformed(evt);
            }
        });

        update_btn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        update_btn.setText("Update");
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        Update_btn1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Update_btn1.setText("Show Details");
        Update_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_btn1ActionPerformed(evt);
            }
        });

        choose_file.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        choose_file.setText("Choose File");
        choose_file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose_fileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(yes_btn)
                        .addGap(18, 18, 18)
                        .addComponent(no_btn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(brand_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sno_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(model_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seats_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(year_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(location_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(availableyes_btn)
                        .addGap(18, 18, 18)
                        .addComponent(availableno_btn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(choose_file)
                .addGap(63, 63, 63))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(submit_btn)
                                .addGap(46, 46, 46)
                                .addComponent(Update_btn1)
                                .addGap(18, 18, 18)
                                .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Time, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(286, 286, 286)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brand_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(model_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seats_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sno_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(location_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(no_btn)
                            .addComponent(yes_btn)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(choose_file)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(availableno_btn)
                    .addComponent(availableyes_btn))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(submit_btn)
                            .addComponent(Update_btn1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(189, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void no_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_no_btnActionPerformed

    private void yes_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yes_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yes_btnActionPerformed

    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed
     DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now=LocalDateTime.now();
        String timeupdated=dtf.format(now);
        Time.setText(timeupdated);
        String brand=brand_txt.getText();
      String Model=model_txt.getText();
      if(seats_txt.getText().equals("")||sno_txt.getText().equals("")){
          JOptionPane.showMessageDialog(this," Please Enter all the details");
      }
      int Seat=Integer.parseInt(seats_txt.getText());
      
      int sno=Integer.parseInt(sno_txt.getText());
      Car ci=new Car();
      System.out.print(ch.getObj().size());
      if(ch.getObj().size()>=1){
      for(int i=0; i<ch.getObj().size();i++){
     if(sno== ch.getObj().get(i).getSno() ){
          JOptionPane.showMessageDialog(this,"Serial Number already Exists");
          return;
     }
     
         
         }
      }
      String loc=location_txt.getText();
      //ViewJPanel v= new ViewJPanel();
      //v.Locationdropdown.Items.add(loc);
        String year=year_txt.getText();
        if(Integer.parseInt(year)<=1850 && Integer.parseInt(year)>2022){
            JOptionPane.showMessageDialog(this,"Enter Valid Year");
          return;
        }
     // int seat_no=Integer.parseInt(seats_txt.getText());
      boolean maintainence;
      boolean available;
      
      if(yes_btn.isSelected()){
           maintainence = true;
           ci.setMaintainence(maintainence);
      }
      else if(no_btn.isSelected() && !(yes_btn.isSelected())){
          maintainence=false;
          ci.setMaintainence(maintainence);
      }
      else{
          JOptionPane.showMessageDialog(this," Please Enter all the details");
      }
      if(availableyes_btn.isSelected()){
            available=true;
             ci.setAvailable(available);
      }
      else if(availableno_btn.isSelected()&&!(availableyes_btn.isSelected())){
          available=false;
           ci.setAvailable(available);
      }
      else{
          JOptionPane.showMessageDialog(this," Please enter all the details");
          return;
      }
     if(brand.isEmpty()|| Model.isEmpty()||loc.isEmpty()|| year.isEmpty()){
         
         if(String.valueOf(sno).isBlank()|| String.valueOf(Seat).isBlank()){
             if(!(yes_btn.isSelected()) && !(no_btn.isSelected())){
                 
                 if(!(availableyes_btn.isSelected()) && !(availableno_btn.isSelected())){
                     JOptionPane.showMessageDialog(this," Please Enter all the details");
                 }
             }
              
         }
         
     }
    
        // TODO add your handling code here:
       
        ci.setSno(sno);
        ci.setBrand(brand);
        ci.setYear(year);
        ci.setModel(Model);
        ci.setSeats(Seat);
       
        
        ci.setLocation(loc);
        
        
        ch.addnew(ci);
        System.out.println(ci.toString());
        
        JOptionPane.showMessageDialog(this,"New data Added");
      // ViewJPanel v= new ViewJPanel();
        
        
        
        
        
        brand_txt.setText(" ");
        seats_txt.setText("");
        model_txt.setText("");
        year_txt.setText("");
        sno_txt.setText("");
        location_txt.setText("");
       yes_btn.setSelected(false);
      no_btn.setSelected(false);
        availableyes_btn.setSelected(false);
        availableno_btn.setSelected(false);
       populateTable();
    }//GEN-LAST:event_submit_btnActionPerformed

    private void seats_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seats_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seats_txtActionPerformed

    private void availableno_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableno_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availableno_btnActionPerformed

    private void availableyes_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableyes_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availableyes_btnActionPerformed

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
            
        // Add new 
        int selectedRowIndex=viewtbl.getSelectedRow();
         String brand=brand_txt.getText();
      String Model=model_txt.getText();
      int Seat=Integer.parseInt(seats_txt.getText());
      int sno=Integer.parseInt(sno_txt.getText());
      String loc=location_txt.getText();
      //ViewJPanel v= new ViewJPanel();
      //v.Locationdropdown.Items.add(loc);
        String year=year_txt.getText();
     // int seat_no=Integer.parseInt(seats_txt.getText());
      boolean maintainence;
      boolean available;
     // Car c=new Car();
      System.out.print(ch.getObj().size());
      if(ch.getObj().size()>=1){
      for(int i=0; i<ch.getObj().size();i++){
     if(sno== ch.getObj().get(i).getSno() ){
          JOptionPane.showMessageDialog(this,"Serial Number already Exists");
          return;
     }
     
         
         }
      }
       Car ci= ch.getObj().get(selectedRowIndex);
      if(yes_btn.isSelected()){
           maintainence = true;
           ci.setMaintainence(maintainence);
      }
      else if(no_btn.isSelected()){
          maintainence=false;
          ci.setMaintainence(maintainence);
      }
      if(availableyes_btn.isSelected()){
            available=true;
             ci.setAvailable(available);
      }
      else if(availableno_btn.isSelected()){
          available=false;
           ci.setAvailable(available);
      }
      
     
    
        // TODO add your handling code here:
       
        ci.setSno(sno);
        ci.setBrand(brand);
        ci.setYear(year);
        ci.setModel(Model);
        ci.setSeats(Seat);
       
        
        ci.setLocation(loc);
        
        
        
                //addnew(ci);
        System.out.println(ci.toString());
        
        JOptionPane.showMessageDialog(this,"Updated");
      // ViewJPanel v= new ViewJPanel();
        
        
        
        
        
        brand_txt.setText(" ");
        seats_txt.setText("");
        model_txt.setText("");
        year_txt.setText("");
        sno_txt.setText("");
        location_txt.setText("");
       yes_btn.setSelected(false);
      no_btn.setSelected(false);
        availableyes_btn.setSelected(false);
        availableno_btn.setSelected(false);
        
       
        //updateTable(selectedRowIndex);
        
        populateTable();
        
        
    }//GEN-LAST:event_update_btnActionPerformed

    private void Update_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_btn1ActionPerformed
       
         int selectedRowIndex=viewtbl.getSelectedRow();
         
         if(selectedRowIndex<0){
             JOptionPane.showMessageDialog(this,"Please select a row");
             System.out.println(selectedRowIndex);
         }
         
     DefaultTableModel model=(DefaultTableModel) viewtbl.getModel();
      //  model.setRowCount(0);
      ArrayList Cars = ch.getObj();
      
      Car selectedcar = (Car) Cars.get(selectedRowIndex);
      
       System.out.println(selectedcar.getBrand());
          brand_txt.setText(selectedcar.getBrand());
          model_txt.setText(selectedcar.getModel());
          seats_txt.setText(String.valueOf(selectedcar.getSeats()));
          location_txt.setText(selectedcar.getLocation());
          year_txt.setText(String.valueOf(selectedcar.getYear()));
          sno_txt.setText(String.valueOf(selectedcar.getSno()));
          
           if(selectedcar.isAvailable()){
                availableyes_btn.setSelected(true);
              
      }
          else if(!selectedcar.isAvailable()) {
                  availableyes_btn.setSelected(false);
               
           }
           
           if(selectedcar.isMaintainence()){
               yes_btn.setSelected(true);
              
           }
           else if(!selectedcar.isMaintainence()){
               no_btn.setSelected(false);
            
           }
           
        // TODO add your handling code here:
    }//GEN-LAST:event_Update_btn1ActionPerformed

    private void choose_fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choose_fileActionPerformed
          datainput();
           
    }//GEN-LAST:event_choose_fileActionPerformed
  public void populateTable(){
        DefaultTableModel model=(DefaultTableModel) viewtbl.getModel();
        model.setRowCount(0);
        
        for(Car cinpt : ch.getObj())
        {
            Object[] row=new Object[8];
            row[0]=cinpt.getSno();
            row[1]=cinpt.getBrand();
            row[2]=cinpt.getModel();
            row[3]=cinpt.getLocation();
            row[4]=cinpt.isMaintainence();
            row[5]=cinpt.getYear();
            row[6]=cinpt.getSeats();
            row[7]=cinpt.isAvailable();
            model.addRow(row);
            
            
            
        }
      
            
        }
  
  public void datainput(){
     File file = new File("C:\\Users\\rishi\\Downloads\\dummydata.txt");
      
        try {
            ArrayList <String> arr= new ArrayList<String>();
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                  Car c=new Car();
                String Sentence = scanner.nextLine();
                String word[] = Sentence.split(",");
                
               
                 c.setBrand(word[0]);
                 c.setModel(word[1]);
                 c.setSeats(Integer.parseInt(word[2]));
                 c.setYear(word[3]);
                 c.setSno(Integer.parseInt(word[4]));
                 c.setLocation(word[5]);
                 c.setAvailable((Boolean.parseBoolean(word[6])));
                 c.setMaintainence((Boolean.parseBoolean(word[7])));
                 ch.addnew(c);
                  populateTable();
                     
                 
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }  
  }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Time;
    private javax.swing.JButton Update_btn1;
    private javax.swing.JCheckBox availableno_btn;
    private javax.swing.JCheckBox availableyes_btn;
    private javax.swing.JTextField brand_txt;
    private javax.swing.JButton choose_file;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField location_txt;
    private javax.swing.JTextField model_txt;
    private javax.swing.JCheckBox no_btn;
    private javax.swing.JTextField seats_txt;
    private javax.swing.JTextField sno_txt;
    private javax.swing.JButton submit_btn;
    private javax.swing.JButton update_btn;
    private javax.swing.JTable viewtbl;
    private javax.swing.JTextField year_txt;
    private javax.swing.JCheckBox yes_btn;
    // End of variables declaration//GEN-END:variables
}
