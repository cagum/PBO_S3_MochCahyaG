public class PersegiPanjang extends BangunDatar {
    protected Double panjang;
    protected Double lebar;

    public PersegiPanjang(Double panjang, Double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        hitungLuas();
        hitungKeliling();
    }

    public void hitungLuas() {
        super.luas = panjang * lebar;
    }

    public void hitungKeliling() {
        super.keliling = 2 * (panjang + lebar);
    }
}
