package digittal.signature.rsa;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Truong Phuc Nguyen
 */
public class FormDSRSA extends javax.swing.JFrame {

    /**
     * Creates new form FormDSRSA
     */
    static int bitleg;
    static BigInteger ciphertext;

    static AlgorithmRSA rsa;

    public FormDSRSA() {

        initComponents();
//        jProgressBar1 = new JProgressBar();
        jProgressBar1.setStringPainted(true);
        jProgressBar1.setForeground(Color.PINK);
        jTextField1.setEnabled(false);
        jTextField2.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);

        bitleg = Integer.parseInt((String) jComboBox1.getSelectedItem());
        rsa = new AlgorithmRSA();
        rsa.KeyRSA(bitleg);

        this.setLocation(300, 50);
        this.setResizable(false);
    }

    public void OutputWrite(File saveLocation, BigInteger EncryptCodes, String name)
            throws FileNotFoundException {

        PrintWriter file
                = new PrintWriter(new FileOutputStream(new File(saveLocation, name)));
        file.println(EncryptCodes);
        file.close();

    }
