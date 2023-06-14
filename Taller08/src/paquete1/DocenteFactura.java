/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author ASUS
 */
public class DocenteFactura extends Docente {
    
    // Declarar
    
    private double valorF;
    private double valorIVA;
    private double valorC;

    public void establecerValorF(double valorF) {
        this.valorF = valorF;
    }

    public void establecerValorIVA(double valorIVA) {
        this.valorIVA = valorIVA;
    }

    public void calcularValorC() {
        this.valorC = valorF - (double)(valorF * valorIVA);
    }

    public double obtenerValorF() {
        return valorF;
    }

    public double obtenerValorIVA() {
        return valorIVA;
    }

    public double obtenerValorC() {
        return valorC;
    }
    
    @Override
    public String toString(){
        String reporte = String.format("Nombres: %s\n"
                + "Id: %s\n"
                + "Valor Factura: %.2f\n"
                + "Valor Iva: %.2f\n"
                + "Valor a cancelar: %.2f\n",
                obtenerNombre(),
                obtenerCedula(),
                valorF,
                valorIVA,
                valorC);
        
        return reporte;
    }
    
}
