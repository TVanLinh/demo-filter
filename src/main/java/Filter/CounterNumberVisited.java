package Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by linhtran on 22/04/2017.
 */

@WebFilter(urlPatterns = "/*")
public class CounterNumberVisited implements Filter {
    public  static int count;
    public void init(FilterConfig filterConfig) throws ServletException {
        count=0;
    }
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        count++;
        System.out.println(count);
        chain.doFilter(request,response);
    }
    public void destroy() {

    }
    public  int getCount()
    {
        return count;
    }
}
