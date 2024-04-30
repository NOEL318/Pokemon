/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author noel
 */
public class Create_Pokemon extends javax.swing.JFrame {

    String[] selected_pokemon = {};
    File file = new File("./favorites.csv");

    /**
     * Creates new form Create_Pokemon
     */
    public Create_Pokemon() {
        initComponents();

    }

    public Create_Pokemon(String[] pokemon) {
        selected_pokemon = pokemon;
        initComponents();
        setValues();
        ImageIcon Img = new ImageIcon("src/main/java/poo/backgroundCombate/backgroundSetCombate.jpg"); 
        Image image = Img.getImage();
        Image newimg = image.getScaledInstance(377, 570, java.awt.Image.SCALE_SMOOTH);
        Img = new ImageIcon(newimg);
        JLabel IMG = new JLabel (Img);
        IMG.setSize(377,570);     
        IMG.setOpaque(false);
        add(IMG);
        IMG.setLocation(1, 1);
    }

    public void setValues() {
        pokemon_id.setText(selected_pokemon[0]);
        pokemon_name.setText(selected_pokemon[1]);
        pokemon_weight.setText(selected_pokemon[3]);
        pokemon_estatura.setText(selected_pokemon[2]);
        pokemon_element.setText(selected_pokemon[4]);
        pokemon_attack.setText("Ataque:" + selected_pokemon[4]);
        pokemon_life.setText("Vida: " + selected_pokemon[5]);
        pokemon_defense.setText("Defensa: " + selected_pokemon[7]);
        pokemon_speed.setText("Speed: " + selected_pokemon[8]);

        String imagepath = "src/main/java/poo/assets/";
        if (selected_pokemon[0].length() == 1) {
            imagepath = imagepath + "00" + selected_pokemon[0] + ".png";
        } else if (selected_pokemon[0].length() == 2) {
            imagepath = imagepath + "0" + selected_pokemon[0] + ".png";
        } else if (selected_pokemon[0].length() == 3) {
            imagepath = imagepath + selected_pokemon[0] + ".png";
        }

        ImageIcon pic = new ImageIcon(imagepath);
        Image image = pic.getImage();
        Image newimg = image.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
        pic = new ImageIcon(newimg);
        pokemon_image.setIcon(pic);

        pokemon_image.setOpaque(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pokemon_weight = new javax.swing.JTextField();
        pokemon_estatura = new javax.swing.JTextField();
        pokemon_element = new javax.swing.JTextField();
        pokemon_genre = new javax.swing.JTextField();
        pokemon_speed = new javax.swing.JTextField();
        pokemon_level = new javax.swing.JTextField();
        pokemon_defense = new javax.swing.JTextField();
        pokemon_attack = new javax.swing.JTextField();
        pokemon_life = new javax.swing.JTextField();
        pokemon_id = new javax.swing.JLabel();
        create_button = new javax.swing.JButton();
        pokemon_image = new javax.swing.JLabel();
        pokemon_name = new javax.swing.JTextField();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Peso");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Estatura");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Elemento");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Género");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Habilidades");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nivel");

        pokemon_weight.setText("Peso");
        pokemon_weight.setEnabled(false);

        pokemon_estatura.setText("Estatura");
        pokemon_estatura.setEnabled(false);

        pokemon_element.setText("Elemento");
        pokemon_element.setEnabled(false);

        pokemon_genre.setText("Género");

        pokemon_speed.setEnabled(false);
        pokemon_speed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokemon_speedActionPerformed(evt);
            }
        });

        pokemon_level.setEditable(false);
        pokemon_level.setText("0");
        pokemon_level.setEnabled(false);
        pokemon_level.setFocusable(false);

        pokemon_defense.setEnabled(false);
        pokemon_defense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokemon_defenseActionPerformed(evt);
            }
        });

        pokemon_attack.setEnabled(false);
        pokemon_attack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokemon_attackActionPerformed(evt);
            }
        });

        pokemon_life.setEnabled(false);
        pokemon_life.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokemon_lifeActionPerformed(evt);
            }
        });

        pokemon_id.setForeground(new java.awt.Color(255, 255, 255));
        pokemon_id.setText("#ID");

        create_button.setText("Crear");
        create_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_buttonActionPerformed(evt);
            }
        });

        pokemon_name.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        pokemon_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pokemon_name.setText("POKEMON_NAME");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pokemon_life, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                    .addComponent(pokemon_attack, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                    .addComponent(pokemon_defense, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                    .addComponent(pokemon_weight)
                                    .addComponent(pokemon_estatura, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                    .addComponent(pokemon_element, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                    .addComponent(pokemon_genre, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                    .addComponent(pokemon_speed, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                    .addComponent(pokemon_level, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(pokemon_image, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(pokemon_id)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(create_button))
                            .addComponent(pokemon_name))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pokemon_id)
                    .addComponent(create_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pokemon_image, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pokemon_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pokemon_weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pokemon_estatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pokemon_element, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pokemon_genre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(pokemon_speed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(pokemon_defense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(pokemon_attack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(pokemon_life, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(pokemon_level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pokemon_speedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokemon_speedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pokemon_speedActionPerformed

    private void pokemon_defenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokemon_defenseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pokemon_defenseActionPerformed

    private void pokemon_attackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokemon_attackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pokemon_attackActionPerformed

    private void pokemon_lifeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokemon_lifeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pokemon_lifeActionPerformed

    private void create_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_buttonActionPerformed
        // TODO add your handling code here:
        try {
//           FileReader file_reader = new FileReader(file);
//            BufferedReader buffered_reader = new BufferedReader(file_reader);
//            String linea = "";
//            while ((linea = buffered_reader.readLine()) != null) {
//                 Text = Text + linea + "\n";
//                System.out.println(Text + "isopening");
//            }

            FileWriter file_writer = new FileWriter(file, true);

            BufferedWriter buffered_writer = new BufferedWriter(file_writer);
            String str=selected_pokemon[0] + "," + pokemon_name.getText() + "," + selected_pokemon[2] + "," + selected_pokemon[3] + "," + selected_pokemon[4] + "," + selected_pokemon[5] + "," + selected_pokemon[6] +","+ selected_pokemon[7] + "," + selected_pokemon[8] + "," + "0" + "," + pokemon_genre.getText() + "\n";
            buffered_writer.write(str);
            JOptionPane.showMessageDialog(null, "Haz atrapado a tu Pokemón " + selected_pokemon[1]);
            System.out.println("here");
            buffered_writer.close();

        } catch (IOException ex) {
            System.out.println("Couldn't write to file");

        }


    }//GEN-LAST:event_create_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Create_Pokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create_Pokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create_Pokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_Pokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create_Pokemon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton create_button;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField pokemon_attack;
    private javax.swing.JTextField pokemon_defense;
    private javax.swing.JTextField pokemon_element;
    private javax.swing.JTextField pokemon_estatura;
    private javax.swing.JTextField pokemon_genre;
    private javax.swing.JLabel pokemon_id;
    private javax.swing.JLabel pokemon_image;
    private javax.swing.JTextField pokemon_level;
    private javax.swing.JTextField pokemon_life;
    private javax.swing.JTextField pokemon_name;
    private javax.swing.JTextField pokemon_speed;
    private javax.swing.JTextField pokemon_weight;
    // End of variables declaration//GEN-END:variables
}
