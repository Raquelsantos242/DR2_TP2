package org.example;

public class RelatorioPDF implements Relatorio {
    public void gerarCabecalho() {

        System.out.println("Gerando cabeçalho PDF...");
    }

    public void gerarCorpo() {

        System.out.println("Gerando corpo PDF...");
    }

    public void gerarRodape() {

        System.out.println("Gerando rodapé PDF...");
    }
}
