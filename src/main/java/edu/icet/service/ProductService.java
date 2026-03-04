package edu.icet.service;

import edu.icet.model.dto.ProductRequest;
import edu.icet.model.dto.ProductResponse;
import edu.icet.model.entity.Product;
import edu.icet.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;

    public void createProduct(ProductRequest productRequest) {

        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        productRepository.save(product);
        log.info("Product {} is saved",product.getId());

    }


    public List<ProductResponse> getAllProducts() {


    }


}
