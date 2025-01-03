// Name:Vedaant Ambolkar
// Roll no:5
// Exp no:14




import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Ex14 extends JFrame {

    private Connection connection;
    private DefaultListModel<String> bookListModel;

    public Ex14() {
        setTitle("Computer Science Books");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        bookListModel = new DefaultListModel<>();
        JList<String> bookList = new JList<>(bookListModel);
        JScrollPane scrollPane = new JScrollPane(bookList);
        add(scrollPane, BorderLayout.CENTER);

        JButton loadButton = new JButton("Load Books");
        add(loadButton, BorderLayout.SOUTH);

        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadBooks();
            }
        });

        connectToDatabase();
        createTable();
        insertDummyData();
    }

    private void connectToDatabase() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:books.db");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void createTable() {
        try (Statement stmt = connection.createStatement()) {
            String sql = "CREATE TABLE IF NOT EXISTS books ("
                       + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                       + "title TEXT NOT NULL, "
                       + "author TEXT NOT NULL, "
                       + "year INTEGER NOT NULL)";
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void insertDummyData() {
        String[][] books = {
            {"Introduction to Algorithms", "Thomas H. Cormen", "2009"},
            {"Artificial Intelligence: A Modern Approach", "Stuart Russell", "2010"},
            {"Computer Networks", "Andrew S. Tanenbaum", "2011"},
            {"Clean Code", "Robert C. Martin", "2008"},
            {"Design Patterns", "Erich Gamma", "1994"},
            {"The Pragmatic Programmer", "Andrew Hunt", "1999"},
            {"Operating System Concepts", "Abraham Silberschatz", "2004"},
            {"Database System Concepts", "Abraham Silberschatz", "2011"},
            {"Java: The Complete Reference", "Herbert Schildt", "2014"},
            {"Structure and Interpretation of Computer Programs", "Harold Abelson", "1996"}
        };

        try (PreparedStatement pstmt = connection.prepareStatement("INSERT INTO books (title, author, year) VALUES (?, ?, ?)")) {
            for (String[] book : books) {
                pstmt.setString(1, book[0]);
                pstmt.setString(2, book[1]);
                pstmt.setInt(3, Integer.parseInt(book[2]));
                pstmt.addBatch();
            }
            pstmt.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void loadBooks() {
        bookListModel.clear();
        try (Statement stmt = connection.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM books");
            while (rs.next()) {
                String book = rs.getString("title") + " by " + rs.getString("author") + " (" + rs.getInt("year") + ")";
                bookListModel.addElement(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BookApp().setVisible(true);
            }
        });
    }}
