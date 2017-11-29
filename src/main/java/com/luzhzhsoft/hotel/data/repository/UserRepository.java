package com.luzhzhsoft.hotel.data.repository;

import com.luzhzhsoft.hotel.data.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by luzhzh on 11/29/2017.
 */
public interface UserRepository extends CrudRepository<User, String> {

    User findByName(String name);
}
