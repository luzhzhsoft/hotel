/**
 * Created by luzhzh on 11/29/2017.
*/
package com.luzhzhsoft.hotel.data.entity

import org.springframework.data.annotation.Id
import org.springframework.data.geo.Point
import org.springframework.data.redis.core.RedisHash
import org.springframework.data.redis.core.index.GeoIndexed
import org.springframework.data.redis.core.index.Indexed
@RedisHash
class Hotel {
    @Id
    var id: String=""

    @Indexed
    var name: String=""

    @GeoIndexed
    var location: Point= Point(0.0,0.0)

}