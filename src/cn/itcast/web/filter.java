package cn.itcast.web;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


@WebFilter("/*")
public class filter implements Filter{
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        System.out.println("Filter is running  First ........");

//        filterChain.doFilter(servletRequest,servletResponse);
        chain.doFilter(req, resp);

        System.out.println("Filter is running  Second ........");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
