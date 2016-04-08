/*
 * Problemas con la generación el Javadoc.
 */
package calculadora;


public class Calculadora {
    
    
    private String operador1;
    private String oper2;
    private String operador;

    
    /**
     * Atributo operador1.
     */
    
    public String getOperador1() {
        return operador1;
    }

    public void setOperador1(String operador1) {
        this.operador1 = operador1;
    }

    /**
     * Atributo oper2.
     */
    
    public String getOperador2() {
        return oper2;
    }
    
    public void setOperador2(String operador2) {
        this.oper2 = operador2;
    }

    
    /**
     * Atributo operador.
     */
    
    public String getOperacion() {
        return operador;
    }

    public void setOperacion(String operacion) {
        this.operador = operacion;
    }
    
    public static void main(String[] args) {
        System.out.println("");
    }
}
