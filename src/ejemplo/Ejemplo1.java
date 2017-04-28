package ejemplo;

/**
 * Created by Maylee on 28/04/2017.
 */

/**operandos logicos
 * >, <, "", &&, ||, !
 * var1 && var2 -> si las dos son verdaderas da verdadero
 * var1 && var2 -> si una de las var es falsa da falso
 * var1 || var2 -> solo da si las dos son falsos  da falso
 * var1 || var2 -> si una de las var es falsa da verdadero
 * !( (var1 ==6) || (var2==2) )-> nega la operacion ...si da falso lo negara y dara resultado verdadero
 * **/
public class Ejemplo1 {
    public static void main(String[] args){
        /**describir variables**/
        int var=5;
        if(var==5){
            System.out.println("es verdadero");
        } else{
            System.out.println("es falso");
        }
    }
}
