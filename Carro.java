
/**
 * Write a description of class Carro here.
 * 
 * @author (Igocalo) 
 * @version (1.0)
 */
public class Carro
{
    private static final double MAX_GALONES = 40;
    //En esta parte vamos a definir 3 atributos y un valor,1 atributo nos dira si el carro esta o no encendido, siempre seguiremos esta estrucura private gestiona
    //la ocultacion, el tipo de dato, nombre del atributo.
    private String color; //cadena de texto
    private double galones; //porque es tipo decimal
    private boolean encendido;
    private char [] asientos;
    /**
     * Constructor for objects of class Carro
     */
    public Carro()
    {
        // Vamos a darle valor a los atributos en esta seccion (el constructor)
        this.color = "negro"; //usaremos la palabrareserada this que hace referencia a la propia clase
        this.galones = 30.5; 
        this.encendido = false;// por defecto lo dejaremos que no esta arrancado
        this.asientos = new char []{'-','-','-','-'}; //lo que se suele haces es especificar como son estructura
    }

    public Carro(String newColor, double newGalones, boolean newEncendido)
    //que tendremos que hacer con estos atributos que nos pasen aqui? pues tendriamos asignarlos a los atributos de la clase.
    {
        // Vamos a darle valor a los atributos en esta seccion (el constructor)
        this.color = newColor; //usaremos la palabrareserada this que hace referencia a la propia clase
        this.galones = newGalones; 
        this.encendido = newEncendido;// por defecto lo dejaremos que no esta arrancado

    }
    //Para crear los metodos de modificacion partimos desde aca utilizamos la palabra reservada public vamos a tener que agregar void ya  que se utiliza con un
    //modificador el atributo

    public void setColor (String newColor){
        //Se utiliza la nomenclatura set
        this.color = newColor;
    }

    public String getColor(){
        return this.color;
    }

    public void setGalones (double newGalones){
        if(newGalones < MAX_GALONES){
            //Se utiliza la nomenclatura set
            this.galones = newGalones;
        }
    }

    public double getGalones(){
        return this.galones;
    }

    public void setEncendido (boolean newEncendido){
        //Se utiliza la nomenclatura set
        this.encendido = newEncendido;
    }

    public boolean isEncendido(){
        return this.encendido;
    }

    public String toString(){
        String cad = "";
        cad += "El carro tiene los siguientes atributos" ; // el operador+= lo que hace es añadir contenido
        cad += "\t-El color es"+ getColor() + "\n";
        cad += "\t-Tiene en el tanque:" + getGalones() +"\n";
        if(isEncendido() == true){
            cad+= "\t-El carro está encendido";
        }
        else{
            cad+= "\t-El carro está apagado";
        }
        System.out.print(cad);
        return cad; //esto nos va a devolver todo lo que representemos en el metodo

    }

    public void ocuparLugar(int pos){
        this.asientos[pos] = 'x'; //valor que reemplazará al valor declarado en los atributos
    }
}   
