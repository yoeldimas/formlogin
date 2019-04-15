
package hackathon1;

public class tempetahu extends CondimentDecorator {
jenisMakanan makanan;
public tempetahu(jenisMakanan makanan) {
this.makanan = makanan;
}
public String getDescription() {
return makanan.getDescription() + ", Tempe/Tahu Goreng";
}
public double cost() {
return .20 + makanan.cost();
}
}