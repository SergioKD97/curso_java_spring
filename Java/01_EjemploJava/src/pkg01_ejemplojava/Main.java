/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_ejemplojava;


public class Main {

   
    public static void main(String[] args) {
        boolean condicion = 5 == 5 && true;
        if (3 < 5 ){
            if(condicion || false){
            System.out.println("Es verdadero");
            }
        } else if (5 > 7) {
            System.out.println("No se ejecuta");
        } else if (8 > 9){
            System.out.println("No se ejecuta");
        } else {
            System.out.println("Cualquier otro caso");
        }
        
        char letra = 'B';
        switch (letra) {
            case 'A':
                System.out.println("AAAAAAA");
                break;
            case 'B':
                System.out.println("BBBB");
                break;
            case 'C':
                System.out.println("CCCC");    
                break;
        }

        String formateado = nombreApell("German", "Caballero Rodrígez");
        
        System.out.print(formateado);
        
        Tucan miPajaro = new Tucan();
        miPajaro.longitud = 20.5F;
        
        Tucan otroPajaro = null;
        
        otroPajaro = new Tucan();
        otroPajaro.longitud = 30.9F;
        
        System.out.println("Mi tucan: " + miPajaro.longitud);
        System.out.println("Otro tucan: " + otroPajaro.longitud);
        System.out.println("Otro tucan: " + miPajaro);
        
        //cogen datos del mismo espacio, si cambio datos de uno cambian los dos
        otroPajaro = miPajaro;
        
        System.out.println("Otro tucan: " + otroPajaro.longitud);
        
        miPajaro.longitud = 67F;
        
        System.out.println("longitud otroTucan: " + otroPajaro.longitud);
        
        miPajaro.edad = 11;
        System.out.println("edad otroTucan: " + otroPajaro.edad);

        otroPajaro.piar();
        miPajaro.piar();
                
        
        Tucan nuevoTuc = new Tucan();
        
        System.out.println("Longitud miTucan: " + nuevoTuc.longitud); 
        
        
        
    }
    
    static String nombreApell(String nombre, String apellidos) {
        return apellidos + ", " + nombre;
    }
    
    
    
    
}
 