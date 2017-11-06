
public class Invoice implements Payable{
	private String num;
	private String product;
	private int quantity;
	private double amount;
	
	public Invoice(){
		num = "";
		product = "";
		quantity = 0;
		amount = 0;
	}
	
	public Invoice(String n , String p , int q, double a){
		num = n;
		product =p;
		quantity = q;
		amount = a;
	}

	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return (double)quantity*amount;
	}
	

	public String getNum() {
		return num;
	}



	public void setNum(String num) {
		this.num = num;
	}



	public String getProduct() {
		return product;
	}



	public void setProduct(String product) {
		this.product = product;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public double getAmount() {
		return amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}



	@Override
	public String toString() {
		return "Invoice: \nID = " + num + "\nProduct = " + product + "\nQuantity = " + quantity + "\nAmount = " + amount + "\n";
	}
	

}
