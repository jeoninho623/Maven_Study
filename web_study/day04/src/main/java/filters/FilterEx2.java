package filters;

import jakarta.servlet.*;

import java.io.IOException;

public class FilterEx2 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("FilterEx2 - 요청 전");

        filterChain.doFilter(servletRequest, servletResponse);

        System.out.println("FilterEx2 - 응답 후");
    }
}
