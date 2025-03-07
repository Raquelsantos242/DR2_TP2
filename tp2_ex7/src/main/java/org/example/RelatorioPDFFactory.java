package org.example;

public class RelatorioPDFFactory implements RelatorioFactory {
    public Relatorio criarRelatorio() {

        return new RelatorioPDF();
    }
}
