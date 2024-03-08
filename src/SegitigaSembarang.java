public class SegitigaSembarang extends BangunDatar {
    protected Double sisi1;
    protected Double sisi2;
    protected Double sisi3;

    public SegitigaSembarang(Double sisi1, Double sisi2, Double sisi3) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
        hitungLuas();
        hitungKeliling();
    }

    public void hitungLuas() {
        double s = (sisi1 + sisi2 + sisi3) / 2;
        super.luas = Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
    }

    public void hitungKeliling() {
        super.keliling = sisi1 + sisi2 + sisi3;
    }
}
