package Models;

/**
 *
 * @author tulio
 */
public interface CatalogoActions {
    void adiciona(Filme f);
    void remove(String titulo);
    Filme procura(String titulo);
}
