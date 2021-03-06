
package gui;

import core.CapturaAudio;
import core.Traductor;
import javax.swing.JOptionPane;

/**
 *
 * @author CesarH
 */
public class Principal extends javax.swing.JFrame implements Runnable {

    public CapturaAudio ca;
    public Traductor tr;
    public String palabra = "";
    public String inicioLang, destinoLang;
    public Thread hiloCaptura;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        buttonGroup1.add(rbtnEspIng);
        buttonGroup1.add(rbtnIngEsp);
        setLocationRelativeTo(null);
        setVisible(true);
        tr = new Traductor();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOrigen = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTraducido = new javax.swing.JTextArea();
        btnStart = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblOrigen = new javax.swing.JLabel();
        lblTraducido = new javax.swing.JLabel();
        rbtnEspIng = new javax.swing.JRadioButton();
        rbtnIngEsp = new javax.swing.JRadioButton();
        btnClean = new javax.swing.JButton();
        lblinfo = new javax.swing.JLabel();
        lblDir = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menArchivo = new javax.swing.JMenu();
        miLimpia = new javax.swing.JMenuItem();
        miCerrar = new javax.swing.JMenuItem();
        menAyuda = new javax.swing.JMenu();
        miAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal IWEKS");
        setResizable(false);

        txtOrigen.setEditable(false);
        txtOrigen.setColumns(20);
        txtOrigen.setRows(5);
        jScrollPane1.setViewportView(txtOrigen);

        txtTraducido.setEditable(false);
        txtTraducido.setColumns(20);
        txtTraducido.setRows(5);
        jScrollPane2.setViewportView(txtTraducido);

        btnStart.setBackground(new java.awt.Color(12, 249, 130));
        btnStart.setText("COMENZAR");
        btnStart.setToolTipText("Comenzar la captura de audio");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("IWEKS");

        lblOrigen.setText("Texto de origen");

        lblTraducido.setText("Texto de salida");

        rbtnEspIng.setSelected(true);
        rbtnEspIng.setText("Español >> Inglés");
        rbtnEspIng.setToolTipText("Traducción del Español al Inglés");

        rbtnIngEsp.setText("Inglés >> Español");
        rbtnIngEsp.setToolTipText("Traducción del Inglés al Español");

        btnClean.setBackground(new java.awt.Color(220, 220, 141));
        btnClean.setText("Limpiar texto");
        btnClean.setToolTipText("Limpiar las áreas de texto");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        lblinfo.setForeground(new java.awt.Color(255, 0, 0));
        lblinfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblinfo.setText("Para terminar la captura de voz, diga \"fintrad\", la ventana se cerrará despues de pronunciar la palabra.");
        lblinfo.setToolTipText("Información de ayuda");

        lblDir.setForeground(new java.awt.Color(255, 0, 0));
        lblDir.setText("Dirección de la traducción");

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        menArchivo.setText("Archivo");

        miLimpia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/broom--pencil.png"))); // NOI18N
        miLimpia.setText("Limpiar texto");
        miLimpia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLimpiaActionPerformed(evt);
            }
        });
        menArchivo.add(miLimpia);

        miCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cross.png"))); // NOI18N
        miCerrar.setText("Cerrar");
        miCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCerrarActionPerformed(evt);
            }
        });
        menArchivo.add(miCerrar);

        jMenuBar1.add(menArchivo);

        menAyuda.setText("Ayuda");

        miAcerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exclamation-octagon.png"))); // NOI18N
        miAcerca.setText("Acerca de la aplicación");
        miAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAcercaActionPerformed(evt);
            }
        });
        menAyuda.add(miAcerca);

        jMenuBar1.add(menAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(lblOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(rbtnEspIng)
                                .addGap(18, 18, 18)
                                .addComponent(rbtnIngEsp)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTraducido, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addComponent(lblinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblDir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnEspIng)
                    .addComponent(rbtnIngEsp)
                    .addComponent(btnClean))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrigen)
                    .addComponent(lblTraducido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(lblinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // Inicio de la captura de audio
        if (rbtnEspIng.isSelected()) {
            //System.out.println("Direccion: " + rbtnEspIng.getText());
            inicioLang = "es";
            destinoLang = "en";
            iniciaCaptura();
            JOptionPane.showMessageDialog(rootPane, "Ahora puede comenzar a hablar", "Información", 1);
        } else if (rbtnIngEsp.isSelected()) {
            //System.out.println("Direccion: " + rbtnIngEsp.getText());
            inicioLang = "en";
            destinoLang = "es";
            iniciaCaptura();
            JOptionPane.showMessageDialog(rootPane, "Ahora puede comenzar a hablar", "Información", 1);
        }
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        // Limpia el texto de las cajas
        txtOrigen.setText("");
        txtTraducido.setText("");
    }//GEN-LAST:event_btnCleanActionPerformed

    private void miLimpiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLimpiaActionPerformed
        // Limpia el texto de las cajas
        txtOrigen.setText("");
        txtTraducido.setText("");
    }//GEN-LAST:event_miLimpiaActionPerformed

    private void miCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCerrarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_miCerrarActionPerformed

    private void miAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAcercaActionPerformed
        // Abrir el frame de informacion
        Informacion info = new Informacion();
        info.setLocationRelativeTo(null);
        info.setVisible(true);
    }//GEN-LAST:event_miAcercaActionPerformed

    /**
     * Metodo para inciar la captura de la voz, crea un nuevo hilo para poder
     * manejar en paralelo el JFrame y el reconocedor de voz
     */
    public void iniciaCaptura() {
        hiloCaptura = new Thread(ca = new CapturaAudio(this));
        hiloCaptura.start();
    }

    /**
     * Metodo para llenar el JTextArea con las palabras dictadas por voz, asi
     * mismo envia la palabra para ser traducida
     *
     * @param palabra
     */
    public void llenaOrigen(String palabra) {
        if (palabra.equals("Fintrad")) {
            JOptionPane.showMessageDialog(rootPane, "Fin de la captura de audio", "Información", 0);
        }else{
            this.txtOrigen.append(palabra);
            llenaTraduccion(palabra.trim());
        }
    }

    /**
     * Metodo para traducir las palabras dictadas por voz.
     *
     * @param pal
     */
    public void llenaTraduccion(String pal) {
        String resultado = tr.traduce(pal, inicioLang, destinoLang);
        if (resultado == null) {
            JOptionPane.showMessageDialog(rootPane, "Error: \nNo se recibió ninguna traducción", "Información", 0);
        } else {
            this.txtTraducido.append(resultado + "\n");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnStart;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDir;
    private javax.swing.JLabel lblOrigen;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTraducido;
    private javax.swing.JLabel lblinfo;
    private javax.swing.JMenu menArchivo;
    private javax.swing.JMenu menAyuda;
    private javax.swing.JMenuItem miAcerca;
    private javax.swing.JMenuItem miCerrar;
    private javax.swing.JMenuItem miLimpia;
    private javax.swing.JRadioButton rbtnEspIng;
    private javax.swing.JRadioButton rbtnIngEsp;
    public javax.swing.JTextArea txtOrigen;
    private javax.swing.JTextArea txtTraducido;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
