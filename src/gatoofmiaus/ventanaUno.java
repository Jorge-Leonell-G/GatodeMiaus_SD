package gatoofmiaus;

import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Valery
 */
public class ventanaUno extends javax.swing.JFrame{
    
    private clienteMiau cliente;

    String turno = "x";
    JLabel lbs[] = new JLabel[9];
    int victorias[][] = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9},
        {1, 4, 7},
        {2, 5, 8},
        {3, 6, 9},
        {1, 5, 9},
        {3, 5, 7}
    };

    public ventanaUno() {
        try{
            initComponents();
            this.setLocationRelativeTo(null);

            lbs[0] = jLabel1;
            lbs[1] = jLabel2;
            lbs[2] = jLabel3;
            lbs[3] = jLabel4;
            lbs[4] = jLabel5;
            lbs[5] = jLabel6;
            lbs[6] = jLabel7;
            lbs[7] = jLabel8;
            lbs[8] = jLabel9;
        
            
            cliente = new clienteMiau();
            Thread hilo = new Thread(cliente);
            hilo.start();
            if(!cliente.ConectarAServidor()){
                JOptionPane.showMessageDialog(this,"Debe iniciar el servidor primero", "Aviso", 0);
                System.exit(0);
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 0, 51));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 52)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setOpaque(true);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setOpaque(true);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel12MousePressed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setOpaque(true);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel13MousePressed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setOpaque(true);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel14MousePressed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setOpaque(true);
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setOpaque(true);
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel25MousePressed(evt);
            }
        });

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setOpaque(true);
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel26MousePressed(evt);
            }
        });

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setOpaque(true);
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel27MousePressed(evt);
            }
        });

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setOpaque(true);
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel28MousePressed(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(255, 0, 255));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("REINICIAR");
        jLabel16.setOpaque(true);
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel16MousePressed(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Ganador C3");
        jLabel17.setOpaque(true);
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel17MousePressed(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Ganador C1");
        jLabel18.setOpaque(true);
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel18MousePressed(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Ganador C2");
        jLabel19.setOpaque(true);
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel19MousePressed(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Ganador C6");
        jLabel20.setOpaque(true);
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel20MousePressed(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Ganador C4");
        jLabel21.setOpaque(true);
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel21MousePressed(evt);
            }
        });

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Ganador C5");
        jLabel29.setOpaque(true);
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel29MousePressed(evt);
            }
        });

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Ganador C7");
        jLabel30.setOpaque(true);
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel30MousePressed(evt);
            }
        });

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Ganador C9");
        jLabel31.setOpaque(true);
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel31MousePressed(evt);
            }
        });

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Ganador C8");
        jLabel32.setOpaque(true);
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel32MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        try {
            presionar(2);
        } catch (IOException ex) {
            Logger.getLogger(ventanaUno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        try {
            presionar(3);
        } catch (IOException ex) {
            Logger.getLogger(ventanaUno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        try {
            presionar(1);
        } catch (IOException ex) {
            Logger.getLogger(ventanaUno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        try {
            presionar(4);
        } catch (IOException ex) {
            Logger.getLogger(ventanaUno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        try {
            presionar(5);
        } catch (IOException ex) {
            Logger.getLogger(ventanaUno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel5MousePressed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        try {
            presionar(6);
        } catch (IOException ex) {
            Logger.getLogger(ventanaUno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel6MousePressed

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        try {
            presionar(7);
        } catch (IOException ex) {
            Logger.getLogger(ventanaUno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        try {
            presionar(9);
        } catch (IOException ex) {
            Logger.getLogger(ventanaUno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel9MousePressed

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        try {
            presionar(8);
        } catch (IOException ex) {
            Logger.getLogger(ventanaUno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel8MousePressed

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed

    }//GEN-LAST:event_jLabel10MousePressed

    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MousePressed

    private void jLabel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MousePressed

    private void jLabel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MousePressed

    private void jLabel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MousePressed

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MousePressed

    private void jLabel25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel25MousePressed

    private void jLabel26MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel26MousePressed

    private void jLabel27MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel27MousePressed

    private void jLabel28MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel28MousePressed

    private void jLabel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MousePressed
        reiniciarJuego();
    }//GEN-LAST:event_jLabel16MousePressed

    private void jLabel17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MousePressed

    private void jLabel18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel18MousePressed

    private void jLabel19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MousePressed

    private void jLabel20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel20MousePressed

    private void jLabel21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel21MousePressed

    private void jLabel29MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel29MousePressed

    private void jLabel30MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel30MousePressed

    private void jLabel31MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel31MousePressed

    private void jLabel32MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel32MousePressed

    public void presionar(int casilla) throws IOException {
        ventanaPadre ventP = new ventanaPadre();

        if (lbs[casilla - 1].getText().equals("")) {
            lbs[casilla - 1].setText(turno);
            changeTurno();
            ganador();
        }

    }

    public void mostrarAnteriores() throws IOException {
        ventanaPadre ventP = new ventanaPadre();
        for (int i = 0; i < 9; i++) {
            if (ventP.lbs[i - 1].equals("x")) {
                ventP.jLabel1.setText("x");
            }
        }
    }

    public void changeTurno() {
        if (turno.equals("x")) {
            turno = "o";
        } else {
            turno = "x";
        }
    }

    public void ganador() throws IOException {

        ventanaPadre ventP = new ventanaPadre();

        for (int i = 0; i < victorias.length; i++) {
            if (lbs[victorias[i][0] - 1].getText().equals("x") && lbs[victorias[i][1] - 1].getText().equals("x") && lbs[victorias[i][2] - 1].getText().equals("x")) {
                JOptionPane.showMessageDialog(null, "JUGADOR X HA GANADO");

                
                if (jLabel10.getText().equals("Casilla 1")) {
                                        
                    
                    ventP.jLabel1.setText("x");
                    jLabel12.setText("x");
                    
                    
                    
                if (jLabel12.getText().equals("x")) {
                    ventP.jLabel10.setText("x");
                    ventP.jLabel1.setText("x");
                }
                else if (jLabel13.getText().equals("x")) {
                    ventP.jLabel11.setText("x");
                    ventP.jLabel2.setText("x");
                }
                else if (jLabel11.getText().equals("x")) {
                    ventP.jLabel12.setText("x");
                    ventP.jLabel3.setText("x");
                }
                else if (jLabel15.getText().equals("x")) {
                    ventP.jLabel13.setText("x");
                    ventP.jLabel4.setText("x");
                }
                else if (jLabel25.getText().equals("x")) {
                    ventP.jLabel14.setText("x");
                    ventP.jLabel5.setText("x");
                }
                else if (jLabel14.getText().equals("x")) {
                    ventP.jLabel15.setText("x");
                    ventP.jLabel6.setText("x");
                }
                else if (jLabel26.getText().equals("x")) {
                    ventP.jLabel26.setText("x");
                    ventP.jLabel7.setText("x");
                }
                else if (jLabel28.getText().equals("x")) {
                    ventP.jLabel27.setText("x");
                    ventP.jLabel8.setText("x");
                }
                else if (jLabel27.getText().equals("x")) {
                    ventP.jLabel25.setText("x");
                    ventP.jLabel9.setText("x");
                }


                else if (jLabel12.getText().equals("o")) {
                    ventP.jLabel10.setText("o");
                    ventP.jLabel1.setText("o");
                }
                else if (jLabel13.getText().equals("o")) {
                    ventP.jLabel11.setText("o");
                    ventP.jLabel2.setText("o");
                }
                else if (jLabel11.getText().equals("o")) {
                    ventP.jLabel12.setText("o");
                    ventP.jLabel3.setText("o");
                }
                else if (jLabel15.getText().equals("o")) {
                    ventP.jLabel13.setText("o");
                    ventP.jLabel4.setText("o");
                }
                else if (jLabel25.getText().equals("o")) {
                    ventP.jLabel14.setText("o");
                    ventP.jLabel5.setText("o");
                }
                else if (jLabel14.getText().equals("o")) {
                    ventP.jLabel15.setText("o");
                    ventP.jLabel6.setText("o");
                }
                else if (jLabel26.getText().equals("o")) {
                    ventP.jLabel26.setText("o");
                    ventP.jLabel7.setText("o");
                }
                else if (jLabel28.getText().equals("o")) {
                    ventP.jLabel27.setText("o");
                    ventP.jLabel8.setText("o");
                }
                else{
                    ventP.jLabel25.setText("o");
                    ventP.jLabel9.setText("o");
                }
                    
                    ventP.setVisible(true);
                    ventP.setLocationRelativeTo(null);
                    this.setVisible(false);
                    reiniciarJuego();
                } else if (jLabel10.getText().equals("Casilla 2")) {
                    ventP.jLabel2.setText("x");
                    jLabel13.setText("x");                    
                    
                    
                if (jLabel12.getText().equals("x")) {
                    ventP.jLabel10.setText("x");
                    ventP.jLabel1.setText("x");
                }
                if (jLabel13.getText().equals("x")) {
                    ventP.jLabel11.setText("x");
                   ventP.jLabel2.setText("x");
                }
                if (jLabel11.getText().equals("x")) {
                    ventP.jLabel12.setText("x");
                    ventP.jLabel3.setText("x");
                }
                if (jLabel15.getText().equals("x")) {
                    ventP.jLabel13.setText("x");
                    ventP.jLabel4.setText("x");
                }
                if (jLabel25.getText().equals("x")) {
                    ventP.jLabel14.setText("x");
                    ventP.jLabel5.setText("x");
                }
                if (jLabel14.getText().equals("x")) {
                    ventP.jLabel15.setText("x");
                    ventP.jLabel6.setText("x");
                }
                if (jLabel26.getText().equals("x")) {
                    ventP.jLabel26.setText("x");
                    ventP.jLabel7.setText("x");
                }
                if (jLabel28.getText().equals("x")) {
                    ventP.jLabel27.setText("x");
                    ventP.jLabel8.setText("x");
                }
                if (jLabel27.getText().equals("x")) {
                    ventP.jLabel25.setText("x");
                    ventP.jLabel9.setText("x");
                }


                if (jLabel12.getText().equals("o")) {
                    ventP.jLabel10.setText("o");
                    ventP.jLabel1.setText("o");
                }
                if (jLabel13.getText().equals("o")) {
                    ventP.jLabel11.setText("o");
                    ventP.jLabel2.setText("o");
                }
                if (jLabel11.getText().equals("o")) {
                    ventP.jLabel12.setText("o");
                    ventP.jLabel3.setText("o");
                }
                if (jLabel15.getText().equals("o")) {
                    ventP.jLabel13.setText("o");
                    ventP.jLabel4.setText("o");
                }
                if (jLabel25.getText().equals("o")) {
                    ventP.jLabel14.setText("o");
                    ventP.jLabel5.setText("o");
                }
                if (jLabel14.getText().equals("o")) {
                    ventP.jLabel15.setText("o");
                    ventP.jLabel6.setText("o");
                }
                if (jLabel26.getText().equals("o")) {
                    ventP.jLabel26.setText("o");
                    ventP.jLabel7.setText("o");
                }
                if (jLabel28.getText().equals("o")) {
                    ventP.jLabel27.setText("o");
                    ventP.jLabel8.setText("o");
                }
                if (jLabel27.getText().equals("o")) {
                    ventP.jLabel25.setText("o");
                    ventP.jLabel9.setText("o");
                }
                    
                    
                    
                    this.setVisible(false);
                    ventP.setVisible(true);
                    ventP.setLocationRelativeTo(null);
                } else if (jLabel10.getText().equals("Casilla 3")) {
                    ventP.jLabel3.setText("x");
                    jLabel11.setText("x");                    
                    
                    
                if (jLabel12.getText().equals("x")) {
                    ventP.jLabel10.setText("x");
                    ventP.jLabel1.setText("x");
                }
                if (jLabel13.getText().equals("x")) {
                    ventP.jLabel11.setText("x");
                    ventP.jLabel2.setText("x");
                }
                if (jLabel11.getText().equals("x")) {
                    ventP.jLabel12.setText("x");
                    ventP.jLabel3.setText("x");
                }
                if (jLabel15.getText().equals("x")) {
                    ventP.jLabel13.setText("x");
                    ventP.jLabel4.setText("x");
                }
                if (jLabel25.getText().equals("x")) {
                    ventP.jLabel14.setText("x");
                    ventP.jLabel5.setText("x");
                }
                if (jLabel14.getText().equals("x")) {
                    ventP.jLabel15.setText("x");
                    ventP.jLabel6.setText("x");
                }
                if (jLabel26.getText().equals("x")) {
                    ventP.jLabel26.setText("x");
                    ventP.jLabel7.setText("x");
                }
                if (jLabel28.getText().equals("x")) {
                    ventP.jLabel27.setText("x");
                    ventP.jLabel8.setText("x");
                }
                if (jLabel27.getText().equals("x")) {
                    ventP.jLabel25.setText("x");
                    ventP.jLabel9.setText("x");
                }


                if (jLabel12.getText().equals("o")) {
                    ventP.jLabel10.setText("o");
                    ventP.jLabel1.setText("o");
                }
                if (jLabel13.getText().equals("o")) {
                    ventP.jLabel11.setText("o");
                    ventP.jLabel2.setText("o");
                }
                if (jLabel11.getText().equals("o")) {
                    ventP.jLabel12.setText("o");
                    ventP.jLabel3.setText("o");
                }
                if (jLabel15.getText().equals("o")) {
                    ventP.jLabel13.setText("o");
                    ventP.jLabel4.setText("o");
                }
                if (jLabel25.getText().equals("o")) {
                    ventP.jLabel14.setText("o");
                    ventP.jLabel5.setText("o");
                }
                if (jLabel14.getText().equals("o")) {
                    ventP.jLabel15.setText("o");
                    ventP.jLabel6.setText("o");
                }
                if (jLabel26.getText().equals("o")) {
                    ventP.jLabel26.setText("o");
                    ventP.jLabel7.setText("o");
                }
                if (jLabel28.getText().equals("o")) {
                    ventP.jLabel27.setText("o");
                    ventP.jLabel8.setText("o");
                }
                if (jLabel27.getText().equals("o")) {
                    ventP.jLabel25.setText("o");
                    ventP.jLabel9.setText("o");
                }
                    
                    
                    

                    ventP.setVisible(true);
                    ventP.setLocationRelativeTo(null);
                    this.setVisible(false);
                    reiniciarJuego();
                } else if (jLabel10.getText().equals("Casilla 4")) {
                    ventP.jLabel4.setText("x");
                    jLabel15.setText("x");                    
                    
                    
                if (jLabel12.getText().equals("x")) {
                    ventP.jLabel10.setText("x");
                    ventP.jLabel1.setText("x");
                }
                if (jLabel13.getText().equals("x")) {
                    ventP.jLabel11.setText("x");
                    ventP.jLabel2.setText("x");
                }
                if (jLabel11.getText().equals("x")) {
                    ventP.jLabel12.setText("x");
                    ventP.jLabel3.setText("x");
                }
                if (jLabel15.getText().equals("x")) {
                    ventP.jLabel13.setText("x");
                    ventP.jLabel4.setText("x");
                }
                if (jLabel25.getText().equals("x")) {
                    ventP.jLabel14.setText("x");
                    ventP.jLabel5.setText("x");
                }
                if (jLabel14.getText().equals("x")) {
                    ventP.jLabel15.setText("x");
                    ventP.jLabel6.setText("x");
                }
                if (jLabel26.getText().equals("x")) {
                    ventP.jLabel26.setText("x");
                    ventP.jLabel7.setText("x");
                }
                if (jLabel28.getText().equals("x")) {
                    ventP.jLabel27.setText("x");
                    ventP.jLabel8.setText("x");
                }
                if (jLabel27.getText().equals("x")) {
                    ventP.jLabel25.setText("x");
                    ventP.jLabel9.setText("x");
                }


                if (jLabel12.getText().equals("o")) {
                    ventP.jLabel10.setText("o");
                    ventP.jLabel1.setText("o");
                }
                if (jLabel13.getText().equals("o")) {
                    ventP.jLabel11.setText("o");
                    ventP.jLabel2.setText("o");
                }
                if (jLabel11.getText().equals("o")) {
                    ventP.jLabel12.setText("o");
                    ventP.jLabel3.setText("o");
                }
                if (jLabel15.getText().equals("o")) {
                    ventP.jLabel13.setText("o");
                    ventP.jLabel4.setText("o");
                }
                if (jLabel25.getText().equals("o")) {
                    ventP.jLabel14.setText("o");
                    ventP.jLabel5.setText("o");
                }
                if (jLabel14.getText().equals("o")) {
                    ventP.jLabel15.setText("o");
                    ventP.jLabel6.setText("o");
                }
                if (jLabel26.getText().equals("o")) {
                    ventP.jLabel26.setText("o");
                    ventP.jLabel7.setText("o");
                }
                if (jLabel28.getText().equals("o")) {
                    ventP.jLabel27.setText("o");
                    ventP.jLabel8.setText("o");
                }
                if (jLabel27.getText().equals("o")) {
                    ventP.jLabel25.setText("o");
                    ventP.jLabel9.setText("o");
                }
                    
                    
                    

                    ventP.setVisible(true);
                    ventP.setLocationRelativeTo(null);
                    this.setVisible(false);
                    reiniciarJuego();
                } else if (jLabel10.getText().equals("Casilla 5")) {
                    ventP.jLabel5.setText("x");
                    jLabel25.setText("x");                    
                    
                    
                if (jLabel12.getText().equals("x")) {
                    ventP.jLabel10.setText("x");
                    ventP.jLabel1.setText("x");
                }
                if (jLabel13.getText().equals("x")) {
                    ventP.jLabel11.setText("x");
                    ventP.jLabel2.setText("x");
                }
                if (jLabel11.getText().equals("x")) {
                    ventP.jLabel12.setText("x");
                    ventP.jLabel3.setText("x");
                }
                if (jLabel15.getText().equals("x")) {
                    ventP.jLabel13.setText("x");
                    ventP.jLabel4.setText("x");
                }
                if (jLabel25.getText().equals("x")) {
                    ventP.jLabel14.setText("x");
                    ventP.jLabel5.setText("x");
                }
                if (jLabel14.getText().equals("x")) {
                    ventP.jLabel15.setText("x");
                    ventP.jLabel6.setText("x");
                }
                if (jLabel26.getText().equals("x")) {
                    ventP.jLabel26.setText("x");
                    ventP.jLabel7.setText("x");
                }
                if (jLabel28.getText().equals("x")) {
                    ventP.jLabel27.setText("x");
                    ventP.jLabel8.setText("x");
                }
                if (jLabel27.getText().equals("x")) {
                    ventP.jLabel25.setText("x");
                    ventP.jLabel9.setText("x");
                }


                if (jLabel12.getText().equals("o")) {
                    ventP.jLabel10.setText("o");
                    ventP.jLabel1.setText("o");
                }
                if (jLabel13.getText().equals("o")) {
                    ventP.jLabel11.setText("o");
                    ventP.jLabel2.setText("o");
                }
                if (jLabel11.getText().equals("o")) {
                    ventP.jLabel12.setText("o");
                    ventP.jLabel3.setText("o");
                }
                if (jLabel15.getText().equals("o")) {
                    ventP.jLabel13.setText("o");
                    ventP.jLabel4.setText("o");
                }
                if (jLabel25.getText().equals("o")) {
                    ventP.jLabel14.setText("o");
                    ventP.jLabel5.setText("o");
                }
                if (jLabel14.getText().equals("o")) {
                    ventP.jLabel15.setText("o");
                    ventP.jLabel6.setText("o");
                }
                if (jLabel26.getText().equals("o")) {
                    ventP.jLabel26.setText("o");
                    ventP.jLabel7.setText("o");
                }
                if (jLabel28.getText().equals("o")) {
                    ventP.jLabel27.setText("o");
                    ventP.jLabel8.setText("o");
                }
                if (jLabel27.getText().equals("o")) {
                    ventP.jLabel25.setText("o");
                    ventP.jLabel9.setText("o");
                }
                    
                    
                    

                    ventP.setVisible(true);
                    ventP.setLocationRelativeTo(null);
                    this.setVisible(false);
                    reiniciarJuego();
                } else if (jLabel10.getText().equals("Casilla 6")) {
                    ventP.jLabel6.setText("x");
                    jLabel14.setText("x");                    
                    
                    
                if (jLabel12.getText().equals("x")) {
                    ventP.jLabel10.setText("x");
                    ventP.jLabel1.setText("x");
                }
                if (jLabel13.getText().equals("x")) {
                    ventP.jLabel11.setText("x");
                    ventP.jLabel2.setText("x");
                }
                if (jLabel11.getText().equals("x")) {
                    ventP.jLabel12.setText("x");
                    ventP.jLabel3.setText("x");
                }
                if (jLabel15.getText().equals("x")) {
                    ventP.jLabel13.setText("x");
                    ventP.jLabel4.setText("x");
                }
                if (jLabel25.getText().equals("x")) {
                    ventP.jLabel14.setText("x");
                    ventP.jLabel5.setText("x");
                }
                if (jLabel14.getText().equals("x")) {
                    ventP.jLabel15.setText("x");
                    ventP.jLabel6.setText("x");
                }
                if (jLabel26.getText().equals("x")) {
                    ventP.jLabel26.setText("x");
                    ventP.jLabel7.setText("x");
                }
                if (jLabel28.getText().equals("x")) {
                    ventP.jLabel27.setText("x");
                    ventP.jLabel8.setText("x");
                }
                if (jLabel27.getText().equals("x")) {
                    ventP.jLabel25.setText("x");
                    ventP.jLabel9.setText("x");
                }


                if (jLabel12.getText().equals("o")) {
                    ventP.jLabel10.setText("o");
                    ventP.jLabel1.setText("o");
                }
                if (jLabel13.getText().equals("o")) {
                    ventP.jLabel11.setText("o");
                    ventP.jLabel2.setText("o");
                }
                if (jLabel11.getText().equals("o")) {
                    ventP.jLabel12.setText("o");
                    ventP.jLabel3.setText("o");
                }
                if (jLabel15.getText().equals("o")) {
                    ventP.jLabel13.setText("o");
                    ventP.jLabel4.setText("o");
                }
                if (jLabel25.getText().equals("o")) {
                    ventP.jLabel14.setText("o");
                    ventP.jLabel5.setText("o");
                }
                if (jLabel14.getText().equals("o")) {
                    ventP.jLabel15.setText("o");
                    ventP.jLabel6.setText("o");
                }
                if (jLabel26.getText().equals("o")) {
                    ventP.jLabel26.setText("o");
                    ventP.jLabel7.setText("o");
                }
                if (jLabel28.getText().equals("o")) {
                    ventP.jLabel27.setText("o");
                    ventP.jLabel8.setText("o");
                }
                if (jLabel27.getText().equals("o")) {
                    ventP.jLabel25.setText("o");
                    ventP.jLabel9.setText("o");
                }
                    
                    
                    

                    ventP.setVisible(true);
                    ventP.setLocationRelativeTo(null);
                    this.setVisible(false);
                    reiniciarJuego();
                } else if (jLabel10.getText().equals("Casilla 7")) {
                    ventP.jLabel7.setText("x");
                    jLabel26.setText("x");                    
                    
                    
                if (jLabel12.getText().equals("x")) {
                    ventP.jLabel10.setText("x");
                    ventP.jLabel1.setText("x");
                }
                if (jLabel13.getText().equals("x")) {
                    ventP.jLabel11.setText("x");
                    ventP.jLabel2.setText("x");
                }
                if (jLabel11.getText().equals("x")) {
                    ventP.jLabel12.setText("x");
                    ventP.jLabel3.setText("x");
                }
                if (jLabel15.getText().equals("x")) {
                    ventP.jLabel13.setText("x");
                    ventP.jLabel4.setText("x");
                }
                if (jLabel25.getText().equals("x")) {
                    ventP.jLabel14.setText("x");
                    ventP.jLabel5.setText("x");
                }
                if (jLabel14.getText().equals("x")) {
                    ventP.jLabel15.setText("x");
                    ventP.jLabel6.setText("x");
                }
                if (jLabel26.getText().equals("x")) {
                    ventP.jLabel26.setText("x");
                    ventP.jLabel7.setText("x");
                }
                if (jLabel28.getText().equals("x")) {
                    ventP.jLabel27.setText("x");
                    ventP.jLabel8.setText("x");
                }
                if (jLabel27.getText().equals("x")) {
                    ventP.jLabel25.setText("x");
                    ventP.jLabel9.setText("x");
                }


                if (jLabel12.getText().equals("o")) {
                    ventP.jLabel10.setText("o");
                    ventP.jLabel1.setText("o");
                }
                if (jLabel13.getText().equals("o")) {
                    ventP.jLabel11.setText("o");
                    ventP.jLabel2.setText("o");
                }
                if (jLabel11.getText().equals("o")) {
                    ventP.jLabel12.setText("o");
                    ventP.jLabel3.setText("o");
                }
                if (jLabel15.getText().equals("o")) {
                    ventP.jLabel13.setText("o");
                    ventP.jLabel4.setText("o");
                }
                if (jLabel25.getText().equals("o")) {
                    ventP.jLabel14.setText("o");
                    ventP.jLabel5.setText("o");
                }
                if (jLabel14.getText().equals("o")) {
                    ventP.jLabel15.setText("o");
                    ventP.jLabel6.setText("o");
                }
                if (jLabel26.getText().equals("o")) {
                    ventP.jLabel26.setText("o");
                    ventP.jLabel7.setText("o");
                }
                if (jLabel28.getText().equals("o")) {
                    ventP.jLabel27.setText("o");
                    ventP.jLabel8.setText("o");
                }
                if (jLabel27.getText().equals("o")) {
                    ventP.jLabel25.setText("o");
                    ventP.jLabel9.setText("o");
                }
                    
                    
                    

                    ventP.setVisible(true);
                    ventP.setLocationRelativeTo(null);
                    this.setVisible(false);
                    reiniciarJuego();
                } else if (jLabel10.getText().equals("Casilla 8")) {
                    ventP.jLabel8.setText("x");
                    jLabel28.setText("x");                    
                    
                    
                if (jLabel12.getText().equals("x")) {
                    ventP.jLabel10.setText("x");
                    ventP.jLabel1.setText("x");
                }
                if (jLabel13.getText().equals("x")) {
                    ventP.jLabel11.setText("x");
                    ventP.jLabel2.setText("x");
                }
                if (jLabel11.getText().equals("x")) {
                    ventP.jLabel12.setText("x");
                    ventP.jLabel3.setText("x");
                }
                if (jLabel15.getText().equals("x")) {
                    ventP.jLabel13.setText("x");
                    ventP.jLabel4.setText("x");
                }
                if (jLabel25.getText().equals("x")) {
                    ventP.jLabel14.setText("x");
                    ventP.jLabel5.setText("x");
                }
                if (jLabel14.getText().equals("x")) {
                    ventP.jLabel15.setText("x");
                    ventP.jLabel6.setText("x");
                }
                if (jLabel26.getText().equals("x")) {
                    ventP.jLabel26.setText("x");
                    ventP.jLabel7.setText("x");
                }
                if (jLabel28.getText().equals("x")) {
                    ventP.jLabel27.setText("x");
                    ventP.jLabel8.setText("x");
                }
                if (jLabel27.getText().equals("x")) {
                    ventP.jLabel25.setText("x");
                    ventP.jLabel9.setText("x");
                }


                if (jLabel12.getText().equals("o")) {
                    ventP.jLabel10.setText("o");
                    ventP.jLabel1.setText("o");
                }
                if (jLabel13.getText().equals("o")) {
                    ventP.jLabel11.setText("o");
                    ventP.jLabel2.setText("o");
                }
                if (jLabel11.getText().equals("o")) {
                    ventP.jLabel12.setText("o");
                    ventP.jLabel3.setText("o");
                }
                if (jLabel15.getText().equals("o")) {
                    ventP.jLabel13.setText("o");
                    ventP.jLabel4.setText("o");
                }
                if (jLabel25.getText().equals("o")) {
                    ventP.jLabel14.setText("o");
                    ventP.jLabel5.setText("o");
                }
                if (jLabel14.getText().equals("o")) {
                    ventP.jLabel15.setText("o");
                    ventP.jLabel6.setText("o");
                }
                if (jLabel26.getText().equals("o")) {
                    ventP.jLabel26.setText("o");
                    ventP.jLabel7.setText("o");
                }
                if (jLabel28.getText().equals("o")) {
                    ventP.jLabel27.setText("o");
                    ventP.jLabel8.setText("o");
                }
                if (jLabel27.getText().equals("o")) {
                    ventP.jLabel25.setText("o");
                    ventP.jLabel9.setText("o");
                }
                    
                    
                    

                    ventP.setVisible(true);
                    ventP.setLocationRelativeTo(null);
                    this.setVisible(false);
                    reiniciarJuego();
                } else {
                    ventP.jLabel9.setText("x");
                    jLabel27.setText("x");                    
                    
                    
                if (jLabel12.getText().equals("x")) {
                    ventP.jLabel10.setText("x");
                    ventP.jLabel1.setText("x");
                }
                if (jLabel13.getText().equals("x")) {
                    ventP.jLabel11.setText("x");
                    ventP.jLabel2.setText("x");
                }
                if (jLabel11.getText().equals("x")) {
                    ventP.jLabel12.setText("x");
                    ventP.jLabel3.setText("x");
                }
                if (jLabel15.getText().equals("x")) {
                    ventP.jLabel13.setText("x");
                    ventP.jLabel4.setText("x");
                }
                if (jLabel25.getText().equals("x")) {
                    ventP.jLabel14.setText("x");
                    ventP.jLabel5.setText("x");
                }
                if (jLabel14.getText().equals("x")) {
                    ventP.jLabel15.setText("x");
                    ventP.jLabel6.setText("x");
                }
                if (jLabel26.getText().equals("x")) {
                    ventP.jLabel26.setText("x");
                    ventP.jLabel7.setText("x");
                }
                if (jLabel28.getText().equals("x")) {
                    ventP.jLabel27.setText("x");
                    ventP.jLabel8.setText("x");
                }
                if (jLabel27.getText().equals("x")) {
                    ventP.jLabel25.setText("x");
                    ventP.jLabel9.setText("x");
                }


                if (jLabel12.getText().equals("o")) {
                    ventP.jLabel10.setText("o");
                    ventP.jLabel1.setText("o");
                }
                if (jLabel13.getText().equals("o")) {
                    ventP.jLabel11.setText("o");
                    ventP.jLabel2.setText("o");
                }
                if (jLabel11.getText().equals("o")) {
                    ventP.jLabel12.setText("o");
                    ventP.jLabel3.setText("o");
                }
                if (jLabel15.getText().equals("o")) {
                    ventP.jLabel13.setText("o");
                    ventP.jLabel4.setText("o");
                }
                if (jLabel25.getText().equals("o")) {
                    ventP.jLabel14.setText("o");
                    ventP.jLabel5.setText("o");
                }
                if (jLabel14.getText().equals("o")) {
                    ventP.jLabel15.setText("o");
                    ventP.jLabel6.setText("o");
                }
                if (jLabel26.getText().equals("o")) {
                    ventP.jLabel26.setText("o");
                    ventP.jLabel7.setText("o");
                }
                if (jLabel28.getText().equals("o")) {
                    ventP.jLabel27.setText("o");
                    ventP.jLabel8.setText("o");
                }
                if (jLabel27.getText().equals("o")) {
                    ventP.jLabel25.setText("o");
                    ventP.jLabel9.setText("o");
                }
                    
                    
                    

                    ventP.setVisible(true);
                    ventP.setLocationRelativeTo(null);
                    this.setVisible(false);
                    reiniciarJuego();
                }

                ventP.setVisible(true);
                ventP.setLocationRelativeTo(null);
                this.setVisible(false);
                reiniciarJuego();
            } else if (lbs[victorias[i][0] - 1].getText().equals("o") && lbs[victorias[i][1] - 1].getText().equals("o") && lbs[victorias[i][2] - 1].getText().equals("o")) {
                JOptionPane.showMessageDialog(null, "JUGADOR O HA GANADO");

                if (jLabel10.getText().equals("Casilla 1")) {
                    ventP.jLabel1.setText("o");
                     jLabel12.setText("o");                    
                    
                    
                if (jLabel12.getText().equals("x")) {
                    ventP.jLabel10.setText("x");
                    ventP.jLabel1.setText("x");
                    
                }
                if (jLabel13.getText().equals("x")) {
                    ventP.jLabel11.setText("x");
                    ventP.jLabel2.setText("x");
                }
                if (jLabel11.getText().equals("x")) {
                    ventP.jLabel12.setText("x");
                    ventP.jLabel3.setText("x");
                }
                if (jLabel15.getText().equals("x")) {
                    ventP.jLabel13.setText("x");
                    ventP.jLabel4.setText("x");
                }
                if (jLabel25.getText().equals("x")) {
                    ventP.jLabel14.setText("x");
                    ventP.jLabel5.setText("x");
                }
                if (jLabel14.getText().equals("x")) {
                    ventP.jLabel15.setText("x");
                    ventP.jLabel6.setText("x");
                }
                if (jLabel26.getText().equals("x")) {
                    ventP.jLabel26.setText("x");
                    ventP.jLabel7.setText("x");
                }
                if (jLabel28.getText().equals("x")) {
                    ventP.jLabel27.setText("x");
                    ventP.jLabel8.setText("x");
                }
                if (jLabel27.getText().equals("x")) {
                    ventP.jLabel25.setText("x");
                    ventP.jLabel9.setText("x");
                }


                if (jLabel12.getText().equals("o")) {
                    ventP.jLabel10.setText("o");
                    ventP.jLabel1.setText("o");
                }
                if (jLabel13.getText().equals("o")) {
                    ventP.jLabel11.setText("o");
                    ventP.jLabel2.setText("o");
                }
                if (jLabel11.getText().equals("o")) {
                    ventP.jLabel12.setText("o");
                    ventP.jLabel3.setText("o");
                }
                if (jLabel15.getText().equals("o")) {
                    ventP.jLabel13.setText("o");
                    ventP.jLabel4.setText("o");
                }
                if (jLabel25.getText().equals("o")) {
                    ventP.jLabel14.setText("o");
                    ventP.jLabel5.setText("o");
                }
                if (jLabel14.getText().equals("o")) {
                    ventP.jLabel15.setText("o");
                    ventP.jLabel6.setText("o");
                }
                if (jLabel26.getText().equals("o")) {
                    ventP.jLabel26.setText("o");
                    ventP.jLabel7.setText("o");
                }
                if (jLabel28.getText().equals("o")) {
                    ventP.jLabel27.setText("o");
                    ventP.jLabel8.setText("o");
                }
                if (jLabel27.getText().equals("o")) {
                    ventP.jLabel25.setText("o");
                    ventP.jLabel9.setText("o");
                }
                    
                    
                    

                    ventP.setVisible(true);
                    ventP.setLocationRelativeTo(null);
                    this.setVisible(false);
                    reiniciarJuego();
                } else if (jLabel10.getText().equals("Casilla 2")) {
                    ventP.jLabel2.setText("o");
                    jLabel13.setText("o");                    
                    
                    
                if (jLabel12.getText().equals("x")) {
                    ventP.jLabel10.setText("x");
                    ventP.jLabel1.setText("x");
                    
                }
                if (jLabel13.getText().equals("x")) {
                    ventP.jLabel11.setText("x");
                    ventP.jLabel2.setText("x");
                }
                if (jLabel11.getText().equals("x")) {
                    ventP.jLabel12.setText("x");
                    ventP.jLabel3.setText("x");
                }
                if (jLabel15.getText().equals("x")) {
                    ventP.jLabel13.setText("x");
                    ventP.jLabel4.setText("x");
                }
                if (jLabel25.getText().equals("x")) {
                    ventP.jLabel14.setText("x");
                    ventP.jLabel5.setText("x");
                }
                if (jLabel14.getText().equals("x")) {
                    ventP.jLabel15.setText("x");
                    ventP.jLabel6.setText("x");
                }
                if (jLabel26.getText().equals("x")) {
                    ventP.jLabel26.setText("x");
                    ventP.jLabel7.setText("x");
                }
                if (jLabel28.getText().equals("x")) {
                    ventP.jLabel27.setText("x");
                    ventP.jLabel8.setText("x");
                }
                if (jLabel27.getText().equals("x")) {
                    ventP.jLabel25.setText("x");
                    ventP.jLabel9.setText("x");
                }


                if (jLabel12.getText().equals("o")) {
                    ventP.jLabel10.setText("o");
                    ventP.jLabel1.setText("o");
                }
                if (jLabel13.getText().equals("o")) {
                    ventP.jLabel11.setText("o");
                    ventP.jLabel2.setText("o");
                }
                if (jLabel11.getText().equals("o")) {
                    ventP.jLabel12.setText("o");
                    ventP.jLabel3.setText("o");
                }
                if (jLabel15.getText().equals("o")) {
                    ventP.jLabel13.setText("o");
                    ventP.jLabel4.setText("o");
                }
                if (jLabel25.getText().equals("o")) {
                    ventP.jLabel14.setText("o");
                    ventP.jLabel5.setText("o");
                }
                if (jLabel14.getText().equals("o")) {
                    ventP.jLabel15.setText("o");
                    ventP.jLabel6.setText("o");
                }
                if (jLabel26.getText().equals("o")) {
                    ventP.jLabel26.setText("o");
                    ventP.jLabel7.setText("o");
                }
                if (jLabel28.getText().equals("o")) {
                    ventP.jLabel27.setText("o");
                    ventP.jLabel8.setText("o");
                }
                if (jLabel27.getText().equals("o")) {
                    ventP.jLabel25.setText("o");
                    ventP.jLabel9.setText("o");
                }
                    
                    
                    


                    ventP.setVisible(true);
                    ventP.setLocationRelativeTo(null);
                    this.setVisible(false);
                    reiniciarJuego();
                } else if (jLabel10.getText().equals("Casilla 3")) {
                    ventP.jLabel3.setText("o");
                    
                    jLabel11.setText("o");                    
                    
                    
                if (jLabel12.getText().equals("x")) {
                    ventP.jLabel10.setText("x");
                    ventP.jLabel1.setText("x");
                    
                }
                if (jLabel13.getText().equals("x")) {
                    ventP.jLabel11.setText("x");
                    ventP.jLabel2.setText("x");
                }
                if (jLabel11.getText().equals("x")) {
                    ventP.jLabel12.setText("x");
                    ventP.jLabel3.setText("x");
                }
                if (jLabel15.getText().equals("x")) {
                    ventP.jLabel13.setText("x");
                    ventP.jLabel4.setText("x");
                }
                if (jLabel25.getText().equals("x")) {
                    ventP.jLabel14.setText("x");
                    ventP.jLabel5.setText("x");
                }
                if (jLabel14.getText().equals("x")) {
                    ventP.jLabel15.setText("x");
                    ventP.jLabel6.setText("x");
                }
                if (jLabel26.getText().equals("x")) {
                    ventP.jLabel26.setText("x");
                    ventP.jLabel7.setText("x");
                }
                if (jLabel28.getText().equals("x")) {
                    ventP.jLabel27.setText("x");
                    ventP.jLabel8.setText("x");
                }
                if (jLabel27.getText().equals("x")) {
                    ventP.jLabel25.setText("x");
                    ventP.jLabel9.setText("x");
                }


                if (jLabel12.getText().equals("o")) {
                    ventP.jLabel10.setText("o");
                    ventP.jLabel1.setText("o");
                }
                if (jLabel13.getText().equals("o")) {
                    ventP.jLabel11.setText("o");
                    ventP.jLabel2.setText("o");
                }
                if (jLabel11.getText().equals("o")) {
                    ventP.jLabel12.setText("o");
                    ventP.jLabel3.setText("o");
                }
                if (jLabel15.getText().equals("o")) {
                    ventP.jLabel13.setText("o");
                    ventP.jLabel4.setText("o");
                }
                if (jLabel25.getText().equals("o")) {
                    ventP.jLabel14.setText("o");
                    ventP.jLabel5.setText("o");
                }
                if (jLabel14.getText().equals("o")) {
                    ventP.jLabel15.setText("o");
                    ventP.jLabel6.setText("o");
                }
                if (jLabel26.getText().equals("o")) {
                    ventP.jLabel26.setText("o");
                    ventP.jLabel7.setText("o");
                }
                if (jLabel28.getText().equals("o")) {
                    ventP.jLabel27.setText("o");
                    ventP.jLabel8.setText("o");
                }
                if (jLabel27.getText().equals("o")) {
                    ventP.jLabel25.setText("o");
                    ventP.jLabel9.setText("o");
                }
                    
                    
                    


                    ventP.setVisible(true);
                    ventP.setLocationRelativeTo(null);
                    this.setVisible(false);
                    reiniciarJuego();
                } else if (jLabel10.getText().equals("Casilla 4")) {
                    ventP.jLabel4.setText("o");
                    jLabel15.setText("o");                    
                    
                    
                if (jLabel12.getText().equals("x")) {
                    ventP.jLabel10.setText("x");
                    ventP.jLabel1.setText("x");
                    
                }
                if (jLabel13.getText().equals("x")) {
                    ventP.jLabel11.setText("x");
                    ventP.jLabel2.setText("x");
                }
                if (jLabel11.getText().equals("x")) {
                    ventP.jLabel12.setText("x");
                    ventP.jLabel3.setText("x");
                }
                if (jLabel15.getText().equals("x")) {
                    ventP.jLabel13.setText("x");
                    ventP.jLabel4.setText("x");
                }
                if (jLabel25.getText().equals("x")) {
                    ventP.jLabel14.setText("x");
                    ventP.jLabel5.setText("x");
                }
                if (jLabel14.getText().equals("x")) {
                    ventP.jLabel15.setText("x");
                    ventP.jLabel6.setText("x");
                }
                if (jLabel26.getText().equals("x")) {
                    ventP.jLabel26.setText("x");
                    ventP.jLabel7.setText("x");
                }
                if (jLabel28.getText().equals("x")) {
                    ventP.jLabel27.setText("x");
                    ventP.jLabel8.setText("x");
                }
                if (jLabel27.getText().equals("x")) {
                    ventP.jLabel25.setText("x");
                    ventP.jLabel9.setText("x");
                }


                if (jLabel12.getText().equals("o")) {
                    ventP.jLabel10.setText("o");
                    ventP.jLabel1.setText("o");
                }
                if (jLabel13.getText().equals("o")) {
                    ventP.jLabel11.setText("o");
                    ventP.jLabel2.setText("o");
                }
                if (jLabel11.getText().equals("o")) {
                    ventP.jLabel12.setText("o");
                    ventP.jLabel3.setText("o");
                }
                if (jLabel15.getText().equals("o")) {
                    ventP.jLabel13.setText("o");
                    ventP.jLabel4.setText("o");
                }
                if (jLabel25.getText().equals("o")) {
                    ventP.jLabel14.setText("o");
                    ventP.jLabel5.setText("o");
                }
                if (jLabel14.getText().equals("o")) {
                    ventP.jLabel15.setText("o");
                    ventP.jLabel6.setText("o");
                }
                if (jLabel26.getText().equals("o")) {
                    ventP.jLabel26.setText("o");
                    ventP.jLabel7.setText("o");
                }
                if (jLabel28.getText().equals("o")) {
                    ventP.jLabel27.setText("o");
                    ventP.jLabel8.setText("o");
                }
                if (jLabel27.getText().equals("o")) {
                    ventP.jLabel25.setText("o");
                    ventP.jLabel9.setText("o");
                }
                    
                    
                    


                    ventP.setVisible(true);
                    ventP.setLocationRelativeTo(null);
                    this.setVisible(false);
                    reiniciarJuego();
                } else if (jLabel10.getText().equals("Casilla 5")) {
                    ventP.jLabel5.setText("o");
                    jLabel25.setText("o");                    
                    
                    
                if (jLabel12.getText().equals("x")) {
                    ventP.jLabel10.setText("x");
                    ventP.jLabel1.setText("x");
                    
                }
                if (jLabel13.getText().equals("x")) {
                    ventP.jLabel11.setText("x");
                    ventP.jLabel2.setText("x");
                }
                if (jLabel11.getText().equals("x")) {
                    ventP.jLabel12.setText("x");
                    ventP.jLabel3.setText("x");
                }
                if (jLabel15.getText().equals("x")) {
                    ventP.jLabel13.setText("x");
                    ventP.jLabel4.setText("x");
                }
                if (jLabel25.getText().equals("x")) {
                    ventP.jLabel14.setText("x");
                    ventP.jLabel5.setText("x");
                }
                if (jLabel14.getText().equals("x")) {
                    ventP.jLabel15.setText("x");
                    ventP.jLabel6.setText("x");
                }
                if (jLabel26.getText().equals("x")) {
                    ventP.jLabel26.setText("x");
                    ventP.jLabel7.setText("x");
                }
                if (jLabel28.getText().equals("x")) {
                    ventP.jLabel27.setText("x");
                    ventP.jLabel8.setText("x");
                }
                if (jLabel27.getText().equals("x")) {
                    ventP.jLabel25.setText("x");
                    ventP.jLabel9.setText("x");
                }


                if (jLabel12.getText().equals("o")) {
                    ventP.jLabel10.setText("o");
                    ventP.jLabel1.setText("o");
                }
                if (jLabel13.getText().equals("o")) {
                    ventP.jLabel11.setText("o");
                    ventP.jLabel2.setText("o");
                }
                if (jLabel11.getText().equals("o")) {
                    ventP.jLabel12.setText("o");
                    ventP.jLabel3.setText("o");
                }
                if (jLabel15.getText().equals("o")) {
                    ventP.jLabel13.setText("o");
                    ventP.jLabel4.setText("o");
                }
                if (jLabel25.getText().equals("o")) {
                    ventP.jLabel14.setText("o");
                    ventP.jLabel5.setText("o");
                }
                if (jLabel14.getText().equals("o")) {
                    ventP.jLabel15.setText("o");
                    ventP.jLabel6.setText("o");
                }
                if (jLabel26.getText().equals("o")) {
                    ventP.jLabel26.setText("o");
                    ventP.jLabel7.setText("o");
                }
                if (jLabel28.getText().equals("o")) {
                    ventP.jLabel27.setText("o");
                    ventP.jLabel8.setText("o");
                }
                if (jLabel27.getText().equals("o")) {
                    ventP.jLabel25.setText("o");
                    ventP.jLabel9.setText("o");
                }
                    
                    
                    


                    ventP.setVisible(true);
                    ventP.setLocationRelativeTo(null);
                    this.setVisible(false);
                    reiniciarJuego();
                } else if (jLabel10.getText().equals("Casilla 6")) {
                    ventP.jLabel6.setText("o");
                    jLabel14.setText("o");                    
                    
                    
                if (jLabel12.getText().equals("x")) {
                    ventP.jLabel10.setText("x");
                    ventP.jLabel1.setText("x");
                    
                }
                if (jLabel13.getText().equals("x")) {
                    ventP.jLabel11.setText("x");
                    ventP.jLabel2.setText("x");
                }
                if (jLabel11.getText().equals("x")) {
                    ventP.jLabel12.setText("x");
                    ventP.jLabel3.setText("x");
                }
                if (jLabel15.getText().equals("x")) {
                    ventP.jLabel13.setText("x");
                    ventP.jLabel4.setText("x");
                }
                if (jLabel25.getText().equals("x")) {
                    ventP.jLabel14.setText("x");
                    ventP.jLabel5.setText("x");
                }
                if (jLabel14.getText().equals("x")) {
                    ventP.jLabel15.setText("x");
                    ventP.jLabel6.setText("x");
                }
                if (jLabel26.getText().equals("x")) {
                    ventP.jLabel26.setText("x");
                    ventP.jLabel7.setText("x");
                }
                if (jLabel28.getText().equals("x")) {
                    ventP.jLabel27.setText("x");
                    ventP.jLabel8.setText("x");
                }
                if (jLabel27.getText().equals("x")) {
                    ventP.jLabel25.setText("x");
                    ventP.jLabel9.setText("x");
                }


                if (jLabel12.getText().equals("o")) {
                    ventP.jLabel10.setText("o");
                    ventP.jLabel1.setText("o");
                }
                if (jLabel13.getText().equals("o")) {
                    ventP.jLabel11.setText("o");
                    ventP.jLabel2.setText("o");
                }
                if (jLabel11.getText().equals("o")) {
                    ventP.jLabel12.setText("o");
                    ventP.jLabel3.setText("o");
                }
                if (jLabel15.getText().equals("o")) {
                    ventP.jLabel13.setText("o");
                    ventP.jLabel4.setText("o");
                }
                if (jLabel25.getText().equals("o")) {
                    ventP.jLabel14.setText("o");
                    ventP.jLabel5.setText("o");
                }
                if (jLabel14.getText().equals("o")) {
                    ventP.jLabel15.setText("o");
                    ventP.jLabel6.setText("o");
                }
                if (jLabel26.getText().equals("o")) {
                    ventP.jLabel26.setText("o");
                    ventP.jLabel7.setText("o");
                }
                if (jLabel28.getText().equals("o")) {
                    ventP.jLabel27.setText("o");
                    ventP.jLabel8.setText("o");
                }
                if (jLabel27.getText().equals("o")) {
                    ventP.jLabel25.setText("o");
                    ventP.jLabel9.setText("o");
                }
                    
                    


                    ventP.setVisible(true);
                    ventP.setLocationRelativeTo(null);
                    this.setVisible(false);
                    reiniciarJuego();
                } else if (jLabel10.getText().equals("Casilla 7")) {
                    ventP.jLabel7.setText("o");
                    jLabel26.setText("o");                    
                    
                    
                if (jLabel12.getText().equals("x")) {
                    ventP.jLabel10.setText("x");
                    ventP.jLabel1.setText("x");
                    
                }
                if (jLabel13.getText().equals("x")) {
                    ventP.jLabel11.setText("x");
                    ventP.jLabel2.setText("x");
                }
                if (jLabel11.getText().equals("x")) {
                    ventP.jLabel12.setText("x");
                    ventP.jLabel3.setText("x");
                }
                if (jLabel15.getText().equals("x")) {
                    ventP.jLabel13.setText("x");
                    ventP.jLabel4.setText("x");
                }
                if (jLabel25.getText().equals("x")) {
                    ventP.jLabel14.setText("x");
                    ventP.jLabel5.setText("x");
                }
                if (jLabel14.getText().equals("x")) {
                    ventP.jLabel15.setText("x");
                    ventP.jLabel6.setText("x");
                }
                if (jLabel26.getText().equals("x")) {
                    ventP.jLabel26.setText("x");
                    ventP.jLabel7.setText("x");
                }
                if (jLabel28.getText().equals("x")) {
                    ventP.jLabel27.setText("x");
                    ventP.jLabel8.setText("x");
                }
                if (jLabel27.getText().equals("x")) {
                    ventP.jLabel25.setText("x");
                    ventP.jLabel9.setText("x");
                }


                if (jLabel12.getText().equals("o")) {
                    ventP.jLabel10.setText("o");
                    ventP.jLabel1.setText("o");
                }
                if (jLabel13.getText().equals("o")) {
                    ventP.jLabel11.setText("o");
                    ventP.jLabel2.setText("o");
                }
                if (jLabel11.getText().equals("o")) {
                    ventP.jLabel12.setText("o");
                    ventP.jLabel3.setText("o");
                }
                if (jLabel15.getText().equals("o")) {
                    ventP.jLabel13.setText("o");
                    ventP.jLabel4.setText("o");
                }
                if (jLabel25.getText().equals("o")) {
                    ventP.jLabel14.setText("o");
                    ventP.jLabel5.setText("o");
                }
                if (jLabel14.getText().equals("o")) {
                    ventP.jLabel15.setText("o");
                    ventP.jLabel6.setText("o");
                }
                if (jLabel26.getText().equals("o")) {
                    ventP.jLabel26.setText("o");
                    ventP.jLabel7.setText("o");
                }
                if (jLabel28.getText().equals("o")) {
                    ventP.jLabel27.setText("o");
                    ventP.jLabel8.setText("o");
                }
                if (jLabel27.getText().equals("o")) {
                    ventP.jLabel25.setText("o");
                    ventP.jLabel9.setText("o");
                }
                    
                    
                    


                    ventP.setVisible(true);
                    ventP.setLocationRelativeTo(null);
                    this.setVisible(false);
                    reiniciarJuego();
                } else if (jLabel10.getText().equals("Casilla 8")) {
                    ventP.jLabel8.setText("o");
                    jLabel28.setText("o");                    
                    
                    
                if (jLabel12.getText().equals("x")) {
                    ventP.jLabel10.setText("x");
                    ventP.jLabel1.setText("x");
                    
                }
                if (jLabel13.getText().equals("x")) {
                    ventP.jLabel11.setText("x");
                    ventP.jLabel2.setText("x");
                }
                if (jLabel11.getText().equals("x")) {
                    ventP.jLabel12.setText("x");
                    ventP.jLabel3.setText("x");
                }
                if (jLabel15.getText().equals("x")) {
                    ventP.jLabel13.setText("x");
                    ventP.jLabel4.setText("x");
                }
                if (jLabel25.getText().equals("x")) {
                    ventP.jLabel14.setText("x");
                    ventP.jLabel5.setText("x");
                }
                if (jLabel14.getText().equals("x")) {
                    ventP.jLabel15.setText("x");
                    ventP.jLabel6.setText("x");
                }
                if (jLabel26.getText().equals("x")) {
                    ventP.jLabel26.setText("x");
                    ventP.jLabel7.setText("x");
                }
                if (jLabel28.getText().equals("x")) {
                    ventP.jLabel27.setText("x");
                    ventP.jLabel8.setText("x");
                }
                if (jLabel27.getText().equals("x")) {
                    ventP.jLabel25.setText("x");
                    ventP.jLabel9.setText("x");
                }


                if (jLabel12.getText().equals("o")) {
                    ventP.jLabel10.setText("o");
                    ventP.jLabel1.setText("o");
                }
                if (jLabel13.getText().equals("o")) {
                    ventP.jLabel11.setText("o");
                    ventP.jLabel2.setText("o");
                }
                if (jLabel11.getText().equals("o")) {
                    ventP.jLabel12.setText("o");
                    ventP.jLabel3.setText("o");
                }
                if (jLabel15.getText().equals("o")) {
                    ventP.jLabel13.setText("o");
                    ventP.jLabel4.setText("o");
                }
                if (jLabel25.getText().equals("o")) {
                    ventP.jLabel14.setText("o");
                    ventP.jLabel5.setText("o");
                }
                if (jLabel14.getText().equals("o")) {
                    ventP.jLabel15.setText("o");
                    ventP.jLabel6.setText("o");
                }
                if (jLabel26.getText().equals("o")) {
                    ventP.jLabel26.setText("o");
                    ventP.jLabel7.setText("o");
                }
                if (jLabel28.getText().equals("o")) {
                    ventP.jLabel27.setText("o");
                    ventP.jLabel8.setText("o");
                }
                if (jLabel27.getText().equals("o")) {
                    ventP.jLabel25.setText("o");
                    ventP.jLabel9.setText("o");
                }
                    
                    
                    


                    ventP.setVisible(true);
                    ventP.setLocationRelativeTo(null);
                    this.setVisible(false);
                    reiniciarJuego();
                } else {
                    ventP.jLabel9.setText("o");
                    jLabel27.setText("o");                    
                    
                    
                if (jLabel12.getText().equals("x")) {
                    ventP.jLabel10.setText("x");
                    ventP.jLabel1.setText("x");
                    
                }
                if (jLabel13.getText().equals("x")) {
                    ventP.jLabel11.setText("x");
                    ventP.jLabel2.setText("x");
                }
                if (jLabel11.getText().equals("x")) {
                    ventP.jLabel12.setText("x");
                    ventP.jLabel3.setText("x");
                }
                if (jLabel15.getText().equals("x")) {
                    ventP.jLabel13.setText("x");
                    ventP.jLabel4.setText("x");
                }
                if (jLabel25.getText().equals("x")) {
                    ventP.jLabel14.setText("x");
                    ventP.jLabel5.setText("x");
                }
                if (jLabel14.getText().equals("x")) {
                    ventP.jLabel15.setText("x");
                    ventP.jLabel6.setText("x");
                }
                if (jLabel26.getText().equals("x")) {
                    ventP.jLabel26.setText("x");
                    ventP.jLabel7.setText("x");
                }
                if (jLabel28.getText().equals("x")) {
                    ventP.jLabel27.setText("x");
                    ventP.jLabel8.setText("x");
                }
                if (jLabel27.getText().equals("x")) {
                    ventP.jLabel25.setText("x");
                    ventP.jLabel9.setText("x");
                }


                if (jLabel12.getText().equals("o")) {
                    ventP.jLabel10.setText("o");
                    ventP.jLabel1.setText("o");
                }
                if (jLabel13.getText().equals("o")) {
                    ventP.jLabel11.setText("o");
                    ventP.jLabel2.setText("o");
                }
                if (jLabel11.getText().equals("o")) {
                    ventP.jLabel12.setText("o");
                    ventP.jLabel3.setText("o");
                }
                if (jLabel15.getText().equals("o")) {
                    ventP.jLabel13.setText("o");
                    ventP.jLabel4.setText("o");
                }
                if (jLabel25.getText().equals("o")) {
                    ventP.jLabel14.setText("o");
                    ventP.jLabel5.setText("o");
                }
                if (jLabel14.getText().equals("o")) {
                    ventP.jLabel15.setText("o");
                    ventP.jLabel6.setText("o");
                }
                if (jLabel26.getText().equals("o")) {
                    ventP.jLabel26.setText("o");
                    ventP.jLabel7.setText("o");
                }
                if (jLabel28.getText().equals("o")) {
                    ventP.jLabel27.setText("o");
                    ventP.jLabel8.setText("o");
                }
                if (jLabel27.getText().equals("o")) {
                    ventP.jLabel25.setText("o");
                    ventP.jLabel9.setText("o");
                }
                    


                    ventP.setVisible(true);
                    ventP.setLocationRelativeTo(null);
                    this.setVisible(false);
                    reiniciarJuego();
                }

            }
        }
    }

    public void reiniciarJuego() {
        for (int i = 0; i < lbs.length; i++) {
            lbs[i].setText("");
            lbs[i].setBackground(Color.white);
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventanaUno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaUno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaUno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaUno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaUno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel25;
    public javax.swing.JLabel jLabel26;
    public javax.swing.JLabel jLabel27;
    public javax.swing.JLabel jLabel28;
    public javax.swing.JLabel jLabel29;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel30;
    public javax.swing.JLabel jLabel31;
    public javax.swing.JLabel jLabel32;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables


}

