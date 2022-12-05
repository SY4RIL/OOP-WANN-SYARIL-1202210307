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

