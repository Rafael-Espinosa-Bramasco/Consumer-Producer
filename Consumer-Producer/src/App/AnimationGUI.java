/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package App;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author andre
 */
public class AnimationGUI extends javax.swing.JFrame {

    /**
     * Creates new form PruebaAnimacion
     */
    public AnimationGUI() {
        initComponents();
        ElementsInit();
    }
    
    private void ElementsInit(){
        WaitProducer();
        WaitConsumer();
        
        Icon contenedor = new ImageIcon(new ImageIcon(getClass().getResource("/images/contenedor.png")).getImage()
        .getScaledInstance(contenedor_label.getWidth(), contenedor_label.getHeight(), 0));
        
        contenedor_label.setIcon(contenedor);
        
        producto1.setVisible(false);
        producto2.setVisible(false);
        producto3.setVisible(false);
        producto4.setVisible(false);
        producto5.setVisible(false);
        producto6.setVisible(false);
        producto7.setVisible(false);
        producto8.setVisible(false);
        producto9.setVisible(false);
        producto10.setVisible(false);
        producto11.setVisible(false);
        producto12.setVisible(false);
        producto13.setVisible(false);
        producto14.setVisible(false);
        producto15.setVisible(false);
        producto16.setVisible(false);
        producto17.setVisible(false);
        producto18.setVisible(false);
        producto19.setVisible(false);
        producto20.setVisible(false);
        producto21.setVisible(false);
        producto22.setVisible(false);
        producto23.setVisible(false);
        producto24.setVisible(false);
        producto25.setVisible(false);
        producto26.setVisible(false);
        producto27.setVisible(false);
        producto28.setVisible(false);
        producto29.setVisible(false);
        producto30.setVisible(false);
        producto31.setVisible(false);
        producto32.setVisible(false);
        producto33.setVisible(false);
        producto34.setVisible(false);
        producto35.setVisible(false);
        
        
        
        
    }
    
    //////////////////////////VARIABLES//////////////////////////////
    int consumer_index = 0;
    int producer_index = 0;
    
    ////////////////////ACCIONES DE CONSUMIDOR///////////////////////
    
    public void SleepConsumer(){
        Icon consumidor = new ImageIcon(new ImageIcon(getClass().getResource("/images/consumidor_dormir.png")).getImage()
        .getScaledInstance(consumidor_label.getWidth(), consumidor_label.getHeight(), 0));
        
        consumidor_label.setIcon(consumidor);
        for(int i = 0; i<10;i++)
        {
            consumidor_label.setLocation(consumidor_label.getLocation().x+1, consumidor_label.getLocation().y+1);
            try {
                Thread.sleep(250);
            }catch (Exception ex) {
                Logger.getLogger(ConsumerThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for(int i = 0; i<10;i++)
        {
            consumidor_label.setLocation(consumidor_label.getLocation().x-1, consumidor_label.getLocation().y-1);
            try {
                Thread.sleep(250);
            }catch (Exception ex) {
                Logger.getLogger(ConsumerThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void WakeConsumer(int elements){
        Icon consumidor = new ImageIcon(new ImageIcon(getClass().getResource("/images/consumidor_comer.png")).getImage()
        .getScaledInstance(consumidor_label.getWidth(), consumidor_label.getHeight(), 0));
        
        consumidor_label.setIcon(consumidor);
        
        for(int i = 0; i<elements;i++)
        {
            consumer_index++;
            switch(consumer_index)
            {
                case 1:
                {
                    producto1.setVisible(false);
                    break;
                }
                case 2:
                {
                    producto2.setVisible(false);
                    break;
                }
                case 3:
                {
                    producto3.setVisible(false);
                    break;
                }
                case 4:
                {
                    producto4.setVisible(false);
                    break;
                }
                case 5:
                {
                    producto5.setVisible(false);
                    break;
                }
                case 6:
                {
                    producto6.setVisible(false);
                    break;
                }
                case 7:
                {
                    producto7.setVisible(false);
                    break;
                }
                case 8:
                {
                    producto8.setVisible(false);
                    break;
                }
                case 9:
                {
                    producto9.setVisible(false);
                    break;
                }
                case 10:
                {
                    producto10.setVisible(false);
                    break;
                }case 11:
                {
                    producto11.setVisible(false);
                    break;
                }case 12:
                {
                    producto12.setVisible(false);
                    break;
                }
                case 13:
                {
                    producto13.setVisible(false);
                    break;
                }
                case 14:
                {
                    producto14.setVisible(false);
                    break;
                }
                case 15:
                {
                    producto15.setVisible(false);
                    break;
                }
                case 16:
                {
                    producto16.setVisible(false);
                    break;
                }
                case 17:
                {
                    producto17.setVisible(false);
                    break;
                }case 18:
                {
                    producto18.setVisible(false);
                    break;
                }case 19:
                {
                    producto19.setVisible(false);
                    break;
                }
                case 20:
                {
                    producto20.setVisible(false);
                    break;
                }
                case 21:
                {
                    producto21.setVisible(false);
                    break;
                }
                case 22:
                {
                    producto22.setVisible(false);
                    break;
                }
                case 23:
                {
                    producto23.setVisible(false);
                    break;
                }
                case 24:
                {
                    producto24.setVisible(false);
                    break;
                }
                case 25:
                {
                    producto25.setVisible(false);
                    break;
                }
                case 26:
                {
                    producto26.setVisible(false);
                    break;
                }case 27:
                {
                    producto27.setVisible(false);
                    break;
                }case 28:
                {
                    producto28.setVisible(false);
                    break;
                }
                case 29:
                {
                    producto29.setVisible(false);
                    break;
                }
                case 30:
                {
                    producto30.setVisible(false);
                    break;
                }
                case 31:
                {
                    producto31.setVisible(false);
                    break;
                }
                case 32:
                {
                    producto32.setVisible(false);
                    break;
                }
                case 33:
                {
                    producto33.setVisible(false);
                    break;
                }
                case 34:
                {
                    producto34.setVisible(false);
                    break;
                }
                case 35:
                {
                    producto35.setVisible(false);
                    consumer_index = 0;
                    break;
                }
                
            }
            try {
                Thread.sleep(250);
            } catch (InterruptedException ex) {
                Logger.getLogger(ConsumerThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void WaitConsumer(){
        Icon consumidor = new ImageIcon(new ImageIcon(getClass().getResource("/images/consumidor_esperar.png")).getImage()
        .getScaledInstance(consumidor_label.getWidth(), consumidor_label.getHeight(), 0));
        
        consumidor_label.setIcon(consumidor);
    }
    
    ///////////////////////ACCIONES DEL PRODUCTOR//////////////////////////////
    public void SleepProducer(){
        Icon productor = new ImageIcon(new ImageIcon(getClass().getResource("/images/productor_esperar.png")).getImage()
        .getScaledInstance(productor_label.getWidth(), productor_label.getHeight(), 0));
        
        productor_label.setIcon(productor);
        for(int i = 0; i<10;i++)
        {
            productor_label.setLocation(productor_label.getLocation().x+1, productor_label.getLocation().y+1);
            try {
                Thread.sleep(250);
            }catch (Exception ex) {
                Logger.getLogger(ConsumerThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for(int i = 0; i<10;i++)
        {
            productor_label.setLocation(productor_label.getLocation().x-1, productor_label.getLocation().y-1);
            try {
                Thread.sleep(250);
            }catch (Exception ex) {
                Logger.getLogger(ConsumerThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void WakeProducer(int elements){
        Icon productor = new ImageIcon(new ImageIcon(getClass().getResource("/images/productor.png")).getImage()
        .getScaledInstance(productor_label.getWidth(), productor_label.getHeight(), 0));
        
        productor_label.setIcon(productor);
        
        for(int i = 0; i<elements;i++)
        {
            producer_index++;
            switch(producer_index)
            {
                case 1:
                {
                    producto1.setVisible(true);
                    break;
                }
                case 2:
                {
                    producto2.setVisible(true);
                    break;
                }
                case 3:
                {
                    producto3.setVisible(true);
                    break;
                }
                case 4:
                {
                    producto4.setVisible(true);
                    break;
                }
                case 5:
                {
                    producto5.setVisible(true);
                    break;
                }
                case 6:
                {
                    producto6.setVisible(true);
                    break;
                }
                case 7:
                {
                    producto7.setVisible(true);
                    break;
                }
                case 8:
                {
                    producto8.setVisible(true);
                    break;
                }
                case 9:
                {
                    producto9.setVisible(true);
                    break;
                }
                case 10:
                {
                    producto10.setVisible(true);
                    break;
                }case 11:
                {
                    producto11.setVisible(true);
                    break;
                }case 12:
                {
                    producto12.setVisible(true);
                    break;
                }
                case 13:
                {
                    producto13.setVisible(true);
                    break;
                }
                case 14:
                {
                    producto14.setVisible(true);
                    break;
                }
                case 15:
                {
                    producto15.setVisible(true);
                    break;
                }
                case 16:
                {
                    producto16.setVisible(true);
                    break;
                }
                case 17:
                {
                    producto17.setVisible(true);
                    break;
                }case 18:
                {
                    producto18.setVisible(true);
                    break;
                }case 19:
                {
                    producto19.setVisible(true);
                    break;
                }
                case 20:
                {
                    producto20.setVisible(true);
                    break;
                }
                case 21:
                {
                    producto21.setVisible(true);
                    break;
                }
                case 22:
                {
                    producto22.setVisible(true);
                    break;
                }
                case 23:
                {
                    producto23.setVisible(true);
                    break;
                }
                case 24:
                {
                    producto24.setVisible(true);
                    break;
                }
                case 25:
                {
                    producto25.setVisible(true);
                    break;
                }
                case 26:
                {
                    producto26.setVisible(true);
                    break;
                }case 27:
                {
                    producto27.setVisible(true);
                    break;
                }case 28:
                {
                    producto28.setVisible(true);
                    break;
                }
                case 29:
                {
                    producto29.setVisible(true);
                    break;
                }
                case 30:
                {
                    producto30.setVisible(true);
                    break;
                }
                case 31:
                {
                    producto31.setVisible(true);
                    break;
                }
                case 32:
                {
                    producto32.setVisible(true);
                    break;
                }
                case 33:
                {
                    producto33.setVisible(true);
                    break;
                }
                case 34:
                {
                    producto34.setVisible(true);
                    break;
                }
                case 35:
                {
                    producto35.setVisible(true);
		    producer_index = 0;
                    break;
                }
                
            }
            try {
                Thread.sleep(250);
            } catch (InterruptedException ex) {
                Logger.getLogger(ConsumerThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void WaitProducer(){
        Icon productor = new ImageIcon(new ImageIcon(getClass().getResource("/images/productor_esperar.png")).getImage()
        .getScaledInstance(productor_label.getWidth(), productor_label.getHeight(), 0));
        
        productor_label.setIcon(productor);
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
        producto35 = new javax.swing.JLabel();
        producto34 = new javax.swing.JLabel();
        producto33 = new javax.swing.JLabel();
        producto32 = new javax.swing.JLabel();
        producto31 = new javax.swing.JLabel();
        producto30 = new javax.swing.JLabel();
        producto29 = new javax.swing.JLabel();
        producto28 = new javax.swing.JLabel();
        producto27 = new javax.swing.JLabel();
        producto26 = new javax.swing.JLabel();
        producto25 = new javax.swing.JLabel();
        producto24 = new javax.swing.JLabel();
        producto23 = new javax.swing.JLabel();
        producto22 = new javax.swing.JLabel();
        producto21 = new javax.swing.JLabel();
        producto20 = new javax.swing.JLabel();
        producto19 = new javax.swing.JLabel();
        producto18 = new javax.swing.JLabel();
        producto17 = new javax.swing.JLabel();
        producto16 = new javax.swing.JLabel();
        producto15 = new javax.swing.JLabel();
        producto14 = new javax.swing.JLabel();
        producto13 = new javax.swing.JLabel();
        producto12 = new javax.swing.JLabel();
        producto11 = new javax.swing.JLabel();
        producto10 = new javax.swing.JLabel();
        producto9 = new javax.swing.JLabel();
        producto8 = new javax.swing.JLabel();
        producto7 = new javax.swing.JLabel();
        producto6 = new javax.swing.JLabel();
        producto5 = new javax.swing.JLabel();
        producto4 = new javax.swing.JLabel();
        producto3 = new javax.swing.JLabel();
        producto2 = new javax.swing.JLabel();
        producto1 = new javax.swing.JLabel();
        productor_label = new javax.swing.JLabel();
        consumidor_label = new javax.swing.JLabel();
        contenedor_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        producto35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto35, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 38, 30));

        producto34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto34, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 38, 30));

        producto33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto33, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 38, 30));

        producto32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto32, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 38, 30));

        producto31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto31, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 38, 30));

        producto30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto30, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 38, 30));

        producto29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto29, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 38, 30));

        producto28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto28, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 38, 30));

        producto27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto27, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 38, 30));

        producto26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto26, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 38, 30));

        producto25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto25, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 38, 30));

        producto24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto24, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 38, 30));

        producto23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto23, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 38, 30));

        producto22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto22, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 38, 30));

        producto21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto21, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 38, 30));

        producto20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto20, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 38, 30));

        producto19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto19, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 38, 30));

        producto18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto18, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 38, 30));

        producto17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto17, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 38, 30));

        producto16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 38, 30));

        producto15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 38, 30));

        producto14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto14, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 38, 30));

        producto13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 38, 30));

        producto12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 38, 30));

        producto11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 38, 30));

        producto10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 38, 30));

        producto9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 38, 30));

        producto8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 38, 30));

        producto7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 38, 30));

        producto6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 38, 30));

        producto5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 38, 30));

        producto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 38, 30));

        producto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 38, 30));

        producto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 38, 30));

        producto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto.png"))); // NOI18N
        jPanel1.add(producto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 38, 30));

        productor_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/productor.png"))); // NOI18N
        jPanel1.add(productor_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 170, 213));

        consumidor_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/consumidor_comer.png"))); // NOI18N
        jPanel1.add(consumidor_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 150, 150));

        contenedor_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/contenedor.png"))); // NOI18N
        jPanel1.add(contenedor_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 500, 221));

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
            java.util.logging.Logger.getLogger(AnimationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnimationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnimationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnimationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnimationGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel consumidor_label;
    private javax.swing.JLabel contenedor_label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel producto1;
    private javax.swing.JLabel producto10;
    private javax.swing.JLabel producto11;
    private javax.swing.JLabel producto12;
    private javax.swing.JLabel producto13;
    private javax.swing.JLabel producto14;
    private javax.swing.JLabel producto15;
    private javax.swing.JLabel producto16;
    private javax.swing.JLabel producto17;
    private javax.swing.JLabel producto18;
    private javax.swing.JLabel producto19;
    private javax.swing.JLabel producto2;
    private javax.swing.JLabel producto20;
    private javax.swing.JLabel producto21;
    private javax.swing.JLabel producto22;
    private javax.swing.JLabel producto23;
    private javax.swing.JLabel producto24;
    private javax.swing.JLabel producto25;
    private javax.swing.JLabel producto26;
    private javax.swing.JLabel producto27;
    private javax.swing.JLabel producto28;
    private javax.swing.JLabel producto29;
    private javax.swing.JLabel producto3;
    private javax.swing.JLabel producto30;
    private javax.swing.JLabel producto31;
    private javax.swing.JLabel producto32;
    private javax.swing.JLabel producto33;
    private javax.swing.JLabel producto34;
    private javax.swing.JLabel producto35;
    private javax.swing.JLabel producto4;
    private javax.swing.JLabel producto5;
    private javax.swing.JLabel producto6;
    private javax.swing.JLabel producto7;
    private javax.swing.JLabel producto8;
    private javax.swing.JLabel producto9;
    private javax.swing.JLabel productor_label;
    // End of variables declaration//GEN-END:variables
}
