package Modelo;

public abstract class absPropriedades implements intMetodos {

    public String lado1;
    public String lado2;
    public String lado3;
    public Double L1;
    public Double L2;
    public Double L3;
    public String mensagem;
    public String resposta;

    public absPropriedades(String lado1, String lado2, String lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public absPropriedades(Double L1, Double L2, Double L3) {
        this.L1 = L1;
        this.L2 = L2;
        this.L3 = L3;
    }

}
