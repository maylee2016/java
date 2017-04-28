package ejemplo;

/**
 * Created by Maylee
 *
 *
 * break -->salirse de un ciclo, dentro de un ciclo for
 * continue --->
 */
public class EjemploBreak {
    public static void main(String[] args){

        for (int var=0; var<=20; var++){
            System.out.println("el valor es:"+var);
            if (var==10){
                break;
            }

            System.out.println("dentro del ciclo");

        }
        System.out.println("fuera de ciclo");

    }

}
