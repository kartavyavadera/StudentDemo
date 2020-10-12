
package com.student;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;

public class InsertStudent implements Servlet {

    ServletConfig config; 
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config=config;
        
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;        
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String name=req.getParameter("sname");
        int number=Integer.parseInt(req.getParameter("snum"));
        
        PrintWriter pr=res.getWriter();
        pr.print("<html><center><body>");        
        pr.print("<h1>"+name+"</h1>");
        pr.print("<h1>"+number+"</h1>");
        pr.print("</body></center></html>");
        
        
        
    }

    @Override
    public String getServletInfo() {
        return "";
        
    }

    @Override
    public void destroy() {
        
    }
    
    
}
