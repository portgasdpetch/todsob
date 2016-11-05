package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import sit.int303.demo.model.Customer;
import java.util.List;

public final class CustomerDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <title>Customer Detail</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/jsp/Header.jsp?title=G3: C U S T O M E R - D E T A I L :::", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <form action=\"SearchCustomer\" method=\"post\"> \n");
      out.write("            <table class=\"table\" style=\"background-color:#FF2D00;\" >\n");
      out.write("                <tr>\n");
      out.write("                    <td> Enter Customer name/id: </td>\n");
      out.write("                    <td> <input type=\"text\" name=\"searchParam\" /> </td>\n");
      out.write("                    <td> <input type=\"submit\" /> </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        <center> <h3 style=\"color: red\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </h3>\n");
      out.write("            \n");
      out.write("        <table class=\"table table-striped\" width=\"500px\">\n");
      out.write("            <tr>\n");
      out.write("                <th >ID</th>\n");
      out.write("                <td > <input type=\"text\" name=\"customerId\" disabled size=\"30\"\n");
      out.write("                      value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.customerId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("                </td>\n");
      out.write("            </tr> \n");
      out.write("            <tr>\n");
      out.write("                <th>Name</th>\n");
      out.write("                <td>  <input type=\"text\" name=\"name\" size=\"30\"\n");
      out.write("                      value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>Address</th>\n");
      out.write("                <td> \n");
      out.write("                    <textarea name=\"addressLine1\" rows=\"2\" style=\"width:450\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.addressLine1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea>\n");
      out.write("                    <br>\n");
      out.write("                    <textarea name=\"addressLine2\" rows=\"2\" style=\"width:450\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.addressLine1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea>\n");
      out.write("               </td>\n");
      out.write("            </tr>   \n");
      out.write("            <tr>\n");
      out.write("                <th>Zip Code</th>\n");
      out.write("                <td> \n");
      out.write("                    <input type=\"text\" name=\"zip\" size=\"30\"\n");
      out.write("                      value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.zip}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>Discount Code</th>\n");
      out.write("                <td> \n");
      out.write("                    <input type=\"text\" name=\"discountCode\" size=\"30\"\n");
      out.write("                      value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.discountCode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("                </td>\n");
      out.write("            </tr>   \n");
      out.write("            <tr>\n");
      out.write("                <th>City</th>\n");
      out.write("                <td> \n");
      out.write("                    <input type=\"text\" name=\"city\" disabled size=\"30\"\n");
      out.write("                      value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.city}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("                </td>\n");
      out.write("            </tr>   \n");
      out.write("            <tr>\n");
      out.write("                <th>State</th>\n");
      out.write("                <td> \n");
      out.write("                    <input type=\"text\" name=\"state\" disabled size=\"30\"\n");
      out.write("                      value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.state}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("                </td>\n");
      out.write("            </tr>   \n");
      out.write("            <tr>\n");
      out.write("                <th>Phone</th>\n");
      out.write("                <td> \n");
      out.write("                    <input type=\"text\" name=\"phone\" disabled size=\"30\"\n");
      out.write("                      value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("                </td>\n");
      out.write("            </tr>   \n");
      out.write("            <tr>\n");
      out.write("                <th>Fax</th>\n");
      out.write("                <td> \n");
      out.write("                    <input type=\"text\" name=\"fax\" disabled size=\"30\"\n");
      out.write("                      value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.fax}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("                </td>\n");
      out.write("            </tr>   \n");
      out.write("            <tr>\n");
      out.write("                <th>Email</th>\n");
      out.write("                <td> \n");
      out.write("                    <input type=\"text\" name=\"email\" disabled size=\"30\"\n");
      out.write("                      value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("                </td>\n");
      out.write("            </tr>   \n");
      out.write("            <tr>\n");
      out.write("                <th>Credit Limit</th>\n");
      out.write("                <td> \n");
      out.write("                    <input type=\"text\" name=\"creditLimit\" disabled size=\"30\"\n");
      out.write("                      value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.creditLimit}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" > \n");
      out.write("                </td>      \n");
      out.write("            </tr>  \n");
      out.write("        </table>\n");
      out.write("        </center>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
