import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HostelSystem {

    public HostelSystem() {
        DatabaseHelper.initializeDatabase();
    }

    public void addStudent(String name, String regNo, String department, String contact) {
        String sql = "INSERT INTO Students (regNo, name, department, contact) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseHelper.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, regNo);
            pstmt.setString(2, name);
            pstmt.setString(3, department);
            pstmt.setString(4, contact);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Student findStudent(String regNo) {
        String sql = "SELECT * FROM Students WHERE regNo = ?";
        try (Connection conn = DatabaseHelper.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, regNo);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return new Student(
                            rs.getString("name"),
                            rs.getString("regNo"),
                            rs.getString("department"),
                            rs.getString("contact")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean allocateRoom(int roomNo, String regNo) {
        if (roomNo < 1 || roomNo > 300) return false;

        Student s = findStudent(regNo);
        if (s == null) return false;

        String checkSql = "SELECT isOccupied FROM Rooms WHERE roomNo = ?";
        String updateSql = "UPDATE Rooms SET isOccupied = True, studentRegNo = ? WHERE roomNo = ?";

        try (Connection conn = DatabaseHelper.getConnection();
             PreparedStatement checkStmt = conn.prepareStatement(checkSql);
             PreparedStatement updateStmt = conn.prepareStatement(updateSql)) {

            checkStmt.setInt(1, roomNo);
            try (ResultSet rs = checkStmt.executeQuery()) {
                if (rs.next() && rs.getBoolean("isOccupied")) {
                    return false; // Already occupied
                }
            }

            updateStmt.setString(1, regNo);
            updateStmt.setInt(2, roomNo);
            int affectedRows = updateStmt.executeUpdate();
            return affectedRows > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deallocateRoom(int roomNo) {
        if (roomNo < 1 || roomNo > 300) return false;

        String updateSql = "UPDATE Rooms SET isOccupied = False, studentRegNo = NULL WHERE roomNo = ?";
        try (Connection conn = DatabaseHelper.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(updateSql)) {
            pstmt.setInt(1, roomNo);
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public String getAllStudents() {
        StringBuilder result = new StringBuilder();
        String sql = "SELECT * FROM Students";
        try (Connection conn = DatabaseHelper.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                result.append(rs.getString("regNo"));
                result.append("\t");
                result.append(rs.getString("name"));
                result.append("\t");
                result.append(rs.getString("department"));
                result.append("\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result.toString();
    }

    public String getAllRooms() {
        StringBuilder result = new StringBuilder();
        String sql = "SELECT r.roomNo, r.isOccupied, s.name FROM Rooms r LEFT JOIN Students s ON r.studentRegNo = s.regNo ORDER BY r.roomNo";
        try (Connection conn = DatabaseHelper.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                int roomNo = rs.getInt("roomNo");
                boolean occupied = rs.getBoolean("isOccupied");
                String studentName = rs.getString("name");
                String status = occupied ? "Occupied" : "Vacant";
                String student = occupied ? (studentName != null ? studentName : "Unknown") : "---";
                result.append("Room ");
                result.append(roomNo);
                result.append("\t");
                result.append(status);
                result.append("\t");
                result.append(student);
                result.append("\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result.toString();
    }

    public String getVacantRooms() {
        StringBuilder result = new StringBuilder();
        String sql = "SELECT roomNo FROM Rooms WHERE isOccupied = False ORDER BY roomNo";
        try (Connection conn = DatabaseHelper.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                result.append("Room ").append(rs.getInt("roomNo")).append("\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result.toString();
    }
}
