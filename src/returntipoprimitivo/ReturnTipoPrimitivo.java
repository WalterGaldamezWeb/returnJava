/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package returntipoprimitivo;

/**
 *
 * @author Walter Galdamez
 */
public class ReturnTipoPrimitivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado = sumar(3,6);
        System.out.println("El resultado es: "+resultado);

        }
        //el metodo retorna un resultado de tipo primitivo int
        public static int sumar(int a,int b){
            return a+b;
        }    
}
