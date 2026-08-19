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
public class MobileWalletFrame extends JFrame implements ActionListener
{
    JLabel title, subtitle;
    JButton easyBtn, jazzBtn, nayaBtn, uBtn,sadaBtn, oneBtn, zindiBtn, skrillBtn;

    MobileWalletFrame()
    {
        this.getContentPane().setBackground(Color.WHITE);
        title = new JLabel("Allied Bank Limited");
        title.setBounds(90, 10, 300, 30);
        title.setFont(new Font("Times New Roman", Font.BOLD, 20));
        this.add(title);

        subtitle = new JLabel("Mobile Wallet Transfer");
        subtitle.setBounds(110, 40, 250, 25);
        subtitle.setFont(new Font("Times New Roman", Font.PLAIN, 15));
          this.add(subtitle);

       
        easyBtn =  new JButton("EasyPaisa");
        easyBtn.setBounds(20, 90, 160, 45);
        easyBtn.addActionListener(this);
        this.add(easyBtn);

        jazzBtn = new JButton("JazzCash");
        jazzBtn.setBounds(200, 90, 160, 45);
        jazzBtn.addActionListener(this);
        this.add(jazzBtn);

       
        nayaBtn = new JButton("NayaPay");
        nayaBtn.setBounds(20, 145, 160, 45);
        nayaBtn.addActionListener(this);
        this.add(nayaBtn);

        uBtn = new JButton("U Paisa");
        uBtn.setBounds(200, 145, 160, 45);
        uBtn.addActionListener(this);
        this.add(uBtn);

        
        sadaBtn = new JButton("SadaPay");
        sadaBtn.setBounds(20, 200, 160, 45);
        sadaBtn.addActionListener(this);
        this.add(sadaBtn);
        oneBtn = new JButton("OneLoad");
        oneBtn.setBounds(200, 200, 160, 45);
        oneBtn.addActionListener(this);
          this.add(oneBtn);
        zindiBtn = new JButton("Zindigi");
        zindiBtn.setBounds(20, 255, 160, 45);
        zindiBtn.addActionListener(this);
        this.add(zindiBtn);
        skrillBtn = new JButton("Skrill");
        skrillBtn.setBounds(200, 255, 160, 45);
        skrillBtn.addActionListener(this);
        this.add(skrillBtn);
        
  }
@Override
    public void actionPerformed(ActionEvent e)
    {
        String cmd = e.getActionCommand();
     if(cmd.equals("EasyPaisa")||cmd.equals("JazzCash"))
        {
         JOptionPane.showMessageDialog(null,"No wallet account found\n\nPlease verify mobile number  ");
        }
       else
         {
            JOptionPane.showMessageDialog(null,"This service is currently unavailable\n\nFeature coming soon ");
        }
    
    
  
}
}

    

