/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainframe;

/**
 *
 * @author impdsede
 */
public class OperadoresSwing extends javax.swing.JFrame {

    /**
     * Creates new form OperadoresSwing
     */
    public OperadoresSwing() {//Constructor
        initComponents();
        calcPanel.setVisible(false);
        restPanel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        n2 = new javax.swing.JTextField();
        btnSoma = new javax.swing.JButton();
        btnMult = new javax.swing.JButton();
        btnDivi = new javax.swing.JButton();
        btnSubt = new javax.swing.JButton();
        n1 = new javax.swing.JTextField();
        btnSqrt = new javax.swing.JButton();
        btnPow = new javax.swing.JButton();
        btnCbrt = new javax.swing.JButton();
        btnNPI = new javax.swing.JButton();
        btnAbs = new javax.swing.JButton();
        btnFloor = new javax.swing.JButton();
        btnCeil = new javax.swing.JButton();
        btnRound = new javax.swing.JButton();
        calcPanel = new javax.swing.JPanel();
        resuLbl = new javax.swing.JLabel();
        btnZera = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        restPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        restLbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Calculadora para opera????es simples. Digite n1 e n2 e depois, clique no operador");

        jLabel2.setText("n1");
        jLabel2.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel2.setMinimumSize(new java.awt.Dimension(30, 30));
        jLabel2.setPreferredSize(new java.awt.Dimension(30, 30));

        jLabel3.setText("n2");
        jLabel3.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel3.setMinimumSize(new java.awt.Dimension(30, 30));
        jLabel3.setPreferredSize(new java.awt.Dimension(30, 30));

        btnSoma.setText("+");
        btnSoma.setMaximumSize(new java.awt.Dimension(70, 30));
        btnSoma.setMinimumSize(new java.awt.Dimension(70, 30));
        btnSoma.setPreferredSize(new java.awt.Dimension(70, 30));
        btnSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomaActionPerformed(evt);
            }
        });

        btnMult.setText("x");
        btnMult.setMaximumSize(new java.awt.Dimension(70, 30));
        btnMult.setMinimumSize(new java.awt.Dimension(70, 30));
        btnMult.setPreferredSize(new java.awt.Dimension(70, 30));
        btnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultActionPerformed(evt);
            }
        });

        btnDivi.setText("/");
        btnDivi.setMaximumSize(new java.awt.Dimension(70, 30));
        btnDivi.setMinimumSize(new java.awt.Dimension(70, 30));
        btnDivi.setPreferredSize(new java.awt.Dimension(70, 30));
        btnDivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiviActionPerformed(evt);
            }
        });

        btnSubt.setText("-");
        btnSubt.setMaximumSize(new java.awt.Dimension(70, 30));
        btnSubt.setMinimumSize(new java.awt.Dimension(70, 30));
        btnSubt.setPreferredSize(new java.awt.Dimension(70, 30));
        btnSubt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtActionPerformed(evt);
            }
        });

        n1.setPreferredSize(new java.awt.Dimension(6, 30));

        btnSqrt.setText("sqrt()");
        btnSqrt.setMaximumSize(new java.awt.Dimension(70, 30));
        btnSqrt.setMinimumSize(new java.awt.Dimension(70, 30));
        btnSqrt.setPreferredSize(new java.awt.Dimension(70, 30));
        btnSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSqrtActionPerformed(evt);
            }
        });

        btnPow.setText("^");
        btnPow.setMaximumSize(new java.awt.Dimension(70, 30));
        btnPow.setMinimumSize(new java.awt.Dimension(70, 30));
        btnPow.setPreferredSize(new java.awt.Dimension(70, 30));
        btnPow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPowActionPerformed(evt);
            }
        });

        btnCbrt.setText("cbrt()");
        btnCbrt.setMaximumSize(new java.awt.Dimension(70, 30));
        btnCbrt.setMinimumSize(new java.awt.Dimension(70, 30));
        btnCbrt.setPreferredSize(new java.awt.Dimension(70, 30));
        btnCbrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCbrtActionPerformed(evt);
            }
        });

        btnNPI.setText("n1 = PI");
        btnNPI.setPreferredSize(new java.awt.Dimension(70, 30));
        btnNPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNPIActionPerformed(evt);
            }
        });

        btnAbs.setText("abs()");
        btnAbs.setMaximumSize(new java.awt.Dimension(70, 30));
        btnAbs.setMinimumSize(new java.awt.Dimension(70, 30));
        btnAbs.setPreferredSize(new java.awt.Dimension(70, 30));
        btnAbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbsActionPerformed(evt);
            }
        });

        btnFloor.setText("floor()");
        btnFloor.setMaximumSize(new java.awt.Dimension(70, 30));
        btnFloor.setMinimumSize(new java.awt.Dimension(70, 30));
        btnFloor.setPreferredSize(new java.awt.Dimension(70, 30));
        btnFloor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFloorActionPerformed(evt);
            }
        });

        btnCeil.setText("ceil()");
        btnCeil.setPreferredSize(new java.awt.Dimension(70, 30));
        btnCeil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeilActionPerformed(evt);
            }
        });

        btnRound.setText("round()");
        btnRound.setMaximumSize(new java.awt.Dimension(70, 30));
        btnRound.setMinimumSize(new java.awt.Dimension(70, 30));
        btnRound.setPreferredSize(new java.awt.Dimension(70, 30));
        btnRound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoundActionPerformed(evt);
            }
        });

        resuLbl.setText("-/-");
        resuLbl.setMaximumSize(new java.awt.Dimension(150, 30));
        resuLbl.setMinimumSize(new java.awt.Dimension(150, 30));
        resuLbl.setPreferredSize(new java.awt.Dimension(150, 30));

        btnZera.setText("Zerar");
        btnZera.setMaximumSize(new java.awt.Dimension(145, 30));
        btnZera.setMinimumSize(new java.awt.Dimension(145, 30));
        btnZera.setPreferredSize(new java.awt.Dimension(145, 30));
        btnZera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeraActionPerformed(evt);
            }
        });

        jLabel4.setText("Resultado:");
        jLabel4.setMaximumSize(new java.awt.Dimension(144, 30));
        jLabel4.setMinimumSize(new java.awt.Dimension(144, 30));
        jLabel4.setPreferredSize(new java.awt.Dimension(144, 30));

        jLabel6.setText("Resto:");
        jLabel6.setMaximumSize(new java.awt.Dimension(144, 30));
        jLabel6.setMinimumSize(new java.awt.Dimension(144, 30));
        jLabel6.setPreferredSize(new java.awt.Dimension(144, 30));

        restLbl.setText("-/-");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel7.setText("*A divis??o ser?? exata, por??m, o resto ser?? apresentado sendo de uma divis??o de valor inteiro");
        jLabel7.setMaximumSize(new java.awt.Dimension(451, 30));
        jLabel7.setMinimumSize(new java.awt.Dimension(451, 30));
        jLabel7.setPreferredSize(new java.awt.Dimension(451, 30));

        javax.swing.GroupLayout restPanelLayout = new javax.swing.GroupLayout(restPanel);
        restPanel.setLayout(restPanelLayout);
        restPanelLayout.setHorizontalGroup(
            restPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restPanelLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(restLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        restPanelLayout.setVerticalGroup(
            restPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restPanelLayout.createSequentialGroup()
                .addGroup(restPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setText("* Em sqrt, cbrt, abs, floor, ceil ou round, ser?? considerado apenas o valor de n1");
        jLabel5.setMaximumSize(new java.awt.Dimension(454, 30));
        jLabel5.setMinimumSize(new java.awt.Dimension(454, 30));
        jLabel5.setPreferredSize(new java.awt.Dimension(454, 30));

        javax.swing.GroupLayout calcPanelLayout = new javax.swing.GroupLayout(calcPanel);
        calcPanel.setLayout(calcPanelLayout);
        calcPanelLayout.setHorizontalGroup(
            calcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calcPanelLayout.createSequentialGroup()
                .addGroup(calcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(restPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(calcPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resuLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnZera, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(4, 4, 4))
        );
        calcPanelLayout.setVerticalGroup(
            calcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calcPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(calcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resuLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnZera, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(restPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDivi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCbrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFloor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCeil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(n2)
                            .addComponent(n1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(calcPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSubt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNPI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAbs, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRound, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(n1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSubt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNPI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAbs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRound, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnMult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDivi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCbrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnFloor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCeil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calcPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomaActionPerformed
        // TODO add your handling code here:
        float vN1 = Float.parseFloat(n1.getText());
        float vN2 = Float.parseFloat(n2.getText());
        
        float resu = vN1 + vN2;
        
        resuLbl.setText(Float.toString(resu));
        calcPanel.setVisible(true);
        restPanel.setVisible(false);
    }//GEN-LAST:event_btnSomaActionPerformed

    private void btnSubtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtActionPerformed
        // TODO add your handling code here:
        float vN1 = Float.parseFloat(n1.getText());
        float vN2 = Float.parseFloat(n2.getText());
        
        float resu = vN1 - vN2;
        
        resuLbl.setText(Float.toString(resu));
        calcPanel.setVisible(true);
        restPanel.setVisible(false);
    }//GEN-LAST:event_btnSubtActionPerformed

    private void btnDiviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiviActionPerformed
        // TODO add your handling code here:
        float vN1 = Float.parseFloat(n1.getText());
        float vN2 = Float.parseFloat(n2.getText());
        
        float resu = vN1 / vN2;
        float rest = vN1 % vN2;
        
        resuLbl.setText(String.format("%.4f", resu));
        restLbl.setText(String.format("%.4f", rest));
        calcPanel.setVisible(true);
        restPanel.setVisible(true);
    }//GEN-LAST:event_btnDiviActionPerformed

    private void btnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultActionPerformed
        // TODO add your handling code here:
        float vN1 = Float.parseFloat(n1.getText());
        float vN2 = Float.parseFloat(n2.getText());
        
        float resu = vN1 * vN2;
        
        resuLbl.setText(String.format("%.4f", resu));
        calcPanel.setVisible(true);
        restPanel.setVisible(false);
    }//GEN-LAST:event_btnMultActionPerformed

    private void btnNPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNPIActionPerformed
        // TODO add your handling code here:
        n1.setText("3.1415");
        restPanel.setVisible(false);
    }//GEN-LAST:event_btnNPIActionPerformed

    private void btnPowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPowActionPerformed
        // TODO add your handling code here:
        float vN1 = Float.parseFloat(n1.getText());
        float vN2 = Float.parseFloat(n2.getText());
        
        float resu = Float.parseFloat(Double.toString(Math.pow(vN1, vN2)));
        
        resuLbl.setText(String.format("%.4f", resu));
        calcPanel.setVisible(true);
        restPanel.setVisible(false);
    }//GEN-LAST:event_btnPowActionPerformed

    private void btnSqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSqrtActionPerformed
        // TODO add your handling code here:
        float vN1 = Float.parseFloat(n1.getText());
        
        float resu = Float.parseFloat(Double.toString(Math.sqrt(vN1)));
        
        resuLbl.setText(String.format("%.4f", resu));
        calcPanel.setVisible(true);
        restPanel.setVisible(false);
    }//GEN-LAST:event_btnSqrtActionPerformed

    private void btnCbrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCbrtActionPerformed
        // TODO add your handling code here:
        float vN1 = Float.parseFloat(n1.getText());
        
        float resu = Float.parseFloat(Double.toString(Math.cbrt(vN1)));
        
        resuLbl.setText(String.format("%.4f", resu));
        calcPanel.setVisible(true);
        restPanel.setVisible(false);
    }//GEN-LAST:event_btnCbrtActionPerformed

    private void btnZeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeraActionPerformed
        // TODO add your handling code here:
        n1.setText("");
        n2.setText("");
        resuLbl.setText("-/-");
        calcPanel.setVisible(true);
        restPanel.setVisible(false);
    }//GEN-LAST:event_btnZeraActionPerformed

    private void btnAbsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbsActionPerformed
        // TODO add your handling code here:
        float vN1 = Float.parseFloat(n1.getText());
        
        float resu = Math.abs(vN1);
        
        resuLbl.setText(Float.toString(resu));
        calcPanel.setVisible(true);
        restPanel.setVisible(false);
    }//GEN-LAST:event_btnAbsActionPerformed

    private void btnFloorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFloorActionPerformed
        // TODO add your handling code here:
        float vN1 = Float.parseFloat(n1.getText());
        
        String resu = Double.toString(Math.floor(vN1));
        
        resuLbl.setText(resu);
        calcPanel.setVisible(true);
        restPanel.setVisible(false);
    }//GEN-LAST:event_btnFloorActionPerformed

    private void btnCeilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeilActionPerformed
        // TODO add your handling code here:
        float vN1 = Float.parseFloat(n1.getText());
        
        String resu = Double.toString(Math.ceil(vN1));
        
        resuLbl.setText(resu);
        calcPanel.setVisible(true);
        restPanel.setVisible(false);
    }//GEN-LAST:event_btnCeilActionPerformed

    private void btnRoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoundActionPerformed
        // TODO add your handling code here:
        float vN1 = Float.parseFloat(n1.getText());
        
        int resu = Math.round(vN1);
        
        resuLbl.setText(Integer.toString(resu));
        calcPanel.setVisible(true);
        restPanel.setVisible(false);
    }//GEN-LAST:event_btnRoundActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(OperadoresSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperadoresSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperadoresSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperadoresSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperadoresSwing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbs;
    private javax.swing.JButton btnCbrt;
    private javax.swing.JButton btnCeil;
    private javax.swing.JButton btnDivi;
    private javax.swing.JButton btnFloor;
    private javax.swing.JButton btnMult;
    private javax.swing.JButton btnNPI;
    private javax.swing.JButton btnPow;
    private javax.swing.JButton btnRound;
    private javax.swing.JButton btnSoma;
    private javax.swing.JButton btnSqrt;
    private javax.swing.JButton btnSubt;
    private javax.swing.JButton btnZera;
    private javax.swing.JPanel calcPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField n2;
    private javax.swing.JLabel restLbl;
    private javax.swing.JPanel restPanel;
    private javax.swing.JLabel resuLbl;
    // End of variables declaration//GEN-END:variables
}
