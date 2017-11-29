package com.luzhzhsoft.hotel.data.repository;


import com.luzhzhsoft.hotel.data.entity.Hotel;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by luzhzh on 11/29/2017.
 */
public interface HotelRepository extends CrudRepository<Hotel, String> {
}
