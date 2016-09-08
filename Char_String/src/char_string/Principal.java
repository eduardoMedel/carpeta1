
package char_string;


public class Principal {

    
    public static void main(String[] args) {
        
        char[] letras = new char[4];
        
        letras[0] = 'h';
        letras[1] = 'o';
        letras[2] = 'l';
        letras[3] = 'a';
        
        //String union = String.valueOf(letras);
        String union = new String(letras);
        
        System.out.println("frase: " + union);
    }
    
}
