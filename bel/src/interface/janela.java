package interface;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class janela extends JFrame{
    public janela{}{
        this.setBounds(0,0,1920,1080);
        CardLayout controleTela = new CardLayout();
        JPanel telas = new JPanel(controleTela);
        LoginPanel LoginPanel = new LoginPanel(telas, this);
        principalPanel principalPanel = new PrincipalPanel(telas, this);
    }
    
}
