
package dbconnection;
import java.sql.*;
/**
 *
 * @author ComputerArtt
 */
public class DBConnection {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            /*
            The DriverManager class acts as an interface between user and drivers. 
            It keeps track of the drivers that are available and handles 
            establishing a connection between a database and the appropriate driver.
            */
            //getConnection method is used to establish the connection with the specified url, username and password.
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Database","","");
            Statement stmt = con.createStatement();//creates a statement object that can be used to execute SQL queries.
            //The Statement interface provides methods to execute queries with the database. 
            ResultSet rs = stmt.executeQuery("select * from table_1 ");//is used to execute SELECT query. It returns the object of ResultSet
            //The object of ResultSet maintains a cursor pointing to a row of a table. 
            //Initially, cursor points to before the first row.
            while(rs.next())
            {
                System.out.println(rs.getInt("column_1")+"  "+rs.getString("column_2")
                                    + "  " + rs.getInt("column_3"));
            }
            /*
            The metadata means data about data i.e. we can get further information from the data.
            If you have to get metadata of a table like total number of column, column name, 
            column type etc. , ResultSetMetaData interface is useful because it 
            provides methods to get metadata from the ResultSet object. 
            */
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("Total number of columns: "+rsmd.getColumnCount());//total number of columns
            System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1)); 
            System.out.println("Column Type Name of 4th column: "+rsmd.getColumnTypeName(4));  
            /*
            DatabaseMetaData interface provides methods to get meta data of a 
            database such as database product name, database product version
            driver name, name of total number of tables, name of total number of views etc. 
            */
            DatabaseMetaData dbmd = con.getMetaData();
            System.out.println("Driver Name: "+dbmd.getDriverName());
            System.out.println("Driver Version: "+dbmd.getDriverVersion());
            System.out.println("UserName: "+dbmd.getUserName());
            System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());
            System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());
        } catch (Exception e) {
        }
    }
    
}
