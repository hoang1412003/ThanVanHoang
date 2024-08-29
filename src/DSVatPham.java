import java.util.*;

public class DSVatPham {
    private List<VatPham> arr;
    public DSVatPham() {
        this.arr = new ArrayList<>();
    }

    public void nhap() {
        int flag;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<5; i++) {
            System.out.println("chọn 5 loại vật phẩm ");
            System.out.println("1. Chiếc búa thần");
            System.out.println("2. Bao tay sấm sết");
            System.out.println("3. Hòn đá kích nổ");
            System.out.println("4. cây riều phép thuật");
            System.out.println("5. Cây gậy chiến thần");
            flag = sc.nextInt();
            VatPham vatPham;
            if(flag == 1) {
                vatPham = new CayGayChienThan();
                arr.add(vatPham);
            } else if (flag ==2) {
                vatPham = new BaoTaySamSet();
                arr.add(vatPham);
            } else if (flag == 3) {
                vatPham = new HonDaKichNo();
                arr.add(vatPham);
            } else if (flag == 4) {
                vatPham = new CayRiuPhepThuat();
                arr.add(vatPham);
            } else if (flag == 5) {
                vatPham = new CayGayChienThan();
                arr.add(vatPham);
            }
        }

    }

    public void xuat () {
        for (VatPham vp : this.arr) {
            vp.xuat();
        }
    }

    public void tinhVangLonNhat() {
        Optional<VatPham> vatPham = arr.stream()
                .max(Comparator.comparingDouble(VatPham::tinhSoVang));
        System.out.println("Vật phẩm tốn nhiều tiền nhất là: " + vatPham.orElse(null).tenVatPham);

    }

    public void cau4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhạp số xu vang mà Spon thu được");
        float soVang = sc.nextFloat();
        if(arr.stream().mapToDouble(VatPham::tinhSoVang).sum() > soVang) {
            System.out.println("Spon dã giải cứu thành công đồng đội");
        } else {
            System.out.println("Spon không giải cứu thành công");
        }
    }

}
