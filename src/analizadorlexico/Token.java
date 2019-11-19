package analizadorlexico;

/**
 *
 * @author Carlos Contreras
 */
public class Token {

    // Todos los tipos posibles para este analizador léxico, en este caso son numeros y operadores binarios. 
    enum Tipos {
        NUMERO("[0-9]+"), // Uso de expresiones regulares
        OPERADOR_BINARIO("[*|/|+|-]");

        public final String patron;

        // Constructor con la expresión regular que sirve para encontrar ese lexema en particular.
        Tipos(String s) {
            this.patron = s;
        }
    }

    private String valor;   // nombre del token en cuestión
    private Tipos tipo;     // tipo de token en cuestión

    public Tipos getTipo() {
        return tipo;
    }

    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}
