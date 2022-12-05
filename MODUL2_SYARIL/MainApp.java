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

    public class Sampan {
        protected int Layar;
    
    
        public Sampan (int JumlahKursi, int Biaya, int Layar) {
        this.JumlahKursi = JumlahKursi;
        this.Biaya = Biaya;
        this.Layar = Layar;
        }
    
        @Override
        public void informasi(){
            system.out.println("Transportasi Air dengan kursi berjumlah"+ JumlahKursi +"ditetapkan dengan biaya sebesar"+ biaya);
        }
    
        @Override
        public void berlayar(){
            system.out.println("Transportasi Air jenis sampan sedang berlayar menggunakan"+ Layar +"layar");
        }
        
        @Override
        public void berlabuh(){
            system.out.println("Transportasi Air jenis sampan berlabuh di pantai tanpa jangkar");
        }
    
        @Override
        public void berlabuh(){
            system.out.println("Transportasi Air jenis sampan berlabuh di pantai menggunakan 2 jangkar");
    
        }
            
}