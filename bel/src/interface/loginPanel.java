

import java.awt.Desktop;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class loginPanel extends TelaPanel {
    private JButton botaologin;
    public loginPanel(JPanel telas, JFrame janela){
        super (telas, janela)
        jLabel mensagem = new JLabel("conteudo de login Panel")

        JButton botao = new JButton("login")
        botao.addActionListener(this);

        this.add(mensagem);
        this.add(botao);

    }
    public void executarBotao(ActionEvent e){
        trocaTela("Tela principal")
    }
    
}
