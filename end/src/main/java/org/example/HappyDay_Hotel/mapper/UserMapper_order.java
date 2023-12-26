package org.example.HappyDay_Hotel.mapper;

import org.example.HappyDay_Hotel.entity.UserEntity_order;

public interface UserMapper_order {

  //数据添加
  int insert(UserEntity_order userEntity_order);

  //数据删除
  int delete(UserEntity_order userEntity_order);

  //数据修改
  int update(UserEntity_order userEntity_order);

  //数据查询
  UserEntity_order select(UserEntity_order userEntity_order);

}
