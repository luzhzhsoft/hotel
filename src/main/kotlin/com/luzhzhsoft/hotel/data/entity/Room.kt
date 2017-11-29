package com.luzhzhsoft.hotel.data.entity

import org.springframework.data.annotation.Id
import org.springframework.data.redis.core.RedisHash
import org.springframework.data.redis.core.index.Indexed

/**
 * Created by luzhzh on 11/29/2017.
 */
@RedisHash
class Room {
    @Id
    var id:String=""
    @Indexed
    var name:String=""
}