/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.userinterface.MentalHealthCare;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.MentalHealthCareOrganzition;
import Business.UserAccount.UserAccount;
import Business.Citizen.Citizen;
import Business.Citizen.CitizenDirectory;
import Business.WorkQueue.MentalHealthCareRequest;
import Business.WorkQueue.RehabWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.userinterface.SystemAdminWorkArea.ViewAllCitizen;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author kshitijkumartiwari
 */
public class MentalHealthCareWorkAreaJPanel extends javax.swing.JPanel {

     private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private  MentalHealthCareOrganzition MHC_Organization;
    private CitizenDirectory vd;
    private Enterprise enterprise;

    /**
     * Creates new form MentalHealthCareWorkAreaJPanel
     */

    public MentalHealthCareWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, CitizenDirectory vd,EcoSystem system) {
       initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.system = system;
        this.MHC_Organization = (MentalHealthCareOrganzition) organization;
        this.enterprise = enterprise;
        this.vd = vd;
        populateTable();   
        populateRequestTable();
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
        workRequestJTable = new javax.swing.JTable();
        refreshJButton = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rehab_tbl = new javax.swing.JTable();
        btnViewAllCitizen = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtTotalRequests1 = new javax.swing.JLabel();
        txtAcc = new javax.swing.JLabel();
        txtPend = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTotalRequests2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtAcc1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPend1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtWelcome = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Concern", "Sender", "Receiver", "Status", "Medical History", "Symptoms"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 977, 130));

        refreshJButton.setBackground(new java.awt.Color(20, 53, 94));
        refreshJButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(999, 48, -1, -1));

        assignJButton.setBackground(new java.awt.Color(20, 53, 94));
        assignJButton.setForeground(new java.awt.Color(255, 255, 255));
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 118, 46));

        processJButton.setBackground(new java.awt.Color(20, 53, 94));
        processJButton.setForeground(new java.awt.Color(255, 255, 255));
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 518, 118, 46));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Citizen Request List");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Rehab  Request List");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 134, -1, -1));

        rehab_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Citizen Concern", "Citizen Name", "Rehab Concern", "Rehab Report Result"
            }
        ));
        jScrollPane2.setViewportView(rehab_tbl);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 169, 474, 113));

        btnViewAllCitizen.setBackground(new java.awt.Color(20, 53, 94));
        btnViewAllCitizen.setForeground(new java.awt.Color(255, 255, 255));
        btnViewAllCitizen.setText("View and track Citizen");
        btnViewAllCitizen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllCitizenActionPerformed(evt);
            }
        });
        add(btnViewAllCitizen, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 48, 208, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Overall - Across Organization");
        jLabel4.setFocusable(false);
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 111, -1, -1));

        txtTotalRequests1.setBackground(new java.awt.Color(153, 255, 255));
        txtTotalRequests1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtTotalRequests1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotalRequests1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTotalRequests1.setFocusable(false);
        txtTotalRequests1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtTotalRequests1, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 130, 88, 34));

        txtAcc.setBackground(new java.awt.Color(153, 255, 255));
        txtAcc.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtAcc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAcc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtAcc.setFocusable(false);
        txtAcc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 130, 88, 34));

        txtPend.setBackground(new java.awt.Color(153, 255, 255));
        txtPend.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtPend.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPend.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPend.setFocusable(false);
        txtPend.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtPend, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 130, 88, 34));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel11.setText("Total Pending");
        jLabel11.setFocusable(false);
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel5.setText("Total Accepted");
        jLabel5.setFocusable(false);
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel6.setText("Total Requests");
        jLabel6.setFocusable(false);
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 170, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("My Requests");
        jLabel10.setFocusable(false);
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 210, -1, -1));

        txtTotalRequests2.setBackground(new java.awt.Color(153, 153, 255));
        txtTotalRequests2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtTotalRequests2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotalRequests2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTotalRequests2.setFocusable(false);
        txtTotalRequests2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtTotalRequests2, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 229, 88, 34));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel9.setText("Total Requests");
        jLabel9.setFocusable(false);
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 269, -1, -1));

        txtAcc1.setBackground(new java.awt.Color(153, 153, 255));
        txtAcc1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtAcc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAcc1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtAcc1.setFocusable(false);
        txtAcc1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtAcc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 229, 88, 34));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel8.setText("Total Accepted");
        jLabel8.setFocusable(false);
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 269, -1, -1));

        txtPend1.setBackground(new java.awt.Color(153, 153, 255));
        txtPend1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtPend1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPend1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPend1.setFocusable(false);
        txtPend1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtPend1, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 230, 88, 34));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel12.setText("Total Pending");
        jLabel12.setFocusable(false);
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 270, -1, -1));

        txtWelcome.setBackground(new java.awt.Color(204, 204, 255));
        txtWelcome.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtWelcome.setFocusable(false);
        add(txtWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 63, 580, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Mental Healthcare Dashboard");
        jLabel7.setFocusable(false);
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
        populateRequestTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed
 public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) rehab_tbl.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = ((RehabWorkRequest) request).getCitizenName();
            row[2] = ((RehabWorkRequest) request).getRehabConcern();
            String result = ((RehabWorkRequest) request).getReturn_Result();
            row[3] = result == null ? "Waiting" : result;
            
            model.addRow(row);
        }
    }
    
       public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
 int totalRequests = 0;
        int acceptedRequests = 0;
        int rejectedRequests = 0;
        int pendingRequests = 0;
        int totalRequestsUser = 0;
        int acceptedRequestsUser = 0;
        int rejectedRequestsUser = 0;
        int pendingRequestsUser = 0;
        int unassignedReq = 0;
        model.setRowCount(0);
        System.out.println("Inside PopulateTable");

        for (WorkRequest request : MHC_Organization.getWorkQueue().getWorkRequestList()) {
            System.out.println("Inside LOOP");
            totalRequests = totalRequests + 1;
            Object[] row = new Object[6];
            String CitizenName = "";
        for (Citizen v : system.getVd().getCitizen_Dir() ) {
            if (v.getUsername().equals(request.getSender().getUsername())) {
                CitizenName = v.getFirstName()+ " "+ v.getLastName();
                break;

            }
        } 
            row[0] = request;
            row[1] = CitizenName;
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            row[4] = ((MentalHealthCareRequest)request).getMedicalHistory_mental();
            row[5] = ((MentalHealthCareRequest)request).getMain_Concern();
 if (request.getReceiver() == null) {
                    unassignedReq = unassignedReq + 1;
                } else if (request.getReceiver().getEmployee().equals(userAccount.getEmployee())) {
                    totalRequestsUser = totalRequestsUser + 1;
                    if (request.getStatus().equals("Approved")) {
                        acceptedRequestsUser = acceptedRequestsUser + 1;
                    } else {
                        pendingRequestsUser = pendingRequestsUser + 1;
                    }

                }

                if (request.getStatus().equals("Approved")) {
                    acceptedRequests = acceptedRequests + 1;
                } else {
                    pendingRequests = pendingRequests + 1;
                }
            model.addRow(row);
        }
         txtTotalRequests1.setText(Integer.toString(totalRequests));
            txtAcc.setText(Integer.toString(acceptedRequests));
           // txtRej.setText(Integer.toString(rejectedRequests));
            txtPend.setText(Integer.toString(pendingRequests));

            txtTotalRequests2.setText(Integer.toString(totalRequestsUser));
            txtAcc1.setText(Integer.toString(acceptedRequestsUser));
           // txtRej1.setText(Integer.toString(rejectedRequestsUser));
            txtPend1.setText(Integer.toString(pendingRequestsUser));

            txtWelcome.setText("Welcome back, " + userAccount.getEmployee().getName() + ". There are " + (Integer.toString(unassignedReq)) + " unassigned request(s) for review & " + (Integer.toString(pendingRequests)) + " in your queue.");

    }
       
    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow >= 0) {
           WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateTable();
        } else{
            JOptionPane.showMessageDialog(null,"Please select any row from above table","Warning",JOptionPane.WARNING_MESSAGE);
        }

        
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow >= 0) {
           MentalHealthCareRequest request = (MentalHealthCareRequest) workRequestJTable.getValueAt(selectedRow, 0);
if(request.getStatus().equalsIgnoreCase("Approved"))
        {
            JOptionPane.showMessageDialog(null, "Already Processed!!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        //btnReject.setEnabled(false);
        }
        request.setStatus("Processing");

        MHC_WorkRequestJPanel mentalHealthCareRequest = new MHC_WorkRequestJPanel(userProcessContainer, request,system,userAccount);
        userProcessContainer.add("MentalHealthCareRequest", mentalHealthCareRequest);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }else{
            JOptionPane.showMessageDialog(null,"Please select any row from above table","Warning",JOptionPane.WARNING_MESSAGE);
        }
        

     
    }//GEN-LAST:event_processJButtonActionPerformed

    private void btnViewAllCitizenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllCitizenActionPerformed
        // TODO add your handling code here:
        ViewAllCitizen rg = new ViewAllCitizen(userProcessContainer, system, vd);
        userProcessContainer.add("ViewAllCitizens", rg);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewAllCitizenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton btnViewAllCitizen;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable rehab_tbl;
    private javax.swing.JLabel txtAcc;
    private javax.swing.JLabel txtAcc1;
    private javax.swing.JLabel txtPend;
    private javax.swing.JLabel txtPend1;
    private javax.swing.JLabel txtTotalRequests1;
    private javax.swing.JLabel txtTotalRequests2;
    private javax.swing.JLabel txtWelcome;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
