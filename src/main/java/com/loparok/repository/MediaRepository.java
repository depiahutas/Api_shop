package com.loparok.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.loparok.model.Media;

public interface MediaRepository  extends JpaRepository<Media, Integer>{

    
    public List<Media> findByProductId(int id);

    @Query(value = "SELECT media.id_product_as FROM shop.media inner join product on product.id = media.id_product_as group by media.id_product_as", nativeQuery = true)
    public List<Integer> findByProduct();

}
