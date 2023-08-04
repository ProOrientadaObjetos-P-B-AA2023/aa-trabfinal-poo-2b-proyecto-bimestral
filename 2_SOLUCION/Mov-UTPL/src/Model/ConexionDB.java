package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private Connection conDB;

    public ConexionDB() {
    }

    public Connection getConDB() {
        return this.conDB;
    }

    public void setConDB(Connection conDB) {
        this.conDB = conDB;
    }

    public void conectar() {
        try {
            this.conDB = DriverManager.getConnection("jdbc:sqlite:./db/data-Telefonia.db");
        } catch (SQLException e) {
            System.out.println("ERROR (Conexion con Base de Datos)");
        }
    }

    public void desconectar() {
        try {
            if (conDB != null) {
                if (conDB.isClosed() == false) {
                    conDB.close();
                }
            }
        } catch (SQLException e) {
            System.out.println("ERROR (Desconeccion con Base de Datos)");
        }
    }

}
