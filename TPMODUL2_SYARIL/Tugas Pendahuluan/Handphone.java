public class Handphone {
    protected boolean fingerprint;

    public Handphone(String drive, int ram, float processor, boolean fingerprint){
    this.drive = drive;
    this.ram = ram;
    this.processor = processor;
    this.fingerprint = fingerprint;
}

public void informasi(){
    system.out.println("Handphone ini memiliki drive berjenis"+ drive +"dengan ram"+ ram +"dan processor sekuat"+ processor +"selain itu handphone ini juga memiliki fingerprint"+ fingerprint);
}

public void telfon(){
    system.out.println("Handphone berhasil menghubungi nomor"+ nomor);
}

public void kirimSMS(){
    system.out.println("Handphone ini berhasil mengirimkan sms ke nomor"+ nomor);
}

public void kirimSMS(){
    system.out.println("Handphone ini berhasil mengirimkan sms ke nomor"+ nomor +"dan"+ nomor);
}

}

