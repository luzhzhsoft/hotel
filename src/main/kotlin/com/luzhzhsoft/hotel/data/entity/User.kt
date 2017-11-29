package com.luzhzhsoft.hotel.data.entity

import org.springframework.data.annotation.Id
import org.springframework.data.redis.core.RedisHash
import org.springframework.data.redis.core.index.Indexed

/**
 * Created by luzhzh on 11/29/2017.
 */
@RedisHash
class User {

    @Id
    var id: String? = null
    @Indexed
    var name: String? = null

    var nickName: String? = null
    var mobilephone: String? = null
    var email: String? = null
    var identificationCardNumber: String? = null
}