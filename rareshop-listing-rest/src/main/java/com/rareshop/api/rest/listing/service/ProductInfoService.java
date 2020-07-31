package com.rareshop.api.rest.listing.service;

import com.rareshop.api.rest.listing.model.BasicProductInfo;
import org.springframework.stereotype.Service;
import rareshop.api.common.core.model.Acknowledgement;

import java.util.List;

@Service
public interface ProductInfoService {

    Acknowledgement addProductInfo(BasicProductInfo productInfo);

    List<BasicProductInfo> getAllProductInfo();

    BasicProductInfo getProductInfo(long id);

    Acknowledgement updateProductInfo(BasicProductInfo productInfo);

    Acknowledgement deleteProductInfo(long id);

    Acknowledgement publishProductInfo(long id, boolean published);
}
