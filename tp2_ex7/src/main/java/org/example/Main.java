package org.example;


public class Main {
    public static void main(String[] args) {
        RelatorioService service = new RelatorioService();

        service.gerarRelatorio("PDF");
        service.gerarRelatorio("CSV");
        service.gerarRelatorio("JSON");
        service.gerarRelatorio("TXT");
    }
}
