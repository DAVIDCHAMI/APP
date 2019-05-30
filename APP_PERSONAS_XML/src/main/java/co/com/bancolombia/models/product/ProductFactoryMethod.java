package co.com.bancolombia.models.product;


import co.com.bancolombia.models.products.Product;

/**
 * The interface Product factory method.
 */
public interface ProductFactoryMethod {

    /**
     * Create product product.
     *
     * @param numberProduct the number product
     * @param typeProduct   the type product
     * @return the product
     */
    Product createProduct(String numberProduct, String typeProduct);

}
