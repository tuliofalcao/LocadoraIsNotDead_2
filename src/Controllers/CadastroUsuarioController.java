package Controllers;

import Models.Usuario;
import Views.CadastroUsuario;
import Views.Principal;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author tulio
 *  * TRIO: Túlio Falcão / Marcos Vinícius / Pedro Henrique de Oliveira Santos
 */
public class CadastroUsuarioController {

    private final CadastroUsuario view;
    
    public CadastroUsuarioController(CadastroUsuario view){
        this.view = view;
    }
    
    public void cadastraUsuario(){
        
        try {
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
        
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"O campo ID deve conter apenas números!" );
        }
    }
    
    public void removerUsuario(){
        int id = Integer.parseInt(view.getTxtIdUsuario().getText());
        String nome = view.getTxtNomeUsuario().getText();
        String cpf = view.getTxtCpfUsuario().getText();
        String login = view.getTxtLoginUsuario().getText();
        String senha = view.getPassSenhaUsuario().getText();
        
         Usuario usuario = new Usuario(id, nome, cpf, login, senha);
            
         ArrayList<Usuario> listaUsuarios = usuario.getUsuarios();
        for (int i = 0; i < usuario.getUsuarios().size(); i++){
            if (listaUsuarios.get(i).getNome().equals(nome) && listaUsuarios.get(i).getCpf().equals(cpf)){
                listaUsuarios.remove(listaUsuarios.get(i));
            }else{
                JOptionPane.showMessageDialog(null, "Usuário não encontrado!");
            }
        }
        
        JOptionPane.showMessageDialog(null, "Usuário Removido com Sucesso!");
        
        Principal telaPrincipal = new Principal();
        telaPrincipal.setVisible(true);
        view.dispose();
    }
}
