package org.example.Composite_Pattern.BT1;

public class Main {
    public static void main(String[] args) {
        Employee dev1 = new Staff("Nguyễn Văn A", "Lập trình viên");
        Employee dev2 = new Staff("Trần Thị B", "Tester");
        Employee hr1  = new Staff("Lê Văn C", "HR");

        Manager devManager = new Manager("Phạm Văn D", "Trưởng phòng IT");
        devManager.add(dev1);
        devManager.add(dev2);

        Manager hrManager = new Manager("Ngô Thị E", "Trưởng phòng Nhân sự");
        hrManager.add(hr1);

        Manager ceo = new Manager("Lý Hải", "Giám đốc");
        ceo.add(devManager);
        ceo.add(hrManager);

        ceo.showDetails();
    }
}
