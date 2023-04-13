package controller;
import dao.StudentDao;
import ejb.MyInterface;
import service.model.Student;

import jakarta.inject.Inject;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", value = "/Servlet")
public class Servlet extends HttpServlet {
    @Inject
    MyInterface myInterface;
    @Inject
    StudentDao studentDao;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out= response.getWriter();
        out.println("<html><head><title>home1</title></head><body>");
        out.println("<h1>hii</h1>");
        String s = myInterface.sayHello();
        studentDao.add(new Student("amine","amine@laaguidi"));
        out.println(s);
        out.println("<h1>hii</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
