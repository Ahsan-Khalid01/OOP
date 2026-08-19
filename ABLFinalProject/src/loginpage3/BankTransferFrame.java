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
import java.awt.Color;
import static loginpage3.UserAccountFrame.saveHistory;
/**
 *
 * @author Ahsan Khalid
 */
public class BankTransferFrame extends JFrame implements ActionListener
{
    JLabel lbAcc, lbName;
    JTextField accTxt, amountTxt;
    JButton checkBtn, sendBtn;
    
    //private String rName = null;
    String senderUsername;
    String receiverName = "";
    String receiverAcc = "";

    String dbStr = "jdbc:ucanaccess://C:/Users/dcui/Documents/NetBeansProjects/ABLFinalProject/ABLdatabase.accdb";
    BankTransferFrame(String username)
    {
        senderUsername = username;
        lbAcc = new JLabel("Enter Account Number:");
        lbAcc.setBounds(20, 20, 200, 25);
        this.add(lbAcc);

        accTxt = new JTextField();
        accTxt.setBounds(180, 20, 180, 25);
        this.add(accTxt);

        checkBtn = new JButton("Check");
        checkBtn.setBounds(140, 60, 100, 30);
        checkBtn.addActionListener(this);
        this.add(checkBtn);

        lbName = new JLabel("");
        lbName.setBounds(20, 110, 350, 25);
        this.add(lbName);

        amountTxt = new JTextField();
        amountTxt.setBounds(180, 150, 180, 25);
        amountTxt.setVisible(false);
        this.add(amountTxt);

        sendBtn = new JButton("Send");
        sendBtn.setBounds(140, 190, 100, 30);
        sendBtn.setVisible(false);
        sendBtn.addActionListener(this);
        this.add(sendBtn);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
     String cmd = e.getActionCommand();

        if(cmd.equals("Check"))
        {
          String accNo = accTxt.getText().trim();
        if(accNo.length() != 14)
        {
           JOptionPane.showMessageDialog(null, "  Account number must be 14 digits");
              return;
            }

            try
            {
                Connection conn = DriverManager.getConnection(dbStr);
                String query = "SELECT FirstName, LastName FROM CustomerInfo WHERE AccNo=?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setLong(1, Long.parseLong(accNo));

                ResultSet rs = ps.executeQuery();

                if(rs.next())
                {
                    receiverName = rs.getString("FirstName") + " " + rs.getString("LastName");
                    receiverAcc = accNo;

                    lbName.setText("Account Found: " + receiverName);
                    amountTxt.setVisible(true);
                    amountTxt.setToolTipText("Enter Amount");
                    sendBtn.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, " Account not found");
                }

                rs.close();
                ps.close();
                conn.close();
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        else if(cmd.equals("Send"))
        {
            String amtStr = amountTxt.getText().trim();

            if(amtStr.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Enter amount");
                return;
            }

            double amount = Double.parseDouble(amtStr);

            JOptionPane.showMessageDialog(null,"Amount Rs " + amount +" sent successfully to\n" +receiverName +"\nAccount: " + receiverAcc);
                  saveHistory("Transfers Rs " + amtStr);
        }
 }
}

    









