import javax.swing.*;
import java.awt.*;

public class FormSobre extends JFrame {

    private static final long serialVersionUID = 1L;

    public FormSobre() {
        setTitle("Sobre o Aplicativo");
        setBounds(200, 200, 350, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        setContentPane(panel);

        JLabel lblInfo = new JLabel("<html><div style='text-align:center;'>"
                + "<h2>Calculadora de Investimentos</h2>"
                + "<p>Este é um aplicativo simples para calcular o total investido em um determinado período de tempo com juros compostos.</p>"
                + "<p>Desenvolvido por: Bruno Alves de Melo</p>"
                + "<p>Contato: bruno.am05@aluno.ifsc.edu.br</p>"
                + "<p>Versão 1.0</p>"
                + "</div></html>");

        lblInfo.setFont(new Font("Arial", Font.PLAIN, 14));

        panel.add(lblInfo, BorderLayout.CENTER);
    }
}