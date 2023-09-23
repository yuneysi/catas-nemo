package com.sii.catas.api.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.sii.catas.api.CatalogApiController;
import com.sii.catas.api.CatalogApiDelegate;
import com.sii.catas.api.model.CatalogResponse;
import com.sii.catas.api.model.InpuParameters;
import com.sii.catas.facade.CatalogForNemoFacade;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public class CatalogForNemoController extends CatalogApiController {


  CatalogForNemoFacade facade;

  public CatalogForNemoController(CatalogApiDelegate delegate, CatalogForNemoFacade facade) {
    super(delegate);
    this.facade = facade;
  }

  @Override
  public ResponseEntity<CatalogResponse> getCatalogDataForModel(
      @Parameter(name = "carlineId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("carlineId") String carlineId,
      @NotNull
      @Parameter(name = "modelId", description = "", required = true, in = ParameterIn.QUERY) @Valid
      @RequestParam(value = "modelId", required = true) String modelId,
      @Parameter(name = "InpuParameters", description = "Optional description in *Markdown*", required = true) @Valid @RequestBody
      InpuParameters inpuParameters
  )  {

    facade.getGroups();
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

  }
}
