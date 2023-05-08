import java.util.ArrayList;
import java.util.Scanner;

public class NhanVienService {
    Scanner scanner = new Scanner(System.in);
    int id = 0;
    ArrayList<NhanVien> nhanViens = new ArrayList<>();

    public void themNhanVien() {
        System.out.println("Nhap ten");
        String name = scanner.nextLine();
        System.out.println("Nhap luong");
        double luong = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap he so luong");
        int heSoLuong = Integer.parseInt(scanner.nextLine());
        NhanVien nhanVien = new NhanVien(id, name, luong, heSoLuong);
        nhanViens.add(nhanVien);
        id++;
    }

    public void showAll() {
        System.out.println(nhanViens.toString());
    }

    public void  findMax() {
        double max = nhanViens.get(0).getLuong();
        NhanVien nhanVien = nhanViens.get(0);
        for (int i = 0; i < nhanViens.size()  ; i++) {
            if (max < nhanViens.get(i).getLuong()) {
                max = nhanViens.get(i).getLuong();
                nhanVien = nhanViens.get(i);
            }
        }
        System.out.println(nhanVien);
    }

    public void kiemTraSoLuongNhanVien() {
        System.out.println(nhanViens.size());
    }

    public void edit() {
        System.out.println("Nhap id nhan vien can sua");
        int id  = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < nhanViens.size(); i++) {
            if ( id == nhanViens.get(i).getId()) {
                System.out.println("Nhap ten Nhan vien moi");
                String name = scanner.nextLine();
                nhanViens.get(i).setName(name);
            }
        }
    }
}