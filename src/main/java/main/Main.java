package main;

import freemarker.template.Configuration;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import service.AccountService;
import servlets.Home;
import servlets.api.SingUp;
import servlets.api.SingIn;

import java.util.Hashtable;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, world!!!");

        ServletContextHandler contextHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);

        Hashtable<String, String> accountTable = new Hashtable<>();
        accountTable.put("admin", "admin");
        AccountService accountService = new AccountService(accountTable);

        Configuration cfg = new Configuration(Configuration.VERSION_2_3_27);


        contextHandler.addServlet(new ServletHolder(new Home()), "/");
        contextHandler.addServlet(new ServletHolder(new SingUp(accountService)), "/signup");
        contextHandler.addServlet(new ServletHolder(new SingIn()), "/signin");


        Server server = new Server(8080);
        server.setHandler(contextHandler);

        server.start();
        System.out.println("Server started!");
        server.join();
    }
}
