package com.example.springbootsourcestudy.configuration;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 204506
 * @Description
 * @create 2022-07-01 17:11
 */
@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String, Object> globalHandler(Exception ex) {
        Map<String, Object> result = new HashMap<>(2);
        result.put("id", "aaabbb");
        result.put("message", ex.getMessage());
        return result;
    }
}
