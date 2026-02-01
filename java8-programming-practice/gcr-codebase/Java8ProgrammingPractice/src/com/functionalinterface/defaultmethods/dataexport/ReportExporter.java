package com.functionalinterface.defaultmethods.dataexport;
public class ReportExporter implements Exporter {

    public void exportToCSV() {
        System.out.println("Exporting report to CSV");
    }

    public void exportToPDF() {
        System.out.println("Exporting report to PDF");
    }
}
