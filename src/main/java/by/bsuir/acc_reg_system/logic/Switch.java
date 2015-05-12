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

    private PersonalAccount personalAccount;
    private RegisterCommand registerCommand;
    private AddOwnerOrderCommand addOwnerOrderCommand;
    private GetOrdersCommand getOrdersCommand;
    private DeleteOrderCommand deleteOrderCommand;
    private AddOrderCommand addOrderCommand;

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

            registerCommand = new RegisterCommand();
            registerCommand.execute(req, resp);

        } else if (command.equals("enter")) {

            this.personalAccount = PersonalAccount.sharedAccount();

            if (!this.personalAccount.checkAccount(req, resp)) {

                req.setAttribute("check", "Incorrect E-mail or Password. Try again!");
                req.getRequestDispatcher("/enter.jsp").forward(req, resp);
            } else {
                getOrdersCommand = new GetOrdersCommand();
                getOrdersCommand.execute(req, resp);
                req.getRequestDispatcher("/PersonalAccount.jsp").forward(req, resp);
            }

        } else if (command.equals("addOwnerTemplate")) {

            req.setAttribute("name", this.session.getAttribute("name"));
            addOwnerOrderCommand = new AddOwnerOrderCommand();
            addOwnerOrderCommand.execute(req, resp);

            getOrdersCommand = new GetOrdersCommand();
            getOrdersCommand.execute(req, resp);

            req.getServletContext().getRequestDispatcher("/PersonalAccount.jsp").forward(req, resp);

        } else if(command.equals("delete")) {

            deleteOrderCommand = new DeleteOrderCommand();
            deleteOrderCommand.execute(req, resp);

            getOrdersCommand = new GetOrdersCommand();
            getOrdersCommand.execute(req, resp);

            req.getServletContext().getRequestDispatcher("/PersonalAccount.jsp").forward(req, resp);

        } else if(command.equals("addOrder")) {

            addOrderCommand = new AddOrderCommand();
            addOrderCommand.execute(req, resp);

            getOrdersCommand = new GetOrdersCommand();
            getOrdersCommand.execute(req, resp);

            req.getServletContext().getRequestDispatcher("/PersonalAccount.jsp").forward(req, resp);

        }
    }
}
