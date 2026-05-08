package lv.venta.service.impl;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lv.venta.model.Category;
import lv.venta.model.Product;
import lv.venta.repo._ProductRepo;
import lv.venta.service.IproductfilterService;

@Service
public class ProductfilterServiceImpl implements IproductfilterService {\
	
	
	
	@Autowired
	private _ProductRepo proRepp;

	@Override
	public ArrayList<Product> filterByCategory(Category category) throws Exception {
		if(category == null) {
			throw new Exception("Wrong input param");
		}
		ArrayList<Product> result = proRepp.findByCatergory(category);
		
		if(result.isEmpty()) {
			throw new Exception("there are no product under category " + category);
		}
		else
		{
			return result;
		}
		
	}

	@Override
	public ArrayList<Product> filterByPrice(float priceLevel) throws Exception {
		if (priceLevel > 0 && priceLevel < 100) {
			throw new Exception("Price Level should be 0 - 100 eur");
		}
		ArrayList<Product> result = proRepp.findByPriceLessThan(priceLevel);
		if (result.isEmpty()) {
			throw new Exception("there are no " + "product which price is less than" + priceLevel); 
		}
	}

	@Override
	public ArrayList<Product> filterByKeyword(String keyword) throws Exception {
		if (p\)
		return null;
	}

	@Override
	public float calculateAvgPrice() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
