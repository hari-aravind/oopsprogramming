//Problem 2

package tasksthree
public class Product implements Taxable {
    private int pid;
    private double price;
    private int qty;

    public Product(int pid, double price, int qty) {
        this.pid = pid;
        this.price = price;
        this.qty = qty;
    }

    @Override
    public double calcTax(double price) { // product tax calculation
        price = price * this.qty;
        double salesTaxAmount = price * (salesTax / 100);
        return salesTaxAmount;
    }

}