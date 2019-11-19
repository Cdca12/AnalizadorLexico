package analizadorlexico;

import analizadorlexico.Token.Tipos;
import java.util.*;
import java.util.regex.*;

/**
 *
 * @author Carlos Contreras
 */
public class Lexer {

    public static ArrayList<Token> lex(String input) {
        final ArrayList<Token> tokens = new ArrayList<Token>();
        final StringTokenizer st = new StringTokenizer(input);

        while (st.hasMoreTokens()) {
            String palabra = st.nextToken();
            boolean matched = false;

            // Determinar el tipo de token que corresponde
            for (Tipos tokenTipo : Tipos.values()) {
                Pattern patron = Pattern.compile(tokenTipo.patron);
                Matcher matcher = patron.matcher(palabra);
                if (matcher.find()) {
                    Token tk = new Token();
                    tk.setTipo(tokenTipo);
                    tk.setValor(palabra);
                    tokens.add(tk);
                    matched = true;
                }
            }

            // Sirve para determinar si el tipo de token es válido o se debe arrojar 
            // una excepción porque no existe tal cosa en nuestro alfabeto.
            if (!matched) {
                throw new RuntimeException("Se encontró un token invalido.");
            }
        }
        return tokens;
    }
}
