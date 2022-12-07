package com.nest.shopping_cart_backend.doa;

import com.nest.shopping_cart_backend.model.Shopping;
import org.springframework.data.repository.CrudRepository;

public interface ShoppingDao extends CrudRepository<Shopping,Integer> {
}
