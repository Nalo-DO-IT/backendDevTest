package com.example.demo.infrastructure.http.mapper;

import com.example.demo.domain.model.ProductDetail;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-25T17:09:49+0100",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 15 (Oracle Corporation)"
)
public class ProductDetailMapperImpl implements ProductDetailMapper {

    @Override
    public Set<com.example.demo.infrastructure.http.model.ProductDetail> parse(Set<ProductDetail> set) {
        if ( set == null ) {
            return null;
        }

        Set<com.example.demo.infrastructure.http.model.ProductDetail> set1 = new HashSet<com.example.demo.infrastructure.http.model.ProductDetail>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( ProductDetail productDetail : set ) {
            set1.add( productDetailToProductDetail( productDetail ) );
        }

        return set1;
    }

    @Override
    public ProductDetail parse(com.example.demo.infrastructure.http.external.model.ProductDetail productDetail) {
        if ( productDetail == null ) {
            return null;
        }

        ProductDetail productDetail1 = new ProductDetail();

        productDetail1.setId( productDetail.getId() );
        productDetail1.setName( productDetail.getName() );
        productDetail1.setPrice( productDetail.getPrice() );
        if ( productDetail.getAvailability() != null ) {
            productDetail1.setAvailability( productDetail.getAvailability() );
        }

        return productDetail1;
    }

    protected com.example.demo.infrastructure.http.model.ProductDetail productDetailToProductDetail(ProductDetail productDetail) {
        if ( productDetail == null ) {
            return null;
        }

        com.example.demo.infrastructure.http.model.ProductDetail productDetail1 = new com.example.demo.infrastructure.http.model.ProductDetail();

        productDetail1.setId( productDetail.getId() );
        productDetail1.setName( productDetail.getName() );
        productDetail1.setPrice( productDetail.getPrice() );
        productDetail1.setAvailability( productDetail.isAvailability() );

        return productDetail1;
    }
}
