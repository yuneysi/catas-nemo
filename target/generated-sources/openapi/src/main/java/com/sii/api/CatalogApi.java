/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.sii.api;

import com.sii.api.model.CatalogResponse;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-10T01:02:30.956333+02:00[Europe/Berlin]")
@Validated
@Tag(name = "next-catalog-data", description = "Next catalog data")
public interface CatalogApi {

    default CatalogApiDelegate getDelegate() {
        return new CatalogApiDelegate() {};
    }

    /**
     * GET /catalog/{carlineId}/modelId} : List all equipments by model id.
     * Return the entire catalog for a model.
     *
     * @param carlineId  (required)
     * @param modelId  (required)
     * @return Returning a list of exterior (status code 200)
     *         or Authentication information is missing or invalid (status code 401)
     *         or The specified resource was not found. (status code 404)
     */
    @Operation(
        operationId = "getCatalogDataForModel",
        summary = "List all equipments by model id.",
        description = "Return the entire catalog for a model.",
        tags = { "next-catalog-data" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Returning a list of exterior", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CatalogResponse.class))
            }),
            @ApiResponse(responseCode = "401", description = "Authentication information is missing or invalid"),
            @ApiResponse(responseCode = "404", description = "The specified resource was not found.")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/catalog/{carlineId}/modelId}",
        produces = { "application/json" }
    )
    default ResponseEntity<CatalogResponse> getCatalogDataForModel(
        @Parameter(name = "carlineId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("carlineId") String carlineId,
        @NotNull @Parameter(name = "modelId", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "modelId", required = true) String modelId
    ) {
        return getDelegate().getCatalogDataForModel(carlineId, modelId);
    }

}