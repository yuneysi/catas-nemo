package com.sii.api;

import com.sii.api.model.CatalogResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-10T01:47:17.270867+02:00[Europe/Berlin]")
@Controller
@RequestMapping("${openapi.nextCatalogService.base-path:}")
public class CatalogApiController implements CatalogApi {

    private final CatalogApiDelegate delegate;

    public CatalogApiController(@Autowired(required = false) CatalogApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new CatalogApiDelegate() {});
    }

    @Override
    public CatalogApiDelegate getDelegate() {
        return delegate;
    }

}
