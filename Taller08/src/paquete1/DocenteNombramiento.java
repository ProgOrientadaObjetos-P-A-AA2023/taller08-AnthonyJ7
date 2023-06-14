/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author ASUS
 */
public class DocenteNombramiento extends Docente {
    
    private double valorSueldo;
    private double valorHoraExtra;
    private int numeroHorasE;
    private double sueldo;

    public void establecerValorSueldo(double valorSueldo) {
        this.valorSueldo = valorSueldo;
    }

    public void establecerHoraExtra(double horaExtra) {
        this.valorHoraExtra = horaExtra;
    }

    public void establecerNumeroHorasE(int numeroHorasE) {
        this.numeroHorasE = numeroHorasE;
    }

    public void calcularSueldo() {
        this.sueldo = valorSueldo + (valorHoraExtra * numeroHorasE);
    }

    public double obtenerValorSueldo() {
        return valorSueldo;
    }

    public double obtenerHoraExtra() {
        return valorHoraExtra;
    }

    public int obtenerNumeroHorasE() {
        return numeroHorasE;
    }

    public double obtenerSueldo() {
        return sueldo;
    }
    
    @Override
    public String toString(){
        String reporte = String.format("Nombres: %s\n"
                + "Id: %s\n"
                + "Valor Sueldo: %.2f\n"
                + "Horas Extra: %.2f\n"
                + "Numero de Horas Extra: %d\n"
                + "Sueldo: %.2f\n",
                obtenerNombre(),
                obtenerCedula(),
                valorSueldo,
                valorHoraExtra,
                numeroHorasE,
                sueldo);
        return reporte;
    }
    
}
