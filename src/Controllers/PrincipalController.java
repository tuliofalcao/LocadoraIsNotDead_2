package Controllers;

import Views.CadastroUsuario;
import Views.Principal;

/**
 *
 * @author tulio
 */
public class PrincipalController {

    private final Principal view;

    public PrincipalController(Principal view) {
        this.view = view;
    }
    
    public void entrarCadastroUsuario(){
        CadastroUsuario telaCadastroUsuario = new CadastroUsuario();
        telaCadastroUsuario.setVisible(true);
        view.dispose();
    }
    
}
