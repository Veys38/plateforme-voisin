package be.technifutur.plateformevoisin.servlets.auth;

import be.technifutur.plateformevoisin.entities.Address;
import be.technifutur.plateformevoisin.entities.User;
import be.technifutur.plateformevoisin.services.UserService;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;


@WebServlet(value = "/register",loadOnStartup = 1)
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
        String city = req.getParameter("city");
        String state = req.getParameter("state");
        String zip = req.getParameter("zip");
        int phoneNumber = Integer.parseInt(req.getParameter("phoneNumber"));
        String profilePicture = req.getParameter("profilePicture");

        try{
            userService.RegisterUser(new User(firstName, lastName, email, password, new Address(street,number,mailbox,city,state,zip), phoneNumber, profilePicture));
            resp.sendRedirect("/");
        }catch (Exception e){
            System.out.println(e.getMessage());
            req.getRequestDispatcher("/pages/register.jsp").forward(req, resp);
        }
    }
}
