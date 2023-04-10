package Models;

import java.util.ArrayList;

/**
 *
 * @author tulio
 *  * TRIO: Túlio Falcão / Marcos Vinícius / Pedro Henrique de Oliveira Santos
 */
public class Faturamento {
    int quantidadeFilmesLocados;
    double valorTotal;
    
    ArrayList<Faturamento> mes = new ArrayList();

    public Faturamento(int quantidadeFilmesLocados, double valorTotal) {
        this.quantidadeFilmesLocados = quantidadeFilmesLocados;
        this.valorTotal = valorTotal;
    }

    public int getQuantidadeFilmesLocados() {
        return quantidadeFilmesLocados;
    }

    public void setQuantidadeFilmesLocados(int quantidadeFilmesLocados) {
        this.quantidadeFilmesLocados = quantidadeFilmesLocados;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public void adiciona(Cliente c){
        this.mes.add(this);
    }
    
    public void incrementa(double valor, int quantidadeFilmes){
        this.quantidadeFilmesLocados += quantidadeFilmes;
        this.valorTotal += valor;
    }
}
    

