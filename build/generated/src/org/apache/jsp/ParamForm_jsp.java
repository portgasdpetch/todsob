package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;
import java.util.HashMap;

public final class ParamForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        ");

            Map<String, String> subjects = new HashMap();
            subjects.put("INT102", "Java Programming 1");
            subjects.put("INT105", "Java Programming 2");
            subjects.put("INT303", "Web Programming");
            subjects.put("GEN101", "Physical Education");
            subjects.put("LNG101", "General English");
            subjects.put("INT107", "Computing Platform Technology");
            subjects.put("INT104", "Discrete Math");
            subjects.put("INT101", "IT Fundamental");
            subjects.put("INT201", "Networks");
            subjects.put("INT203", "Information Management 1");
            application.setAttribute("subjects", subjects);

            Map<String, String> faculty = new HashMap();
            faculty.put("sit", "School of Information Technology");
            faculty.put("eng", "Faculty of Engineering");
            faculty.put("sci", "Faculty of Science");
            application.setAttribute("faculty", faculty);
        
      out.write("\n");
      out.write("        <form action = \"ViewParam.jsp?programId=1457995\" method=\"POST\">\n");
      out.write("            Student Id: <input type=\"text\" name=\"sid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${psram.sid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("            <br>\n");
      out.write("            Student Name: <input type=\"text\" name=\"sname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.sname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("            <br>\n");
      out.write("            Faculty: <select name=\"faculty\">\n");
      out.write("                            <option value=\"sit\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${faculty.sit}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </option>\n");
      out.write("                            <option value=\"eng\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${faculty.eng}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </option>\n");
      out.write("                            <option value=\"sci\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${faculty.sci}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </option>\n");
      out.write("                     </select>\n");
      out.write("            <br>\n");
      out.write("            Favourite Subjects: <br>\n");
      out.write("                <input type=\"checkbox\" name=\"subjects\" value=\"INT102\"/>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subjects[\"INT102\"]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>\n");
      out.write("                <input type=\"checkbox\" name=\"subjects\" value=\"INT105\"/>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subjects[\"INT105\"]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>\n");
      out.write("                <input type=\"checkbox\" name=\"subjects\" value=\"INT303\"/>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subjects[\"INT303\"]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>\n");
      out.write("                <input type=\"checkbox\" name=\"subjects\" value=\"GEN101\"/>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subjects[\"GEN101\"]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>\n");
      out.write("                <input type=\"checkbox\" name=\"subjects\" value=\"LNG101\"/>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subjects[\"LNG101\"]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>\n");
      out.write("                <input type=\"checkbox\" name=\"subjects\" value=\"INT107\"/>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subjects[\"INT107\"]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>\n");
      out.write("                <input type=\"checkbox\" name=\"subjects\" value=\"INT104\"/>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subjects[\"INT104\"]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>\n");
      out.write("                <input type=\"checkbox\" name=\"subjects\" value=\"INT101\"/>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subjects[\"INT101\"]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>\n");
      out.write("                <input type=\"checkbox\" name=\"subjects\" value=\"INT201\"/>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subjects[\"INT201\"]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>\n");
      out.write("                <input type=\"checkbox\" name=\"subjects\" value=\"INT203\"/>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subjects[\"INT203\"]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>                \n");
      out.write("            <input type=\"submit\" value=\"Submit Query\">         \n");
      out.write("        </form>\n");
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
