public class Perangkat {
    protected String drive, int ram, float processor;
    
    public Perangkat(String drive, int ram, float processor){
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }

    public void informasi(){
        system.out.println("Perangkat belum terindikasi jenis drive"+ drive +"dan ram"+ ram +"juga processor sekuat"+ processor);
    }
}

