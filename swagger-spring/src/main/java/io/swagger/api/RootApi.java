/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.8).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.InlineResponse200;
import io.swagger.model.Root;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-17T11:11:04.278Z")

@Api(value = "root", description = "the root API")
public interface RootApi {

    @ApiOperation(value = "Deletes a Root", nickname = "deleteRoot", notes = "Rootto be Deleted", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Pet not found") })
    @RequestMapping(value = "/root",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteRoot(@ApiParam(value = "" ) @RequestHeader(value="api_key", required=false) String apiKey);


    @ApiOperation(value = "Entity to be fetched is Root", nickname = "getOperationRoot", notes = " This API is used to fetch the Root records from the system", response = InlineResponse200.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Response", response = InlineResponse200.class) })
    @RequestMapping(value = "/root",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse200> getOperationRoot(@NotNull @ApiParam(value = "Maximum number of elements per page", required = true) @Valid @RequestParam(value = "limit", required = true) Integer limit,@NotNull @ApiParam(value = "Page number", required = true) @Valid @RequestParam(value = "page", required = true) Integer page);


    @ApiOperation(value = "To Create a new record for the entity: Root", nickname = "postOperationRoot", notes = "This API is used to create new Root records in the system", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation"),
        @ApiResponse(code = 400, message = "Invalid ID supplied") })
    @RequestMapping(value = "/root",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/xml", "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> postOperationRoot(@ApiParam(value = "RootThis API is used to create new" ,required=true )  @Valid @RequestBody Root root);


    @ApiOperation(value = "Update an existing Root", nickname = "updateRoot", notes = "Rootto be Updated", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Response"),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Pet not found"),
        @ApiResponse(code = 405, message = "Validation exception") })
    @RequestMapping(value = "/root",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/xml", "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateRoot(@ApiParam(value = "Rootobject that needs to be added to the store" ,required=true )  @Valid @RequestBody Root body);

}
