package lv.venta.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
//@AllArgsConstructor
public class Product {
	
	@Setter(value = AccessLevel.NONE)//priekš ID nebūs automātiskais set
	private int id;
	
	private String title;
	private String description;
	private float price;
	private int quantity;
	
	
	private static int counter = 1;
	
	public void setId() {
		this.id = counter++;
	}
	public Product(String title, String desription, float price, int quantity) {
		setId();
		setTitle(title);
		setDescription(desription);
		setPrice(price);
		setQuantity(quantity);
	}

}
