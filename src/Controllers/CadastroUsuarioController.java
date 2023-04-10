package Controllers;

import Models.Usuario;
import Views.CadastroUsuario;
import Views.Principal;
import javax.swing.JOptionPane;

/**
 *
 * @author tulio
 */
public class CadastroUsuarioController {

    private final CadastroUsuario view;
    
    public CadastroUsuarioController(CadastroUsuario view){
        this.view = view;
    }
    
    public void cadastraUsuario(){
        int id = Integer.parseInt(view.getTxtIdUsuario().getText());
        String nome = view.getTxtNomeUsuario().getText();
        String cpf = view.getTxtCpfUsuario().getText();
        String login = view.getTxtLoginUsuario().getText();
        String senha = view.getPassSenhaUsuario().getText();
        
        Usuario usuario = new Usuario(id, nome, cpf, login, senha);
        usuario.adiciona(usuario);
        
        JOptionPane.showMessageDialog(null, "Usuário Cadastrado com Sucesso!");
        
        Principal telaPrincipal = new Principal();
        telaPrincipal.setVisible(true);
        view.dispose();
    }
    
    public void removerUsuario(){
        int id = Integer.parseInt(view.getTxtIdUsuario().getText());
        String nome = view.getTxtNomeUsuario().getText();
        String cpf = view.getTxtCpfUsuario().getText();
        String login = view.getTxtLoginUsuario().getText();
        String senha = view.getPassSenhaUsuario().getText();
        
         Usuario usuario = new Usuario(id, nome, cpf, login, senha);
             
        for (Usuario u : usuario.getUsuarios()){
            if (u.getNome().equals(nome) && u.getCpf().equals(cpf)){
                usuario.removeUsuariodeUsuarios(usuario);
            }
        }
        
        JOptionPane.showMessageDialog(null, "Usuário Removido com Sucesso!");
        
        Principal telaPrincipal = new Principal();
        telaPrincipal.setVisible(true);
        view.dispose();
    }
}
