package by.bsuir.acc_reg_system.servlet;

/**
 * Created by Vladislav on 28.04.15.
 */

import by.bsuir.acc_reg_system.persistence.Factory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/page")
public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        try {
            req.setAttribute("name", Factory.getInstance().getCustomerDAO().getCustomerById(1).getName());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("page.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

    }

}
