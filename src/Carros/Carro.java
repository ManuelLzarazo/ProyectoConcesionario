
package Carros;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;

@DatabaseTable


public class Carro {
    public static void main (String[] args) throws SQLException{
        String nombreArchivo = "jdbc:h2:./Carros";
        
        ConnectionSource conn = new JdbcConnectionSource(nombreArchivo);
        
        TableUtils.createTableIfNotExists(conn, Carro.class);
        
    
        
    }
    
    @DatabaseField (id = true)
    private int placa;
    
    @DatabaseField
    private String marca;
    
    @DatabaseField
    private String color;
    
    @DatabaseField
    private int cilidraje;
    
    @DatabaseField
    private int modelo;
    
    @DatabaseField
    private int precio;
   
    public Carro() {
    }

    public Carro(int placa, String marca, String color, int cilidraje, int modelo, int precio) {
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.cilidraje = cilidraje;
        this.modelo = modelo;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Carro{" + "placa=" + placa + ", marca=" + marca + ", color=" + color + ", cilidraje=" + cilidraje + ", modelo=" + modelo + ", precio=" + precio + '}';
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca.toUpperCase();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color.toUpperCase();
    }

    public int getCilidraje() {
        return cilidraje;
    }

    public void setCilidraje(int cilidraje) {
        this.cilidraje = cilidraje;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
    
      
    

