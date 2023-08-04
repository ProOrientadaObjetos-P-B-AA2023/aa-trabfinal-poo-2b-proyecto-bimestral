/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Model.ConexionDB;
import Model.Factura;
import Model.PlanPostPagoMegas;
import Model.PlanPostPagoMinutos;
import Model.PlanPostPagoMinutosMegas;
import Model.PlanPostPagoMinutosMegasEconomico;

/**
 *
 * @author Pablo
 */
public class ControladorPlanes {
    private ConexionDB conexionDB;
    private ArrayList<Factura> listaFacturas;

    public ControladorPlanes() {
        this.conexionDB = new ConexionDB();
        this.listaFacturas = new ArrayList<>();
    }

    public ConexionDB getConexionDB() {
        return conexionDB;
    }

    public void setConexionDB(ConexionDB conexionDB) {
        this.conexionDB = conexionDB;
    }

    public ArrayList<Factura> getListaFacturas() {
        return listaFacturas;
    }

    public void setListaFacturas(ArrayList<Factura> listaFacturas) {
        this.listaFacturas = listaFacturas;
    }

    public void registrarPlan_PlanPostPagoMinutosMegasEconomico(double minutos, double costoMinuto, double megasEnGigas, double costoGiga, double porcentajeDescuento, String nombre, String idCliente) {
        
        PlanPostPagoMinutosMegasEconomico plan = new PlanPostPagoMinutosMegasEconomico(minutos,costoMinuto,megasEnGigas,costoGiga,porcentajeDescuento,0,nombre,idCliente,0);
        plan.calcularCostoTotal();

        String sentencia = String.format("insert into PlanPostPagoMinutosMegasEconomico(nombre,idCliente,minutos,costoMinuto,megasEnGigas,costoGiga,porcentajeDescuento,costoTotal) values ('%s','%s','%.2f','%.2f','%.2f','%.2f','%.2f','%.2f')",
        plan.getNombre(),plan.getIdCliente(),plan.getMinutos(),plan.getCostoMinuto(),plan.getMegasEnGigas(),plan.getCostoGiga(),plan.getPorcentajeDescuento(),plan.getCostoTotal());
        
        try {
            this.conexionDB.conectar();
            Statement statement = conexionDB.getConDB().createStatement();
            statement.executeQuery(sentencia);
            conexionDB.desconectar();

        } catch (SQLException e) {
            System.out.println("ERROR (Registro Plan Movil PlanPostPagoMinutosMegasEconomico)");
            System.out.println(e.getMessage());
        }
    }

    public void registrarPlan_PlanPostPagoMinutos(double minutos, double costoMinuto, double minutosInternacionales, double costoMinutoInternacional, String nombre, String idCliente) {
        
        PlanPostPagoMinutos plan = new PlanPostPagoMinutos(minutos,costoMinuto,minutosInternacionales,costoMinutoInternacional,0,nombre,idCliente,0);
        plan.calcularCostoTotal();

        String sentencia = String.format("insert into PlanPostPagoMinutos(nombre,idCliente,minutos,costoMinuto,minutosInternacionales,costoMinutoInternacional,costoTotal) values ('%s','%s','%.2f','%.2f','%.2f','%.2f','%.2f')",
        plan.getNombre(),plan.getIdCliente(),plan.getMinutos(),plan.getCostoMinuto(),plan.getMinutosInternacionales(),plan.getCostoMinutoInternacional(),plan.getCostoTotal());
        
        try {
            this.conexionDB.conectar();
            Statement statement = conexionDB.getConDB().createStatement();
            statement.executeQuery(sentencia);
            conexionDB.desconectar();

        } catch (SQLException e) {
            System.out.println("ERROR (Registro Plan Movil PlanPostPagoMinutos)");
            System.out.println(e.getMessage());
        }
    }

    public void registrarPlan_PlanPostPagoMegas(double megasEnGigas, double costoGiga, double tarifaBase, String nombre, String idCliente) {
        
        PlanPostPagoMegas plan = new PlanPostPagoMegas(megasEnGigas,costoGiga,tarifaBase,0,nombre,idCliente,0);
        plan.calcularCostoTotal();

        String sentencia = String.format("insert into PlanPostPagoMegas(nombre,idCliente,megasEnGigas,costoGiga,tarifaBase,costoTotal) values ('%s','%s','%.2f','%.2f','%.2f','%.2f')",
        plan.getNombre(),plan.getIdCliente(),plan.getMegasEnGigas(),plan.getCostoGiga(),plan.getTarifaBase(),plan.getCostoTotal());
        
        try {
            this.conexionDB.conectar();
            Statement statement = conexionDB.getConDB().createStatement();
            statement.executeQuery(sentencia);
            conexionDB.desconectar();

        } catch (SQLException e) {
            System.out.println("ERROR (Registro Plan Movil PlanPostPagoMegas)");
            System.out.println(e.getMessage());
        }
    }

    public void registrarPlan_PlanPostPagoMinutosMegas(double minutos, double costoMinuto, double megasEnGigas, double costoGiga, String nombre, String idCliente) {

        PlanPostPagoMinutosMegas plan = new PlanPostPagoMinutosMegas(minutos,costoMinuto,megasEnGigas,costoGiga,0,nombre,idCliente,0);

        String sentencia = String.format("insert into PlanPostPagoMinutosMegas(nombre,idCliente,minutos,costoMinuto,megasEnGigas,costoGiga,costoTotal) values ('%s','%s','%.2f','%.2f','%.2f','%.2f','%.2f')",
        plan.getNombre(),plan.getIdCliente(),plan.getMinutos(),plan.getCostoMinuto(),plan.getMegasEnGigas(),plan.getCostoGiga(),plan.getCostoTotal());
        
        try {
            this.conexionDB.conectar();
            Statement statement = conexionDB.getConDB().createStatement();
            statement.executeQuery(sentencia);
            conexionDB.desconectar();

        } catch (SQLException e) {
            System.out.println("ERROR (Registro Plan Movil PlanPostPagoMinutosMegas)");
            System.out.println(e.getMessage());
        }
    }
}
