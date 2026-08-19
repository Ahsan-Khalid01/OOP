/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginpage3;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
/**
 *
 * @author Ahsan Khalid
 */
public class UserAccountFrame extends JFrame implements ActionListener
{
    JLabel lbimage,welcomeLabel, balanceLabel,lbline;
    JButton depositBtn, transferBtn, billPayBtn;
    String username;
    public static double balance = 10000.0;
    public static int pin = 12345;
  //  private string t1;
    //t1="";
    //private static String t1 = "";
    //private static String t2 = "";
    static String  t1 =  "";
     static String t2 = "";
     static String t3 = "";
     static String t4 = "";
     static String t5 = "";

    public static void saveHistory(String msg)
    {
      t5 =  t4;
       t4 =  t3;
       t3 =  t2;
       t2 =  t1;
       t1 =  msg;
        }
    
    public UserAccountFrame(String username)
    {
       
       // addComponents();
        this.username = username;
           addComponents();
    }
   

    public void addComponents()
    {
        this.getContentPane().setBackground(Color.WHITE);
        ImageIcon icon1=new ImageIcon("C:\\Users\\dcui\\Documents\\NetBeansProjects\\ABLFinalProject\\cropTopLogo.jpg");
        lbimage=new JLabel();
        lbimage.setIcon(icon1);
        lbimage.setBounds(1, 1, 1686, 31);
        lbimage.setVisible(true);
        this.add(lbimage);
        
        ImageIcon icon2=new ImageIcon("C:\\Users\\dcui\\Documents\\NetBeansProjects\\ABLFinalProject\\qrcode.png");
        lbimage=new JLabel();
        lbimage.setIcon(icon2);
        lbimage.setBounds(256,20,140 , 120);
        lbimage.setVisible(true);
        this.add(lbimage);

        Font font = new Font("Times New Roman", Font.BOLD, 18);

        welcomeLabel = new JLabel("Welcome! " + username); 
        welcomeLabel.setBounds(5, 40, 400, 30);
        welcomeLabel.setFont(font);
        this.add(welcomeLabel);

        balanceLabel = new JLabel(" Rs : " + balance);
        balanceLabel.setBounds(5, 75, 400, 30);
        balanceLabel.setFont(font);
        this.add(balanceLabel);
        
        Font fontline = new Font("Times New Roman", Font.BOLD, 22);
        Color c=Color.ORANGE;
        lbline = new JLabel("-------------------------------------------------------------------");
        lbline.setBounds(1, 150, 400, 5);
        lbline.setFont(font);
        lbline.setForeground(c);
        this.add(lbline);
       
      

        depositBtn = new JButton("Deposit");
        depositBtn.setBounds(5, 165, 90, 90);
        depositBtn.addActionListener(this);
        //depositBtn.setForeground(c);
        //depositBtn.setFont(font);
        this.add(depositBtn);

        transferBtn = new JButton("Transfer");
        transferBtn.setBounds(105, 165, 90, 90);
        transferBtn.addActionListener(this);
        this.add(transferBtn);

        billPayBtn = new JButton("Payment");
        billPayBtn.setBounds(205, 165, 90, 90);
        billPayBtn.addActionListener(this);
        this.add(billPayBtn);
        
         billPayBtn = new JButton("T History");
        billPayBtn.setBounds(305, 165, 90, 90);
        billPayBtn.addActionListener(this);
        this.add(billPayBtn);
        
         billPayBtn = new JButton("Raast");
        billPayBtn.setBounds(5, 275, 90, 90);
        billPayBtn.addActionListener(this);
        this.add(billPayBtn);
        
         billPayBtn = new JButton("Tickets");
        billPayBtn.setBounds(105, 275, 90, 90);
        billPayBtn.addActionListener(this);
        this.add(billPayBtn);
        
         billPayBtn = new JButton("Loan");
        billPayBtn.setBounds(205, 275, 90, 90);
        billPayBtn.addActionListener(this);
        this.add(billPayBtn);
        
         billPayBtn = new JButton("Invesments");
        billPayBtn.setBounds(305, 275, 90, 90);
        billPayBtn.addActionListener(this);
        this.add(billPayBtn);
        
         billPayBtn = new JButton("Cards");
        billPayBtn.setBounds(5, 385, 90, 90);
        billPayBtn.addActionListener(this);
        this.add(billPayBtn);
        
         billPayBtn = new JButton("PTM");
        billPayBtn.setBounds(105, 385, 90, 90);
        billPayBtn.addActionListener(this);
        this.add(billPayBtn);
        
         billPayBtn = new JButton("Loyality");
        billPayBtn.setBounds(205, 385, 90, 90);
        billPayBtn.addActionListener(this);
        this.add(billPayBtn);
        
         billPayBtn = new JButton("WithDraw");
        billPayBtn.setBounds(305, 385, 90, 90);
        billPayBtn.addActionListener(this);
        this.add(billPayBtn);
        
        
         billPayBtn = new JButton("< Back");
        billPayBtn.setBounds(5, 580, 80, 30);
        billPayBtn.addActionListener(this);
        this.add(billPayBtn);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String cmd = e.getActionCommand();
        if(cmd.equals("Deposit"))
        {
            String amountStr = JOptionPane.showInputDialog("Enter amount to deposit:");
            if(amountStr != null)
            {
                double amt = Double.parseDouble(amountStr);
                balance += amt;
                balanceLabel.setText("Rs " + balance);
                // saveHistory( amt);
                JOptionPane.showMessageDialog(null, "Amount Deposited Successfully!");
              //  balance += amt;
               // balanceLabel.setText("Rs " + balance);
              saveHistory("Deposit Rs " + amt);
        }
        }
        else if(cmd.equals("Transfer"))
        {
           //JOptionPane.showMessageDialog(null, "Money Transfer buttom  clicked");
   
    TransferOptionFrame tf = new TransferOptionFrame(username);
    tf.setTitle(" Allied Bank Limited");
    tf.setSize(350, 200);
    tf.setLayout(null);
    tf.setLocationRelativeTo(null);
    tf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    tf.setVisible(true);

        
        }
        else if(cmd.equals("Bill Payment"))
        {
            JOptionPane.showMessageDialog(null, "Bill Payments Feataure Coming Soon...");
        }
        else if(cmd.equals("< Back"))
        {
            this.dispose();
        }
        else if(cmd.equals("WithDraw")) 
        {
    
    String pinStr = JOptionPane.showInputDialog("Enter PIN");

    if(pinStr == null)
    {
   
      return;
    }
    int enteredPin = Integer.parseInt(pinStr);
    if(enteredPin ==pin)
    {
        String amtStr =  JOptionPane.showInputDialog(null,"  Enter a Withdraw Amount");
        double amt = Double.parseDouble(amtStr);
        if(amt <= balance)
        {
            balance -=  amt;
            balanceLabel.setText("Rs " + balance);
           //  saveHistory( amt);
            saveHistory("Withdraw Rs " + amt);
        //JOptionPane.showMessageDialog("Alleid Bank Limited", "   Withdraw Money Successfull   ");
    JOptionPane.showMessageDialog(null, "   Withdrawl Successfull:   ");
        }
        else
        {
            JOptionPane.showMessageDialog(null, " Insufficient Balance  !  ");
        }
    }
    else
    {
     JOptionPane.showMessageDialog(null, " Wrong PIN ! ");
    }
}
        
 else if(cmd.equals("T History"))
{
    String msg = "Last Transactions:\n\n";;
    //if(t1.equals(""))&& msg += t1 + "\n";
    if( !t1.equals(""))
    { 
        msg += t1 + " \n\n ";
 }
    
    if( !t2.equals(""))
    {
        msg += t2 + " \n";
    }
    if(!t3.equals(""))
    {
        msg += t3 + "\n";
    }
    
    if(!t4.equals(""))
    { 
        msg += t4 + " \n";
    }
    if(!t5.equals("") )
    {
        msg += t5 + "\n";
    }
    

    if(msg.equals("Last Transactions:\n\n"))
    {
      
        msg = " No Transaction yet..";
    }
    
    //JOptionPane.showMessageDialog(null,"No Transaction Available...");
            JOptionPane.showMessageDialog(null, msg);
}

    else if(cmd.equals("Loan"))
{
    LoanFrame lf= new LoanFrame();
}
        else if(cmd.equals("Bill Payment")  || cmd.equals("Raast") ||cmd.equals("Tickets") ||cmd.equals("Invesments") ||cmd.equals("Cards") ||cmd.equals("PTM") || cmd.equals("Loyality"))
    {
        JOptionPane.showMessageDialog(this, "  This feature is coming soon..........");
    }

}
}

    



    


    

