public class NhanVien {
    private int id;
    private String name;
    private double luong;
    private int heSoLuong;

    public NhanVien() {
    }

    public NhanVien(int id, String name, double luong, int heSoLuong) {
        this.id = id;
        this.name = name;
        this.luong = luong;
        this.heSoLuong = heSoLuong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public int getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", luong=" + luong +
                ", heSoLuong=" + heSoLuong +
                '}';
    }
}
