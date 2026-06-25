import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class CalculadoraInvestimentosGrid extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtDepositoMensal, txtNumMeses, txtTaxaJuros;
    private JLabel lblResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CalculadoraInvestimentosGrid frame = new CalculadoraInvestimentosGrid();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public CalculadoraInvestimentosGrid() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        setContentPane(contentPane);

        
        contentPane.setLayout(new GridLayout(6, 2, 5, 5)); 

        
        JLabel lblDepositoMensal = new JLabel("Depósito Mensal R$:");
        lblDepositoMensal.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        contentPane.add(lblDepositoMensal);

       
        txtDepositoMensal = new JTextField();
        contentPane.add(txtDepositoMensal);
        txtDepositoMensal.setColumns(10);

        
        JLabel lblNumMeses = new JLabel("Num. de meses:");
        lblNumMeses.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        contentPane.add(lblNumMeses);

        
        txtNumMeses = new JTextField();
        contentPane.add(txtNumMeses);
        txtNumMeses.setColumns(10);

       
        JLabel lblTaxaJuros = new JLabel("Juros ao mês % :");
        contentPane.add(lblTaxaJuros);

       
        txtTaxaJuros = new JTextField();
        contentPane.add(txtTaxaJuros);
        txtTaxaJuros.setColumns(10);

        
        JLabel lblResultadoTexto = new JLabel("Total investido + juros % :");
        lblResultadoTexto.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        contentPane.add(lblResultadoTexto);

        
        lblResultado = new JLabel(""); 
        contentPane.add(lblResultado);

       
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener(e -> calcular()); 
        
        JPanel panel = new JPanel();
        contentPane.add(panel);
        contentPane.add(btnCalcular);

        
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        
        JMenu mnAjuda = new JMenu("Ajuda");
        menuBar.add(mnAjuda);

        
        mnAjuda.setFont(new Font("Arial", Font.BOLD, 12)); 

        
        JMenuItem mntmSobre = new JMenuItem("Sobre");
        mntmSobre.setFont(new Font("Arial", Font.PLAIN, 14)); 
        mntmSobre.addActionListener(e -> {
            
            new FormSobre().setVisible(true);
        });
        mnAjuda.add(mntmSobre);
    }

    private void calcular() {
        try {
            double depositoMensal = Double.parseDouble(txtDepositoMensal.getText());
            int numMeses = Integer.parseInt(txtNumMeses.getText());
            double taxaJuros = Double.parseDouble(txtTaxaJuros.getText()) / 100; 

            Investimento investimento = new Investimento(numMeses, taxaJuros, depositoMensal);

            
            double total = investimento.calculaTotal();

            
            lblResultado.setText(String.format("R$ %.2f", total));
        } catch (NumberFormatException e) {
            
            lblResultado.setText("Erro! Preencha todos os campos corretamente.");
        }
    }
}