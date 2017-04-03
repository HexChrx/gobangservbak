package net.controller;

import net.model.RoomModel;
import net.model.UserModel;

import java.util.HashMap;

public class RoomManager {
    private static HashMap<Long, RoomModel> rooms = new HashMap<>();

    /**
     * 创建房间
     * @param creator
     * @return
     */
    public static long createRoom (UserModel creator) {
        long newRoomNumer = RoomNumberManger.getRoomNumber();
        RoomModel newRoom = new RoomModel(creator, newRoomNumer);
        rooms.put(newRoomNumer, newRoom);
        return newRoomNumer;
    }

    /**
     * 获取一个房间对象
     * @param roomNumber
     * @return
     */
    public static RoomModel getRoom(long roomNumber) {
        return rooms.get(roomNumber);
    }

    /**
     * 解散一个房间
     * @param roomNumber
     * @return
     */
    public static RoomModel dismissRoom(long roomNumber) {
        return rooms.remove(roomNumber);
    }
}
