public class Kapal {
    protected int JumlahKursi, int Biaya, String Mesin;


    public Kapal (int JumlahKursi, int Biaya, String Mesin) {
    this.JumlahKursi = JumlahKursi;
    this.Biaya = Biaya;
    this.Mesin = Mesin;
    }

    @Override
    public void informasi() {
        system.out.println("Transportasi Air jenis kapal dengan kursi berjumlah"+ JumlahKursi +"ditetapkan dengan biaya sebesar"+ biaya);
    }

    @Override
    public void berlayar() {
        system.out.println("Transportasi Air jenis kapal sedang berlayar menggunakan mesin Diesel dengan kecepatan yang tidak stabil");
    }

    @Override
    public void berlayar() {
        system.out.println("Transportasi Air jenis kapal sedang berlayar menggunakan mesin Diesel dengan kecepatan stabil di kisaran 20 knot");
    }

    @Override
    public void berlabuh() {
        system.out.println("Transportasi Air jenis kapal sedang berlabuh di pantai");
    }
}
