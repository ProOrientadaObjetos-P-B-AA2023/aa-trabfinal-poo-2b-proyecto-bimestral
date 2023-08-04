/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Cliente;
import Model.ConexionDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Pablo
 */
public class ControladorCliente {
    private ConexionDB conexionDB;
    private ArrayList<Cliente> listaClientes;

    public ControladorCliente() {
        this.conexionDB = new ConexionDB();
        this.listaClientes = new ArrayList<>();
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public void resgistrarCliente(Cliente cliente) {
        try {
            String sentencia = String.format("insert into Cliente(cedula,nombres,ciudad,direccion,marca,modelo,numero,correo,pagoMensual) values ('%s','%s','%s','%s','%s','%s','%s','%s','%s')",
            cliente.getCedula(),cliente.getNombres(),cliente.getCiudad(),cliente.getDireccion(),cliente.getMarca(),cliente.getModelo(),cliente.getNumero(),cliente.getCorreo(),cliente.getPagoMensual());
            
            this.conexionDB.conectar();
            Statement statement = conexionDB.getConDB().createStatement();
            statement.executeUpdate(sentencia);
            conexionDB.desconectar();

        } catch (SQLException e) {
            System.out.println("ERROR (Registro del Cliente)");
            System.out.println(e.getMessage());
        }
    }

    public void modificarCliente(Cliente cliente) {
        try {
            String sentencia = String.format("update Cliente set nombres = '%s', ciudad = '%s', direccion = '%s', marca = '%s', modelo = '%s', numero = '%s', correo = '%s' where cedula = '%s'",
            cliente.getNombres(),cliente.getCiudad(),cliente.getDireccion(),cliente.getMarca(),cliente.getModelo(),cliente.getNumero(),cliente.getCorreo(),cliente.getCedula());
            
            this.conexionDB.conectar();
            Statement statement = conexionDB.getConDB().createStatement();
            statement.executeUpdate(sentencia);
            conexionDB.desconectar();

        } catch (SQLException e) {
            System.out.println("ERROR (Modificacion del Cliente)");
            System.out.println(e.getMessage());
        }
    }
    
    public void eliminarCliente(String cedula) {
        try {
            String sentencia = String.format("delete from Cliente where cedula = '%s'", cedula);
            
            this.conexionDB.conectar();
            Statement statement = conexionDB.getConDB().createStatement();
            statement.executeUpdate(sentencia);
            conexionDB.desconectar();

        } catch (SQLException e) {
            System.out.println("ERROR (Eliminar Cliente)");
            System.out.println(e.getMessage());
        }
    }

    public void mostrarCliente() {
        try {
            String sentencia = "select * from Cliente";
            
            conexionDB.conectar();
            Statement statement = conexionDB.getConDB().createStatement();
            ResultSet resultSet = statement.executeQuery(sentencia);

            while (resultSet.next()) {
                this.listaClientes.add((new Cliente(resultSet.getString("cedula"), resultSet.getString("nombres"),
                                                  resultSet.getString("ciudad"), resultSet.getString("direccion"),
                                                  resultSet.getString("marca"), resultSet.getString("modelo"),
                                                  resultSet.getString("numero"), resultSet.getString("correo"),
                                                  resultSet.getDouble("pagoMensual"))));
            }
            
        } catch (SQLException e) {
            System.out.println("ERROR (Obtener lista clientes)");
        }

        conexionDB.desconectar();
    }

    public boolean existeCliente(String cedula) {
        boolean respuesta = false;
        
        try {
            String sentencia = "select cedula from Cliente where cedula = '" + cedula + "';";

            this.conexionDB.conectar();
            Statement statement = conexionDB.getConDB().createStatement();
            ResultSet resultSet = statement.executeQuery(sentencia);

            while (resultSet.next()) {
                respuesta = true;
            }

            conexionDB.desconectar();

        } catch (SQLException e) {
            System.out.println("ERROR (Buscar cliente)");
            
        }

        return respuesta;
        
    }

}
