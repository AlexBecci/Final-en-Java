package test;

import domain.Persona;

public class TestFinal {

    public static void main(String[] args) {
        final int miVariable = 10;//No se puede modificar la variable ya que utiliza el FINAL y es un constante entonces
        System.out.println("miVariable = " + miVariable);
        //miVariable = 20;

        //     Persona.MI_CONSTANTE = 5;//No es posible ya que es una constante 
        System.out.println("Mi constante :" + Persona.MI_CONSTANTE);
        
        final Persona persona1 = new Persona();
        //persona1 = new Persona(); No se puede hacer
        
        persona1.setNombre("Alex");
        System.out.println("Persona 1: "+ persona1.getNombre());
        
        persona1.setNombre("Maximiliano");
        System.out.println("Persona 1: "+ persona1.getNombre());
    }

}
