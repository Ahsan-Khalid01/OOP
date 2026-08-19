/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginpage3;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.awt.Color;
/**
 *
 * @author Ahsan Khalid
 */
public class TransferOptionFrame extends JFrame implements ActionListener
{
    JButton bankBtn, walletBtn;
    String username;

   // TransferOptionFrame( uname){ 
     TransferOptionFrame( String username)
    {
        this.username = username;

        bankBtn = new JButton("Bank Transfer");
        bankBtn.setBounds(40, 50, 120, 40);
        bankBtn.addActionListener(this);
        this.add(bankBtn);

        walletBtn = new JButton("Mobile Wallet");
        walletBtn.setBounds(180, 50, 120, 40);
        walletBtn.addActionListener(this);
        this.add(walletBtn);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String cmd = e.getActionCommand();

        if(cmd.equals("Bank Transfer"))
        {
            BankTransferFrame bf = new BankTransferFrame(username);
            bf.setTitle("Bank Transfer");
            bf.setSize(400, 300);
            bf.setLayout(null);
            bf.setLocationRelativeTo(null);
            bf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            bf.setVisible(true);
        }
        else if(cmd.equals("Mobile Wallet"))
        {
          
      MobileWalletFrame mw = new MobileWalletFrame();
    mw.setTitle("Allied Bank Limited ");
    mw.setSize(400, 400);
    mw.setLayout(null);
    mw.setLocationRelativeTo(null);
    mw.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    mw.setVisible(true);
}
 }
 }


    

