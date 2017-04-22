package Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by linhtran on 21/04/2017.
 */

@WebFilter(urlPatterns = {"/MyServlet1"})
public class MyFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        Logger logger=Logger.getLogger(this.getClass().getName());

        HttpServletRequest httpServletRequest=(HttpServletRequest)request;
        HttpServletResponse httpServletResponse=(HttpServletResponse)response;
        String action=httpServletRequest.getParameter("action");
        System.out.println(action);
        ((HttpServletResponse) response).sendRedirect("/MyServlet2");
        System.out.println("ok");
        chain.doFilter(request,response);
//        ((HttpServletResponse) response).sendRedirect("/MyServlet2");

    }

    public void destroy() {
        System.runFinalization();
    }
}
