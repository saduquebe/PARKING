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
    private String placa;

    public Carros(String placa) {
        this.placa = placa;
    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Carros{" + "placa=" + placa + '}';
    }


    
}
