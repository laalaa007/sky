package com.sky.utils;

import org.apache.commons.lang.text.StrBuilder;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

public class BindingResultUtil {

    public static String getErrors(BindingResult bindingResult) {
        StrBuilder sb = new StrBuilder();
        for (ObjectError allError : bindingResult.getAllErrors()) {
            sb.append(allError.getDefaultMessage());
        }

        return sb.toString();
    }
}
