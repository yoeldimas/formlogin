
package hackathon1;

public class sayurasam extends CondimentDecorator {
jenisMakanan makanan;
public sayurasam(jenisMakanan makanan) {
this.makanan = makanan;
}
public String getDescription() {
return makanan.getDescription() + ", Mocha";
}
public double cost() {
return .20 + makanan.cost();
}
}
