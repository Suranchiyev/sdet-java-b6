package homework;

public class Item {
	public String name;
	public double priceForSingleItem;
	public int amount;
	public Section section;
	
	public Item(String name, double priceForSingleItem, int amount, Section section) {
		this.name = name;
		this.priceForSingleItem = priceForSingleItem;
		this.amount = amount;
		this.section = section;
	}
	
	
	@Override
	public String toString() {
		return "Item [name=" + name + ", priceForSingleItem=" + priceForSingleItem + ", amount=" + amount + ", section="
				+ section + "]";
	}
}
