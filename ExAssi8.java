
package sidharthsircorejava;

interface ProductFactory {
    Pr addPro(int id, String nm, double price);
}

class Pr {

    public int id;
    String nm;
    double price;

    public Pr(int id, String nm, double price) {
        this.id = id;
        this.nm = nm;
        this.price = price;
    }

    public void disp() {
        System.out.println(id + " " + nm + " " + price);
    }
}

public class ExAssi8 {

    public static void main(String[] args) {

        ProductFactory pf = Pr::new;

        Pr p = pf.addPro(101, "Laptop", 55000.50);

        p.disp();
    }
}
