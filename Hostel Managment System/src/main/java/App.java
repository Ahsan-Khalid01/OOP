import javax.swing.JFrame;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        HostelGUI frm = new HostelGUI();
        frm.setTitle("Hostel ROOMS ALLOCATION");
        frm.setSize(1000, 700);
        frm.setLayout(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.addComps();
        //frm.setLocationRelativeTo();
        frm.setVisible(true);
    }
}