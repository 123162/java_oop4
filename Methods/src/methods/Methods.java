
package methods;

public class Methods {

    public static boolean AsalMi(int sayi){
        for(int i=2;i<sayi;i++){
            if(sayi%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        AsalMi(5);
    }
    
}
