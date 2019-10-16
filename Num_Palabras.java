
package practica;
import java.util.*;
public class Num_Palabras {
    
     public int numerodepalabras(String cadena){
   String caracter = "a";
   int numeroveces=0;
  String palabras[]= cadena.split(" ") ;
       for (int i = 0; i < palabras.length  ; i++) {
        if (palabras[i].contains(caracter)){
        numeroveces ++;
        }
       }
       return numeroveces;
   } 

    public static void main(String[] args) {
        Num_Palabras obj =new Num_Palabras();
        
        
        System.out.println(obj.numerodepalabras("yo soy Ana"));
        }
    } 
    
    
    
