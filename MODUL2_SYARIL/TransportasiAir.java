public class TransportasiAir {
    protected int JumlahKursi, int Biaya;


    public TransportasiAir (int JumlahKursi, int Biaya)
    this.JumlahKursi = JumlahKursi;
    this.Biaya = Biaya;

    @Override
    public void informasi() {
        system.out.println("Transportasi Air jenis tidak diketahui dengan kursi berjumlah"+ JumlahKursi +"dengan biaya sebesar Rp."+ biaya);
    }

    @Override
    public void berlayar() {
        system.out.println("Transportasi Air dengan jenis yang tidak diketahui sedang berlayar");
    }

    @Override
    public void berlabuh() {
        system.out.println("Transportasi Air dengan jenis yang tidak diketahui sedang berlabuh di pantai");
    }
}

