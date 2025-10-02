/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package portafolio1;

import javax.swing.JOptionPane;

/**
 *
 * @author dani1
 */
public class Portafolio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        nombre = JOptionPane.showInputDialog("ingrese su nombre");
        String apellido;
        apellido= JOptionPane.showInputDialog("ingrese su apellido");
        String lectura;
        lectura = JOptionPane.showInputDialog("Digite su salario: ");
        double salario;
        salario = Double.parseDouble(lectura);
        JOptionPane.showMessageDialog(null,"Bienvenido" + nombre);
        if (salario >922.00 ){
        double sem;
        sem= salario*0.0925;
        double ivm;
        ivm= salario*0.0508;
        double impuestoSalarial;
        impuestoSalarial = salario - 2373000*0.2; 
        double total;
        total= sem-ivm-impuestoSalarial;
       JOptionPane.showMessageDialog(null,"Su salario es: " + total );
        
        }
    }
    
}
