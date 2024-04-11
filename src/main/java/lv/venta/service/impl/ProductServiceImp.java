package lv.venta.service.impl;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import lv.venta.model.Product;
import lv.venta.service.ICRUDProductService;
import lv.venta.service.IFilterProductService;

@Service
public class ProductServiceImp implements ICRUDProductService, IFilterProductService{

	private ArrayList<Product> allProducts = new ArrayList<>(
			Arrays.asList(
					new Product("Abols", "Sarkans", 0.99f, 5),
					new Product("Zemene", "Salda", 1.99f, 50),
					new Product("Burkans", "Oranžš", 0.39f, 500)));

	@Override
	public Product create(String title, String description, float price, int quantity) throws Exception {
		//pārbaudam ienākošos parametrus
		if(title==null || description==null || price < 0 || quantity < 0)
			throw new Exception("Problems with input params");
		
		
		//noskaidrojam, vai jau tāds produkts neeksistē
		for(Product tempP: allProducts) {
			if(tempP.getTitle().equals(title) && tempP.getDescription().equals(description)
					&& tempP.getPrice() == price) {
				tempP.setQuantity(tempP.getQuantity() + quantity);
				return tempP;
			}
		}
		//ja tāds produkts neeksistē, tad izveidojam jaunu
		Product newProduct = new Product(title, description, price, quantity);
		allProducts.add(newProduct);
		return newProduct;

	}

	@Override
	public ArrayList<Product> retrieveAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product retrieveById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateById(int id, String title, String description, float price, int quantity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int id) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public ArrayList<Product> filterByPriceLessThanThreshold(float threshold) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Product> filterByQuantityLessThanThreshold(int threshold) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Product> filterByTitleOrDescription(String text) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float calculateProductsTotalValue() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
