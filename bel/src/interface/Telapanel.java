
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TelaPanel {
    public class TelaPanel extends JPanel
    implements ActionListener{
        private JPanel telas;
        private CardLayout controletelas;
        private JFrame janelas;
        public TelaPanel(JPanel telas, JFrame janelas){
            this.telas = telas;
            this.controletelas = (CardLayout) telas.getLayout();
            this.janelas = janelas;
            this.setBackground(Color.decode("#202028"));
        }
    }
}