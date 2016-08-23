package Forms;


import java.sql.*;
import javax.swing.JInternalFrame;
import javax.swing.table.DefaultTableModel;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Admin extends javax.swing.JFrame {
    Connection con;
    Statement stmt;
    ResultSet rs;
   
    public Admin() {
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        sector_table = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        flights_table = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        aircraft_table = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        staff_table = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Setting = new javax.swing.JMenu();
        staff = new javax.swing.JMenu();
        flights = new javax.swing.JMenu();
        aircraft = new javax.swing.JMenu();
        sector = new javax.swing.JMenu();
        Operation = new javax.swing.JMenu();
        search = new javax.swing.JMenu();
        book = new javax.swing.JMenu();
        Exit = new javax.swing.JMenu();

        sector_table.setTitle("Sector");
        sector_table.setMinimumSize(new java.awt.Dimension(800, 425));
        sector_table.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                sector_tableWindowActivated(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Source", "Destination", "Business class fare", "Execurive class fare", "Economical class fare"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout sector_tableLayout = new javax.swing.GroupLayout(sector_table.getContentPane());
        sector_table.getContentPane().setLayout(sector_tableLayout);
        sector_tableLayout.setHorizontalGroup(
            sector_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sector_tableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                .addContainerGap())
        );
        sector_tableLayout.setVerticalGroup(
            sector_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sector_tableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addContainerGap())
        );

        flights_table.setTitle("Flights");
        flights_table.setMinimumSize(new java.awt.Dimension(520, 530));
        flights_table.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                flights_tableWindowActivated(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight No.", "Departure time", "Aircraft Type ID", "Sector ID"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout flights_tableLayout = new javax.swing.GroupLayout(flights_table.getContentPane());
        flights_table.getContentPane().setLayout(flights_tableLayout);
        flights_tableLayout.setHorizontalGroup(
            flights_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flights_tableLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        flights_tableLayout.setVerticalGroup(
            flights_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flights_tableLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        aircraft_table.setTitle("Aircraft");
        aircraft_table.setMinimumSize(new java.awt.Dimension(720, 410));
        aircraft_table.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                aircraft_tableWindowActivated(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Aircraft Type ID", "Description", "Business class", "Executive class", "Economy class"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout aircraft_tableLayout = new javax.swing.GroupLayout(aircraft_table.getContentPane());
        aircraft_table.getContentPane().setLayout(aircraft_tableLayout);
        aircraft_tableLayout.setHorizontalGroup(
            aircraft_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aircraft_tableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
                .addContainerGap())
        );
        aircraft_tableLayout.setVerticalGroup(
            aircraft_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aircraft_tableLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        staff_table.setTitle("Staff");
        staff_table.setMinimumSize(new java.awt.Dimension(462, 340));
        staff_table.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                staff_tableWindowActivated(evt);
            }
        });

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Employee Name", "Job"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout staff_tableLayout = new javax.swing.GroupLayout(staff_table.getContentPane());
        staff_table.getContentPane().setLayout(staff_tableLayout);
        staff_tableLayout.setHorizontalGroup(
            staff_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staff_tableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addContainerGap())
        );
        staff_tableLayout.setVerticalGroup(
            staff_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staff_tableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MAIN.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(jLabel1, gridBagConstraints);

        Setting.setText("Setting");

        staff.setText("Staff");
        staff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffMouseClicked(evt);
            }
        });
        staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffActionPerformed(evt);
            }
        });
        Setting.add(staff);

        flights.setText("Flights");
        flights.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flightsMouseClicked(evt);
            }
        });
        Setting.add(flights);

        aircraft.setText("Aircraft");
        aircraft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aircraftMouseClicked(evt);
            }
        });
        Setting.add(aircraft);

        sector.setText("Sector");
        sector.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sectorMouseClicked(evt);
            }
        });
        Setting.add(sector);

        jMenuBar1.add(Setting);

        Operation.setText("Operation");

        search.setText("Search");
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        Operation.add(search);

        book.setText("Quick Book");
        book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookMouseClicked(evt);
            }
        });
        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookActionPerformed(evt);
            }
        });
        Operation.add(book);

        jMenuBar1.add(Operation);

        Exit.setText("Exit");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jMenuBar1.add(Exit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void staffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffMouseClicked
        staff_table.setVisible(true);
    }//GEN-LAST:event_staffMouseClicked

    private void flightsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flightsMouseClicked
        flights_table.setVisible(true);
    }//GEN-LAST:event_flightsMouseClicked

    private void staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffActionPerformed
       
    }//GEN-LAST:event_staffActionPerformed

    private void flights_tableWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_flights_tableWindowActivated
        DefaultTableModel model= (DefaultTableModel)jTable2.getModel();
        String query="select * from a_r_s.flights1";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/a_r_S", "root", "admin");
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            while(rs.next())
            {
                model.addRow(new Object[]
                {
                    rs.getString(1),rs.getTime(2),rs.getString(3),rs.getString(4)
                });
            }
        }
        catch(Exception e)
        {
            System.out.print(e.getMessage());
        }
        
    }//GEN-LAST:event_flights_tableWindowActivated

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        
    }//GEN-LAST:event_ExitActionPerformed

    private void aircraftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aircraftMouseClicked
        aircraft_table.setVisible(true);
    }//GEN-LAST:event_aircraftMouseClicked

    private void aircraft_tableWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_aircraft_tableWindowActivated
        DefaultTableModel model= (DefaultTableModel)jTable3.getModel();
        String query="select * from a_r_s.aircraft";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/a_r_S", "root", "admin");
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            while(rs.next())
            {
                model.addRow(new Object[]
                {
                    rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getInt(5)
                });
            }
        }
        catch(Exception e)
        {
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_aircraft_tableWindowActivated

    private void sector_tableWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_sector_tableWindowActivated
       DefaultTableModel model= (DefaultTableModel)jTable1.getModel();
        String query="select source,destination,bfare,xfare,efare from a_r_s.sector";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/a_r_S", "root", "admin");
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            while(rs.next())
            {
                model.addRow(new Object[]
                {
                    rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)
                });
            }
        }
        catch(Exception e)
        {
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_sector_tableWindowActivated

    private void sectorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sectorMouseClicked
        sector_table.setVisible(true);
    }//GEN-LAST:event_sectorMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
       
        
        
    }//GEN-LAST:event_searchActionPerformed

    private void bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookActionPerformed
        
    }//GEN-LAST:event_bookActionPerformed

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        Search_Frame sf = new Search_Frame();
        sf.setVisible(true);
    }//GEN-LAST:event_searchMouseClicked

    private void bookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookMouseClicked
        Booking_Frame bf = new Booking_Frame();
        bf.setVisible(true);
    }//GEN-LAST:event_bookMouseClicked

    private void staff_tableWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_staff_tableWindowActivated
        DefaultTableModel model= (DefaultTableModel)jTable4.getModel();
        String query="select * from a_r_s.staff";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/a_r_S", "root", "admin");
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            while(rs.next())
            {
                model.addRow(new Object[]
                {
                    rs.getInt(1),rs.getString(2),rs.getString(11)
                });
            }
        }
        catch(Exception e)
        {
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_staff_tableWindowActivated

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Exit;
    private javax.swing.JMenu Operation;
    private javax.swing.JMenu Setting;
    private javax.swing.JMenu aircraft;
    private javax.swing.JDialog aircraft_table;
    private javax.swing.JMenu book;
    private javax.swing.JMenu flights;
    private javax.swing.JDialog flights_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JMenu search;
    private javax.swing.JMenu sector;
    private javax.swing.JDialog sector_table;
    private javax.swing.JMenu staff;
    private javax.swing.JDialog staff_table;
    // End of variables declaration//GEN-END:variables
}
