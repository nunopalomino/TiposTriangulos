package Modelo;

public class Controle extends absPropriedades {

    public Controle(String lado1, String lado2, String lado3) {
        super(lado1, lado2, lado3);
    }

    @Override
    public void verificar() {
        Validacao validacao = new Validacao(lado1, lado2, lado3);

        validacao.lado1 = lado1;
        validacao.lado2 = lado2;
        validacao.lado3 = lado3;

        validacao.verificar();

        if (validacao.mensagem.equals("")) {
            Triangulos triangulos = new Triangulos(validacao.L1, validacao.L2, validacao.L3);

            triangulos.L1 = validacao.L1;
            triangulos.L2 = validacao.L2;
            triangulos.L3 = validacao.L3;

            triangulos.verificar();

            this.mensagem = triangulos.mensagem;
        } else {
            this.mensagem = validacao.mensagem;
        }

    }
}
