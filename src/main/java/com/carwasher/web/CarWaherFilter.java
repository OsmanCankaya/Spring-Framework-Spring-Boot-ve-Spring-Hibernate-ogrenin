package com.carwasher.web;

import lombok.NoArgsConstructor;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/CarWasherServlet")
@NoArgsConstructor
public class CarWaherFilter implements Filter {

    public void destroy() {

    }


    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        response.getWriter().write("before custom filter...");
        chain.doFilter(request, response);
        response.getWriter().write("after custom filter...");

    }
}
