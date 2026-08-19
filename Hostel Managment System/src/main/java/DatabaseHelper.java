import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseHelper {
    private static final String DB_URL = "jdbc:ucanaccess://hostel.accdb;showSchema=true;immediatelyReleaseResources=true;newDatabaseVersion=V2010";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        } catch (ClassNotFoundException e) {
            System.err.println("UCanAccess Driver not found. Make sure ucanaccess jar and its dependencies are in the classpath.");
        }
        return DriverManager.getConnection(DB_URL);
    }

    public static void initializeDatabase() {
        String createStudentTable = "CREATE TABLE Students (" +"regNo TEXT(20) PRIMARY KEY, " + "name TEXT(100), " + "department TEXT(100), " + "contact TEXT(20))";

        String createRoomTable = "CREATE TABLE Rooms (" + "roomNo INT PRIMARY KEY, " + "isOccupied YESNO, " + "studentRegNo TEXT(20))";

        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement()) {
            
            // Check if tables exist by trying to select from them (simple check for MS Access)
            try {
                stmt.executeQuery("SELECT TOP 1 * FROM Students");
            } catch (SQLException e) {
                stmt.execute(createStudentTable);
                System.out.println("Students table created.");
            }

            try {
                stmt.executeQuery("SELECT TOP 1 * FROM Rooms");
            } catch (SQLException e) {
                stmt.execute(createRoomTable);
                System.out.println("Rooms table created.");
                // Initialize rooms
                for (int i = 1; i <= 300; i++) {
                    stmt.execute("INSERT INTO Rooms (roomNo, isOccupied, studentRegNo) VALUES (" + i + ", False, NULL)");
                }
                System.out.println("300 rooms initialized.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
