package kata5;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Kata5 {

    public static void main(String[] args) throws IOException {
        //SelectApp app = new SelectApp();
        //app.selectAll();
        
        //CrearTabla table = new CrearTabla();
        //table.createNewTable();
        
        String mailRoute = "email.txt";
        mailListReader mlr = new mailListReader();
        mlr.read(mailRoute);
    }
}
