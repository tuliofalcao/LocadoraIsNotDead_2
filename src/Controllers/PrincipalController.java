package Controllers;

import Views.AlugarFilme;
import Views.CadastroCliente;
import Views.CadastroFilme;
import Views.CadastroUsuario;
import Views.Principal;
import Views.ProcuraFilme;

/**
 *
 * @author tulio
 *  * TRIO: Túlio Falcão / Marcos Vinícius / Pedro Henrique de Oliveira Santos
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
    
    public void entrarCadastroCliente(){
        CadastroCliente telaCadastroCliente = new CadastroCliente();
        telaCadastroCliente.setVisible(true);
        view.dispose();
    }
    
    public void entrarCadastroFilme(){
        CadastroFilme telaCadastroFilme = new CadastroFilme();
        telaCadastroFilme.setVisible(true);
        view.dispose();   
    }
    
    public void entrarProcuraFilme(){
        ProcuraFilme telaProcuraFilme = new ProcuraFilme();
        telaProcuraFilme.setVisible(true);
        view.dispose();
    }
    
    public void entrarAlugarFilme(){
        AlugarFilme telaAlugarFilme = new AlugarFilme();
        telaAlugarFilme.setVisible(true);
        view.dispose();
    }
    
}
