package Modelo;

public class Validacao extends absPropriedades {

    public Validacao(String lado1, String lado2, String lado3) {
        super(lado1, lado2, lado3);
    }

    @Override
    public void verificar() {
        mensagem = "";

        try {
            L1 = Double.valueOf(lado1);
            L2 = Double.valueOf(lado2);
            L3 = Double.valueOf(lado3);

        } catch (NumberFormatException e) {
            mensagem = "Valor(es) de lado inválido(s).";
        }
    }

}
