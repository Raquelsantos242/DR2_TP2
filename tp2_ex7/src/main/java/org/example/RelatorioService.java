package org.example;

public class RelatorioService {
    public void gerarRelatorio(String tipo) {
        RelatorioFactory factory;

        switch (tipo.toUpperCase()) {
            case "PDF":
                factory = new RelatorioPDFFactory();
                break;
            case "CSV":
                factory = new RelatorioCSVFactory();
                break;
            case "JSON":
                factory = new RelatorioJSONFactory();
                break;
            default:
                System.out.println("Tipo de relatório desconhecido!");
                return;
        }

        Relatorio relatorio = factory.criarRelatorio();
        relatorio.gerarCabecalho();
        relatorio.gerarCorpo();
        relatorio.gerarRodape();
    }
}
