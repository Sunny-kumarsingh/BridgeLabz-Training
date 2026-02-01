package com.functionalinterface.defaultmethods.dataexport;
public interface Exporter {

    void exportToCSV();
    void exportToPDF();

    // new feature added later
    default void exportToJSON() {
        System.out.println("Exporting data to JSON (default implementation)");
    }
}
