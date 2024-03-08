public class BangunDatar {
    protected double luas;
    protected double keliling;
    protected String nama;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void getInfo() {
        System.out.println("Nama bangun datar : "+ nama);
        System.out.println("Luas : " + luas);
        System.out.println("Keliling :" + keliling);
    }
}
