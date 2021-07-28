package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import objectClass.Product;
import java.util.List;
import dal.ProductFacadeImplement;
import dal.ProductFacade;
import dal.AccountFacade;

public final class thu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            .white{\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function check(a){\n");
      out.write("                document.forms[\"frm\"].action=\"CartControl?id=\"+a;\n");
      out.write("                document.forms[\"frm\"].submit();\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: black\">\n");
      out.write("        <form name=\"frm\" action=\"showsanphammoi.jsp\" method=\"post\">\n");
      out.write("        ");

            int currentpage=1;
            int startRecord=0;
            if(request.getParameter("currentpage")!=null){
                currentpage=Integer.parseInt(request.getParameter("currentpage"));
                if(currentpage==1){
                    startRecord=0;
                }
                else{
                      startRecord=(currentpage-1)*9;
                }
               
            }
            else{
               startRecord=0;
            }
            ProductFacade pf=new ProductFacadeImplement();
            List<Product> listproduct=pf.getAllProduct();
            List<Product> listsub=new ArrayList<Product>();
            for(int i=0;i<listproduct.size();i++){
                if(i>=startRecord&&i<startRecord+9){
                    listsub.add(listproduct.get(i));
                }
            }
            
            
      out.write("\n");
      out.write("            <table align=\"center\" style=\"text-align: center;border-radius:4px;border: 1px solid blanchedalmond;opacity:0.8;box-shadow:3px 3px 3px darkgray;color: white \">\n");
      out.write("                <tr>\n");
      out.write("            ");

            
            for(int i=0;i<listsub.size();i++){
            
      out.write("\n");
      out.write("            \n");
      out.write("            ");

                if(i<3){
                    Product pro=listsub.get(i);
                   
                    
            
      out.write("\n");
      out.write("            \n");
      out.write("                <td>\n");
      out.write("                    <table >\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(pro.getPro_Name());
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><img width=\"220px\" height=\"220px\" src=\"");
      out.print(pro.getPicture());
      out.write("\"></img></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(pro.getPrice());
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(pro.getOriginal());
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(pro.getProduceDate());
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(pro.getExpiredDate());
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr><td><input type=\"image\" src=\"js/label_blue_buy.png\"  onclick=\"check(");
      out.print(pro.getPro_ID());
      out.write(")\" ></input></td></tr>\n");
      out.write("                    </table>\n");
      out.write("                    \n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("            ");

                       }
            
      out.write("\n");
      out.write("          \n");
      out.write("           \n");
      out.write("            ");

           
            }
                    
            
      out.write("\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("            ");

            
            for(int i=0;i<listsub.size();i++){
            
      out.write("\n");
      out.write("            \n");
      out.write("            ");

                if(i>=3&&i<6){
                     Product pro=listsub.get(i);
            
      out.write("\n");
      out.write("            \n");
      out.write("                <td>\n");
      out.write("                    <table>\n");
      out.write("                           <tr>\n");
      out.write("                            <td>");
      out.print(pro.getPro_Name());
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><img width=\"220px\" height=\"220px\" src=\"");
      out.print(pro.getPicture());
      out.write("\"></img></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(pro.getPrice());
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(pro.getOriginal());
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(pro.getProduceDate());
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(pro.getExpiredDate());
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                         <tr><td><input type=\"image\" src=\"js/label_blue_buy.png\" onclick=\"check(");
      out.print(pro.getPro_ID());
      out.write(")\" ></input></td></tr>\n");
      out.write("                    </table>\n");
      out.write("                    \n");
      out.write("                </td>\n");
      out.write("          \n");
      out.write("            ");

                       }
            
      out.write("\n");
      out.write("          \n");
      out.write("           \n");
      out.write("            ");

           
            }
                    
            
      out.write("\n");
      out.write("              </tr> \n");
      out.write("              <tr>\n");
      out.write("            ");

            
            for(int i=0;i<listsub.size();i++){
            
      out.write("\n");
      out.write("            \n");
      out.write("            ");

                if(i>=6){
                     Product pro=listsub.get(i);
            
      out.write("\n");
      out.write("            \n");
      out.write("               <td>\n");
      out.write("                    <table>\n");
      out.write("                            <tr>\n");
      out.write("                            <td>");
      out.print(pro.getPro_Name());
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><img width=\"220px\" height=\"220px\" src=\"");
      out.print(pro.getPicture());
      out.write("\"></img></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(pro.getPrice());
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(pro.getOriginal());
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(pro.getProduceDate());
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(pro.getExpiredDate());
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr><td><input type=\"image\" src=\"js/label_blue_buy.png\" onclick=\"check(");
      out.print(pro.getPro_ID());
      out.write(")\" ></input></td></tr>\n");
      out.write("                    </table>\n");
      out.write("                    \n");
      out.write("                </td>\n");
      out.write("          \n");
      out.write("            ");

                       }
            
      out.write("\n");
      out.write("          \n");
      out.write("           \n");
      out.write("            ");

           
            }
                    
            
      out.write("\n");
      out.write("            </tr>  \n");
      out.write("            </table>\n");
      out.write("        <div align=\"center\">\n");
      out.write("        ");

            int count=pf.spCount();
            int pagecount=(int)Math.ceil((double)count/9);
            for(int i=0;i<pagecount;i++){
                
        
      out.write("\n");
      out.write("        \n");
      out.write("        <a class=\"white\" href=\"showsanphammoi.jsp?currentpage=");
      out.print(i+1);
      out.write('"');
      out.write('>');
      out.print(i+1);
      out.write("</a>\n");
      out.write("        ");

                   }
        
      out.write("\n");
      out.write("        </div>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
