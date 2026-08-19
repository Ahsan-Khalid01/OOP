import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HostelGUI extends JFrame implements ActionListener {

    // Labels
    JLabel lbMain, lbName, lbReg, lbDept, lbContact, lbRoom, lbRoomReg;

    // TextFields
    JTextField txtName, txtReg, txtDept, txtContact, txtRoom, txtRoomReg;

    // Buttons
    JButton btnAddStudent, btnViewStudents, btnAllocate, btnDeallocate, btnShowRooms, btnVacant, btnExit;

    // Display
    JTextArea display;

    // Fonts
    Font fnTitle, fnLabel;

    // Hostel System
    HostelSystem hostel = new HostelSystem();

    public void addComps() {
        fnTitle = new Font("Times New Roman", Font.BOLD + Font.ITALIC, 24);
        fnLabel = new Font("Times New Roman", Font.BOLD, 16);


        lbMain = new JLabel(" HOSTEL ROOM  ALLOCATION", JLabel.CENTER);
        lbMain.setFont(fnTitle);
        lbMain.setOpaque(true);
        lbMain.setBackground(Color.blue);
        lbMain.setForeground(Color.white);
        lbMain.setBounds(250, 20, 500, 50);
        add(lbMain);


        lbName = new JLabel("Name:");
        lbName.setBounds(40, 100, 100, 30);
        lbName.setFont(fnLabel);
        add(lbName);

        txtName = new JTextField();
        txtName.setBounds(150, 100, 200, 30);
        add(txtName);

        lbReg = new JLabel("Reg No:");
        lbReg.setBounds(40, 140, 100, 30);
        lbReg.setFont(fnLabel);
        add(lbReg);

        txtReg = new JTextField();
        txtReg.setBounds(150, 140, 200, 30);
        add(txtReg);

        lbDept = new JLabel("Department:");
        lbDept.setBounds(40, 180, 100, 30);
        lbDept.setFont(fnLabel);
        add(lbDept);

        txtDept = new JTextField();
        txtDept.setBounds(150, 180, 200, 30);
        add(txtDept);

        lbContact = new JLabel("Contact:");
        lbContact.setBounds(40, 220, 100, 30);
        lbContact.setFont(fnLabel);
        add(lbContact);

        txtContact = new JTextField();
        txtContact.setBounds(150, 220, 200, 30);
        add(txtContact);

        btnAddStudent = new JButton("Add Student");
        btnAddStudent.setBounds(40, 270, 140, 35);
        btnAddStudent.addActionListener(this);
        btnAddStudent.setForeground(Color.BLACK);
        btnAddStudent.setBackground(Color.YELLOW);
        add(btnAddStudent);

        btnViewStudents = new JButton("View Students");
        btnViewStudents.setBounds(210, 270, 140, 35);
        btnViewStudents.addActionListener(this);
        btnViewStudents.setBackground(Color.BLUE);
        btnViewStudents.setForeground(Color.WHITE);
        add(btnViewStudents);


        lbRoom = new JLabel("Room No:");
        lbRoom.setBounds(450, 100, 100, 30);
        lbRoom.setFont(fnLabel);
        add(lbRoom);

        txtRoom = new JTextField();
        txtRoom.setBounds(550, 100, 150, 30);
        add(txtRoom);

        lbRoomReg = new JLabel("Student Reg No:");
        lbRoomReg.setBounds(450,140 , 200, 30);
        lbRoomReg.setFont(fnLabel);
        add(lbRoomReg);

        txtRoomReg = new JTextField();
        txtRoomReg.setBounds(580, 140, 120, 30);
        add(txtRoomReg);

        btnAllocate = new JButton("Allocate Room");
        btnAllocate.setBounds(450, 180, 130, 35);
        btnAllocate.addActionListener(this);
        btnAllocate.setForeground(Color.BLACK);
        btnAllocate.setBackground(Color.RED);
        add(btnAllocate);

        btnDeallocate = new JButton("Deallocate Room");
        btnDeallocate.setBounds(600, 180, 200, 35);
        btnDeallocate.addActionListener(this);
        btnDeallocate.setBackground(Color.GREEN);
        btnDeallocate.setForeground(Color.WHITE);
        add(btnDeallocate);


        display = new JTextArea();
        display.setFont(new Font("Arial", Font.PLAIN, 13));
        display.setEditable(false);
        display.setBackground(Color.ORANGE);
        JScrollPane sp = new JScrollPane(display);
        sp.setBounds(40, 330, 740, 280);
        add(sp);

        btnShowRooms = new JButton("Show All Rooms");
        btnShowRooms.setBounds(100, 620, 140, 30);
        btnShowRooms.addActionListener(this);
        btnShowRooms.setForeground(Color.magenta);
        btnShowRooms.setBackground(Color.GREEN);
        add(btnShowRooms);

        btnVacant = new JButton("Vacant Rooms");
        btnVacant.setBounds(280, 620, 140, 30);
        btnVacant.addActionListener(this);
        btnVacant.setForeground(Color.RED);
        btnVacant.setBackground(Color.orange);
        add(btnVacant);

        btnExit = new JButton("Exit");
        btnExit.setBounds(600, 620, 140, 30);
        btnExit.addActionListener(this);
        btnExit.setBackground(Color.GRAY);
        btnExit.setForeground(Color.yellow);
        add(btnExit);


        display.setText(hostel.getAllRooms());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.equals("Add Student")) {
            if (txtName.getText().isEmpty() || txtReg.getText().isEmpty() || txtDept.getText().isEmpty() || txtContact.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Fill all fields!");
                return;
            }
            hostel.addStudent(txtName.getText(), txtReg.getText(), txtDept.getText(), txtContact.getText());
            JOptionPane.showMessageDialog(this, "Student Added: " + txtName.getText());
            txtName.setText(""); txtReg.setText(""); txtDept.setText(""); txtContact.setText("");

        } else if (cmd.equals("View Students")) {
            String all = hostel.getAllStudents();
            JOptionPane.showMessageDialog(this, all.isEmpty() ? "No students registered" : all);

        } else if (cmd.equals("Allocate Room")) {
            try {
                int roomNo = Integer.parseInt(txtRoom.getText());
                if (hostel.allocateRoom(roomNo, txtRoomReg.getText()))
                    JOptionPane.showMessageDialog(this, "Room Allocated!");
                else
                    JOptionPane.showMessageDialog(this, "Allocation Failed!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Invalid input!");
            }
            display.setText(hostel.getAllRooms());

        } else if (cmd.equals("Deallocate Room")) {
            try {
                int roomNo = Integer.parseInt(txtRoom.getText());
                if (hostel.deallocateRoom(roomNo))
                    JOptionPane.showMessageDialog(this, "Room Deallocated!");
                else
                    JOptionPane.showMessageDialog(this, "Room is already vacant!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Invalid input!");
            }
            display.setText(hostel.getAllRooms());

        } else if (cmd.equals("Show All Rooms")) {
            display.setText(hostel.getAllRooms());

        } else if (cmd.equals("Vacant Rooms")) {
            display.setText("VACANT ROOMS:\n\n" + hostel.getVacantRooms());

        } else if (cmd.equals("Exit")) {
            System.exit(0);
        }
    }
}
