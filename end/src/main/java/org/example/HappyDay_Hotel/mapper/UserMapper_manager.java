package org.example.HappyDay_Hotel.mapper;

import org.example.HappyDay_Hotel.entity.UserEntity_manager;

public interface UserMapper_manager {

  //数据添加
  int insert(UserEntity_manager userEntity_manager);

  //数据删除
  int delete(UserEntity_manager userEntity_manager);

  //数据修改
  int update(UserEntity_manager userEntity_manager);

  //数据查询
  UserEntity_manager select(UserEntity_manager userEntity_manager);

}
