package com.luzhzhsoft.hotel.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by luzhzh on 2017/11/26.
 */
@RestController
public class Version {

    @RequestMapping
    public String getVersion(){
        return "0.1.0";
    }
}
