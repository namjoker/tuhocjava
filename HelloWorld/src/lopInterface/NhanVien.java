package lopInterface;

/**
 * Created by joker on 16/10/2016.
 */
public class NhanVien implements Comparable<NhanVien> {
    private String id;
    private String name;

    public NhanVien() {
    }

    public NhanVien(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(NhanVien nhanVien) {
        return this.name.compareToIgnoreCase(nhanVien.getName());
        // So sanh voi compare theo ten, cai nay dung de sap xep 1 list theo ten
    }
}
