public class App {
    public static void main(String[] args) throws Exception {
        SegitigaSiku abc = new SegitigaSiku(8.0,9.0);
        abc.setNama("Segitiga siku-siku");
        abc.getInfo();

        System.out.println("==============================================");

        Lingkaran lingkaran = new Lingkaran(5.0);
        lingkaran.setNama("Lingkaran");
        lingkaran.getInfo();
        System.out.println(); // Spasi antar objek

        System.out.println("==============================================");

        // Membuat objek persegi panjang
        PersegiPanjang persegiPanjang = new PersegiPanjang(4.0, 6.0);
        persegiPanjang.setNama("Persegi Panjang");
        persegiPanjang.getInfo();
        System.out.println(); // Spasi antar objek

        System.out.println("==============================================");
        
        // Membuat objek segitiga sama kaki
        SegitigaSamaKaki segitigaSamaKaki = new SegitigaSamaKaki(5.0, 4.0);
        segitigaSamaKaki.setNama("Segitiga Sama Kaki");
        segitigaSamaKaki.getInfo();
        System.out.println(); // Spasi antar objek

        System.out.println("==============================================");
        
        // Membuat objek segitiga sama sisi
        SegitigaSamaSisi segitigaSamaSisi = new SegitigaSamaSisi(6.0);
        segitigaSamaSisi.setNama("Segitiga Sama Sisi");
        segitigaSamaSisi.getInfo();
        System.out.println(); // Spasi antar objek

        System.out.println("==============================================");

        // Membuat objek segitiga sembarang
        SegitigaSembarang segitigaSembarang = new SegitigaSembarang(5.0, 7.0, 6.0);
        segitigaSembarang.setNama("Segitiga Sembarang");
        segitigaSembarang.getInfo();
    }
}
