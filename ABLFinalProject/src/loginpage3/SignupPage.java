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
import java.sql.ResultSet;
import java.util.Random;
import java.awt.Color;
/**
 *
 * @author Ahsan Khalid 
 */
public class SignupPage extends JFrame implements ActionListener  {
    JLabel lb;
    JButton btn;
    Font font;
    JTextField Frstntxt,Lntxt,Fathntxt,EAtxt,ContNtxt,Edutxt,Cnictxt,Dobtxt,Citytxt,Countxt,Religtxt,Untxt,cpintxt,repintxt,Accnotxt;
    JPasswordField pswd;
    Frame2 pf;
    SignupPage(Frame2 f)
    {
        pf=f;
    }
    public void addComp3()
    {
         
        lb=new JLabel();
        font=new Font("Times New Roman",Font.BOLD,16);
        lb.setText("First Name");
        lb.setBounds(10, 10,120, 50);
        lb.setFont(font);
        this.add(lb);
        
        lb=new JLabel();
        font=new Font("Times New Roman",Font.BOLD,16);
        lb.setText("Last Name");
        lb.setBounds(10, 50,150, 50);
        lb.setFont(font);
        this.add(lb);
        
        lb=new JLabel();
        font=new Font("Times New Roman",Font.BOLD,16);
        lb.setText("Father Name");
        lb.setBounds(10, 90,150, 50);
        lb.setFont(font);
        this.add(lb);
        
        lb=new JLabel();
        font=new Font("Times New Roman",Font.BOLD,16);
        lb.setText("Email Address");
        lb.setBounds(10, 130,150, 50);
        lb.setFont(font);
        this.add(lb);
        
        lb=new JLabel();
        font=new Font("Times New Roman",Font.BOLD,16);
        lb.setText("Contact Number ");
        lb.setBounds(10, 170,150, 50);
        lb.setFont(font);
        this.add(lb);
        
        lb=new JLabel();
        font=new Font("Times New Roman",Font.BOLD,16);
        lb.setText("CNIC");
        lb.setBounds(10, 210,150, 50);
        lb.setFont(font);
        this.add(lb);
        
        lb=new JLabel();
        font=new Font("Times New Roman",Font.BOLD,16);
        lb.setText("Date of Birth ");
        lb.setBounds(10, 250,150, 50);
        lb.setFont(font);
        this.add(lb);
        
        lb=new JLabel();
        font=new Font("Times New Roman",Font.BOLD,16);
        lb.setText("Country");
        lb.setBounds(10, 290,150, 50);
        lb.setFont(font);
        this.add(lb);
        
        lb=new JLabel();
        font=new Font("Times New Roman",Font.BOLD,16);
        lb.setText("City");
        lb.setBounds(10, 330,150, 50);
        lb.setFont(font);
        this.add(lb);
        
        lb=new JLabel();
        font=new Font("Times New Roman",Font.BOLD,16);
        lb.setText("Relion");
        lb.setBounds(10, 370,150, 50);
        lb.setFont(font);
        this.add(lb);
        
        lb=new JLabel();
        font=new Font("Times New Roman",Font.BOLD,16);
        lb.setText("Education");
        lb.setBounds(10, 410,150, 50);
        lb.setFont(font);
        this.add(lb);
        
        lb=new JLabel();
        font=new Font("Times New Roman",Font.BOLD,16);
        lb.setText("Account Number");
        lb.setBounds(10, 450,150, 50);
        lb.setFont(font);
        this.add(lb);
        
        lb=new JLabel();
        font=new Font("Times New Roman",Font.BOLD,16);
        lb.setText("User Name");
        lb.setBounds(10, 490,150, 50);
        lb.setFont(font);
        this.add(lb);
        
        lb=new JLabel();
        font=new Font("Times New Roman",Font.BOLD,16);
        lb.setText("Create Pin");
        lb.setBounds(10, 530,150, 50);
        lb.setFont(font);
        this.add(lb);
        
       lb=new JLabel();
        font=new Font("Times New Roman",Font.BOLD,16);
        lb.setText("Re Enter Pin");
        lb.setBounds(10, 570,150, 50);
        lb.setFont(font);
        this.add(lb);
        
      /*  lb=new JLabel();
        font=new Font("Times New Roman",Font.BOLD,16);
        lb.setText("Passion");
        lb.setBounds(10, 610,150, 50);
        lb.setFont(font);
        this.add(lb);*/
        
        //text fields area below
        //Fisrt Name 
        Frstntxt=new JTextField();
        Frstntxt.setBounds(150, 25,250,25);
        Frstntxt.setOpaque(true);
        this.add(Frstntxt);
        //Last Name
        Lntxt=new JTextField();
        Lntxt.setBounds(150,65,250,25);
        Lntxt.setOpaque(true);
        this.add(Lntxt);
        
        Fathntxt=new JTextField();
        Fathntxt.setBounds(150,105 ,250,25);
        Fathntxt.setOpaque(true);
        this.add(Fathntxt);
        
        EAtxt=new JTextField();
        EAtxt.setBounds(150,145 ,250,25);
        EAtxt.setOpaque(true);
        this.add(EAtxt);
        
        ContNtxt=new JTextField();
        ContNtxt.setBounds(150,185 ,250,25);
        ContNtxt.setOpaque(true);
        this.add(ContNtxt);
        
        Cnictxt=new JTextField();
        Cnictxt.setBounds(150, 225,250,25);
        Cnictxt.setOpaque(true);
        this.add(Cnictxt);
        
        Dobtxt=new JTextField();
        Dobtxt.setBounds(150,265 ,250,25);
        Dobtxt.setOpaque(true);
        this.add(Dobtxt);
        
        Countxt=new JTextField();
        Countxt.setBounds(150,305,250,25);
        Countxt.setOpaque(true);
        this.add(Countxt);
        
        Citytxt=new JTextField();
        Citytxt.setBounds(150, 345,250,25);
        Citytxt.setOpaque(true);
        this.add(Citytxt);
        
        Religtxt=new JTextField();
        Religtxt.setBounds(150,385 ,250,25);
        Religtxt.setOpaque(true);
        this.add(Religtxt);
        
        Edutxt=new JTextField();
        Edutxt.setBounds(150,425 ,250,25);
        Edutxt.setOpaque(true);
        this.add(Edutxt);
        
     
        Accnotxt=new JTextField();
        Accnotxt.setBounds(150, 465,250,25);
        Accnotxt.setOpaque(true);
        this.add(Accnotxt);
        
        Untxt=new JTextField();
        Untxt.setBounds(150, 505,250,25);
        Untxt.setOpaque(true);
        this.add(Untxt);
        
        cpintxt=new JTextField();
        cpintxt.setBounds(150, 545,250,25);
        cpintxt.setOpaque(true);
        this.add(cpintxt);
        
        repintxt=new JTextField();
        repintxt.setBounds(150, 585,250,25);
        repintxt.setOpaque(true);
        this.add(repintxt);
        
        /*txt=new JTextField();
        txt.setBounds(150, 625,250,25);
        txt.setOpaque(true);
        this.add(txt);*/
        
        btn=new JButton();
        btn.setText("< Back");
        btn.setBounds(10, 667, 80, 25);
        btn.setVisible(true);
        btn.addActionListener(this);
        this.add(btn);
        
        btn=new JButton();
        btn.setText("Next >");
        btn.setBounds(195, 667, 80, 25);
        btn.setVisible(true);
        btn.addActionListener(this);
        this.add(btn);
        
        btn=new JButton();
        btn.setText("Clear");
        btn.setBounds(293, 667, 80, 25);
        btn.setVisible(true);
        this.add(btn);
        
        btn=new JButton();
        btn.setText("Theme");
        btn.setBounds(95, 667, 80, 25);
        btn.setVisible(true);
        this.add(btn);
        btn.addActionListener(this);
        
        
    }
    String dbStr ="jdbc:ucanaccess://C:/Users/dcui/Documents/NetBeansProjects/ABLFinalProject/ABLdatabase.accdb";

    /*String dbStr="jdbc:ucanaccess://ABLdatabase.accdb";
    Connection.conn;*/
   Connection conn;
     

    @Override
    public void actionPerformed(ActionEvent e) {
        try
        {
        String input=e.getActionCommand();
        if(input.compareTo("< Back")==0)
         {
             //this.setVisible(false);
            this.dispose();
         }
        if(input.compareTo("Theme")==0)
        {
            Random rd=new Random();
            int r=rd.nextInt(255);
            int a=rd.nextInt(255);
            int b=rd.nextInt(255);
            Color c=new Color(r,a,b);
            this.getContentPane().setBackground(c);
            
            
        }
        if(input.compareTo("Next >")==0)
        {
           conn=DriverManager.getConnection(dbStr);
           String query="insert into CustomerInfo(FirstName,LastName,FatherName,EmailAddress,ContactNumber,CNIC,DateOfBirth,Country,City,Religon,Education,AccNo,UserName,Pin)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
           PreparedStatement stat=conn.prepareStatement(query);
           stat.setString(1,this.Frstntxt.getText());
           stat.setString(2,this.Lntxt.getText());
           stat.setString(3,this.Fathntxt.getText());
           stat.setString(4,this.EAtxt.getText());
           long contact=Long.parseLong(this.ContNtxt.getText().trim());
           stat.setLong(5,contact);
           long cnic=Long.parseLong(this.Cnictxt.getText());
           if(Long.toString(cnic).length()==14)
           {
             stat.setLong(6, cnic);
           }
           else
           {
               JOptionPane.showMessageDialog(null, "Invalid CNIC! must be 14 Digit");
           }
           
           stat.setString(7, this.Dobtxt.getText());
           stat.setString(8, this.Countxt.getText());
           stat.setString(9, this.Citytxt.getText());
           stat.setString(10,this.Religtxt.getText());
           stat.setString(11, this.Edutxt.getText());
           long accno=Long.parseLong(this.Accnotxt.getText().trim());
           if(Long.toString(accno).length()==14)
           {       
           stat.setLong(12, accno);
           }
           else
           {
             JOptionPane.showMessageDialog(null, "Invalid Account Number! must be 14 digits");
           
           }
           stat.setString(13, this.Untxt.getText());
           int pin=Integer.parseInt(this.cpintxt.getText().trim());
           int repin=Integer.parseInt(this.repintxt.getText());
           if(Integer.toString(pin).length()==5)
           {
               if(pin==repin)
               {
                   stat.setInt(14,pin);
               }else
               {
                   JOptionPane.showMessageDialog(null,"Pin Mismatch");
               }
           }
           else{
               JOptionPane.showMessageDialog(null,"Invalid Pin! pin must be 5 digits");
           
           }
          // JOptionPane.showMessageDialog(Allied Bank Limited, "Account Created Successfully");
           stat.executeUpdate();
           JOptionPane.showMessageDialog(rootPane, "Account Created Successfully");

           conn.close();
           stat.close();
        }
       
    }
    
    catch(Exception ex)
    {
        System.out.println(ex.getMessage());
    }
    }
    }
