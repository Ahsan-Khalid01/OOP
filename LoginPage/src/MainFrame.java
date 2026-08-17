import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MainFrame extends JFrame{
   

    JLabel lbMain,lbuname,lbpword;
    JTextField txtuname;
    JPasswordField txtpassword;
    JButton btnSignIn, btnClear;
    Font fn;
    Font fnsl;
    public void addComps()
    {
        fn=new Font("Times New Roman",Font.BOLD+Font.ITALIC,24);
        fnsl=new Font("Times New Roman",Font.BOLD+Font.ITALIC,14);
        
        lbMain=new JLabel();
        lbMain.setText("Login");
        lbMain.setFont(fn);
        lbMain.setForeground(Color.WHITE);
        lbMain.setOpaque(true);
        lbMain.setBackground(Color.BLACK);
        lbMain.setBounds(150,80, 120, 40);
        this.add(lbMain);
        
        
        
        lbuname=new JLabel();
        lbuname.setText("User Name");
        lbuname.setBounds(40,160,120,40);
        lbuname.setFont(fnsl);
        lbuname.setOpaque(true);
        this.add(lbuname);
        
        txtuname=new JTextField();
        txtuname.setBounds(180,160,160,40);
        txtuname.setOpaque(true);
        this.add(txtuname);
        
        
         lbpword=new JLabel();
        lbpword.setText("Password");
        lbpword.setBounds(40,240,120,40);
        lbpword.setFont(fnsl);
        lbpword.setOpaque(true);
        this.add(lbpword);
        
        txtpassword=new JPasswordField();
        txtpassword.setBounds(180,240,160,40);
        txtpassword.setOpaque(true);
        this.add(txtpassword);
        
        btnSignIn=new JButton();
        btnSignIn.setText("Sign In");
        btnSignIn.setBounds(60,320,120,40);
        btnSignIn.setOpaque(true);
        this.add(btnSignIn);
        
        btnClear=new JButton();
        btnClear.setText("Clear");
        btnClear.setBounds(220,320,120,40);
        btnClear.setOpaque(true);
        this.add(btnClear);
                
        
    }
    

    


}
