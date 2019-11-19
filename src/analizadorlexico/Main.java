package analizadorlexico;

import java.util.*;

/**
 *
 * @author Carlos Contreras
 */
public class Main {

    public static void main(String[] args) {
        // Prueba de analizador léxico
        String cadenaTexto = "11 + 22 - 33";        // Correcto
//        String cadenaTexto = "11 + 22 + a - 33";    // Incorrecto
        ArrayList<Token> tokens = Lexer.lex(cadenaTexto);
        // Obtener salida de resultados
        for (Token token : tokens) {
            System.out.println("Tipo: " + token.getTipo() + "\tValor: " + token.getValor());
        }
    }

}
