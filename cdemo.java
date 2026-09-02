
public class cdemo extends pdemo {

    int c, d;
    int resc;

    cdemo() {
        c = 9;
        d = 5;
    }

    void sum() {
        resc = c + d;
        System.out.println("Sub=" + resc);
    }

    public static void main(String[] args) {
        cdemo cobj =(cdemo)(new pdemo());
        cobj.sum();   
    }
}
