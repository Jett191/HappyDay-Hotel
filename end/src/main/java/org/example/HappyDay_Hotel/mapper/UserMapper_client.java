package org.example.HappyDay_Hotel.mapper;

import org.example.HappyDay_Hotel.entity.UserEntity_client;

public interface UserMapper_client {

  //数据添加
  int insert(UserEntity_client userEntity_client );

  //数据删除
  int delete(UserEntity_client userEntity_client );

  //数据修改
  int update(UserEntity_client userEntity_client );

  //数据查询
  UserEntity_client select(UserEntity_client userEntity_client);

}

