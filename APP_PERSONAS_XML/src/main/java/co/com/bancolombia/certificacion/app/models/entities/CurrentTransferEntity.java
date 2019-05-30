package co.com.bancolombia.certificacion.app.models.entities;


import co.com.bancolombia.certificacion.app.models.product.ProductFactory;
import co.com.bancolombia.certificacion.app.models.product.ProductFactoryMethod;
import co.com.bancolombia.certificacion.app.models.transaction.Transfer;
import co.com.bancolombia.certificacion.app.models.products.Product;

import java.util.List;

import static co.com.bancolombia.certificacion.app.utilities.constant.ConstantsManager.TRANSACTION_CODE_ACH;


/**
 * The type Current transfer entity.
 */
public class CurrentTransferEntity {
    private static Transfer transfer;

    private CurrentTransferEntity() {

    }

    /**
     * Gets transfer.
     *
     * @return the transfer
     */
    public static Transfer getTransfer() {
        return transfer;
    }

    /**
     * Sets transfer.
     *
     * @param data the data
     */
    public static void setTransfer(List<String> data) {
        Transfer transfer = new Transfer();
        ProductFactoryMethod productFactory = new ProductFactory();

        Product originProduct = productFactory.createProduct(data.get(0), data.get(1));
        Product destinationProduct = productFactory.createProduct(data.get(2), data.get(3));
        transfer.setOriginProduct(originProduct);
        transfer.setDestinationProduct(destinationProduct);
        transfer.setAmount(data.get(4));

        if (CurrentTrasactionConfigEntity.getTransactionConfig().getTransactionCode().equals(TRANSACTION_CODE_ACH)) {
            transfer.setBank(data.get(5));
            transfer.setDescription(data.get(6));
            transfer.setAdditionalInformation(data.get(7));
        }
        
        CurrentTransferEntity.transfer = transfer;
    }

}
