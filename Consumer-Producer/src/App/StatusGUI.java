/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package App;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rafael
 */
public class StatusGUI extends javax.swing.JFrame {

    /**
     * Creates new form StatusGUI
     */
    public StatusGUI() {
        initComponents();
        
        this.addSystemMessage("Free (No people using the container)");
        
        this.container = new ArrayList<>();
        
        for(int i = 0 ; i < 35 ; i++){
            this.container.add('*');
        }
        
        ContainerTableModel = (DefaultTableModel) this.ContainerTable.getModel();
        
        this.initContainerTable();
        
        this.status = 0;
        this.containerSize = 0;
    }
    
    // Variables
        DefaultTableModel ContainerTableModel;
    
        // Container Array List
        ArrayList<Character> container;
        
        AnimationGUI animREF;
        ConsumerThread consumer;
        ProducerThread producer;
        
        /* 
        * 0 -> Container is Free
        * 1 -> Container is on Use
        */
        int status;
        int containerSize;
    
    // Functions
        public ArrayList<Character> getContainerList(){
            return this.container;
        }
        
        public int getContinerSize(){
            return this.containerSize;
        }
        
        public void setContinerSize(int x){
            this.containerSize = x;
        }
        
        public void setStatus(int x){
            this.status = x;
        }
        
        private void initContainerTable(){
            for(int i = 1 ; i <= 35 ; i++){
                ContainerTableModel.addRow(new Object[]{i,'*'});
            }
        }
        
        public boolean isConsumerAvalible(){
            return status == 0 && (containerSize >= 3);
        }
        
        public void setConsumerStatus(int c){
            switch(c){
                case 0 -> {
                    addConsumerMessage("Sleeping...");
                    animREF.SleepConsumer();
                }
                case 1 -> {
                    addConsumerMessage("Waiting");
                    animREF.WaitConsumer();
                }
                case 2 -> {
                    status = 1;
                    addConsumerMessage("Working");
                    //animREF.WakeConsumer();
                    addSystemMessage("Busy (Consumer is working)");
                }
            }
        }
        
        public void modCont(int i, char c){
            this.container.set(i, c);
            
            this.ContainerTableModel.setValueAt(i + 1, i, 0);
            this.ContainerTableModel.setValueAt(c, i, 1);
        }
        
        public boolean isProducerAvalible(){
            return status == 0 && (containerSize <= 32);
        }
        
        public void setProducerStatus(int c){
            switch(c){
                case 0 -> {
                    addProducerMessage("Sleeping...");
                    animREF.SleepProducer();
                }
                case 1 -> {
                    addProducerMessage("Waiting");
                    animREF.WaitProducer();
                }
                case 2 -> {
                    status = 1;
                    addProducerMessage("Working");
                    //animREF.WakeProducer();
                    addSystemMessage("Busy (Consumer is working)");
                }
            }
        }
        
        public void setAnimRef(AnimationGUI ag){
            this.animREF = ag;
        }
        
        public void setThreads(ConsumerThread c, ProducerThread p){
            this.consumer = c;
            this.producer = p;
        }
        
        public void addSystemMessage(String s){
            Date d = new Date();
            
            s = d.toString().concat(" ").concat(s).concat("\n");
            
            this.SystemStatus.setText(this.SystemStatus.getText().concat(s));
        }
        
        public void addConsumerMessage(String s){
            Date d = new Date();
            
            s = d.toString().concat(" ").concat(s).concat("\n");
            
            this.ConsumerStatus.setText(this.ConsumerStatus.getText().concat(s));
        }
        
        public void addProducerMessage(String s){
            Date d = new Date();
            
            s = d.toString().concat(" ").concat(s).concat("\n");
            
            this.ProducerStatus.setText(this.ProducerStatus.getText().concat(s));
        }
        
        public void addContainerMessage(String s){
            Date d = new Date();
            
            s = d.toString().concat(" ").concat(s).concat("\n");
            
            this.ContainerStatus.setText(this.ContainerStatus.getText().concat(s));
        }
        
        public void showanimationConsumer(int n){
            animREF.WakeConsumer(n);
        }
        
        public void showanimationProducer(int n){
            animREF.WakeProducer(n);
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
        ContainerTable = new javax.swing.JTable();
        ConsumerLabel = new javax.swing.JLabel();
        ProducerLabel = new javax.swing.JLabel();
        SystemLabel = new javax.swing.JLabel();
        ContainerLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProducerStatus = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        ConsumerStatus = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        ContainerStatus = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        SystemStatus = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Status");
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        ContainerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "#", "Item"
            }
        ));
        ContainerTable.setFocusable(false);
        ContainerTable.setShowGrid(true);
        jScrollPane1.setViewportView(ContainerTable);

        ConsumerLabel.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        ConsumerLabel.setText("Consumer Status");
        ConsumerLabel.setFocusable(false);

        ProducerLabel.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        ProducerLabel.setText("Producer Status");
        ProducerLabel.setFocusable(false);

        SystemLabel.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        SystemLabel.setText("System Status");
        SystemLabel.setFocusable(false);

        ContainerLabel.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        ContainerLabel.setText("Container Status");
        ContainerLabel.setFocusable(false);

        ProducerStatus.setEditable(false);
        ProducerStatus.setColumns(20);
        ProducerStatus.setRows(5);
        ProducerStatus.setFocusable(false);
        jScrollPane2.setViewportView(ProducerStatus);

        ConsumerStatus.setEditable(false);
        ConsumerStatus.setColumns(20);
        ConsumerStatus.setRows(5);
        ConsumerStatus.setFocusable(false);
        jScrollPane3.setViewportView(ConsumerStatus);

        ContainerStatus.setEditable(false);
        ContainerStatus.setColumns(20);
        ContainerStatus.setRows(5);
        ContainerStatus.setFocusable(false);
        jScrollPane4.setViewportView(ContainerStatus);

        SystemStatus.setEditable(false);
        SystemStatus.setColumns(20);
        SystemStatus.setRows(5);
        SystemStatus.setFocusable(false);
        jScrollPane5.setViewportView(SystemStatus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ContainerLabel)
                            .addComponent(SystemLabel))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                            .addComponent(jScrollPane5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ConsumerLabel)
                            .addComponent(ProducerLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane2))))
                .addGap(9, 9, 9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ConsumerLabel)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProducerLabel)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ContainerLabel)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SystemLabel)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ESCAPE){
            if(consumer.isAlive()){
                consumer.stop();
            }
            
            if(producer.isAlive()){
                producer.stop();
            }
            
            if(animREF.isEnabled()){
                animREF.dispose();
            }
            
            this.dispose();
        }
    }//GEN-LAST:event_formKeyReleased

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
            java.util.logging.Logger.getLogger(StatusGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatusGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatusGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatusGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StatusGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ConsumerLabel;
    private javax.swing.JTextArea ConsumerStatus;
    private javax.swing.JLabel ContainerLabel;
    private javax.swing.JTextArea ContainerStatus;
    private javax.swing.JTable ContainerTable;
    private javax.swing.JLabel ProducerLabel;
    private javax.swing.JTextArea ProducerStatus;
    private javax.swing.JLabel SystemLabel;
    private javax.swing.JTextArea SystemStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
