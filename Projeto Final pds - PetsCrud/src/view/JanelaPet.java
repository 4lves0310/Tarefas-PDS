package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class JanelaPet extends JFrame {

    // Cores do tema
    private static final Color COR_FUNDO    = new Color(255, 140, 0);   // laranja
    private static final Color COR_BOTAO    = new Color(220, 60, 60);    // vermelho claro
    private static final Color COR_TEXTO_BTN = Color.WHITE;
    private static final Color COR_TABELA_HEADER = new Color(180, 50, 50);

    // Campos de entrada
    private JTextField txtNome    = new JTextField(15);
    private JTextField txtEspecie = new JTextField(15);
    private JTextField txtRaca    = new JTextField(15);
    private JTextField txtIdade   = new JTextField(5);
    private JTextField txtPeso    = new JTextField(7);

    // Botões
    private JButton btnAdicionar  = criarBotao("Adicionar");
    private JButton btnAtualizar  = criarBotao("Atualizar");
    private JButton btnRemover    = criarBotao("Remover");
    private JButton btnLimpar     = criarBotao("Limpar");

    // Tabela
    private JTable table = new JTable();

    public JanelaPet() {
        setTitle("🐾 Cadastro de Pets");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(680, 500);
        setLocationRelativeTo(null);

        JPanel contentPane = new JPanel(new BorderLayout(10, 10));
        contentPane.setBackground(COR_FUNDO);
        contentPane.setBorder(new EmptyBorder(15, 15, 15, 15));
        setContentPane(contentPane);

        // --- Painel do formulário ---
        JPanel formPanel = new JPanel(new GridBagLayout()); // layout flexível
        formPanel.setBackground(COR_FUNDO);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(4, 6, 4, 6);
        gbc.anchor = GridBagConstraints.WEST;

        adicionarCampo(formPanel, gbc, "Nome:",         txtNome,    0);
        adicionarCampo(formPanel, gbc, "Espécie:",      txtEspecie, 1);
        adicionarCampo(formPanel, gbc, "Raça:",         txtRaca,    2);
        adicionarCampo(formPanel, gbc, "Idade (anos):", txtIdade,   3);
        adicionarCampo(formPanel, gbc, "Peso (kg):",    txtPeso,    4);

        // --- Painel dos botões ---
        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        btnPanel.setBackground(COR_FUNDO);
        btnPanel.add(btnAdicionar);
        btnPanel.add(btnAtualizar);
        btnPanel.add(btnRemover);
        btnPanel.add(btnLimpar);

        JPanel topPanel = new JPanel(new BorderLayout(0, 8));
        topPanel.setBackground(COR_FUNDO);
        topPanel.add(formPanel, BorderLayout.CENTER);
        topPanel.add(btnPanel, BorderLayout.SOUTH);

        // --- Tabela -
        estilizarTabela();
        JScrollPane scroll = new JScrollPane(table);
        scroll.setBorder(BorderFactory.createLineBorder(new Color(180, 80, 0), 2));

        contentPane.add(topPanel, BorderLayout.NORTH);
        contentPane.add(scroll, BorderLayout.CENTER);
    }

    private void adicionarCampo(JPanel p, GridBagConstraints gbc, String label, JTextField field, int row) {
        gbc.gridx = 0; gbc.gridy = row; gbc.weightx = 0;
        JLabel lbl = new JLabel(label);
        lbl.setForeground(Color.WHITE);
        lbl.setFont(new Font("Arial", Font.BOLD, 13));
        p.add(lbl, gbc);

        gbc.gridx = 1; gbc.weightx = 1; gbc.fill = GridBagConstraints.HORIZONTAL;
        field.setFont(new Font("Arial", Font.PLAIN, 13));
        p.add(field, gbc);
        gbc.fill = GridBagConstraints.NONE;
    }

    private JButton criarBotao(String texto) {
        JButton btn = new JButton(texto);
        btn.setBackground(COR_BOTAO);
        btn.setForeground(COR_TEXTO_BTN);
        btn.setFont(new Font("Arial", Font.BOLD, 13));
        btn.setFocusPainted(false);
        btn.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(150, 30, 30)),
            BorderFactory.createEmptyBorder(5, 14, 5, 14)
        ));
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        return btn;
    }

    private void estilizarTabela() {
        table.setFont(new Font("Arial", Font.PLAIN, 13));
        table.setRowHeight(24);
        table.setGridColor(new Color(255, 160, 60));
        table.setBackground(new Color(255, 230, 180));
        table.setForeground(new Color(80, 20, 0));
        table.setSelectionBackground(new Color(220, 60, 60));
        table.setSelectionForeground(Color.WHITE);

        // Cabeçalho
        table.getTableHeader().setBackground(COR_TABELA_HEADER);
        table.getTableHeader().setForeground(Color.WHITE);
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 13));

        // Centralizar colunas numéricas (índice 3 e 4)
        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(SwingConstants.CENTER);
        table.setDefaultRenderer(Object.class, center);
    }

    // --- Getters ---
    public JTextField getTxtNome()    { return txtNome; }
    public JTextField getTxtEspecie() { return txtEspecie; }
    public JTextField getTxtRaca()    { return txtRaca; }
    public JTextField getTxtIdade()   { return txtIdade; }
    public JTextField getTxtPeso()    { return txtPeso; }
    public JTable     getTable()      { return table; }
    public JButton    getBtnAdicionar(){ return btnAdicionar; }
    public JButton    getBtnAtualizar(){ return btnAtualizar; }
    public JButton    getBtnRemover() { return btnRemover; }
    public JButton    getBtnLimpar()  { return btnLimpar; }
}
