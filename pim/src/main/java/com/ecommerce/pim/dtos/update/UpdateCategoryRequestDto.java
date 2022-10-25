package com.ecommerce.pim.dtos.update;

import com.ecommerce.pim.models.Category;
import com.ecommerce.pim.models.Product;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Set;

@Data
public class UpdateCategoryRequestDto {
    @NotBlank
    private String categoryTitle;

    @NotBlank
    private String imageUrl;


    private Set<Category> subCategories;


    private Category parentCategory;


    private Set<Product> products;
}