package lv.venta.service;

import java.util.ArrayList;

import lv.venta.model.Product;
import lv.venta.utils.MyException;

public interface ICRUDProductService {
	
	//CRUD - create - retrieve - update - delete
	public abstract Product create(String title, String description,
			float price, int quantity) throws MyException;
	
	public abstract ArrayList<Product> retrieveAll() throws MyException;
	
	public abstract Product retrieveById(int id)throws MyException;
	
	public abstract void updateById(int id, String title, String description,
			float price, int quantity) throws MyException;
	
	public abstract void deleteById(int id) throws MyException;
	
}
