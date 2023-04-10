package Models;


/**
 *
 * @author tulio
 *  * TRIO: Túlio Falcão / Marcos Vinícius / Pedro Henrique de Oliveira Santos
 */
public class Filme {
    private int id;
    private String titulo;
    private double valor;
    private boolean alugado;
    private int diaLocacao;
    private int diaDevolucao;
    private double multa;
    private int diasLocados;
    

    public Filme(int id, String titulo, double valor) {
        this.id = id;
        this.titulo = titulo;
        this.valor = valor;
        this.alugado = false;
        this.diaLocacao = 0;
        this.diaDevolucao = 0;
        this.multa = 0;
        this.diasLocados = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    public int getDiaLocacao() {
        return diaLocacao;
    }

    public void setDiaLocacao(int diaLocacao) {
        this.diaLocacao = diaLocacao;
    }

    public int getDiaDevolucao() {
        return diaDevolucao;
    }

    public void setDiaDevolucao(int diaDevolucao) {
        this.diaDevolucao = diaDevolucao;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public int getDiasLocados() {
        return diasLocados;
    }

    public void setDiasLocados(int diasLocados) {
        this.diasLocados = diasLocados;
    }

    @Override
    public String toString() {
        return "Filme{" + "id=" + id + ", titulo=" + titulo + ", valor=" + valor + ", alugado=" + alugado + ", diaLocacao=" + diaLocacao + ", diaDevolucao=" + diaDevolucao + ", multa=" + multa + ", diasLocados=" + diasLocados + '}';
    }
    
    public void pago(){
        this.setAlugado(false);
        this.setDiaLocacao(0);
        this.setDiaDevolucao(0);
        this.setMulta(0);
        this.setDiasLocados(0);
    }
 
}
