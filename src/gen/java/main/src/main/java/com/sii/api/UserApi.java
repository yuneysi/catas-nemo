/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.sii.api;

import java.util.List;
import java.time.OffsetDateTime;
import com.sii.api.model.User;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-09T21:36:01.055175+02:00[Europe/Berlin]")
@Validated
@Tag(name = "user", description = "Operations about user")
public interface UserApi {

    default UserApiDelegate getDelegate() {
        return new UserApiDelegate() {};
    }

    /**
     * POST /user : Create user
     * This can only be done by the logged in user.
     *
     * @param user Created user object (optional)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "createUser",
        summary = "Create user",
        description = "This can only be done by the logged in user.",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "default", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = User.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = User.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/user",
        produces = { "application/json", "application/xml" },
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" }
    )
    default ResponseEntity<User> createUser(
        @Parameter(name = "User", description = "Created user object") @Valid @RequestBody(required = false) User user
    ) {
        return getDelegate().createUser(user);
    }


    /**
     * POST /user/createWithList : Creates list of users with given input array
     * Creates list of users with given input array
     *
     * @param user  (optional)
     * @return Successful operation (status code 200)
     *         or successful operation (status code 200)
     */
    @Operation(
        operationId = "createUsersWithListInput",
        summary = "Creates list of users with given input array",
        description = "Creates list of users with given input array",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = User.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = User.class))
            }),
            @ApiResponse(responseCode = "default", description = "successful operation")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/user/createWithList",
        produces = { "application/json", "application/xml" },
        consumes = { "application/json" }
    )
    default ResponseEntity<User> createUsersWithListInput(
        @Parameter(name = "User", description = "") @Valid @RequestBody(required = false) List<User> user
    ) {
        return getDelegate().createUsersWithListInput(user);
    }


    /**
     * DELETE /user/{username} : Delete user
     * This can only be done by the logged in user.
     *
     * @param username The name that needs to be deleted (required)
     * @return Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @Operation(
        operationId = "deleteUser",
        summary = "Delete user",
        description = "This can only be done by the logged in user.",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
            @ApiResponse(responseCode = "404", description = "User not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/user/{username}"
    )
    default ResponseEntity<Void> deleteUser(
        @Parameter(name = "username", description = "The name that needs to be deleted", required = true, in = ParameterIn.PATH) @PathVariable("username") String username
    ) {
        return getDelegate().deleteUser(username);
    }


    /**
     * GET /user/{username} : Get user by user name
     * 
     *
     * @param username The name that needs to be fetched. Use user1 for testing.  (required)
     * @return successful operation (status code 200)
     *         or Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @Operation(
        operationId = "getUserByName",
        summary = "Get user by user name",
        description = "",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = User.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = User.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
            @ApiResponse(responseCode = "404", description = "User not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/{username}",
        produces = { "application/json", "application/xml" }
    )
    default ResponseEntity<User> getUserByName(
        @Parameter(name = "username", description = "The name that needs to be fetched. Use user1 for testing. ", required = true, in = ParameterIn.PATH) @PathVariable("username") String username
    ) {
        return getDelegate().getUserByName(username);
    }


    /**
     * GET /user/login : Logs user into the system
     * 
     *
     * @param username The user name for login (optional)
     * @param password The password for login in clear text (optional)
     * @return successful operation (status code 200)
     *         or Invalid username/password supplied (status code 400)
     */
    @Operation(
        operationId = "loginUser",
        summary = "Logs user into the system",
        description = "",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/xml", schema = @Schema(implementation = String.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid username/password supplied")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/login",
        produces = { "application/xml", "application/json" }
    )
    default ResponseEntity<String> loginUser(
        @Parameter(name = "username", description = "The user name for login", in = ParameterIn.QUERY) @Valid @RequestParam(value = "username", required = false) String username,
        @Parameter(name = "password", description = "The password for login in clear text", in = ParameterIn.QUERY) @Valid @RequestParam(value = "password", required = false) String password
    ) {
        return getDelegate().loginUser(username, password);
    }


    /**
     * GET /user/logout : Logs out current logged in user session
     * 
     *
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "logoutUser",
        summary = "Logs out current logged in user session",
        description = "",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "default", description = "successful operation")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/logout"
    )
    default ResponseEntity<Void> logoutUser(
        
    ) {
        return getDelegate().logoutUser();
    }


    /**
     * PUT /user/{username} : Update user
     * This can only be done by the logged in user.
     *
     * @param username name that need to be deleted (required)
     * @param user Update an existent user in the store (optional)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "updateUser",
        summary = "Update user",
        description = "This can only be done by the logged in user.",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "default", description = "successful operation")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/user/{username}",
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" }
    )
    default ResponseEntity<Void> updateUser(
        @Parameter(name = "username", description = "name that need to be deleted", required = true, in = ParameterIn.PATH) @PathVariable("username") String username,
        @Parameter(name = "User", description = "Update an existent user in the store") @Valid @RequestBody(required = false) User user
    ) {
        return getDelegate().updateUser(username, user);
    }

}