package fazendinha;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Luan Diniz
 */
public class Animais {
    private int id;
    private String nome,especie,raca,sexo;
    private double peso;

    public Animais(int id, String nome, String especie, String raca, String sexo, double peso) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.sexo = sexo;
        this.peso = peso;
        if(peso<0)this.peso=0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Animais{");
        sb.append("id=").append(id);
        sb.append(", nome=").append(nome);
        sb.append(", especie=").append(especie);
        sb.append(", raca=").append(raca);
        sb.append(", sexo=").append(sexo);
        sb.append(", peso=").append(peso);
        sb.append('}');
        return sb.toString();
    }

    
}
