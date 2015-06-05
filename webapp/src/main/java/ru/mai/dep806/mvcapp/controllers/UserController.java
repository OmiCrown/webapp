package ru.mai.dep806.mvcapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ru.mai.dep806.mvcapp.dao.UserDAO;
import ru.mai.dep806.mvcapp.dao.InMemoryUserDAO;
import ru.mai.dep806.mvcapp.model.User;

/**
 * Created by Omicrown on 05.06.2015.
 */
@Controller
public class UserController {
    private UserDAO userDAO;

    public UserController() {
        userDAO = new InMemoryUserDAO();
    }

    @RequestMapping("/users.html")
    public ModelAndView listUsers(){
        return new ModelAndView("WEB-INF/jsp/users.jsp", "users", userDAO.getAllUsers());
    }

    @RequestMapping(value = "/addUser.html", method = RequestMethod.GET)
    public String showCreateUser(Model model) {
        User user = new User();
        user.setActive(true);
        model.addAttribute("user", user);
        return "WEB-INF/jsp/addEditUser.jsp";
    }

    @RequestMapping(value = "/editUser.html", method = RequestMethod.GET)
    public String showEditUser(@RequestParam("id") Long id, Model model) {
        model.addAttribute("user", userDAO.findUserById(id));
        return "WEB-INF/jsp/addEditUser.jsp";
    }
}
