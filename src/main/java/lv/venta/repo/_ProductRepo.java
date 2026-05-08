package lv.venta.repo;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import lv.venta.model.Category;
import lv.venta.model.Product;

public interface _ProductRepo 
		extends CrudRepository<Product, Integer> {

	boolean existsByTitleAndCategoryAndPriceAndQuantityAndDescription(String title, Category category, float price,
			int quantity, String description);
	//only abstract functions will be there


	ArrayList<Product> findByCatergory(Category category);


	ArrayList<Product> findByPriceLessThan(float priceLevel);


	ArrayList<Product> findByTitleContainingOrDescriptionContaining(String keyword, String keyword2);


	float myCalculateAvgPrice();
}