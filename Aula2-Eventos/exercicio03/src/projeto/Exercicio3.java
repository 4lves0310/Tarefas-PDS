package projeto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textAltura;
	private JLabel lblResultadoPerimetro;
	private JLabel lblResultadoArea;
	private JTextField textBase;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio3 frame = new Exercicio3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Exercicio3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite as medidas do retângulo:");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(10, 11, 278, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Altura:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 71, 42, 26);
		contentPane.add(lblNewLabel_1);
		
		textAltura = new JTextField();
		textAltura.setBounds(74, 74, 140, 20);
		contentPane.add(textAltura);
		textAltura.setColumns(10);
		
		textBase = new JTextField();
		textBase.setColumns(10);
		textBase.setBounds(74, 116, 140, 20);
		contentPane.add(textBase);
		
		JButton btnbotaoCalcular = new JButton("Calcular");
		btnbotaoCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String altura = textAltura.getText();
				String base = textBase.getText();
				double h = Double.parseDouble(altura);
				double b = Double.parseDouble(base);
				
				double per = 2 * (h + b);
				double area = b * h;
				
				String Rarea = String.valueOf(per);
				Rarea = String.format("%.2f", per);
				String Rper = String.valueOf(area);
				Rper = String.format("%.2f", area);
				
				lblResultadoArea.setText("Área: " + Rarea);
				lblResultadoPerimetro.setText("Perimetro: " + Rper);
				
			}
		});
		btnbotaoCalcular.setBounds(149, 158, 101, 23);
		contentPane.add(btnbotaoCalcular);
		
		lblResultadoArea = new JLabel("");
		lblResultadoArea.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblResultadoArea.setBounds(23, 192, 308, 26);
		contentPane.add(lblResultadoArea);
		
		JLabel lblNewLabel_1_1 = new JLabel("Base:");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 116, 62, 26);
		contentPane.add(lblNewLabel_1_1);
		
		lblResultadoPerimetro = new JLabel("");
		lblResultadoPerimetro.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblResultadoPerimetro.setBounds(23, 229, 308, 26);
		contentPane.add(lblResultadoPerimetro);
		
		
	}
}
