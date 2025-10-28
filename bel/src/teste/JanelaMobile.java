import javax.swing.JFrame;

public class JanelaMobile {

    public static void main(String[] args) {
        JFrame janela = new JFrame("Janela Mobile");
        
        janela.setBounds(0, 0, 750, 320);
        
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        janela.setVisible(true);
    }
}