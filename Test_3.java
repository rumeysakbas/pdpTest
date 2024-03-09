package odev;
import java.util.UUID;
public class Test_1 {
    private String motorNo;
    private boolean calisiyor;
    /**
    * Varsayılan kurucu fonksiyon
    */
    public Motor() {
        this.motorNo = UUID.randomUUID().toString();
        /* Başlangıçta false */calisiyor = false;

    }
    /**
    *
    * @param motorNo UUID olarak motor id
    * @return motor instance
    */
    public Motor(String motorNo) {
    /*
    * Varolan bir motor no ile oluşturuluyor.
    */
    this.motorNo = motorNo;
    calisiyor = false; // false yapılıyor
    }   
    public void calistir() {
    /**
    * calisiyor true yapılıyor
    */
    calisiyor = true;
    }

    // hckdslıjxcv

    public void durdur() {
    calisiyor = false;
    }
   
}