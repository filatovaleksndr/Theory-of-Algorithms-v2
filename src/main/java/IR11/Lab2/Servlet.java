/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IR11.Lab2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Alex
 */
public class Servlet extends HttpServlet {
   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Validator validator = new Validator();
        String arg = request.getParameter("x");
        String result = validator.ValidateAndCalculate(arg);
        request.setAttribute("result", result);
        request.getRequestDispatcher("lab2.jsp").forward(request, response);
    }

}
