package com.mengxuegu.springcloud.mapper;

import com.mengxuegu.springcloud.entities.Product;

import java.util.List;

//import org.apache.ibatis.annotations.Mapper;

//@Mapper //或在主启动类上使用@MapperScan注解
public interface ProductMapper {

    Product findById(Long pid);
    List<Product> findAll();
    boolean addProduct(Product product);
}
