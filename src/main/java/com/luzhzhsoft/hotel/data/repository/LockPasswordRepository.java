package com.luzhzhsoft.hotel.data.repository;

import com.luzhzhsoft.hotel.data.entity.LockPassword;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by luzhzh on 11/29/2017.
 */
public interface LockPasswordRepository extends CrudRepository<LockPassword, String> {
}
