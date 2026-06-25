
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PlanoAcademia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Telefone;
	private JTextField Nome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlanoAcademia frame = new PlanoAcademia();
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
	public PlanoAcademia() {
		setTitle("Plano Academia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][grow][][][][][]", "[][][][][][][][][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Cadastro do Cliente - Academia BluLive");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel, "cell 2 1 4 1,alignx center,aligny center");
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		contentPane.add(lblNewLabel_1, "cell 1 3,alignx left");
		
		Nome = new JTextField();
		contentPane.add(Nome, "cell 2 3 6 1,growx");
		Nome.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Telefone:");
		contentPane.add(lblNewLabel_2, "cell 1 5,alignx left");
		
		Telefone = new JTextField();
		contentPane.add(Telefone, "cell 2 5 6 1,growx");
		Telefone.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Tipo de plano:");
		contentPane.add(lblNewLabel_2_1, "cell 1 7");
		
		JRadioButton Basico = new JRadioButton("Básico");
		contentPane.add(Basico, "cell 2 7");
		
		JRadioButton Intermeiario = new JRadioButton("Intermediario");
		contentPane.add(Intermeiario, "cell 4 7,alignx left");
		
		JRadioButton Premiun = new JRadioButton("Premium");
		contentPane.add(Premiun, "cell 6 7,alignx left");
		
		JLabel lblNewLabel_3 = new JLabel("Duração:");
		contentPane.add(lblNewLabel_3, "cell 1 10");
		
		JRadioButton Mensal = new JRadioButton("Mensal");
		contentPane.add(Mensal, "cell 2 10");
		
		JRadioButton Semestral = new JRadioButton("Semestral");
		contentPane.add(Semestral, "cell 4 10");
		
		JRadioButton Anual = new JRadioButton("Anual");
		contentPane.add(Anual, "cell 6 10");
		
		JLabel lblNewLabel_4 = new JLabel("Frequencia Semanal:");
		contentPane.add(lblNewLabel_4, "cell 1 12");
		
		JRadioButton DoisX = new JRadioButton("2x por semana");
		contentPane.add(DoisX, "cell 2 12");
		
		JRadioButton TresX = new JRadioButton("3x por semana");
		contentPane.add(TresX, "cell 4 12");
		
		JRadioButton CincoX = new JRadioButton("5x por semana");
		contentPane.add(CincoX, "cell 6 12");
		
		JButton btnNewButton = new JButton("Calcular");
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				char plano;
				
				boolean basico = Basico.isSelected();
				boolean intermediario = Intermeiario.isSelected();
				boolean premiun = Premiun.isSelected();
				
				
				char duracao;
				
				boolean mensal = Mensal.isSelected();
				boolean semestral = Semestral.isSelected();
				boolean anual = Anual.isSelected();
				
				
				char frequencia;
				
				boolean doisX = DoisX.isSelected();
				boolean tresX = TresX.isSelected();
				boolean cincoX = CincoX.isSelected();
				
				
				if (basico == true) {
					plano = 'B';
				}
				if (intermediario == true) {
					plano = 'I';
				}
				if (premiun == true) {
					plano = 'P';
				}
				
				
				if(mensal == true) {
					duracao = 'M';
				}
				if(semestral == true) {
					duracao = 'S';
				}
				if(anual == true) {
					duracao = 'A';
				}
				
				
				if (doisX == true) {
					frequencia = '2';
				}
				if (tresX == true) {
					frequencia = '3';
				}
				if (cincoX == true) {
					frequencia = '5';
				}
			}
			
		});
		contentPane.add(btnNewButton, "cell 2 14");
		
		JLabel lblNewLabel_5 = new JLabel("Valor Final:");
		contentPane.add(lblNewLabel_5, "cell 3 14");
		
		JLabel ValorFinal = new JLabel("");
		contentPane.add(ValorFinal, "cell 4 14");

	}
}
