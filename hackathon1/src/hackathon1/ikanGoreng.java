/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackathon1;

/**
 *
 * @author Yoel Dimas
 */
public class ikanGoreng extends CondimentDecorator {
jenisMakanan makanan;
public ikanGoreng(jenisMakanan makanan) {
this.makanan = makanan;
}
public String getDescription() {
return makanan.getDescription() + ", Ikan Goreng";
}
public double cost() {
return .20 + makanan.cost();
}
}
