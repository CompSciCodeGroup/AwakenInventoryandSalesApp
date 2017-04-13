/**
 * Created by Chase on 4/11/2017.
 */

import com.sun.org.apache.bcel.internal.util.ClassPath;

import java.sql.*;

public class SQLTalk {

    public SQLTalk connection;

    public static void main(String args[]) throws SQLException {
        SQLTalk connection = new SQLTalk();

        Connection con = connection.connectDB();

        System.out.println("WE CONNECTED");
        //step3 create the statement object
        Statement stmt=con.createStatement();

        //step4 execute query
        ResultSet rs = stmt.executeQuery("SELECT COLOR FROM INVENTORY");
        while(rs.next())
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));

            //step5 close the connection object
            con.close();
    }

    public Connection connectDB(){
        //step1 load the driver class
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your driver??");
        }

        //step2 create  the connection object
        Connection con= null;
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","awaken","awaken");
        } catch (SQLException e1) {
            e1.printStackTrace();
        }

        return con;
    }

    public void disconnectDB(Connection con){
        //step5 close the connection object
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    public Clothing[] searchItemNumber(String itemNumber) {
        Clothing [] clothes = new Clothing[10000];

        Connection con = connection.connectDB();

        //step3 create the statement object
        Statement stmt= null;
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //step4 execute query
        ResultSet rs= null;
        try {
            rs = stmt.executeQuery("select * from INVENTORY");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
        } catch (SQLException e) {
            e.printStackTrace();
        }

       connection.disconnectDB(con);
        return clothes;
    }

    public Clothing[] searchStyleNumber(String styleNumber) {
        Clothing [] clothes = new Clothing[10000];

        Connection con = connection.connectDB();

        //step3 create the statement object
        Statement stmt= null;
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //step4 execute query
        ResultSet rs= null;
        try {
            rs = stmt.executeQuery("select * from INVENTORY");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        connection.disconnectDB(con);

        return clothes;
    }

    public Clothing[] searchSKU(String sku) {
        Clothing [] clothes = new Clothing[10000];

        Connection con = connection.connectDB();

        //step3 create the statement object
        Statement stmt= null;
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //step4 execute query
        ResultSet rs= null;
        try {
            rs = stmt.executeQuery("select * from INVENTORY");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        connection.disconnectDB(con);

        return clothes;
    }

    public Clothing[] searchStyle(String style) {
        Clothing [] clothes = new Clothing[10000];

        Connection con = connection.connectDB();

        //step3 create the statement object
        Statement stmt= null;
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //step4 execute query
        ResultSet rs= null;
        try {
            rs = stmt.executeQuery("select * from INVENTORY");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        connection.disconnectDB(con);

        return clothes;
    }

    public Clothing[] searchDescription(String description) {
        Clothing [] clothes = new Clothing[10000];

        Connection con = connection.connectDB();

        //step3 create the statement object
        Statement stmt= null;
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //step4 execute query
        ResultSet rs= null;
        try {
            rs = stmt.executeQuery("select * from INVENTORY");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        connection.disconnectDB(con);

        return clothes;
    }

    public Clothing[] searchAll(String input) {
        Clothing[] clothes = new Clothing[10000];

        Connection con = connection.connectDB();

        //step3 create the statement object
        Statement stmt = null;
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //step4 execute query
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery("select * from INVENTORY");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        connection.disconnectDB(con);

        return clothes;
    }

    public void addClothes(String sku){

        Connection con = connection.connectDB();

        //step3 create the statement object
        Statement stmt= null;
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //step4 execute query
        ResultSet rs= null;
        try {
            rs = stmt.executeQuery("select * from INVENTORY");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        connection.disconnectDB(con);
    }

    public void removeClothes(String sku) {
        Connection con = connection.connectDB();

        //step3 create the statement object
        Statement stmt= null;
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //step4 execute query
        ResultSet rs= null;
        try {
            rs = stmt.executeQuery("select * from INVENTORY");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        connection.disconnectDB(con);
    }
}
