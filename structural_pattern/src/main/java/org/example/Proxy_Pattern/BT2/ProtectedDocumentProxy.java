package org.example.Proxy_Pattern.BT2;

public class ProtectedDocumentProxy implements Document{
    private RealDocument realDocument;
    private String filename;
    private String userRole;

    public ProtectedDocumentProxy( String filename, String userRole) {
        this.filename = filename;
        this.userRole = userRole;
    }

    @Override
    public void read() {
        if (hasAccess()) {
            if (realDocument == null) {
                realDocument = new RealDocument(filename);
            }
            realDocument.read();
        } else {
            System.out.println("Truy cập bị từ chối! Vai trò của bạn (" + userRole + ") không được phép đọc tài liệu này.");
        }
    }
    private boolean hasAccess() {
        if (filename.startsWith("secret") && !userRole.equals("admin")) {
            return false;
        }
        return true;
    }
}
