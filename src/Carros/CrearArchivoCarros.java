
package Carros;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;


public class CrearArchivoCarros {
    public static void main (String[] args) throws SQLException{
        String nombreArchivo = "jdbc:h2:./Carros";
        
        ConnectionSource conn = new JdbcConnectionSource(nombreArchivo);
      
        TableUtils.createTableIfNotExists(conn, Carro.class);
        
        
        
    }
    
}

