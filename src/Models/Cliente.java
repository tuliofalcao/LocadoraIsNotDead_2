package Models;

import java.util.ArrayList;

/**
 *
 * @author tulio
 */
public class Cliente extends Pessoa implements ClienteActions{
    
    ArrayList<Filme> pedidoCliente =  new ArrayList();
    
    public Cliente(int id, String nome, String cpf) {
        super(id, nome, cpf);
    }

    public ArrayList<Filme> getPedidoCliente() {
        return pedidoCliente;
    }

    public void setPedidoCliente(ArrayList<Filme> pedidoCliente) {
        this.pedidoCliente = pedidoCliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
       
    @Override
    public void aluga(Filme f, int diaLocacao, int diaDevolucao){
        f.setAlugado(true);
        f.setDiaLocacao(diaLocacao);
        f.setDiaDevolucao(diaDevolucao);
        
        if (diaDevolucao < diaLocacao){
            diaDevolucao += 30;
        }
        f.setDiasLocados(diaDevolucao - diaLocacao);
        this.pedidoCliente.add(f);
    }
    
    @Override
    public void remove(String titulo){
        for (Filme filme : this.pedidoCliente){
            if (filme.getTitulo().equals(titulo)){
                filme.setAlugado(false);
                filme.setDiaLocacao(0);
                filme.setDiaDevolucao(0);
                filme.setDiasLocados(0);
                this.pedidoCliente.remove(filme);
            }
        }
    }
    
    @Override
    public double pagar(int diaDevolvido){
        double total = 0;
        for (Filme f : this.pedidoCliente){
            if (f.getDiaDevolucao() > 30){
                diaDevolvido += 30;
            }
            if (f.getDiaDevolucao() == diaDevolvido){
                total = f.getValor();
                f.pago();
                this.pedidoCliente.remove(f);
            }else{
                f.setDiaDevolucao(diaDevolvido);
                f.setDiasLocados(f.getDiaDevolucao() - f.getDiaLocacao());
                f.setMulta(f.getDiasLocados() * 1.5);
                total = f.getValor() + f.getMulta();
                f.pago();
            }
        }
        this.pedidoCliente.removeAll(pedidoCliente);
        return total;
    }
          
}
