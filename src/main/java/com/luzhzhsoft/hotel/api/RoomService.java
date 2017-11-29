package com.luzhzhsoft.hotel.api;

import com.luzhzhsoft.hotel.data.entity.Room;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by luzhzh on 11/29/2017.
 */
@RestController
public class RoomService {

    @RequestMapping(value = "/room", method = RequestMethod.POST)
    public Room createRoom() {

    }

    @RequestMapping(value = "/room/{id}", method = RequestMethod.PATCH)
    public void patchRoom(@PathVariable String id,Room room) {

    }

    @RequestMapping(value = "/room/{id}", method = RequestMethod.PUT)
    public Room updateRoom(@PathVariable String id,Room room) {

    }

    @RequestMapping(value = "/room", method = RequestMethod.GET)
    public Room getRooms() {

    }

    @RequestMapping(value = "/room/{id}", method = RequestMethod.GET)
    public Room getRoom(@PathVariable String id) {

    }

    @RequestMapping(value = "/room/{id}", method = RequestMethod.DELETE)
    public Room deleteRoom(@PathVariable String id) {

    }
}
