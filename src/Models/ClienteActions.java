package Models;

/**
 *
 * @author tulio
 */
public interface ClienteActions {
 
    void aluga(Filme f, int diaLocacao, int diaDevolucao);
    void remove(String titulo);
    double pagar(int diaDevolvido);
}
