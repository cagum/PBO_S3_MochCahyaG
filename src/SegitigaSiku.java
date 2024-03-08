public class SegitigaSiku extends Segitiga{
    public SegitigaSiku(Double alas, Double tinggi){
        this.sisi3 = this.getSisiMiring(alas,tinggi);
        super.setProperty(alas, tinggi, this.sisi3);
        super.hitungLuas();
        super.hitungKeliling();
    }

    public double getSisiMiring(Double alas, Double tinggi){
        return Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
    }
}
