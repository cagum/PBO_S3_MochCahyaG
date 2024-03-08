public class SegitigaSamaKaki extends BangunDatar {
    protected Double alas;
    protected Double tinggi;

    public SegitigaSamaKaki(Double alas, Double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        hitungLuas();
        hitungKeliling();
    }

    public void hitungLuas() {
        super.luas = 0.5 * alas * tinggi;
    }

    public void hitungKeliling() {
        super.keliling = 2 * alas + Math.sqrt(2) * alas;
    }
}
