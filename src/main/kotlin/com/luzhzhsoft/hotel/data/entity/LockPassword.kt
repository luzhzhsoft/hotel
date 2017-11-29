package com.luzhzhsoft.hotel.data.entity

import org.springframework.data.annotation.Id
import org.springframework.data.redis.core.RedisHash
import org.springframework.data.redis.core.TimeToLive

/**
 * Created by luzhzh on 11/29/2017.
 */
@RedisHash
class LockPassword {
    @Id
    private val id: String? = null
    @TimeToLive
    private val expiration: Long? = null

    private val password: String? = null
}