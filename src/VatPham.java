import java.util.Scanner;

public class VatPham {
    protected String tenVatPham;
    protected float chiSoSucManh;
    protected float heSoSucManh;
    protected float soVangQuyDoiTren1SucCongPha;



    public void xuat() {
        System.out.println("--------------------------------");
        System.out.println("Ten vat pham " + this.tenVatPham);
        System.out.println("Chi so suc manh " + this.chiSoSucManh);
        System.out.println("Hệ số sức mạnh " + this.heSoSucManh);
        System.out.println("So Vang Quy Doi Tren 1 suc cong pha " + this.soVangQuyDoiTren1SucCongPha);
    }
    public float tinhSoVang() {
        return  this.tinhSucCongPha() * this.soVangQuyDoiTren1SucCongPha;
    }

    public float tinhSucCongPha() {
      return this.chiSoSucManh * this.heSoSucManh;
    };

    public String getTenVatPham() {
        return tenVatPham;
    }

    public void setTenVatPham(String tenVatPham) {
        this.tenVatPham = tenVatPham;
    }

    public float getHeSoSucManh() {
        return heSoSucManh;
    }

    public void setHeSoSucManh(float heSoSucManh) {
        this.heSoSucManh = heSoSucManh;
    }

    public float getChiSoSucManh() {
        return chiSoSucManh;
    }

    public void setChiSoSucManh(float chiSoSucManh) {
        this.chiSoSucManh = chiSoSucManh;
    }

    public float getSoVangQuyDoiTren1SucCongPha() {
        return soVangQuyDoiTren1SucCongPha;
    }

    public void setSoVangQuyDoiTren1SucCongPha(float soVangQuyDoiTren1SucCongPha) {
        this.soVangQuyDoiTren1SucCongPha = soVangQuyDoiTren1SucCongPha;
    }
}
