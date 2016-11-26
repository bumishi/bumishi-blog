package org.bumishi.techblog.api.web.controller;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;
import org.bumishi.toolbox.model.RestResponse;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author qiang.xie
 * @date 2016/9/27
 */
@ControllerAdvice
public class PublicAdvice {

    @ExceptionHandler
    public void handleControllerException(HttpServletRequest request, HttpServletResponse response, Throwable ex) throws IOException {
        ex.printStackTrace();
        String ajax = request.getHeader("X-Requested-With");
        response.setCharacterEncoding("utf-8");
        if (StringUtils.isBlank(ajax)) {
            response.sendRedirect("/error");
        } else {
            response.setContentType("application/json");

            response.getWriter().println(JSON.toJSON(RestResponse.fail(ex.getMessage())));
        }

    }

    @ModelAttribute
    public void addCommonModel(Model model, HttpServletRequest request) {

    }


}