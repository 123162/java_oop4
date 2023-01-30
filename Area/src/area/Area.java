
package area;

public class Area {

    public static void main(String[] args) {
        Areatest area=new Areatest(3,4);
        area.getBreadth();
        System.out.println(area.getBreadth());
        System.out.println(area.getLength());
        int alan=area.getBreadth()*area.getLength();
        System.out.println("alan:"+alan);
    }
    
}
