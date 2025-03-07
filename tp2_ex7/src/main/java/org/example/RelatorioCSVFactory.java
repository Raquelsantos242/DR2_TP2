package org.example;

public class RelatorioCSVFactory implements RelatorioFactory {
    public Relatorio criarRelatorio() {

        return new RelatorioCSV();
    }
}
