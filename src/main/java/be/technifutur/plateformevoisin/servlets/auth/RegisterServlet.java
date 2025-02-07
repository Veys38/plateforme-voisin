package be.technifutur.plateformevoisin.servlets.auth;

import be.technifutur.plateformevoisin.entities.Address;
import be.technifutur.plateformevoisin.entities.User;
import be.technifutur.plateformevoisin.repositories.impls.UserRepositoryImpl;
import be.technifutur.plateformevoisin.services.UserService;
import be.technifutur.plateformevoisin.utils.EmfFactoryUtils;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;


@WebServlet(value = "/register")
public class RegisterServlet extends HttpServlet {

    @Inject
    private UserService userService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/pages/register.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String street = req.getParameter("street");
        String number = req.getParameter("number");
        String mailbox = req.getParameter("mailbox");
        String phoneNumber = req.getParameter("phoneNumber");
        String city = req.getParameter("city");
        String state = req.getParameter("state");
        String zip = req.getParameter("zip");

        try{
            userService.RegisterUser(new User(firstName, lastName, email, password, phoneNumber, new Address(street,number,mailbox,city,state,zip)));
            resp.sendRedirect(req.getContextPath() + "/login");
        }catch (Exception e){
            System.out.println(e.getMessage());
            req.getRequestDispatcher("/pages/register.jsp").forward(req, resp);
        }
    }
}
