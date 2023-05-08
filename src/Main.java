import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NhanVienService nhanVienService = new NhanVienService();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("1. Danh sach Nhan Vien");
                System.out.println("2. Them Nhan Vien");
                System.out.println("3. Tim Nhan Vien co luong cao nhat");
                System.out.println("4. Kiem tra so luong nhan vien");
                System.out.println("5. sua nhan vien theo id");
                int input = Integer.parseInt(scanner.nextLine());
                switch (input) {
                    case 1:
                        nhanVienService.showAll();
                        break;
                    case 2:
                        nhanVienService.themNhanVien();
                        break;
                    case 3:
                        nhanVienService.findMax();
                        break;
                    case 4:
                        nhanVienService.kiemTraSoLuongNhanVien();
                        break;
                    case 5:
                        nhanVienService.edit();
                        break;
                    default:
                        System.out.println("Chi nhap tu 1 den 5");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}