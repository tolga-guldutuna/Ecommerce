package com.ecommerce.pim.dtos.create;

import com.ecommerce.pim.models.Product;
import lombok.Data;

/**
 * Created on October 2022
 *
 * @author tolga
 */

@Data
public class CreateStockRequestDto {
    private int amount;

    private Boolean available;

}
