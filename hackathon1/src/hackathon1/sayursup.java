
package hackathon1;

public class sayursup extends CondimentDecorator {
jenisMakanan makanan;
public sayursup(jenisMakanan makanan) {
this.makanan = makanan;
}
public String getDescription() {
return makanan.getDescription() + ", Mocha";
}
public double cost() {
return .20 + makanan.cost();
}
}
