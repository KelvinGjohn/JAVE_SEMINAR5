package lv.venta;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lv.venta.model.Category;
import lv.venta.model.Product;
import lv.venta.repo._ProductRepo;

@SpringBootApplication
public class Seminar5Application {

	public static void main(String[] args) {
		SpringApplication.run(Seminar5Application.class, args);
	}
	
	@Bean // call function automatic
	public CommandLineRunner testDatabase(_ProductRepo prodRepo) {
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				// TODO Auto-generated method stub
				Product productData1 = 
						new Product( "Apple", Category.cellphones, 0.99f, 3, "White");
				
				Product productData2 = 
						new Product( "Promax", Category.cellphones, 0.99f, 3, "gray");
				
				Product productData3 = 
						new Product( "Blackberry", Category.cellphones, 0.99f, 3, "brown");
				
				prodRepo.save(productData1);
				prodRepo.save(productData2);
				prodRepo.save(productData3);
				
				
				
			}
		};
	}

}
