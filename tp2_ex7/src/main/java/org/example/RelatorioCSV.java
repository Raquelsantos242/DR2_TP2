package org.example;

public class RelatorioCSV implements Relatorio {
    public void gerarCabecalho() {

        System.out.println("Gerando cabeçalho CSV...");
    }

    public void gerarCorpo() {

        System.out.println("Gerando corpo CSV...");
    }

    public void gerarRodape() {

        System.out.println("Gerando rodapé CSV...");
    }
}
