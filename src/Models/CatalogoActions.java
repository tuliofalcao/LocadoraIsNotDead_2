package Models;

/**
 *
 * @author tulio
 *  * TRIO: Túlio Falcão / Marcos Vinícius / Pedro Henrique de Oliveira Santos
 */
public interface CatalogoActions {
    void adiciona(Filme f);
    void remove(String titulo);
    Filme procura(String titulo);
}
