public class SegitigaSamaSisi extends BangunDatar {
    protected Double sisi;

    public SegitigaSamaSisi(Double sisi) {
        this.sisi = sisi;
        hitungLuas();
        hitungKeliling();
    }

    public void hitungLuas() {
        super.luas = (Math.sqrt(3) / 4) * sisi * sisi;
    }

    public void hitungKeliling() {
        super.keliling = 3 * sisi;
    }
}
