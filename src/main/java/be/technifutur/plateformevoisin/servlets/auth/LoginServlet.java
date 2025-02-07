package be.technifutur.plateformevoisin.servlets.auth;


import be.technifutur.plateformevoisin.services.UserService;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/login")
public class LoginServlet extends HttpServlet {

    @Inject
    private UserService userService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/pages/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        try{
            userService.LoginUser(email, password);
            req.getSession(true).setAttribute("currentUser", email);
            resp.sendRedirect("/pages/mainWeb.jsp");
        }catch (Exception e){
            System.out.println(e.getMessage());
            resp.sendError(500);
        }
    }
}
