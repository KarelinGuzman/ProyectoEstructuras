/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import Estructuras.AuxiliarSopa;
import Estructuras.Grafo;
import Estructuras.Lista;
import Estructuras.Vertice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author karelin
 */
public class Menu extends javax.swing.JFrame {

    public static Grafo g;
    public AuxiliarSopa[] cuadros;
    public static String[] diccionario;
    public static String letras;

    /**
     * Creates new form Menu
     */
    public Menu(String letras, String[] diccionario) {
        initComponents();
        this.letras = letras;
        this.diccionario = diccionario;
        for (String word : this.diccionario) {
            System.out.println(word);
        }
        this.g = new Grafo(16, this.letras);
        javax.swing.JTextField[] fields = {this.C0, this.C1, this.C2, this.C3, this.C4, this.C5, this.C6, this.C7, this.C8, this.C9, this.C10, this.C11, this.C12, this.C13, this.C14, this.C15};
        this.setVisible(true);
        this.cuadros = new AuxiliarSopa[16];
        for (int i = 0; i < 16; i++) {
            cuadros[i] = new AuxiliarSopa(fields[i], g.sopa[i]);
            cuadros[i].celda.setText(String.valueOf(letras.charAt(i)));
        }
//        this.jTextField1.setBackground(Color.red);
    }

    public void mostrar(String[] diccionario) {
        String encontradas = "";
        for (String word : diccionario) {
            try {
                int red = (int) (Math.random() * 256);
                int green = (int) (Math.random() * 256);
                int blue = (int) (Math.random() * 256);
                Color color = new Color(red, green, blue);
                Lista lista = this.g.buscarDFS(word);
                encontradas += lista.imprimir() + "\n";
                for (int i = 0; i < word.length(); i++) {
                    Vertice actual = lista.buscarPos(i);

                    for (int j = 0; j < 16; j++) {
//                        System.out.println(this.cuadros[j].nodo.equals(actual));
                        if (this.cuadros[j].nodo.equals(actual)) {
//                            System.out.println("jdj");
                            if (this.cuadros[j].celda.getBackground().equals(Color.WHITE)) {
                                this.cuadros[j].celda.setBackground(color);

                            } else {
                                this.cuadros[j].celda.setBackground(Color.BLACK);
                                this.cuadros[j].celda.setForeground(Color.WHITE);

                            }
                        }
                    }

                }

            } catch (Exception e) {
                System.out.println(e);
            }
        }
        this.jTextArea1.setText(encontradas);
    }

//    public int drawTree(Graphics g, Documento x, int x0, int x1, int y, int index) {
//
//        int m = (x0 + x1) / 2;
//        g.setColor(Color.GRAY);
//        g.fillOval(m, y, 50, 40);
//        g.setColor(Color.lightGray);
//        g.setFont(new Font("Arial", Font.BOLD, 20));
//        String t = String.valueOf(x.etiqueta_de_tiempo);
//        g.drawString(t, m + 20, y + 30);
//        int posL = bh.indiceIzq(index);
//        int posR = bh.indiceDer(index);
//        if (bh.monticulo[posL] != null) {
//            int x2 = drawTree(g, bh.monticulo[posL], x0, m, y + 50, posL);
//            g.drawLine(m + 25, y + 40, x2 + 25, y + 50);
//        }
//        if (bh.monticulo[posR] != null) {
//            int x2 = drawTree(g, bh.monticulo[posR], m, x1, y + 50, posR);
//            g.drawLine(m + 25, y + 40, x2 + 25, y + 50);
//        }
//        return m;
//    }
//
//    public void draw(Graphics g, int m, int y, Documento x) {
//        g.setColor(Color.BLUE);
//        g.fillOval(m, y, 50, 40);
//        g.setColor(Color.lightGray);
//        g.setFont(new Font("Arial", Font.BOLD, 20));
//        String t = String.valueOf(x.etiqueta_de_tiempo);
//        g.drawString(t, m + 20, y + 30);
//    }
//
//    @Override
//    public void paint(Graphics g) {
//        super.paint(g);
//        drawTree(g, bh.monticulo[0], 0, this.getWidth() - 25, 100, 0);
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        C15 = new javax.swing.JTextField();
        C0 = new javax.swing.JTextField();
        C1 = new javax.swing.JTextField();
        C2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        C7 = new javax.swing.JTextField();
        C6 = new javax.swing.JTextField();
        C5 = new javax.swing.JTextField();
        C4 = new javax.swing.JTextField();
        C8 = new javax.swing.JTextField();
        C9 = new javax.swing.JTextField();
        C10 = new javax.swing.JTextField();
        C11 = new javax.swing.JTextField();
        C12 = new javax.swing.JTextField();
        C13 = new javax.swing.JTextField();
        C14 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        C3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Busqueda por Diccionario:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 400, 30));

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setFont(new java.awt.Font("Century Gothic", 3, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buscar");
        jButton1.setAlignmentY(0.0F);
        jButton1.setAutoscrolls(true);
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 204), new java.awt.Color(153, 255, 153), new java.awt.Color(204, 255, 204), new java.awt.Color(153, 255, 153)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 190, 100, 40));

        jButton2.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jButton2.setText("GRAFICAR BFS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 510, -1, -1));

        C15.setEditable(false);
        C15.setBackground(new java.awt.Color(255, 255, 255));
        C15.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        C15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C15.setText("A");
        C15.setPreferredSize(new java.awt.Dimension(64, 64));
        C15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C15ActionPerformed(evt);
            }
        });
        jPanel1.add(C15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, -1));

        C0.setEditable(false);
        C0.setBackground(new java.awt.Color(255, 255, 255));
        C0.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        C0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C0.setText("A");
        C0.setPreferredSize(new java.awt.Dimension(64, 64));
        C0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C0ActionPerformed(evt);
            }
        });
        jPanel1.add(C0, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        C1.setEditable(false);
        C1.setBackground(new java.awt.Color(255, 255, 255));
        C1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        C1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C1.setText("A");
        C1.setPreferredSize(new java.awt.Dimension(64, 64));
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        jPanel1.add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        C2.setEditable(false);
        C2.setBackground(new java.awt.Color(255, 255, 255));
        C2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        C2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C2.setText("A");
        C2.setPreferredSize(new java.awt.Dimension(64, 64));
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });
        jPanel1.add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        jTextField5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField5.setPreferredSize(new java.awt.Dimension(64, 64));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 280, 40));

        C7.setEditable(false);
        C7.setBackground(new java.awt.Color(255, 255, 255));
        C7.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        C7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C7.setText("A");
        C7.setPreferredSize(new java.awt.Dimension(64, 64));
        C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C7ActionPerformed(evt);
            }
        });
        jPanel1.add(C7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        C6.setEditable(false);
        C6.setBackground(new java.awt.Color(255, 255, 255));
        C6.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        C6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C6.setText("A");
        C6.setPreferredSize(new java.awt.Dimension(64, 64));
        C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C6ActionPerformed(evt);
            }
        });
        jPanel1.add(C6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        C5.setEditable(false);
        C5.setBackground(new java.awt.Color(255, 255, 255));
        C5.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        C5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C5.setText("A");
        C5.setPreferredSize(new java.awt.Dimension(64, 64));
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });
        jPanel1.add(C5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        C4.setEditable(false);
        C4.setBackground(new java.awt.Color(255, 255, 255));
        C4.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        C4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C4.setText("A");
        C4.setPreferredSize(new java.awt.Dimension(64, 64));
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });
        jPanel1.add(C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        C8.setEditable(false);
        C8.setBackground(new java.awt.Color(255, 255, 255));
        C8.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        C8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C8.setText("A");
        C8.setPreferredSize(new java.awt.Dimension(64, 64));
        C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C8ActionPerformed(evt);
            }
        });
        jPanel1.add(C8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        C9.setEditable(false);
        C9.setBackground(new java.awt.Color(255, 255, 255));
        C9.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        C9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C9.setText("A");
        C9.setPreferredSize(new java.awt.Dimension(64, 64));
        C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C9ActionPerformed(evt);
            }
        });
        jPanel1.add(C9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        C10.setEditable(false);
        C10.setBackground(new java.awt.Color(255, 255, 255));
        C10.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        C10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C10.setText("A");
        C10.setPreferredSize(new java.awt.Dimension(64, 64));
        C10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C10ActionPerformed(evt);
            }
        });
        jPanel1.add(C10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        C11.setEditable(false);
        C11.setBackground(new java.awt.Color(255, 255, 255));
        C11.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        C11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C11.setText("A");
        C11.setPreferredSize(new java.awt.Dimension(64, 64));
        C11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C11ActionPerformed(evt);
            }
        });
        jPanel1.add(C11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

        C12.setEditable(false);
        C12.setBackground(new java.awt.Color(255, 255, 255));
        C12.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        C12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C12.setText("A");
        C12.setPreferredSize(new java.awt.Dimension(64, 64));
        C12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C12ActionPerformed(evt);
            }
        });
        jPanel1.add(C12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        C13.setEditable(false);
        C13.setBackground(new java.awt.Color(255, 255, 255));
        C13.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        C13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C13.setText("A");
        C13.setPreferredSize(new java.awt.Dimension(64, 64));
        C13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C13ActionPerformed(evt);
            }
        });
        jPanel1.add(C13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, -1));

        C14.setEditable(false);
        C14.setBackground(new java.awt.Color(255, 255, 255));
        C14.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        C14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C14.setText("A");
        C14.setPreferredSize(new java.awt.Dimension(64, 64));
        C14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C14ActionPerformed(evt);
            }
        });
        jPanel1.add(C14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel2.setText("SOPA DE LETRAS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 400, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setText("Diccionario:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 400, -1));

        C3.setEditable(false);
        C3.setBackground(new java.awt.Color(255, 255, 255));
        C3.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        C3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C3.setText("A");
        C3.setPreferredSize(new java.awt.Dimension(64, 64));
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });
        jPanel1.add(C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setText("Busqueda Especifica:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 400, 30));

        jButton3.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jButton3.setText("Buscar por BFS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, -1, -1));

        jButton4.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jButton4.setText("Buscar por DFS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 890, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void C15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C15ActionPerformed

    private void C0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C0ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C7ActionPerformed

    private void C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C6ActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C5ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C4ActionPerformed

    private void C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C8ActionPerformed

    private void C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C9ActionPerformed

    private void C10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C10ActionPerformed

    private void C11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C11ActionPerformed

    private void C12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C12ActionPerformed

    private void C13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C13ActionPerformed

    private void C14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C14ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String encontradas = "";
//        System.out.println(this.diccionario.length);
        for (String word : this.diccionario) {
//            if (g.buscarBFS(word)) {
//                encontradas += word + "\n";
//            }
//System.out.println(word);
if (g.buscarBFS(word)) {
                System.out.println("                    Found: " + word);
            } else {
                System.out.println("                    Not found: " + word);
            }
        }
        this.mostrar(this.diccionario);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String p = this.jTextField5.getText();
        Lista lista = this.g.buscarDFS(p);

        this.jTextArea1.setText(lista.imprimir());

        String recorrido = lista.imprimir();
        for (int i = 0; i < 16; i++) {
            this.cuadros[i].celda.setBackground(Color.WHITE);
            this.cuadros[i].celda.setForeground(Color.BLACK);
        }
        for (int i = 0; i < recorrido.length(); i++) {
            Vertice actual = lista.buscarPos(i);
            for (int j = 0; j < 16; j++) {
                if (this.cuadros[j].nodo.equals(actual)) {
                    System.out.println("jdj");
                    this.cuadros[j].celda.setBackground(Color.red);
                    break;
                }
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.mostrar(this.diccionario);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu(letras, diccionario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField C0;
    private javax.swing.JTextField C1;
    private javax.swing.JTextField C10;
    private javax.swing.JTextField C11;
    private javax.swing.JTextField C12;
    private javax.swing.JTextField C13;
    private javax.swing.JTextField C14;
    private javax.swing.JTextField C15;
    private javax.swing.JTextField C2;
    private javax.swing.JTextField C3;
    private javax.swing.JTextField C4;
    private javax.swing.JTextField C5;
    private javax.swing.JTextField C6;
    private javax.swing.JTextField C7;
    private javax.swing.JTextField C8;
    private javax.swing.JTextField C9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
