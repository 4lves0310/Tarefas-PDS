package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class PetTableModel extends AbstractTableModel {

    private ArrayList<Pet> lista = new ArrayList<>();
    private final String[] colunas = { "Nome", "Espécie", "Raça", "Idade", "Peso (kg)" };

    @Override
    public String getColumnName(int col) { return colunas[col]; }

    @Override
    public int getRowCount()    { return lista.size(); }

    @Override
    public int getColumnCount() { return colunas.length; }

    @Override
    public Object getValueAt(int row, int col) {
        Pet p = lista.get(row);
        switch (col) {
            case 0: return p.getNome();
            case 1: return p.getEspecie();
            case 2: return p.getRaca();
            case 3: return p.getIdade();
            case 4: return String.format("%.2f", p.getPeso());
            default: return null;
        }
    }

    public Pet getPet(int row) { return lista.get(row); }

    public void adicionar(Pet p) {
        lista.add(p);
        fireTableDataChanged();
    }

    public void atualizar(int row, Pet p) {
        lista.set(row, p);
        fireTableDataChanged();
    }

    public void remover(int row) {
        lista.remove(row);
        fireTableDataChanged();
    }
}
