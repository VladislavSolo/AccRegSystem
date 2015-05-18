package by.bsuir.acc_reg_system.logic.comand;

import by.bsuir.acc_reg_system.entity.Orders;
import by.bsuir.acc_reg_system.persistence.Factory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class AdminAcceptOrderCommad implements Command {
    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ServletException, IOException {

        String email = (String) req.getSession(true).getAttribute("email");

        if (email.equals("")) {

            req.getServletContext().getRequestDispatcher("/enter.jsp").forward(req, resp);

        } else {

            String idString = req.getParameter("idAccept");
            String date = req.getParameter("date");

            if (idString.equals("") || date.equals("")) {

                req.setAttribute("err", "Enter the values!");

            } else {

                int id = Integer.parseInt(idString);

                Orders order = Factory.getInstance().getOrderDAO().getOrderById(id);

                if (order != null) {

                    order.setStatus("Will be making " + date);

                    Factory.getInstance().getOrderDAO().updateOrder(id, order);
                } else {

                    req.setAttribute("err", "Incorrect value!");
                }
            }
        }
    }
}
