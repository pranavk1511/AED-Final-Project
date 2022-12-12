/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.userinterface.CitizenRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.GradSchoolOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Citizen.CitizenDirectory;
import Business.WorkQueue.GradSchoolRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author 91983
 */
public class RequestGradJPanel2 extends javax.swing.JPanel {

    /**
     * Creates new form RequestGradJPanel2
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    private CitizenDirectory vd;
    String hsGrade;
    String highSchool;
    String bachUni;
    String bachGrade;
    String bachDegree;

    RequestGradJPanel2(JPanel userProcessContainer, UserAccount userAccount, CitizenDirectory vd, EcoSystem system, String highSchool, String hsGrade, String bachUni, String bachGrade, String bachDegree) {

        this.userProcessContainer = userProcessContainer;
        this.vd = vd;
        this.userAccount = userAccount;
        this.system = system;
        this.hsGrade = hsGrade;
        this.highSchool = highSchool;
        this.bachUni = bachUni;
        this.bachGrade = bachGrade;
        this.bachDegree = bachDegree;

        initComponents();
        populateData();

//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void populateData() {
        String message = null;

        if (bachDegree.equals("Computer Science")) {
            comboProgram.addItem("Masters in Computer Science");
            comboProgram.addItem("Masters in Computer Systems Engineering");
            message = "Masters in Computer Science & Masters in Computer Systems Engineering";
        } else if (bachDegree.equals("Electrical Engineering")) {
            comboProgram.addItem("Masters in Electrical Systems");
            comboProgram.addItem("Masters in Power Systems");
            message = "Masters in Electrical Systems & Masters in Power Systems";
        } else if (bachDegree.equals("Human Relations")) {
            comboProgram.addItem("Masters in Human Relations");
            comboProgram.addItem("Masters in HR");
            message = "Masters in Human Relations & Masters in HR";
        } else if (bachDegree.equals("Medical")) {
            comboProgram.addItem("Post Doctoral - 2");
            comboProgram.addItem("Post Doctoral - 1");
            message = "Post Doctoral - 1 & Post Doctoral 2";
        } else if (bachDegree.equals("Biotechnology")) {
            comboProgram.addItem("Masters in Biomedical Engineering");
            comboProgram.addItem("Masters in Biochemical Engineering");
            message = "Masters in Biomedical Engineering & Biochemical Engineering";
        } else if (bachDegree.equals("Law")) {
            comboProgram.addItem("Criminal Law Specialization");
            comboProgram.addItem("Corporate Law Specialization");
            message = "Criminal Law Specialization & Corporate Law Specialization";
        }

        txtRecommend1.setText("Based on your Bachelor's Degree in " + bachDegree + ", the following courses are recommended");
        txtRecommend.setText(message);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtRecommend = new javax.swing.JLabel();
        comboProgram = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboUniversity = new javax.swing.JComboBox<>();
        txtRecommend1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboUniversity1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAdditional = new javax.swing.JTextArea();
        btnSubmit = new javax.swing.JButton();
        Home = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Apply for a Master's Degree");
        jLabel3.setFocusable(false);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("A master’s degree typically requires a year and one-half to two years of full-time study. ");
        jLabel2.setFocusable(false);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 23));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Choose Desired Program");
        jLabel1.setFocusable(false);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 30));

        txtRecommend.setBackground(new java.awt.Color(20, 53, 94));
        txtRecommend.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        txtRecommend.setForeground(new java.awt.Color(20, 53, 94));
        add(txtRecommend, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 580, 31));

        add(comboProgram, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 220, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Application - Page 2");
        jLabel4.setFocusable(false);
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Choose University");
        jLabel5.setFocusable(false);
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 30));

        comboUniversity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Northeastern Univerisity", "Arizona State University", "NJIT", "NYU", "University of Cincinati", "University of Florida" }));
        add(comboUniversity, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 220, -1));

        txtRecommend1.setBackground(new java.awt.Color(20, 53, 94));
        txtRecommend1.setForeground(new java.awt.Color(20, 53, 94));
        add(txtRecommend1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 580, 31));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Additional Information");
        jLabel6.setFocusable(false);
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, 30));

        comboUniversity1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Spring", "Fall", "Summer" }));
        add(comboUniversity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 220, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Desired Intake");
        jLabel7.setFocusable(false);
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 30));

        txtAdditional.setColumns(20);
        txtAdditional.setRows(5);
        jScrollPane1.setViewportView(txtAdditional);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, -1, -1));

        btnSubmit.setBackground(new java.awt.Color(255, 204, 51));
        btnSubmit.setText("Submit Application");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 230, -1));

        Home.setBackground(new java.awt.Color(255, 204, 51));
        Home.setText("Home");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 570, 230, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:

        GradSchoolRequest request = new GradSchoolRequest();
        request.setAdditionalInfo(txtAdditional.getText());
        request.setBachDegree(bachDegree);
        request.setBachGrade(bachGrade);
        request.setBachUni(bachUni);
        request.setDesIntake((String) comboUniversity1.getSelectedItem());
        request.setDesProgram((String) comboProgram.getSelectedItem());
        request.setHighSchool(highSchool);
        request.setHsGrade(hsGrade);
        request.setSender(userAccount);
        request.setStatus("Applied");
        request.setMessage("Request for Grad School");

        Organization org = null;
        System.out.println("Request Page2");

        for (Network network : system.getNetworkList()) {
            //Step 2.a: check against each enterprise
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                System.out.println(enterprise);

//                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                //Step 3:check against each organization for each enterprise
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    System.out.println(organization);

                    if (organization instanceof GradSchoolOrganization) {
                        org = organization;
                        System.out.println(org);
                        break;
                    }

                }
            }
        }

        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(request);
            System.out.println("Added GradSchoolRequest to Org");
            userAccount.getWorkQueue().getWorkRequestList().add(request);
            System.out.println("Added VocationalRequest to UserAccount");
            JOptionPane.showMessageDialog(null, "Your Application has been submitted Successfully", "Information", JOptionPane.INFORMATION_MESSAGE);

        }

        String message = "User: " + userAccount.getUsername() + " raised a request for Grad School";

//        String message = "User: " + userAccount.getUsername() + " raised a request for " + (String) coursesComboBox.getSelectedItem() + " at " + (String) campusComboBox.getSelectedItem() + " Campus";
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

//        JOptionPane.showMessageDialog(null, "Request Submitted Successfully", "Information", JOptionPane.INFORMATION_MESSAGE);

        comboProgram.setEnabled(false);

        comboUniversity.setEnabled(false);

        comboUniversity1.setEnabled(false);

        txtAdditional.setEnabled(false);
//        backJButton1.setEnabled(false);
        btnSubmit.setEnabled(false);


    }//GEN-LAST:event_btnSubmitActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed

//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();

        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CitizenWorkAreaJPanel dwjp = (CitizenWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_HomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Home;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> comboProgram;
    private javax.swing.JComboBox<String> comboUniversity;
    private javax.swing.JComboBox<String> comboUniversity1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAdditional;
    private javax.swing.JLabel txtRecommend;
    private javax.swing.JLabel txtRecommend1;
    // End of variables declaration//GEN-END:variables
}
