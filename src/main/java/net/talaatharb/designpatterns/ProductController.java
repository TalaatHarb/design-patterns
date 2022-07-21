package net.talaatharb.designpatterns;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ProductController {
	
	private final NotificationService notificationService;

	@GetMapping("/products")
	public List<Product> getProducts() {
		notificationService.notifyUser();
		return List.of("A", "B", "C").stream().map(Product::new).collect(Collectors.toList());
	}
}
