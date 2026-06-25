package model;

public class Pet {
    private String nome;
    private String especie;
    private String raca;
    private int idade;
    private double peso;

    public Pet(String nome, String especie, String raca, int idade, double peso) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
    }

    public String getNome()       { return nome; }
    public String getEspecie()    { return especie; }
    public String getRaca()       { return raca; }
    public int    getIdade()      { return idade; }
    public double getPeso()       { return peso; }

    public void setNome(String nome)       { this.nome = nome; }
    public void setEspecie(String especie) { this.especie = especie; }
    public void setRaca(String raca)       { this.raca = raca; }
    public void setIdade(int idade)        { this.idade = idade; }
    public void setPeso(double peso)       { this.peso = peso; }
}
