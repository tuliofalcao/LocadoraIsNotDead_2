package Models;

/**
 *
 * @author tulio
 */
public class teste {

    public static void main(String args[]) {
        Filme filme1 = new Filme(0, "Indiana Jones", 10);
        Filme filme2 = new Filme (1, "Stalker", 15);
        Catalogo catalogo = new Catalogo();
        catalogo.adiciona(filme1);
        catalogo.adiciona(filme2);
        
        Cliente cliente1 = new Cliente(0, "Cláudio", "0000");
        Usuario usuario = new Usuario(0, "Túlio", "666", "Adm", "666");
        
        Filme p = catalogo.procura("Indiana Jones");
        
        if (p != null){
            cliente1.aluga(p, 9, 10);
        }
       
        double t = cliente1.pagar(12);
        System.out.println(t);
    }
}
