/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M18
 * Generated at: 2017-05-28 23:55:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class events_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"\r\n");
      out.write("\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"./stylesheets/stylesheet.css\"></link>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"./scripts/writeMenuHTML.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"./scripts/writeFooterHTML.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"./scripts/helpers.js\"></script>\r\n");
      out.write("\t");
      events.EventData events = null;
      synchronized (session) {
        events = (events.EventData) _jspx_page_context.getAttribute("events", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (events == null){
          events = new events.EventData();
          _jspx_page_context.setAttribute("events", events, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write(" \r\n");
      out.write("\t\r\n");
      out.write("\t<title>Events</title>  \r\n");
      out.write("\t<!-- Include navigation Menu -->\r\n");
      out.write("\t<script type=\"text/javascript\" >writeMenuHTML();</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"main\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"whitebackblacktext\">\r\n");
      out.write("    <h1 class=\"heading\"><b>Events</b></h1>\r\n");
      out.write("    <p>How you can get involved</p>\r\n");
      out.write("\r\n");
      out.write("  <!-- Main Content -->\r\n");
      out.write("  <div> \r\n");
      out.write("    <h2 class=\"heading\">Host a Stationery Drive on World Stationery Day!</h2>\r\n");
      out.write("    <p>\r\n");
      out.write("\tBasic stationery is a necessity for learning in the classroom and at home. </p>\r\n");
      out.write("\t<p>As an ongoing initiative, our\r\n");
      out.write("foundation has supplied over 20,000 basic stationery packs to needy learners over the past 4 years.\r\n");
      out.write("As part of our fifth anniversary, we aim to collect 7,000 basic stationery packs for distribution to\r\n");
      out.write("fifteen rural schools. You can help by hosting a stationery drive at your school, church or office on\r\n");
      out.write("26 th April 2017.\r\n");
      out.write("</p>\r\n");
      out.write("<p>\r\n");
      out.write("Contact participation@afforableeducation.org for more information for resources to host your own\r\n");
      out.write("stationery drive.</p>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div> \r\n");
      out.write("    <h2 class=\"heading\">Books for Learning</h2>\r\n");
      out.write("    <p>\r\n");
      out.write("\tThe Foundation for Affordable Education has partnered with Books for Learning for the past two\r\n");
      out.write("\tyears to raise funds for books and learning aids in the classroom. Sell or buy 2nd hand affordable\r\n");
      out.write("\ttextbooks online at www.booksforlearning.org and the organization will donate 10% of the profit to\r\n");
      out.write("\tour foundation.</p>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <!-- JSP Event data read -->\r\n");
      out.write("  <div>\r\n");
      out.write("  <h2 class=\"heading\">Upcoming events</h2>\r\n");
      out.write("\t<table id=\"eventstable\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th>Name</th>\r\n");
      out.write("    <th>Date</th> \r\n");
      out.write("    <th>Time</th>\t\r\n");
      out.write("    <th>Venue</th>\r\n");
      out.write("    <th>Description</th>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
      out.print( events.csvToHtmlTable() );
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<br />\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("</div>\r\n");
      out.write("  \r\n");
      out.write("  <!-- Footer -->\r\n");
      out.write("  <script type=\"text/javascript\" >writeFooterHTML();</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
