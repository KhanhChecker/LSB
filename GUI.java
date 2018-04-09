/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgimport.img.pkg1;

import com.sun.javafx.scene.layout.region.Margins;
import java.awt.Color;
import java.awt.List;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import static java.nio.file.Files.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.FileChooser;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author SuaOngTho
 */
public class GUI extends javax.swing.JFrame {

    JFileChooser chooser;
    File file;
    String fileName;
    BufferedImage myPicture;
    String messege;
    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEncode = new javax.swing.JButton();
        btnDecode = new javax.swing.JButton();
        txtMessege = new javax.swing.JTextField();
        btnPath = new javax.swing.JButton();
        txtPath = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLableImg = new javax.swing.JLabel();
        lbNotification = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEncode.setText("Encode");
        btnEncode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncodeActionPerformed(evt);
            }
        });

        btnDecode.setText("Decode");
        btnDecode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecodeActionPerformed(evt);
            }
        });

        btnPath.setText("Open File");
        btnPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPathActionPerformed(evt);
            }
        });

        jLabel1.setText(" Messege");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLableImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEncode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDecode)
                                .addGap(28, 28, 28)
                                .addComponent(lbNotification, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtMessege, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtMessege, txtPath});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDecode, btnPath, jLabel1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLableImg, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPath)
                    .addComponent(txtPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMessege)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEncode)
                    .addComponent(btnDecode)
                    .addComponent(lbNotification))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPathActionPerformed

        try {
            chooser = new JFileChooser();
            int returnValue = chooser.showOpenDialog(this);
            file = chooser.getSelectedFile();
            fileName = file.getAbsolutePath();
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                myPicture = ImageIO.read(new File(fileName));
                jLableImg.setIcon(new ImageIcon(myPicture));
                txtPath.setText(fileName);
                messege = txtMessege.getText();
                lbNotification.setText("");

            }
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }   catch (Exception NullPointerException) {

        }
    }//GEN-LAST:event_btnPathActionPerformed

    private void btnEncodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncodeActionPerformed
        String path = txtPath.getText();
        String messege = txtMessege.getText();
        JFrame parentFrame = new JFrame();

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");
        try {
            int userSelection = fileChooser.showSaveDialog(parentFrame);

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fileChooser.getSelectedFile();
                System.out.println("Save as file: " + fileToSave.getAbsolutePath());
            }

            Encode(path, messege, fileChooser.getSelectedFile().getAbsolutePath());
            txtMessege.setText(" ");
            lbNotification.setText("Encode Successfully");
        } catch (Exception NullPointerException) {

        }
    }//GEN-LAST:event_btnEncodeActionPerformed

    private void btnDecodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecodeActionPerformed
        String path = txtPath.getText();
        txtMessege.setText(Decode(path));
        lbNotification.setText("Decode Successfully");

    }//GEN-LAST:event_btnDecodeActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUI gui = new GUI();
                gui.setVisible(true);
                gui.setSize(600, 600);
                gui.setLocation(500, 100);

            }
        });
    }

    // trường hợp chuỗi không đủ độ dài
    public boolean Encode(String image_path, String secret, String output_path) {
        String fileName = "";

        try {
            int msg_length = secret.length(); 
            int count = 0;
            

            if (output_path.equals("")) {
                fileName = image_path.substring(0, image_path.lastIndexOf('.'));
                fileName = "encode_" + fileName.substring(fileName.lastIndexOf('\\') + 1);
            } else {
                fileName = output_path;

            }
            String fileType = image_path.substring(image_path.lastIndexOf('.') + 1);

            String hiddenString = padding(msg_length) + MessageToBinary(secret);
            while (hiddenString.length() % 3 != 0) {
                hiddenString += "0";
            }
            char[] binHidden = hiddenString.toCharArray(); //đổi message thành mẩng char bin
            int break_point = binHidden.length; 
            BufferedImage buff = ImageIO.read(new File(image_path)); 

            for (int x = 0; x < buff.getWidth(); x++) {
                for (int y = 0; y < buff.getHeight(); y++) {
                    int rgb = buff.getRGB(x, y); //Get current RGB value
                    rgb = (binHidden[count++] == '0') ? (rgb & 0xFFFEFFFF) : (rgb | 0x00010000); //Thay thế giá trị màu đỏ
                    rgb = (binHidden[count++] == '0') ? (rgb & 0xFFFFFEFF) : (rgb | 0x00000100); //Thay thế giá trị màu xanh
                    rgb = (binHidden[count++] == '0') ? (rgb & 0xFFFFFFFE) : (rgb | 0x00000001); //Xanh lá
                    buff.setRGB(x, y, rgb); //Set new RGB value
                    if (count == break_point) {
                        break;
                    }

                }

                if (count == break_point) {
                    break; //Check for breaking the loop when encoding all secret charaters
                }
            }

            if (saveImage(buff, fileType, fileName)) //Saving new image
            {
                System.out.println("Save file OK!");
                return true;
            }
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
        return false;
    }

    public String getLSBBits(int pixel_rgb) {
        Color c = new Color(pixel_rgb);
        String result = "";
        String redInB = Integer.toBinaryString(c.getRed());
        String greenInB = Integer.toBinaryString(c.getGreen());
        String blueInB = Integer.toBinaryString(c.getBlue());

        result += String.valueOf(redInB.charAt(redInB.length() - 1));
        result += String.valueOf(greenInB.charAt(greenInB.length() - 1));
        result += String.valueOf(blueInB.charAt(blueInB.length() - 1));
        return result;
    }

    /**
     *
     * @param image_path
     * @return
     */
    public String Decode(String image_path) {
        try {
            int secret_length = 20;
            int count = 0; //đếm số bit LSB
            String secret = ""; 
            BufferedImage buff = ImageIO.read(new File(image_path));

            for (int x = 0; x < buff.getWidth(); x++) {
                for (int y = 0; y < buff.getHeight(); y++) {
                    secret = secret + getLSBBits(buff.getRGB(x, y));// Chuyển message thành dạng string
                    count += 3;
                    if (count == 9) {
                        secret_length = Integer.parseInt(secret.substring(0, 8), 2) + 1;
                    }
                    if (count > (secret_length * 8)) {
                        break; //đọc xong thì break
                    }
                }
                if (count > secret_length) {
                    break;
                }
            }
            secret = secret.substring(0, secret_length * 8); //Get exactly the length of 'Secret'
            System.out.println(secret);

            String result = ""; //The secret in plaintext

            for (int i = 8; i < secret.length(); i = i + 8) {
                result += BinToChar(secret.substring(i, i + 8));
            }
            return result;
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
        return "";
    }

    /**
     *
     * @param buff
     * @param file_type
     * @param file_path
     * @return
     */
   //Lưu ảnh
    public boolean saveImage(BufferedImage buff, String file_type, String file_path) {
        try {
            if (file_type.equalsIgnoreCase("PNG")) {
                return ImageIO.write(buff, "PNG", new File(file_path + ".png"));
            }
            return ImageIO.write(buff, "bmp", new File(file_path + ".bmp"));
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
        return false;
    }

    //Trường hợp chuỗi không đủ độ dài
    public String padding(int b) {
        String bin = Integer.toBinaryString(b);
        while (bin.length() < 8) {
            bin = "0" + bin;
        }
        return bin;
    }

    /**
     *
     * @param msg
     * @return
     */
    
    public String MessageToBinary(String msg) {
        String result = "";

        for (char c : msg.toCharArray()) {
            result += padding(c);
        }
       
        while (result.length() % 3 != 0) {
            result += "0";
        }
        return result;
    }

    
    public char BinToChar(String bin_string) {
        byte r = 0;
        int n = bin_string.length();
        int i = 0;
        int pow = 1;
        for (char c : bin_string.toCharArray()) {
            if (c == '1') {
                i = 0;
                pow = 1;
                while (i < n - 1) {
                    pow *= 2;
                    i++;
                }
                r += pow;
            }
            n--;
        }
        return (char) r;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDecode;
    private javax.swing.JButton btnEncode;
    private javax.swing.JButton btnPath;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLableImg;
    private javax.swing.JLabel lbNotification;
    private javax.swing.JTextField txtMessege;
    private javax.swing.JTextField txtPath;
    // End of variables declaration//GEN-END:variables
}
