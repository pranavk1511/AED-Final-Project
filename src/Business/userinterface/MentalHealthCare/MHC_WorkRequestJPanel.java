/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.userinterface.MentalHealthCare;

import Business.EcoSystem;
import Business.Email.SendMail;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.RehabOrganization;
import Business.Organization.RehabOrganization;
import Business.UserAccount.UserAccount;
import Business.Citizen.Citizen;
import Business.Citizen.CitizenDirectory;
import Business.WorkQueue.MentalHealthCareRequest;
import Business.WorkQueue.PhysicalHealthCareRequest;
import Business.WorkQueue.RehabWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kshitijkumartiwari
 */
public class MHC_WorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MHC_WorkRequestJPanel
     */
     JPanel userProcessContainer;
   MentalHealthCareRequest request;
       EcoSystem system;
        UserAccount userAccount;
    MHC_WorkRequestJPanel(JPanel userProcessContainer, MentalHealthCareRequest request, EcoSystem system, UserAccount userAccount) {
          initComponents();
           this.request = request;
           this.system= system;
           this.userAccount =userAccount;
          CitizenDirectory vdr =  system.getVd();
          String CitizenName = "";
        for (Citizen v : system.getVd().getCitizen_Dir() ) {
            if (v.getUsername().equals(request.getSender().getUsername())) {
                CitizenName = v.getFirstName()+ " "+ v.getLastName();
                break;

            }
        }
           
           lblMainConcern.setText(((MentalHealthCareRequest) request).getMain_Concern());
           lbl_Brain_injury.setText(((MentalHealthCareRequest) request).getBrain_injury());
           lbl_MedicalHistory.setText(((MentalHealthCareRequest) request).getMedicalHistory_mental());     
           lbl_Mood.setText(((MentalHealthCareRequest) request).getMood());
          
           lbl_concernDescription.setText(((MentalHealthCareRequest) request).getDetails_concern());
           lbl_patientName.setText(CitizenName);
           lbl_symptoms.setText(((MentalHealthCareRequest) request).getMood());
          this.userProcessContainer = userProcessContainer;
          
          txt_EmailID.setEnabled(false);
          btnRehab.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        submitJButton = new javax.swing.JButton();
        lblMainConcern = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea_Comments = new javax.swing.JTextArea();
        lbl = new javax.swing.JLabel();
        txtArea_analysis = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lbl_patientName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_concernDescription = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_MedicalHistory = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_Brain_injury = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_symptoms = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_Mood = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_EmailID = new javax.swing.JTextField();
        btnRehab = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton.setBackground(new java.awt.Color(20, 53, 94));
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        submitJButton.setBackground(new java.awt.Color(20, 53, 94));
        submitJButton.setForeground(new java.awt.Color(255, 255, 255));
        submitJButton.setText("Submit Result");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, 140, 50));

        lblMainConcern.setText("jLabel2");
        add(lblMainConcern, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 153, 140, 33));

        jLabel2.setText("Main Concern:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 162, -1, -1));

        jLabel3.setText("Comments");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        txtArea_Comments.setColumns(20);
        txtArea_Comments.setRows(5);
        jScrollPane1.setViewportView(txtArea_Comments);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 225, 133));

        lbl.setText("Analysis");
        add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));
        add(txtArea_analysis, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 225, -1));

        jLabel4.setText("Patient Name: ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 121, -1, -1));

        lbl_patientName.setText("jLabel5");
        add(lbl_patientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 121, 98, -1));

        jLabel6.setText("Concern Description:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, 30));

        lbl_concernDescription.setText("jLabel7");
        add(lbl_concernDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 169, 50));

        jLabel7.setText("Medical History");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 100, 30));

        lbl_MedicalHistory.setText("jLabel8");
        add(lbl_MedicalHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, 30));

        jLabel8.setText("Brain Injury:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, 30));

        lbl_Brain_injury.setText("jLabel9");
        add(lbl_Brain_injury, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, 30));

        jLabel9.setText("Symptoms");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 30));

        lbl_symptoms.setText("jLabel10");
        add(lbl_symptoms, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, 30));

        jLabel10.setText("Mood:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, 30));

        lbl_Mood.setText("jLabel11");
        add(lbl_Mood, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, -1, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Citizen Details");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 197, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Doctor Analysis");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        jLabel1.setText("Email ID");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 79, 23));
        add(txt_EmailID, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 220, -1));

        btnRehab.setBackground(new java.awt.Color(20, 53, 94));
        btnRehab.setForeground(new java.awt.Color(255, 255, 255));
        btnRehab.setText("Redirect to Rehab");
        btnRehab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRehabActionPerformed(evt);
            }
        });
        add(btnRehab, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 150, 50));

        jCheckBox1.setText("Refer and redirect Citizen to Rehab Center");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setText("Process Mental Healthcare Request");
        jLabel14.setFocusable(false);
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        MentalHealthCareWorkAreaJPanel dwjp = (MentalHealthCareWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
if(txtArea_analysis.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Doctor Analysis can't be empty");
             return;
         } 
           // mhc_request.setMessage(resultJTextField.getText());
            request.setStatus("Approved");
            request.setDoctorAnalysis(txtArea_analysis.getText());
            request.setDoctorComments(txtArea_Comments.getText());
               String CitizenName = "";
        for (Citizen v : system.getVd().getCitizen_Dir() ) {
            if (v.getUsername().equals(request.getSender().getUsername())) {
                CitizenName = v.getFirstName()+ " "+ v.getLastName();
                break;

            }
        }     
        
             String to = String.valueOf(request.getSender());
             String subject = "Report for the MHC request raised : "+ request.getMain_Concern();
             String user = "tkshitij2001@gmail.com";
             String pass = "bypmbzuapfkdgcor";   
             String message = " Hello "+ CitizenName 
                         + "Please Look into the report provide by your dcotor for your MHC request concern: " + ((MentalHealthCareRequest) request).getMain_Concern()
                         + " Doctor Name: "+  request.getReceiver() + "  \n"+ 
                     "According to the reports generated by your doctor, You are facing :  " + txtArea_analysis.getText()+
                          "with comments  : " + txtArea_Comments.getText()+"\n\n"+" Please contact your doctor for more details. "
                     +"\n\n "
                     + "Regards "+
                     request.getReceiver();
             
             
                 
                SendMail.send(to,subject, message, user, pass);
                
                txtArea_analysis.setText("");
         txtArea_Comments.setText("");
                 txt_EmailID.setText("");
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void btnRehabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRehabActionPerformed
        // TODO add your handling code here:

        String message = " Hello Rehab Employee ,\n"
        + "Please consider the following citizen for Rehab : \n "
        +  lbl_patientName.getText()+ " with description:  \n"
        + " Main concern: "+  lblMainConcern.getText() + "  \n"+
        " Detailed concern: " + String.valueOf(lbl_concernDescription.getText()) +"  \n"
        +" Symptoms : "+ String.valueOf(lbl_symptoms.getText()) +"  \n"+
        " I further request this citizen for Rehab Living to improve his health due to his substance abuse :  \n"+
        " because I believe he is suffering : "+ txtArea_analysis.getText()+" \n"+
        "comments : " +txtArea_Comments.getText()
        +"  \n" +
        "  \n" +
        "  \n" +
        " Regards";

        String CitizenName = "";
        for (Citizen v : system.getVd().getCitizen_Dir() ) {
            if (v.getUsername().equals(request.getSender().getUsername())) {
                CitizenName = v.getFirstName()+ " "+ v.getLastName();
                break;

            }
        }

        RehabWorkRequest request = new RehabWorkRequest();
        request.setRehabConcern(txtArea_analysis.getText());
        if(txtArea_analysis.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Doctor Analysis can't be empty");
             return;
         }
        request.setStatus("Sent");
        request.setMessage(lblMainConcern.getText());
        request.setSender(userAccount);
        request.setCitizenName(lbl_patientName.getText());
        request.setCitizenEmail(request.getSender().getUsername());
        ///////////////////////////////////////////////
        request.setComments(txtArea_Comments.getText());
        if(txtArea_analysis.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Doctor Comments can't be empty");
             return;
         }
        // request.setPhysical_injury();

        Organization org = null;

        for (Network network : system.getNetworkList()) {
            //Step 2.a: check against each enterprise
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                //                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                //Step 3:check against each organization for each enterprise
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof RehabOrganization) {
                        org = organization;
                        break;
                    }
                }
            }
        }
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(request);
            //  userAccount.getWorkQueue().getWorkRequestList().add(request);
            System.out.println("Added Reqyesr to Org ");
            userAccount.getWorkQueue().getWorkRequestList().add(request);
            System.out.println("Added Reqyesr to UserAccount ");
if(!usernamePatternCorrect()){
        JOptionPane.showMessageDialog(null,"Email ID should be the form of xxx@xxx.xxx");
        
        return;
        }
            String to = txt_EmailID.getText();
            String subject = "Request for citizen Rehab : " +lbl_patientName.getText() ;
            String user = "tkshitij2001@gmail.com";
            String pass = "kshitij@123";

            SendMail.send(to,subject, message, user, pass);
        txtArea_analysis.setText("");
         txtArea_Comments.setText("");
                 txt_EmailID.setText("");
        }

    }//GEN-LAST:event_btnRehabActionPerformed
 private boolean usernamePatternCorrect() {
       Pattern p = Pattern.compile("^[a-zA-Z0-9]+[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
       Matcher m = p.matcher(txt_EmailID.getText());
       boolean b = m.matches();
       return b;
   }
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox1.isSelected()){
            txt_EmailID.setEnabled(true);
          btnRehab.setEnabled(true);
           submitJButton.setEnabled(false);
        }
        else
        {
            txt_EmailID.setEnabled(false);
          btnRehab.setEnabled(false);
           submitJButton.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnRehab;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblMainConcern;
    private javax.swing.JLabel lbl_Brain_injury;
    private javax.swing.JLabel lbl_MedicalHistory;
    private javax.swing.JLabel lbl_Mood;
    private javax.swing.JLabel lbl_concernDescription;
    private javax.swing.JLabel lbl_patientName;
    private javax.swing.JLabel lbl_symptoms;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextArea txtArea_Comments;
    private javax.swing.JTextField txtArea_analysis;
    private javax.swing.JTextField txt_EmailID;
    // End of variables declaration//GEN-END:variables
}
