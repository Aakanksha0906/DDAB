package io.swagger.api;

import io.swagger.model.InlineResponse2006;
import io.swagger.model.Orders;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-17T11:11:04.278Z")

@Controller
public class OrdersApiController implements OrdersApi {

    private static final Logger log = LoggerFactory.getLogger(OrdersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public OrdersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> deleteOrders(@ApiParam(value = "" ) @RequestHeader(value="api_key", required=false) String apiKey) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2006> getOperationOrders(@NotNull @ApiParam(value = "Maximum number of elements per page", required = true) @Valid @RequestParam(value = "limit", required = true) Integer limit,@NotNull @ApiParam(value = "Page number", required = true) @Valid @RequestParam(value = "page", required = true) Integer page) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<InlineResponse2006>(objectMapper.readValue("<null>  <page>5</page>  <limit>10</limit>  <totalPages>10</totalPages>  <totalRecords>100</totalRecords></null>", InlineResponse2006.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<InlineResponse2006>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2006>(objectMapper.readValue("{  \"schema\" : [ {    \"order\" : [ {      \"shipInfo\" : {        \"shipCity\" : \"helloworld\",        \"shipVia\" : 6598741,        \"freight\" : 655498.5456,        \"shipName\" : \"helloworld\",        \"shipPostalCode\" : \"helloworld\",        \"shipRegion\" : \"helloworld\",        \"shipCountry\" : \"helloworld\",        \"shippedDate\" : \"12252019\",        \"shipAddress\" : \"helloworld\"      },      \"customerID\" : \"helloworld\",      \"requiredDate\" : \"12252019\",      \"employeeID\" : \"helloworld\",      \"orderDate\" : \"12252019\"    }, {      \"shipInfo\" : {        \"shipCity\" : \"helloworld\",        \"shipVia\" : 6598741,        \"freight\" : 655498.5456,        \"shipName\" : \"helloworld\",        \"shipPostalCode\" : \"helloworld\",        \"shipRegion\" : \"helloworld\",        \"shipCountry\" : \"helloworld\",        \"shippedDate\" : \"12252019\",        \"shipAddress\" : \"helloworld\"      },      \"customerID\" : \"helloworld\",      \"requiredDate\" : \"12252019\",      \"employeeID\" : \"helloworld\",      \"orderDate\" : \"12252019\"    } ]  }, {    \"order\" : [ {      \"shipInfo\" : {        \"shipCity\" : \"helloworld\",        \"shipVia\" : 6598741,        \"freight\" : 655498.5456,        \"shipName\" : \"helloworld\",        \"shipPostalCode\" : \"helloworld\",        \"shipRegion\" : \"helloworld\",        \"shipCountry\" : \"helloworld\",        \"shippedDate\" : \"12252019\",        \"shipAddress\" : \"helloworld\"      },      \"customerID\" : \"helloworld\",      \"requiredDate\" : \"12252019\",      \"employeeID\" : \"helloworld\",      \"orderDate\" : \"12252019\"    }, {      \"shipInfo\" : {        \"shipCity\" : \"helloworld\",        \"shipVia\" : 6598741,        \"freight\" : 655498.5456,        \"shipName\" : \"helloworld\",        \"shipPostalCode\" : \"helloworld\",        \"shipRegion\" : \"helloworld\",        \"shipCountry\" : \"helloworld\",        \"shippedDate\" : \"12252019\",        \"shipAddress\" : \"helloworld\"      },      \"customerID\" : \"helloworld\",      \"requiredDate\" : \"12252019\",      \"employeeID\" : \"helloworld\",      \"orderDate\" : \"12252019\"    } ]  } ],  \"totalRecords\" : 100,  \"limit\" : 10,  \"totalPages\" : 10,  \"page\" : 5}", InlineResponse2006.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2006>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2006>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> postOperationOrders(@ApiParam(value = "OrdersThis API is used to create new" ,required=true )  @Valid @RequestBody Orders orders) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateOrders(@ApiParam(value = "Ordersobject that needs to be added to the store" ,required=true )  @Valid @RequestBody Orders body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
