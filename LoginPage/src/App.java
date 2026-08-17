import javax.swing.JFrame;
public class App {
    public static void main(String[] args)  {
        //System.out.println("Hello, World!");
        MainFrame mf=new MainFrame();
        mf.setSize(400, 600);
        mf.setTitle("My First GUI Application");
      //  mf.setVisible(true);
        mf.setLayout(null);
        mf.setLocationRelativeTo(null);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         mf.addComps();
           mf.setVisible(true);


    }
}
