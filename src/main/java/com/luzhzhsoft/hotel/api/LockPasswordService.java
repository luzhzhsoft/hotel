package com.luzhzhsoft.hotel.api;

import com.luzhzhsoft.hotel.data.entity.LockPassword;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by luzhzh on 11/29/2017.
 */
@Service
public class LockPasswordService {
    @RequestMapping("/lockpassword")
    public LockPassword createLockPassword(LockPassword lockPassword) {

    }


}
