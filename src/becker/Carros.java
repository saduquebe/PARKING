/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker;
import becker.robots.*;
/**
 *
 * @author santi
 */
public class Carros {
    public Thing obj;
    private String placa;
    public int zona;
    private int hora;
    private int minutos;
    public Carros(String placa,int hora, int minuto) {
        this.placa = placa;
        this.hora=hora;
        this.minutos=minuto;
    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
 
    public double getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    
    @Override
    public String toString() {
        return "Carros{" + "placa=" + placa + '}';
    }


    
}
