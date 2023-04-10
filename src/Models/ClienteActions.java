package Models;

/**
 *
 * @author tulio
 *  * TRIO: Túlio Falcão / Marcos Vinícius / Pedro Henrique de Oliveira Santos
 */
public interface ClienteActions {
 
    void aluga(Filme f, int diaLocacao, int diaDevolucao);
    void remove(String titulo);
    double pagar(int diaDevolvido);
}
