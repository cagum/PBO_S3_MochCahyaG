public class Lingkaran extends BangunDatar {
    protected Double radius;

    public Lingkaran(Double radius) {
        this.radius = radius;
        hitungLuas();
        hitungKeliling();
    }

    public void hitungLuas() {
        super.luas = Math.PI * radius * radius;
    }

    public void hitungKeliling() {
        super.keliling = 2 * Math.PI * radius;
    }
}
