 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginpage3;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
/**
 *
 * @author Ahsan Khalid
 */
class Frame2 extends JFrame implements ActionListener
{
    JLabel lb2,logo;
    JButton btn;
    JTextField txt;
    JPasswordField pswd;
    Font font;
    public void addcomp2()
    {
      //  t//his.setIconImage(new ImageIcon(LoginPage3.class.getResource("pic/allied-bank-logo.png")).getImage());
       ImageIcon icon=new ImageIcon("C:\\Users\\dcui\\Downloads\\allied-bank-logo.png");
       logo=new JLabel(icon);
        logo.setBounds(0, 0, 400, 100);
        this.add(logo);
        
        lb2=new JLabel();
         font=new Font("Times New Roman",Font.BOLD+Font.TRUETYPE_FONT,25);
        lb2.setText("Welcome, Valued Customer");
        lb2.setBounds(60, 100, 300, 100);
        lb2.setFont(font);
        lb2.setVisible(true);
        this.add(lb2);
        
        lb2=new JLabel();
         font=new Font("Times New Roman",Font.BOLD,16);
         lb2.setText("Please choose an account type to proceed");
         lb2.setBounds(70, 180, 1000, 20);
         lb2.setFont(font);
         lb2.setVisible(true);
         this.add(lb2);
         
         lb2=new JLabel();
         font=new Font("Times New Roman",Font.BOLD,16);
         lb2.setText("with your new account opening");
         lb2.setBounds(75, 203, 1000, 20);
         lb2.setFont(font);
         lb2.setVisible(true);
         this.add(lb2);
         
        
     /* Font font=new Font("Times New Roman",Font.BOLD,16);
      lb2=new JLabel();
      lb2.setText("First Name");
      lb2.setBounds(20,200, 100, 30);
      lb2.setFont(font);
      this.add(lb2);*/
     btn=new JButton();
     font=new Font("Times New Roman",Font.BOLD,17);
     btn.setText("Current");
     btn.setBounds(10, 300, 90, 80);
     btn.setVisible(true);
     btn.setFont(font);
     this.add(btn);
          btn.addActionListener(this);
     btn=new JButton();
     font=new Font("Times New Roman",Font.BOLD,17);
     btn.setText("Saving");
     btn.setBounds(110, 300, 90, 80);
     btn.setVisible(true);
     btn.setFont(font);
     this.add(btn);
          btn.addActionListener(this);
     btn=new JButton();
     font=new Font("Times New Roman",Font.BOLD,17);
     btn.setText("Fixed");
     btn.setBounds(210, 300, 90, 80);
     btn.setVisible(true);
     btn.setFont(font);
     this.add(btn);
          btn.addActionListener(this);
     btn=new JButton();
     font=new Font("Times New Roman",Font.BOLD,17);
     btn.setText("Student");
     btn.setBounds(310, 300, 90, 80);
     btn.setVisible(true);
     btn.setFont(font);
     this.add(btn);
     btn.addActionListener(this);
     
     btn=new JButton();
     font=new Font("Times New Roman",Font.BOLD,17);
     btn.setText("< Back");
     btn.setBounds(5, 418, 90, 25);
     btn.setVisible(true);
     btn.setFont(font);
     this.add(btn);
     btn.addActionListener(this);
     
    }
     @Override
    public void actionPerformed(ActionEvent e)
    {
       String input=e.getActionCommand();
       if(input.compareTo("Current")==0 || input.compareTo("Fixed")==0 || input.compareTo("Saving")==0 || input.compareTo("Student")==0)
       {  
            SignupPage sp=new  SignupPage(this);
            sp.setTitle("Allied Bank Limited - Account Registration");
            sp.setSize(418, 740);
           // sp.getContentPane().setBackground(Color.cyan);
             sp.setIconImage(new ImageIcon(LoginPage3.class.getResource("/pic/logo ablll.png")).getImage());
            sp.setLayout(null);
            sp.setLocationRelativeTo(null);
            sp.setDefaultCloseOperation(3);
            sp.addComp3();
            sp.setVisible(true);
           
       }
       if(input.compareTo("< Back")==0)
       {
           this.dispose();
       }
    }
   
}
