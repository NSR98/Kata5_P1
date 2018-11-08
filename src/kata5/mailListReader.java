package kata5;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class mailListReader {
    
    public void read (String name) throws FileNotFoundException, IOException {
        File file = new File(name);
        FileReader fr = new FileReader(file);
        String mail = "";
        InsertarDatosTabla insertTable = new InsertarDatosTabla();
        
        try (BufferedReader br = new BufferedReader(fr)) {
            while((mail=br.readLine()) != null) {
                if (mail.contains("@")) {
                    insertTable.insert(mail);                    
                }
            }
            br.close();
            fr.close();
        }
    } 
}
