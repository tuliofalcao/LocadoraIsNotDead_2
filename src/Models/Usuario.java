package Models;

import java.util.ArrayList;


/**
 *
 * @author tulio
 */
public class Usuario extends Pessoa {
    private String login;
    private String senha;
    
    ArrayList<Usuario> usuarios = new ArrayList();
    
    public Usuario(int id, String nome, String cpf, String login, String senha) {
        super(id, nome, cpf);
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void adiciona(Usuario u){
        this.usuarios.add(u);
    }
    
    public ArrayList getUsuarios(){
        return this.usuarios;
    }
    
}
