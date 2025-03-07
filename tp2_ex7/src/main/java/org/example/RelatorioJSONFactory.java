package org.example;

public class RelatorioJSONFactory implements RelatorioFactory {
    public Relatorio criarRelatorio() {

        return new RelatorioJSON();
    }
}
