public class Laptop {
    protected boolean webcam;

    public Laptop(String drive, int ram, float processor, boolean webcam){
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
        this.webcam = webcam;
    }

    public void informasi(){
        system.out.println("Laptop ini memiliki drive berjenis"+ drive +"dengan ram"+ ram +"dan processor sekuat"+ processor +"selain itu laptop ini juga memiliki webcam"+ webcam);
    }

    public void bukaGame(){
        system.out.println("Laptop sedang menjalankan game"+ game);
    }

    public void kirimEmail(){
        system.out.println("Laptop mengirimkan email ke"+ email);
    }

    public void kirimEmail(){
        system.out.println("Laptop mengirimkan email ke"+ email);
    }
}
