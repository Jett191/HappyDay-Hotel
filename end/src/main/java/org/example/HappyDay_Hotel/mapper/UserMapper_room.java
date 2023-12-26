package org.example.HappyDay_Hotel.mapper;

import org.example.HappyDay_Hotel.entity.UserEntity_room;

public interface UserMapper_room {

  //数据添加
  int insert(UserEntity_room userEntity_room);

  //数据删除
  int delete(UserEntity_room userEntity_room);

  //数据修改
  int update(UserEntity_room userEntity_room);

  //数据查询
  UserEntity_room select(UserEntity_room userEntity_room);

}
