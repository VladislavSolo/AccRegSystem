package by.bsuir.acc_reg_system.logic;

import by.bsuir.acc_reg_system.logic.comand.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

public class Switch {

    private static Switch aSwitch;
    private HttpSession session;

    public static Switch sharedSwitch() {

        if(aSwitch == null) {

            return new Switch();
        } else {

            return aSwitch;
        }
    }

    public void addCommand(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ServletException, IOException {

        this.session = req.getSession();

        String command = req.getParameter("command");

        if (command.equals("register")) {

            RegisterCommand registerCommand = new RegisterCommand();
            registerCommand.execute(req, resp);

            req.getServletContext().getRequestDispatcher("/enter.jsp").forward(req, resp);

        } else if (command.equals("enter")) {

            AuthorizationCommand authorizationCommand = new AuthorizationCommand();
            authorizationCommand.execute(req, resp);

        } else if (command.equals("addOwnerTemplate")) {

            req.setAttribute("name", this.session.getAttribute("name"));

            AddOwnerOrderCommand addOwnerOrderCommand = new AddOwnerOrderCommand();
            addOwnerOrderCommand.execute(req, resp);

            GetOrdersCommand getOrdersCommand = new GetOrdersCommand();
            getOrdersCommand.execute(req, resp);

            req.getServletContext().getRequestDispatcher("/personalAccount.jsp").forward(req, resp);

        } else if(command.equals("delete")) {

            DeleteOrderCommand deleteOrderCommand = new DeleteOrderCommand();
            deleteOrderCommand.execute(req, resp);

            GetOrdersCommand getOrdersCommand = new GetOrdersCommand();
            getOrdersCommand.execute(req, resp);

            req.getServletContext().getRequestDispatcher("/personalAccount.jsp").forward(req, resp);

        } else if(command.equals("Delete")) {

            AdminDeleteOrderCommand adminDeleteOrderCommand = new AdminDeleteOrderCommand();
            adminDeleteOrderCommand.execute(req, resp);

            AdminGetOrdersCommand adminGetOrdersCommand = new AdminGetOrdersCommand();
            adminGetOrdersCommand.execute(req, resp);

            req.getServletContext().getRequestDispatcher("/adminTools.jsp").forward(req, resp);

        } else if(command.equals("addOrder")) {

            AddOrderCommand addOrderCommand = new AddOrderCommand();
            addOrderCommand.execute(req, resp);

            GetOrdersCommand getOrdersCommand = new GetOrdersCommand();
            getOrdersCommand.execute(req, resp);

            req.getServletContext().getRequestDispatcher("/personalAccount.jsp").forward(req, resp);

        } else if(command.equals("search")) {

            SearchOrderCommand searchOrderCommand = new SearchOrderCommand();
            searchOrderCommand.execute(req, resp);

            req.getServletContext().getRequestDispatcher("/personalAccount.jsp").forward(req, resp);

        } else if(command.equals("refresh")) {

            GetOrdersCommand getOrdersCommand = new GetOrdersCommand();
            getOrdersCommand.execute(req, resp);

            req.getServletContext().getRequestDispatcher("/personalAccount.jsp").forward(req, resp);

        }  else if(command.equals("logOut")) {

            req.getSession(true).setAttribute("name", "");
            req.getSession(true).setAttribute("email", "");
            req.getSession(true).setAttribute("password", "");
            req.getSession(true).setAttribute("myEmail", "");

            req.getServletContext().getRequestDispatcher("/main.jsp").forward(req, resp);

        } else if(command.equals("reject")) {

            AdminRejectOrderCommand adminRejectOrderCommand = new AdminRejectOrderCommand();
            adminRejectOrderCommand.execute(req, resp);

            AdminGetOrdersCommand adminGetOrdersCommand = new AdminGetOrdersCommand();
            adminGetOrdersCommand.execute(req, resp);

            req.getServletContext().getRequestDispatcher("/adminTools.jsp").forward(req, resp);

        } else if(command.equals("accept")) {

            AdminAcceptOrderCommad adminAcceptOrderCommad = new AdminAcceptOrderCommad();
            adminAcceptOrderCommad.execute(req, resp);

            AdminGetOrdersCommand adminGetOrdersCommand = new AdminGetOrdersCommand();
            adminGetOrdersCommand.execute(req, resp);

            req.getServletContext().getRequestDispatcher("/adminTools.jsp").forward(req, resp);

        }
    }
}
