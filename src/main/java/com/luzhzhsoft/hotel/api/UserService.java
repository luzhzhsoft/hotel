package com.luzhzhsoft.hotel.api;

import com.luzhzhsoft.hotel.data.entity.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by luzhzh on 11/29/2017.
 */
@RestController
public class UserService {
    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public User createUser() {

    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    public User deleteUser(@PathVariable String id) {

    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.PATCH)
    public void patchUser(@PathVariable String id) {

    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
    public User updateUser(@PathVariable String id) {

    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public User getUsers() {

    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable String id) {

    }

}
