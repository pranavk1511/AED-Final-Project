/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.userinterface.VocationalSchoolRole;

import Business.EcoSystem;
import Business.Email.SendMail;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.JobOrganization;
import Business.Organization.Organization;
import Business.Organization.RehabOrganization;
import Business.UserAccount.UserAccount;
import Business.Citizen.Citizen;
import Business.Citizen.CitizenDirectory;
import Business.WorkQueue.JobWorkRequest;
import Business.WorkQueue.VocTrainingRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author 91983
 */
public class ProcessWorkRequestJPanel2 extends javax.swing.JPanel {

    /**
     * Creates new form ProcessWorkRequestJPanel2
     */
    JPanel userProcessContainer;
    VocTrainingRequest request;
    CitizenDirectory vd;
    EcoSystem system;
    UserAccount account;

    ProcessWorkRequestJPanel2(JPanel userProcessContainer, VocTrainingRequest request, CitizenDirectory vd,EcoSystem system,UserAccount account) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.vd = vd;
        this.system = system;
        this.account = account;

        initComponents();
        txtHeader.setText("Review Applicant: " + request.getSender().getUsername());


        ArrayList<Business.Citizen.Citizen> vetDir = system.getVd().getCitizen_Dir();

        for (Citizen v : vetDir) {
            if (v.getUsername().equals(request.getSender().getUsername())) {
                txtVetID.setText("SSN: " + v.getCitizen_ID());
                txtAddress.setText("Address: " + v.getResidentAddress());
                txtGender.setText("Gender: " + v.getGender());
                txtMilType.setText("Military Branch: " + v.getCommunity());
                break;

            }
        }

        txtCampus.setText("Campus: " + request.getCampus());
        txtQual.setText("Highest Qualification: " + request.getHighestQualification());
        txtCourse.setText("Course: " + request.getAreaOfInterest());
        txtFunding.setText("Funding Required?: " + request.getFundingRequired());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rejectJButton = new javax.swing.JButton();
        submitJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        txtCourse = new javax.swing.JLabel();
        txtHeader = new javax.swing.JLabel();
        txtCampus = new javax.swing.JLabel();
        txtFunding = new javax.swing.JLabel();
        txtQual = new javax.swing.JLabel();
        txtVetID = new javax.swing.JLabel();
        txtGender = new javax.swing.JLabel();
        txtMilType = new javax.swing.JLabel();
        txtAddress = new javax.swing.JLabel();
        btnComplete = new javax.swing.JButton();
        btnRecommendForJob = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rejectJButton.setBackground(new java.awt.Color(20, 53, 94));
        rejectJButton.setForeground(new java.awt.Color(255, 255, 255));
        rejectJButton.setText("Reject");
        rejectJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectJButtonActionPerformed(evt);
            }
        });
        add(rejectJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 263, 155, -1));

        submitJButton.setBackground(new java.awt.Color(20, 53, 94));
        submitJButton.setForeground(new java.awt.Color(255, 255, 255));
        submitJButton.setText("Accept");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 263, 146, -1));

        backJButton.setBackground(new java.awt.Color(20, 53, 94));
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 24, -1, -1));

        txtCourse.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtCourse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 106, 291, 23));

        txtHeader.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtHeader.setFocusable(false);
        add(txtHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 62, 357, 32));

        txtCampus.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtCampus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtCampus, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 135, 291, 23));

        txtFunding.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtFunding.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtFunding, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 222, 291, 23));

        txtQual.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtQual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtQual, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 193, 291, 23));

        txtVetID.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtVetID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtVetID, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 106, 190, 23));

        txtGender.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtGender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 135, 190, 23));

        txtMilType.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtMilType.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtMilType, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 170, 190, 23));

        txtAddress.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 209, 190, 23));

        btnComplete.setBackground(new java.awt.Color(20, 53, 94));
        btnComplete.setForeground(new java.awt.Color(255, 255, 255));
        btnComplete.setText("Complete");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });
        add(btnComplete, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 313, 146, -1));

        btnRecommendForJob.setBackground(new java.awt.Color(20, 53, 94));
        btnRecommendForJob.setForeground(new java.awt.Color(255, 255, 255));
        btnRecommendForJob.setText("Recommend For Job");
        btnRecommendForJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecommendForJobActionPerformed(evt);
            }
        });
        add(btnRecommendForJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 313, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Process Vocational Education Request");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 500, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void rejectJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectJButtonActionPerformed
        // TODO add your handling code here:
        request.setStatus("Rejected");
        JOptionPane.showMessageDialog(null, "Candidate: " + request.getSender().getUsername() + " Rejected. Status will be updated accordingly.", "Warning", JOptionPane.INFORMATION_MESSAGE);
        rejectJButton.setEnabled(false);
        submitJButton.setEnabled(false);

        String message = "User: " + request.getSender().getUsername() + "'s Application for " + request.getAreaOfInterest() + " at " + request.getCampus() + " was rejected by Admin: " + request.getReceiver().getUsername();
        try {
            URL yahoo = new URL("https://api.telegram.org/bot886367737:AAE0-wbD4ww50nkPy7M-6KKrMtN2sg70z_Q/sendMessage?chat_id=@AED_Helper&text=" + message);
            URLConnection yc = yahoo.openConnection();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            yc.getInputStream()));
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            in.close();
        } catch (Exception e) {
            System.out.println("Oops Something went wrong.");

        }


    }//GEN-LAST:event_rejectJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        request.setStatus("Accepted");
        JOptionPane.showMessageDialog(null, "Candidate: " + request.getSender().getUsername() + " Accepted. Status will be updated accordingly.", "Information", JOptionPane.INFORMATION_MESSAGE);
        submitJButton.setEnabled(false);
        rejectJButton.setEnabled(false);
        //btnComplete.setEnabled(false);

        String message = "User: " + request.getSender().getUsername() + "'s Application for " + request.getAreaOfInterest() + " Training at " + request.getCampus() + " was Accepted by Admin: " + request.getReceiver().getUsername();
        try {
            URL yahoo = new URL("https://api.telegram.org/bot886367737:AAE0-wbD4ww50nkPy7M-6KKrMtN2sg70z_Q/sendMessage?chat_id=@AED_Helper&text=" + message);
            URLConnection yc = yahoo.openConnection();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            yc.getInputStream()));
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            in.close();
        } catch (Exception e) {
            System.out.println("Oops Something went wrong.");

        }


    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        VocationalSchoolAreaJPanel dwjp = (VocationalSchoolAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed
    
        
    private void btnRecommendForJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecommendForJobActionPerformed
        // TODO add your handling code here:
      if(request.getStatus()=="Graduated")
      {

        JobWorkRequest jrequest = new JobWorkRequest();
        jrequest.setAreaOfInterest(txtCourse.getText());
        jrequest.setCampus(txtCampus.getText());
        jrequest.setHighestQualification(txtQual.getText());
        jrequest.setCandidateName(request.getSender().getUsername());
        Organization org = null;

        for (Network network : system.getNetworkList()) {
            //Step 2.a: check against each enterprise
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                //                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                //Step 3:check against each organization for each enterprise
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof JobOrganization) {
                        org = organization;
                        break;
                    }
                }
            }
        }
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(jrequest);
            System.out.println("Added Reqyesr to Org ");
            account.getWorkQueue().getWorkRequestList().add(jrequest);
            System.out.println("Added Reqyesr to UserAccount ");
            String user = "tkshitij2001@gmail.com";
             String pass = "bypmbzuapfkdgcor";  
            String to = "tkshitij2001@gmail.com";
            String subject = "Request for Citizen job";
            JOptionPane.showMessageDialog(null, "Candidate: " + request.getSender().getUsername() + "Job Recommendation Sent to Admin!", "Information", JOptionPane.INFORMATION_MESSAGE);
            btnRecommendForJob.setEnabled(false);
        

            //SendMail.send(to,subject, message, user, pass);
        }
        
    }//GEN-LAST:event_btnRecommendForJobActionPerformed
    }
    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        // TODO add your handling code here:
        if(request.getStatus()=="Accepted")
        {
            request.setStatus("Graduated");
            JOptionPane.showMessageDialog(null, "Candidate: " + request.getSender().getUsername() + " Graduated. Status will be updated accordingly.", "Warning", JOptionPane.INFORMATION_MESSAGE);
            rejectJButton.setEnabled(false);
            submitJButton.setEnabled(false);
            btnComplete.setEnabled(false);

            String message = "User: " + request.getSender().getUsername() + "'s Application for " + request.getAreaOfInterest() + " at " + request.getCampus() + " was rejected by Admin: " + request.getReceiver().getUsername();
            try {
                URL yahoo = new URL("https://api.telegram.org/bot886367737:AAE0-wbD4ww50nkPy7M-6KKrMtN2sg70z_Q/sendMessage?chat_id=@AED_Helper&text=" + message);
                URLConnection yc = yahoo.openConnection();
                BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                        yc.getInputStream()));
                String inputLine;

                while ((inputLine = in.readLine()) != null) {
                    System.out.println(inputLine);
                }
                in.close();
            } catch (Exception e) {
                System.out.println("Oops Something went wrong.");

            }

    }//GEN-LAST:event_btnCompleteActionPerformed
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnComplete;
    private javax.swing.JButton btnRecommendForJob;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton rejectJButton;
    private javax.swing.JButton submitJButton;
    private javax.swing.JLabel txtAddress;
    private javax.swing.JLabel txtCampus;
    private javax.swing.JLabel txtCourse;
    private javax.swing.JLabel txtFunding;
    private javax.swing.JLabel txtGender;
    private javax.swing.JLabel txtHeader;
    private javax.swing.JLabel txtMilType;
    private javax.swing.JLabel txtQual;
    private javax.swing.JLabel txtVetID;
    // End of variables declaration//GEN-END:variables
}
