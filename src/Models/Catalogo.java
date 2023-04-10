package Models;

import java.util.ArrayList;

/**
 *
 * @author tulio
 */
public class Catalogo implements CatalogoActions{
    ArrayList<Filme> catalogo = new ArrayList();
    
    @Override
    public void adiciona(Filme f){
        this.catalogo.add(f);
    }
    
    @Override
    public void remove(String titulo){
        if (this.catalogo.isEmpty()){
            System.out.println("Catálogo vazio!");
        }else{
            for (Filme filme : this.catalogo){
                if (filme.getTitulo().equals(titulo)){
                    this.catalogo.remove(filme);
                }
            }
        }
    }
    
    @Override
    public Filme procura(String titulo){
        Filme movie = null;
        for (Filme f : this.catalogo){
            if (f.getTitulo().equals(titulo)){
                if (f.isAlugado() == false){
                    movie = f;
                }else{
                    movie = null;
                }
            }
        }
        return movie;
    }
}
