package Controllers;

import Models.Usuario;
import Views.Login;
import Views.Principal;

/**
 *
 * @author tulio
 */
public class LoginController {

    private final Login view;

    public LoginController(Login view) {
        this.view = view;
    }
    
    public void entrarNoSistema(){
        
        Usuario administrador = new Usuario(0, "Tulio", "666", "login", "senha");
        administrador.adiciona(administrador);
        
        String login = view.getTxtLogin().getText();
        String senha = view.getPassSenha().getText();
        
        if (administrador.getLogin().equals(login) && administrador.getSenha().equals(senha)){
            Principal telaPrincipal = new Principal();
            telaPrincipal.setVisible(true);
            view.dispose();
        }
    }
    
}
