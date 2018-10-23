package servlets.api;

import service.AccountService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

final public class SingUp extends HttpServlet {

    private AccountService accountService;

    public SingUp(AccountService accountService) {
        this.accountService = accountService;
    }

    //    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getParameterMap();
    }
}
