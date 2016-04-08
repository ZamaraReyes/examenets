/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;


public class Calculadora {
    
    private String operador1;
    private String operador2;
    private String operador;

    
    public String getOperador1() {
        return operador1;
    }


    public String getOperador2() {
        return operador2;
    }


    public String getOperacion() {
        return operador;
    }


    public void setOperador1(String operador1) {
        this.operador1 = operador1;
    }


    public void setOperador2(String operador2) {
        this.operador2 = operador2;
    }


    public void setOperacion(String operacion) {
        this.operador = operacion;
    }
    
}
