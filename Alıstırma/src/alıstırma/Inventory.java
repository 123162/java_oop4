
package alıstırma;

public class Inventory {
    private String item;//madde
	private int qty;//miktar
	private float price;//fiyat

	public Inventory(String item, int qty, float price)//constractor
	{
		this.item = item;
		this.qty = qty;
		this.price = price;
	}

	public float getTotal()
	{
		return qty * price;
	}

	public String toString()
	{
		return "Item: " + item + "\n" + "Quantity: " + qty + "\n"
					+ "Price: " + price;
	}
}
