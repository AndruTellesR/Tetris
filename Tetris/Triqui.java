
/**
 * Write a description of class Triqui here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triqui
{
   private static String marca;
   private final String ficha1 = "X";
   private final String ficha2 = "O";   
   private String[] fichas = new String[9];

    /**
     * Constructor for objects of class Triqui
     */
    public Triqui()
    {
        // initialise instance variables
        for (int i=0; i<9; i++) {
            fichas[i] = "";
        }
        marca = "O";
    }
    public String getMarca(){
        if(this.marca.equals(ficha1)){
            this.marca = ficha2;
        }else{
            this.marca = ficha1;
        }
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String buscarGanador(){
        if(this.fichas[0].equals(this.fichas[1]) 
            && this.fichas[1].equals(this.fichas[2]) 
            && !this.fichas[2].equals("")){
                return ("Hay un Ganador con la ficha " + this.marca);
            }
            
        if(this.fichas[3].equals(this.fichas[4]) 
            && this.fichas[4].equals(this.fichas[5]) 
            && !this.fichas[5].equals("")){
                return ("Hay un Ganador con la ficha " + this.marca);
            }
        if(this.fichas[6].equals(this.fichas[7]) 
            && this.fichas[7].equals(this.fichas[8]) 
            && !this.fichas[8].equals("")){
                return ("Hay un Ganador con la ficha " + this.marca);
            }
        if((this.fichas[0]+this.fichas[3]+this.fichas[6]).equals("XXX") 
         ||(this.fichas[0]+this.fichas[3]+this.fichas[6]).equals("OOO")
         ||(this.fichas[1]+this.fichas[4]+this.fichas[7]).equals("OOO")
         ||(this.fichas[1]+this.fichas[4]+this.fichas[7]).equals("XXX")
         ||(this.fichas[2]+this.fichas[5]+this.fichas[8]).equals("OOO")
         ||(this.fichas[2]+this.fichas[5]+this.fichas[8]).equals("XXX")){
                return ("Hay un Ganador con la ficha " + this.marca);
            }
        if(this.fichas[0].equals(this.fichas[4]) 
            && this.fichas[4].equals(this.fichas[8]) 
            && !this.fichas[8].equals("")){
                return ("Hay un Ganador con la ficha " + this.marca);
            }
        if(this.fichas[2].equals(this.fichas[4]) 
            && this.fichas[4].equals(this.fichas[6]) 
            && !this.fichas[6].equals("")){
                return ("Hay un Ganador con la ficha " + this.marca);
            }
        return "";
    }
    
    public String marcar(int index){
        this.fichas[index] = this.marca;
        return buscarGanador();
    }
    
    
    
}
