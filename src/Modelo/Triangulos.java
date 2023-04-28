package Modelo;

public class Triangulos extends absPropriedades {

    public Triangulos(Double L1, Double L2, Double L3) {
        super(L1, L2, L3);
    }

    /**
     *
     */
    @Override
    public void verificar() {
        mensagem = "";

        if (L1 <= 0 || L2 <= 0 || L3 <= 0) {
            mensagem = "Erro de validação.";
        } else if (L1 >= L2 + L3 || L2 >= L1 + L3 || L3 >= L1 + L2) {
            mensagem = "Não é um triângulo.";
        } else if (L1.equals(L2) && L2.equals(L3)) {
            mensagem = "Triângulo Equilátero.";
        } else if (L1.equals(L2) || L1.equals(L3) || L2.equals(L3)) {
            mensagem = "Triângulo Isósceles.";
        } else {
            mensagem = "Triângulo Escaleno.";
        }
    }
}
