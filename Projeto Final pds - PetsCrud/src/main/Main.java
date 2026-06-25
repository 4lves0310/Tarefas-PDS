package main;

import controller.PetController;
import model.PetTableModel;
import view.JanelaPet;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Usa o Look and Feel nativo do sistema (aparência mais moderna)
        try {
        	//estilo so
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {}
        PetTableModel model = new PetTableModel();

        //View
        JanelaPet view = new JanelaPet();

        // liga botão com tabela/dados
        new PetController(model, view);

        // Mostra a janela
        view.setVisible(true);
    }
}