package by.bsuir.acc_reg_system.controller;

import by.bsuir.acc_reg_system.logic.Switch;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;;

@WebServlet("/m")
public class MainServlet extends HttpServlet {

    public MainServlet() {
        super();
    }

    public void init() throws ServletException {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        String action = req.getParameter("command");

        Switch mySwitch = Switch.sharedSwitch();

        try {
            if (action.equals("register")) {

                mySwitch.addCustomer(req);
                getServletContext().getRequestDispatcher("/register.jsp").forward(req, resp);

            } else if (action.equals("enter")) {

                mySwitch.logIN(req, resp);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
