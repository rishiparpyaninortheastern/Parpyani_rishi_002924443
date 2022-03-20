/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author rishi
 */
public class Addpersonp extends javax.swing.JPanel {

    /**
     * Creates new form Addpersonp
     */
    PersonDirectory pd;
    
    public Addpersonp(PersonDirectory pd) {
        initComponents();
         this.pd=pd;
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        id_txt = new javax.swing.JTextField();
        community_txt = new javax.swing.JTextField();
        age_txt = new javax.swing.JTextField();
        height_txt = new javax.swing.JTextField();
        Update_btn1 = new javax.swing.JButton();
        weight_txt = new javax.swing.JTextField();
        choose_file = new javax.swing.JButton();
        submit_btn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        house_txt = new javax.swing.JTextField();
        city_txt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        name_txt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        male_btn = new javax.swing.JRadioButton();
        others_btn = new javax.swing.JRadioButton();
        female_btn = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        PersonDetailstbl = new javax.swing.JTable();
        Update_btn = new javax.swing.JButton();
        Delete_btn = new javax.swing.JButton();

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

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Age");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Height");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("City");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Weight");

        id_txt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        id_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_txtActionPerformed(evt);
            }
        });

        community_txt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        age_txt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        height_txt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        height_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                height_txtActionPerformed(evt);
            }
        });

        Update_btn1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Update_btn1.setText("Show Details");
        Update_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_btn1ActionPerformed(evt);
            }
        });

        weight_txt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        choose_file.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        choose_file.setText("Choose File");
        choose_file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose_fileActionPerformed(evt);
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
        jLabel8.setText("House Number");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("PERSON INFORMATION");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Community");

        house_txt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        city_txt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("ID");

        name_txt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Gender");

        male_btn.setText("Male");
        male_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                male_btnActionPerformed(evt);
            }
        });

        others_btn.setText("Others");
        others_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                others_btnActionPerformed(evt);
            }
        });

        female_btn.setText("Female");
        female_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                female_btnActionPerformed(evt);
            }
        });

        PersonDetailstbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "AGE", "GENDER", "HEIGHT", "WEIGHT", "COMMUNITY", "HOUSENUMBER", "CITY"
            }
        ));
        jScrollPane2.setViewportView(PersonDetailstbl);

        Update_btn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Update_btn.setText("Update");
        Update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_btnActionPerformed(evt);
            }
        });

        Delete_btn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Delete_btn.setText("Delete");
        Delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(age_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(12, 12, 12))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(community_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(height_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weight_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(house_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(city_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(male_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(female_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(choose_file)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(others_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(submit_btn)
                        .addGap(50, 50, 50)
                        .addComponent(Update_btn1)
                        .addGap(61, 61, 61)
                        .addComponent(Update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(Delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(choose_file))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(male_btn)
                            .addComponent(others_btn)
                            .addComponent(female_btn))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(height_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weight_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(community_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(house_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(city_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submit_btn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Update_btn1)
                        .addComponent(Update_btn)
                        .addComponent(Delete_btn)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(312, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void height_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_height_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_height_txtActionPerformed

    private void Update_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_btn1ActionPerformed
       int selectedRowIndex=PersonDetailstbl.getSelectedRow();
         
         if(selectedRowIndex<0){
             JOptionPane.showMessageDialog(this,"Please select a row");
             System.out.println(selectedRowIndex);
         }
         
     DefaultTableModel model=(DefaultTableModel) PersonDetailstbl.getModel();
      //  model.setRowCount(0);
      ArrayList Persons = pd.getObj();
      Person selectedperson= (Person) Persons.get(selectedRowIndex);
      
      id_txt.setText(String.valueOf(selectedperson.getId()));
      name_txt.setText(selectedperson.getName());
      age_txt.setText(String.valueOf(selectedperson.getAge()));
      height_txt.setText(String.valueOf(selectedperson.getHeight()));
      weight_txt.setText(String.valueOf(selectedperson.getWeight()));
      community_txt.setText(selectedperson.getCommunityName());
      house_txt.setText(String.valueOf(selectedperson.getHousenum()));
      city_txt.setText(selectedperson.getCityname());
      if(selectedperson.getGender()=="male"){
        male_btn.setSelected(true);
    }
      else if(selectedperson.getGender()=="female"){
          female_btn.setSelected(true);
      }
      else{
          others_btn.setSelected(true);
      }
      
        // TODO add your handling code here:
    }//GEN-LAST:event_Update_btn1ActionPerformed

    private void choose_fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choose_fileActionPerformed
    datainput();   

    }//GEN-LAST:event_choose_fileActionPerformed

    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed
      Person pi= new Person();
   //  City cy=new City();
      String name= name_txt.getText();
       int id=Integer.parseInt(id_txt.getText());
      int age= Integer.parseInt(age_txt.getText());
      float height= Float.parseFloat(height_txt.getText());
      float weight= Float.parseFloat(weight_txt.getText());
      String community=community_txt.getText();
      String houseno=house_txt.getText();
      String city=city_txt.getText();
      ButtonGroup bg=new ButtonGroup();    
      String gender;
      bg.add(male_btn);
      bg.add(female_btn);
      bg.add(others_btn);
      if(male_btn.isSelected()){
          gender="male";
      }
      else if(female_btn.isSelected()) {
          gender="female";
      }
      else{
          gender="others";
      }
      
      pi.setId(id);
      pi.setGender(gender);
      pi.setName(name);
      pi.setAge(age);
      pi.setHeight(height);
      pi.setWeight(weight);
      //cy.setCityname(city);
     
      pi.setHousenum(houseno);
      pi.setCityname(city);
      pi.setCommunityName(community);
      
      //cy.setCityname(city);
      pd.addnew(pi);
   
      JOptionPane.showMessageDialog(this,"New data Added");
      
      id_txt.setText("");
      name_txt.setText(" ");
        age_txt.setText("");
         height_txt.setText("");
          weight_txt.setText("");
           house_txt.setText("");
           male_btn.setSelected(false);
           female_btn.setSelected(false);
           others_btn.setSelected(false);
             community_txt.setText("");
           
         city_txt.setText("");
          populateTable();
    }//GEN-LAST:event_submit_btnActionPerformed

    private void male_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_male_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_male_btnActionPerformed

    private void others_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_others_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_others_btnActionPerformed

    private void female_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_female_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_female_btnActionPerformed

    private void Update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_btnActionPerformed
        Person pi= new Person();
   //  City cy=new City();
      String name= name_txt.getText();
       int id=Integer.parseInt(id_txt.getText());
      int age= Integer.parseInt(age_txt.getText());
      float height= Float.parseFloat(height_txt.getText());
      float weight= Float.parseFloat(weight_txt.getText());
      String community=community_txt.getText();
      String houseno=house_txt.getText();
      String city=city_txt.getText();
      ButtonGroup bg=new ButtonGroup();    
      String gender;
      bg.add(male_btn);
      bg.add(female_btn);
      bg.add(others_btn);
      if(male_btn.isSelected()){
          gender="male";
      }
      else if(female_btn.isSelected()) {
          gender="female";
      }
      else{
          gender="others";
      }
    for (int i=0; i<pd.getObj().size();i++)
    {
        if(id==pd.getObj().get(i).getId()){
             JOptionPane.showMessageDialog(this,"ID already exists");  
             return;
        }
        
    }
        
       
           
          
         
      pi.setGender(gender);
      pi.setName(name);
      pi.setAge(age);
      pi.setHeight(height);
      pi.setWeight(weight);
      //cy.setCityname(city);
     
      pi.setHousenum(houseno);
      pi.setCityname(city);
      pi.setCommunityName(community);
      
      //cy.setCityname(city);
      pd.addnew(pi);
      //pd.addnew(pi);
      JOptionPane.showMessageDialog(this,"Data Updated");
      
      id_txt.setText("");
      name_txt.setText(" ");
        age_txt.setText("");
         height_txt.setText("");
          weight_txt.setText("");
           house_txt.setText("");
           male_btn.setSelected(false);
           female_btn.setSelected(false);
           others_btn.setSelected(false);
             community_txt.setText("");
           
         city_txt.setText("");
      populateTable();
          
      
               // TODO add your handling code here:
    }//GEN-LAST:event_Update_btnActionPerformed

    private void Delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_btnActionPerformed
       int row = PersonDetailstbl.getSelectedRow();
        int id=Integer.parseInt(PersonDetailstbl.getValueAt(row, 0).toString());
         for(Person p : pd.getObj()){
             if(id==p.getId()){
                 pd.getObj().remove(p);
                 break;
             }
         }
         populateTable();
    }//GEN-LAST:event_Delete_btnActionPerformed

    private void id_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_txtActionPerformed
public void populateTable(){
        DefaultTableModel model=(DefaultTableModel) PersonDetailstbl.getModel();
         model.setRowCount(0);

        for(Person pi : pd.getObj())
        {
            Object[] row=new Object[9];
             row[0]=pi.getId();
            row[1]=pi.getName();
            row[2]=pi.getAge();
            row[3]=pi.getGender();
            row[4]=pi.getHeight();
            row[5]=pi.getWeight();
            row[6]=pi.getCommunityName();
            row[7]=pi.getHousenum();
            row[8]=pi.getCityname();
            model.addRow(row);
        }
      
           
        }

 public void datainput(){
     File file = new File("C:\\Users\\rishi\\Downloads\\dummydata1.txt");
      
        try {
            ArrayList <String> arr= new ArrayList<String>();
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                  Person p=new Person();
                String Sentence = scanner.nextLine();
                String word[] = Sentence.split(",");
                p.setId(Integer.parseInt(word[0]));
                p.setName(word[1]);
                p.setAge(Integer.parseInt(word[2]));
                p.setGender(word[3]);
                p.setHeight(Integer.parseInt(word[4]));
                 p.setWeight(Integer.parseInt(word[5]));
                 p.setCommunityName(word[6]);
                 p.setHousenum(word[7]);
                 p.setCityname(word[8]);
                 pd.addnew(p);
                  populateTable();
                     
                 
            }
            
        } catch (Exception e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }  
  }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete_btn;
    private javax.swing.JTable PersonDetailstbl;
    private javax.swing.JButton Update_btn;
    private javax.swing.JButton Update_btn1;
    private javax.swing.JTextField age_txt;
    private javax.swing.JButton choose_file;
    private javax.swing.JTextField city_txt;
    private javax.swing.JTextField community_txt;
    private javax.swing.JRadioButton female_btn;
    private javax.swing.JTextField height_txt;
    private javax.swing.JTextField house_txt;
    private javax.swing.JTextField id_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton male_btn;
    private javax.swing.JTextField name_txt;
    private javax.swing.JRadioButton others_btn;
    private javax.swing.JButton submit_btn;
    private javax.swing.JTextField weight_txt;
    // End of variables declaration//GEN-END:variables
}