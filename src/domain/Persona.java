package domain;

public class Persona {

    //A esto se lo conoce como una constante. Se recomienda nombrarlas en mayuscula
    public final static int MI_CONSTANTE = 1;
    
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public final void imprimir()//No permite sobreescritura del metodo
    {
        System.out.println("Imprimiendo");
    }

}
