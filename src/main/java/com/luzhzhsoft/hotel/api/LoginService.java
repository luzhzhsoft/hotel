package com.luzhzhsoft.hotel.api;

import com.luzhzhsoft.hotel.data.entity.User;
import com.luzhzhsoft.hotel.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by luzhzh on 11/29/2017.
 */
@RestController
public class LoginService {
    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public void login(@RequestBody User user, HttpSession httpSession) {

        User userRepository.findByName(user.getName());

        httpSession.setAttribute("user", user);


    }

    public User getUser() {

    }

    public void logout() {

    }


}
