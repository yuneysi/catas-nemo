package com.sii.catas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import com.sii.catas.api.ApiUtil;
import com.sii.catas.api.CatalogApiController;
import com.sii.catas.api.CatalogApiDelegate;
import com.sii.catas.api.model.CatalogResponse;

public class CatalogForNemoController extends CatalogApiController {

  public CatalogForNemoController(CatalogApiDelegate delegate) {
    super(delegate);
  }

  @Override
  public ResponseEntity<CatalogResponse> getCatalogDataForModel(String carlineId,
      String modelId, String language) {

    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

  }
}
