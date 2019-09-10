/**
 * 
 */

/**
 * @author Riyash Goboodun
 *
 */
public class Item {
	
	/*static attributes*/
	private static int totalItems = 0;
	
	/*Attributes*/
	private String itemId;
	private String name;
	private String description;
	private String category;
	private String supplierName;
	private String supplierContact;
	private double price;
	private int availableQuantity;
	
	/*constructor*/
	/**
	 * default constructor
	 */
	public Item() {
		this.itemId = null;
		this.name = null;
		this.description = null;
		this.category = null;
		this.supplierName = null;
		this.supplierContact = null;
		this.price = 0.0;
		this.availableQuantity = 0;
		
		//incrementing the count to track number of object created 
		setTotalItems(getTotalItems() + 1);
			
	}
	/**8 overloaded constructors
	 * @param itemId of item
	 * @param name of item
	 * @param description of item
	 * @param category of item
	 * @param supplierName of item
	 * @param supplierContact of item
	 * @param price of item
	 * @param availableQuantity of item
	 */
	public Item(String itemId, String name, String description, String category, String supplierName, String supplierContact, double price, int availableQuantity) {
		
		this.itemId = itemId;
		this.name = name;
		this.description = description;
		this.category = category;
		this.supplierName = supplierName;
		this.supplierContact = supplierContact;
		this.price = price;
		this.availableQuantity = availableQuantity;
	
		//incrementing the count to track number of object created 
		setTotalItems(getTotalItems() + 1);
	}
	/*behaviors*/
	/*getters*/
	
	/**
	 * @return the itemId of item
	 */
	public String getItemId() {
		return this.itemId;
	}
	/**
	 * @return the name of item
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * @return the description of item
	 */
	public String getDescription() {
		return this.description;
	}
	/**
	 * @return the category of item
	 */
	public String getCategory() {
		return this.category;
	}
	/**
	 * @return the supplierName of item
	 */
	public String getSupplierName() {
		return this.supplierName;
	}
	/**
	 * @return the supplierContact of item
	 */
	public String getSupplierContact() {
		return this.supplierContact;
	}
	/**
	 * @return the price of item
	 */
	public double getPrice() {
		return this.price;
	}
	/**
	 * @return the availableQuantity of item
	 */
	public int getAvailableQuantity() {
		return this.availableQuantity;
	}
	
	/*setter*/
	
	/**
	 * @param itemId the itemId to set item
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	/**
	 * @param name the name to set item
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param description the description to set item
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @param category the category to set item
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @param supplierName the supplierName to set item
	 */
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	/**
	 * @param supplierContact the supplierContact to set item
	 */
	public void setSupplierContact(String supplierContact) {
		this.supplierContact = supplierContact;
	}
	/**
	 * @param price the price to set item
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @param availableQuantity the availableQuantity to set  item
	 */
	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
	
	public boolean equals(Item p) {
		if(this.itemId.equalsIgnoreCase(p.itemId)) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public String toString() {
		return "itemId=" + itemId + ", name=" + name + ", description=" + description + ", category=" + category
				+ ", supplierName=" + supplierName + ", supplierContact=" + supplierContact + ", price=" + price
				+ ", availableQuantity=" + availableQuantity ;
	}
	
	/**
	 * @return the totalItems of item
	 */
	public static int getTotalItems() {
		return totalItems;
	}
	/**
	 * @param totalItems the totalItems to set item
	 */
	public static void setTotalItems(int totalItems) {
		Item.totalItems = totalItems;
	}
	
	
	
}
