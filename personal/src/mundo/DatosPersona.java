package mundo;

/**
 *clase para guardar los datos de una persona
 * @author Juan Carlos Checa
 * @version 0.1
 */
public class DatosPersona {
    /**
     * color de piel
     */
    String colorPiel;
    /**
     * Edad de la persona
     */
    int edad;
    /**
     * Estatura de la perona
     */
    double estatura;
    /**
     * Nombre de la persona 
     */
    String nombre;
    /**
     * peso de la persona
     */
    double peso;
    /**
     * Constructor de la clase 
     * Inicializa los atributos en 0 0 en cadena vacia
     */
    void DatosPersona(){
        colorPiel="";
        edad=0;
        estatura=0.0;
        nombre="";
        peso=0.0;
    } 
    /**
     * contructor de la clase con parametros
     * @param pColorpiel color piel de la  persona
     * @param pEdad edad de la persona
     * @param pEstatuta estatura de la persona
     * @param pNombre nombre de la persona
     * @param pPeso peso de la persona 
     */
    void DatosPersona(String pColorpiel,int pEdad,double pEstatuta,String pNombre,double pPeso){  
        colorPiel=pColorpiel;
        edad= pEdad;
        estatura= pEstatuta;
        nombre=pNombre;
        peso=pPeso;
    } 
    /**
     * Asigna el color de la persona
     * @param pColorPiel 
     */
    public void setColorPiel(String pColorPiel){
        colorPiel=pColorPiel;
    }
    /**
     * Retorna en color piel 
     * @return colorpiel 
     */
    public String getColorPiel(){
        return colorPiel;
    }
    /**
     * Guarda un nuevo valor en el atributo edad
     * @param pEdad 
     */
    public void setedad(int pEdad){
        edad=pEdad;
    }
    /**
     * recupera edad
     * @return edad
     */
     public int getedad(){
        return edad;
    }
    /**
     * Guarda un nuevo valor en el atributo estatura
     * @param pEstatura 
     */
    public void setestatura(double pEstatura){
        estatura=pEstatura;   
    }       
    /**
     * recupera estatura 
     * @return 
     */
    public double getestatura(){
        return estatura;
    }
    /**
     * Asigna el nombre de la persona
     * @param pNombre 
     */
    public void setNombre(String pNombre){
        nombre=pNombre;
    }
    /**
     * Retorna en nombre 
     * @return colorpiel 
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Guarda un nuevo valor en el atributo peso
     * @param pPeso 
     */
      public void setPeso(double pPeso){
          peso=pPeso;   
    }       
    /**
     * recupera peso
     * @return 
     */
      public double getpeso(){
         return peso;
    }
         
}
