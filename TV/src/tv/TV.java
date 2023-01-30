
package tv;


public class TV {

    
    public static void main(String[] args) {
        Tvtest tv1=new Tvtest(12,4,true);
        Tvtest tv2=new Tvtest(2,7,false);//obje
        tv1.setChannel(4);//set üzerinden çağırdığımız için verdiğimiz değerde çağırıldı
        tv2.kanalDegistirme();//method çağırdığımız için obje üzrindeki değerimiz dönüyor.
    }
    
}
