package by.bsuir.acc_reg_system.logic.comand;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Vladislav on 11.05.15.
 */
public interface Command {

    public void execute(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ServletException, IOException;
}
