package code;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import dto.CheckoutDTO;
import dto.ProductDTO;

public class CheckoutService {

	public static Double sumTotal(List<ProductDTO> list) {
        double total = list.stream()
                .mapToDouble(productDTO -> productDTO.getPrice() * productDTO.getQuantity())
                .sum();
        total = Math.round(total * 100)/100d;
        return total;
    }

	public static ProductDTO findHighestProduct(List<ProductDTO> list) {
		return list.stream().max(Comparator.comparing(ProductDTO::getPrice)).get();
//		return list.stream().collect(Collectors.maxBy(Comparator.comparing(ProductDTO::getPrice))).get();
	}

	public static Double sumDiscount(List<ProductDTO> list) {
		return list.stream().filter(ProductDTO::isDiscount)
				.mapToDouble(prod -> prod.getPrice()*prod.getQuantity()
						).sum();
	}

	public static int sumQuantity(List<ProductDTO> list) {
		return list.stream()
				.mapToInt(ProductDTO::getQuantity).sum();
//				.mapToInt(prod -> prod.getQuantity()).sum();
	}

	public static String[] getProducts(List<ProductDTO> list) {
		List<String> result = list.stream()
				.map(ProductDTO::getSku).collect(Collectors.toList());
		
		return result.toArray(new String[list.size()]);
	}

	public static List<ProductDTO> orderedByTotalPrice(List<ProductDTO> list) {
		return list.stream().sorted(Comparator.comparing(prod -> prod.getPrice()*prod.getQuantity())).collect(Collectors.toList());
	}

	public static CheckoutDTO checkout(List<ProductDTO> list) {
		return new CheckoutDTO(CheckoutService.sumTotal(list),CheckoutService.sumQuantity(list),CheckoutService.getProducts(list));
	} 
}
