
package hackathon1;

public class ayamGoreng extends CondimentDecorator {
jenisMakanan makanan;
public ayamGoreng(jenisMakanan makanan) {
this.makanan = makanan;
}
public String getDescription() {
return makanan.getDescription() + ", Ayam Goreng";
}
public double cost() {
return .20 + makanan.cost();
}
}
