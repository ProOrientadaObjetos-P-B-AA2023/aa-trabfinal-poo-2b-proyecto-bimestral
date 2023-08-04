/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Pablo
 */
public class Factura {
    private int numeroFactura;
    private String fechaEmision;
    private String idCliente;
    private String nombreCliente;
    private String direccionCliente;
    private String ciudadCliente;
    private int idPlan1;
    private int idPlan2;
    private double subtotal;
    private double iva;
    private double totalPagar;

    public Factura() {
    }

    public Factura(int numeroFactura, String fechaEmision, String idCliente, int idPlan1, int idPlan2) {
        this.numeroFactura = numeroFactura;
        this.fechaEmision = fechaEmision;
        this.idCliente = idCliente;
        this.idPlan1 = idPlan1;
        this.idPlan2 = idPlan2;
        this.iva = 12;
    }

    public Factura(int numeroFactura, String fechaEmision, String idCliente, String nombreCliente, String direccionCliente, String ciudadCliente, int idPlan1, int idPlan2) {
        this.numeroFactura = numeroFactura;
        this.fechaEmision = fechaEmision;
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
        this.ciudadCliente = ciudadCliente;
        this.idPlan1 = idPlan1;
        this.idPlan2 = idPlan2;
        this.iva = 12;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getCiudadCliente() {
        return ciudadCliente;
    }

    public void setCiudadCliente(String ciudadCliente) {
        this.ciudadCliente = ciudadCliente;
    }

    public int getIdPlan1() {
        return idPlan1;
    }

    public void setIdPlan1(int idPlan1) {
        this.idPlan1 = idPlan1;
    }

    public int getIdPlan2() {
        return idPlan2;
    }

    public void setIdPlan2(int idPlan2) {
        this.idPlan2 = idPlan2;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void calcularSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void calcularTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    @Override
    public String toString() {
        return "Factura{" + "numeroFactura=" + numeroFactura + ", fechaEmision=" + fechaEmision + ", idCliente=" + idCliente + ", nombreCliente=" + nombreCliente + ", direccionCliente=" + direccionCliente + ", ciudadCliente=" + ciudadCliente + ", idPlan1=" + idPlan1 + ", idPlan2=" + idPlan2 + ", subtotal=" + subtotal + ", iva=" + iva + ", totalPagar=" + totalPagar + '}';
    }

}
