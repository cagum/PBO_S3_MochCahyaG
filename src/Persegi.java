public class Persegi extends BangunDatar {
    protected Double sisi;
    public Persegi(Double sisi) {
        this.sisi = sisi;
        hitungLuas();
        hitungKeliling();
    }

    public void hitungLuas(){
        super.luas = sisi * sisi;
    }

    public void hitungKeliling(){
        super.keliling = 4 * sisi;
    }
}   



