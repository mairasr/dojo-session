package test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import code.CheckoutService;
import dto.CheckoutDTO;
import dto.ProductDTO;

public class CheckoutServiceTest {

	@Test
	public void test00() {
		double expected = 1505.58d;
		Assertions.assertEquals(expected, CheckoutService.sumTotal(buildProductDTOs()));
	}

	@Test
	public void test01() {
		ProductDTO expected = buildProductDTOs().get(1);
		Assertions.assertEquals(expected, CheckoutService.findHighestProduct(buildProductDTOs()));
	}

	@Test
	public void test02() {		
		double expected = 1319.88d;
		Assertions.assertEquals(expected, CheckoutService.sumDiscount(buildProductDTOs()));
	}
	
	@Test
	public void test03() {		
		List<ProductDTO> expected = buildOrderedByTotalPriceProductDTOs();
		Assertions.assertEquals(expected, CheckoutService.orderedByTotalPrice(buildProductDTOs()));
	}

	@Test
	public void test04() {
		CheckoutDTO expected = buildCheckoutDTO();
		Assertions.assertEquals(expected, CheckoutService.checkout(buildProductDTOs()));
	}

	private List<ProductDTO> buildProductDTOs(){
		List<ProductDTO> productDTOs = new ArrayList<>();
		productDTOs.add(new ProductDTO("PROD1", 10, false, 9.90));
		productDTOs.add(new ProductDTO("PROD2", 1, true, 109.90));
		productDTOs.add(new ProductDTO("PROD3", 12, true, 100.00));
		productDTOs.add(new ProductDTO("PROD4", 30, false, 0.9));
		productDTOs.add(new ProductDTO("PROD5", 30, false, 1.99));
		productDTOs.add(new ProductDTO("PROD6", 2, true, 4.99));
		return productDTOs;
	}
	
	private List<ProductDTO> buildOrderedByTotalPriceProductDTOs(){
		List<ProductDTO> productDTOs = new ArrayList<>();
		productDTOs.add(new ProductDTO("PROD6", 2, true, 4.99));
		productDTOs.add(new ProductDTO("PROD4", 30, false, 0.9));
		productDTOs.add(new ProductDTO("PROD5", 30, false, 1.99));
		productDTOs.add(new ProductDTO("PROD1", 10, false, 9.90));
		productDTOs.add(new ProductDTO("PROD2", 1, true, 109.90));
		productDTOs.add(new ProductDTO("PROD3", 12, true, 100.00));
		return productDTOs;
	}
	
	private CheckoutDTO buildCheckoutDTO(){
		return new CheckoutDTO(1505.58d, 85, new String[] {"PROD1", "PROD2", "PROD3", "PROD4", "PROD5", "PROD6"});
	}
	

}
