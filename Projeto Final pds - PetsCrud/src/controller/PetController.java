package controller;

import model.Pet;
import model.PetTableModel;
import view.JanelaPet;

import javax.swing.*;

public class PetController {

    private final PetTableModel modelo;
    private final JanelaPet view;

    public PetController(PetTableModel modelo, JanelaPet view) {
        this.modelo = modelo;
        this.view   = view;

        view.getTable().setModel(modelo);
        //eventos
        view.getBtnAdicionar().addActionListener(e -> adicionar());
        view.getBtnAtualizar().addActionListener(e -> atualizar());
        view.getBtnRemover().addActionListener(e  -> remover());
        view.getBtnLimpar().addActionListener(e   -> limpar());

        // Ao clicar em uma linha da tabela, carrega os dados nos campos
        view.getTable().getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) carregarLinhaSelecionada();
        });
    }

    private void adicionar() {
        Pet p = lerFormulario();
        if (p == null) return;
        modelo.adicionar(p);
        limpar();
        mostrarMensagem("Pet cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    private void atualizar() {
        int row = view.getTable().getSelectedRow();
        if (row < 0) {
            mostrarErro("Selecione um pet na tabela para atualizar.");
            return;
        }
        Pet p = lerFormulario();
        if (p == null) return;
        modelo.atualizar(row, p);
        limpar();
        mostrarMensagem("Pet atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    private void remover() {
        int row = view.getTable().getSelectedRow();
        if (row < 0) {
            mostrarErro("Selecione um pet na tabela para remover.");
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(view,
            "Deseja remover o pet selecionado?", "Confirmar remoção",
            JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (confirm == JOptionPane.YES_OPTION) {
            modelo.remover(row);
            limpar();
        }
    }

    private void limpar() {
        view.getTxtNome().setText("");
        view.getTxtEspecie().setText("");
        view.getTxtRaca().setText("");
        view.getTxtIdade().setText("");
        view.getTxtPeso().setText("");
        view.getTable().clearSelection();
    }

    private void carregarLinhaSelecionada() {
        int row = view.getTable().getSelectedRow();
        if (row < 0) return;
        Pet p = modelo.getPet(row);
        view.getTxtNome().setText(p.getNome());
        view.getTxtEspecie().setText(p.getEspecie());
        view.getTxtRaca().setText(p.getRaca());
        view.getTxtIdade().setText(String.valueOf(p.getIdade()));
        view.getTxtPeso().setText(String.valueOf(p.getPeso()));
    }

    // Lê e valida os campos do formulário. Retorna null se houver erro.
    private Pet lerFormulario() {
        String nome    = view.getTxtNome().getText().trim();
        String especie = view.getTxtEspecie().getText().trim();
        String raca    = view.getTxtRaca().getText().trim();
        String idadeStr = view.getTxtIdade().getText().trim();
        String pesoStr  = view.getTxtPeso().getText().trim();

        if (nome.isEmpty() || especie.isEmpty() || raca.isEmpty()
                || idadeStr.isEmpty() || pesoStr.isEmpty()) {
            mostrarErro("Preencha todos os campos.");
            return null;
        }

        int idade;
        try {
            idade = Integer.parseInt(idadeStr);
            if (idade < 0 || idade > 50) throw new NumberFormatException();
        } catch (NumberFormatException ex) {
            mostrarErro("Idade inválida. Informe um número inteiro entre 0 e 50.");
            return null;
        }

        double peso;
        try {
            peso = Double.parseDouble(pesoStr.replace(",", "."));
            if (peso <= 0 || peso > 200) throw new NumberFormatException();
        } catch (NumberFormatException ex) {
            mostrarErro("Peso inválido. Informe um valor numérico positivo (ex: 4.5).");
            return null;
        }

        return new Pet(nome, especie, raca, idade, peso);
    }

    private void mostrarErro(String msg) {
        JOptionPane.showMessageDialog(view, msg, "Erro", JOptionPane.ERROR_MESSAGE);
    }

    private void mostrarMensagem(String msg, String titulo, int tipo) {
        JOptionPane.showMessageDialog(view, msg, titulo, tipo);
    }
}
