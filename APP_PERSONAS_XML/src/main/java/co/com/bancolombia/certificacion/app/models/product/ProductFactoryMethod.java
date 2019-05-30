package co.com.bancolombia.certificacion.app.models.product;


import co.com.bancolombia.certificacion.app.models.products.Product;

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
