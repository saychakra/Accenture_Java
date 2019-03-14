import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class retailShop {
	private String shopName, shopAddress;
	private String[] products;

	public retailShop() {}

	public retailShop(String shopName, String shopAddress, String products[]) {
		this.shopName = shopName;
		this.shopAddress = shopAddress;
		this.products = products;
	}
	public void setShopName(String shopName1) {
		this.shopName = shopName1;
	}
	public String getShopName() {
		return this.shopName;
	}
	public void setShopAddress(String shopAddress1) {
		this.shopName = shopAddress1;
	}
	public String getShopAddress() {
		return this.shopAddress;
	}
	public void setProducts(String[] products) {
		this.products = products;
	}
	public String[] getProducts() {
		return this.products;
	}

	public boolean checkProductAvailability(String productName) {
//		if (Arrays.asList(products).contains(productName)) {
//			return true;
//		} else {
//			return false;
//		}
		boolean contains = false;
		for (int i = 0; i < products.length; i++) {
			if (products[i].equalsIgnoreCase(productName)) {
				contains = true;
				break;
			}
		}
		return contains;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the shopname:");
		String shopName = reader.readLine();
		System.out.println("Enter the shop address:");
		String shopAddress = reader.readLine();
		System.out.println("Enter number of products:");
		int n = Integer.parseInt(reader.readLine());
		String products[] = new String[n];
		for (int i = 0; i < n; i++) {
			products[i] = reader.readLine();
		}
		System.out.println("Enter the product to be searched:");
		String productName = reader.readLine();
//		retailShop obj = new retailShop();
//		obj.setShopName(shopName);
//		obj.setShopAddress(shopAddress);
//		obj.setProducts(products);
//		obj.showShit();
		retailShop ob = new retailShop(shopName, shopAddress, products);
		if(ob.checkProductAvailability(productName)) {
			System.out.println("Product is available at " + shopName + ", " + shopAddress + ".");
		} else {
			System.out.println("Product is not available at " + shopName + ", " + shopAddress + ".");
		}
	}
}
