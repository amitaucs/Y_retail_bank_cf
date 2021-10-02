package com.d2d.account.controller;


import io.swagger.annotations.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/retailBank/v1")
@Tag(name = "New Account")
@Api(tags = {"New Account"})
public class AccountController {

    @ApiOperation(value = "Greeting")
    @ApiResponses(value = {@ApiResponse(code = 500, message = "Internal Server Error"),
            @ApiResponse(code = 200, message = "OK", response = String.class)})

    @GetMapping("/welcome")
    public ResponseEntity<String> creditCardApplicationStatus(
            @ApiParam(value = "Customer name", type = "String", required = true)
            @RequestParam String customerName) {

        if (StringUtils.isEmpty(customerName)) {
            ResponseEntity.badRequest().build();
        }

        return  ResponseEntity.status(HttpStatus.OK).body(  "<html>\n" + "<header><title>Welcome</title></header>\n" +
                "<body>\n <b><p style=\"color:green\">" +"Hi " + customerName +" welcome \n" + "</p></b></body>\n" + "</html>");

    }
}
