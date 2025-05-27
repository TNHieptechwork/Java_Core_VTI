package org.example.Proxy_Pattern.BT2;

public class main {
    public static void main(String[] args) {
        Document doc1 = new ProtectedDocumentProxy("report.pdf", "guest");
        Document doc2 = new ProtectedDocumentProxy("secret-document.txt", "guest");
        Document doc3 = new ProtectedDocumentProxy("secret-document.txt", "admin");

        doc1.read();
        doc2.read();
        doc3.read();
    }
}
