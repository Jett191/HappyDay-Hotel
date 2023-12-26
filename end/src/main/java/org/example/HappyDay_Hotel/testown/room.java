package org.example.HappyDay_Hotel.testown;


import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.HappyDay_Hotel.entity.UserEntity_room;
import org.example.HappyDay_Hotel.mapper.UserMapper_room;

public class room {


  public static void main(String[] args) {

    //add();

    //delete();

    //update();

    //select();

  }

  //增
  public static void add(String id, String price, String members, String type, String status,String area){
    //初始化sqlSession
    SqlSession sqlSession = null;

    try {
      // mybatis配置文件路径
      String resource = "mybatis-config.xml";

      // 读取配置文件
      InputStream inputStream = Resources.getResourceAsStream(resource);

      // 创建sqlSessionFactory
      SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

      //创建sqlSession
      sqlSession = sqlSessionFactory.openSession();

      //创建UserMapper_room接口实例
      UserMapper_room userMapper_room = sqlSession.getMapper(UserMapper_room.class);

      //创建UserEntity_room实例
      UserEntity_room userEntity_room = new UserEntity_room();

      //对数据进行插入操作
      userEntity_room.setRoomid(id);
      userEntity_room.setRoomprice(price);
      userEntity_room.setRoommember(members);
      userEntity_room.setRoomtype(type);
      userEntity_room.setRoomstatus(status);
      userEntity_room.setRoomarea(area);


      //调用插入方法
      int result = userMapper_room.insert(userEntity_room);

      //提交事务
      sqlSession.commit();

      //判断插入语句是否执行成功
      if (result > 0) {
        System.out.println("插入成功");
      } else {
        System.out.println("插入失败");
      }

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      //关闭sqlSession
      if (sqlSession != null) {
        sqlSession.close();
      }
    }
  }

  //删
  public static void delete(String id){
    //初始化sqlSession
    SqlSession sqlSession = null;

    try {
      // mybatis配置文件路径
      String resource = "mybatis-config.xml";

      // 读取配置文件
      InputStream inputStream = Resources.getResourceAsStream(resource);

      // 创建sqlSessionFactory
      SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

      //创建sqlSession
      sqlSession = sqlSessionFactory.openSession();

      //创建UserMapper_room接口实例
      UserMapper_room userMapper_room = sqlSession.getMapper(UserMapper_room.class);

      //创建UserEntity_room实例
      UserEntity_room userEntity_room = new UserEntity_room();

      //对数据进行删除操作
      userEntity_room.setRoomid(id);


      //调用删除方法
      int result = userMapper_room.delete(userEntity_room);

      //提交事务
      sqlSession.commit();

      //判断插入语句是否执行成功
      if (result > 0) {
        System.out.println("删除成功");
      } else {
        System.out.println("删除失败");
      }

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      //关闭sqlSession
      if (sqlSession != null) {
        sqlSession.close();
      }
    }
  }

  //改
  public static void update(String id, String price, String member, String type, String status,String area){
    //初始化sqlSession
    SqlSession sqlSession = null;

    try {
      // mybatis配置文件路径
      String resource = "mybatis-config.xml";

      // 读取配置文件
      InputStream inputStream = Resources.getResourceAsStream(resource);

      // 创建sqlSessionFactory
      SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

      //创建sqlSession
      sqlSession = sqlSessionFactory.openSession();

      //创建UserMapper_room接口实例
      UserMapper_room userMapper_room = sqlSession.getMapper(UserMapper_room.class);

      //创建UserEntity_room实例
      UserEntity_room userEntity_room = new UserEntity_room();

      //对数据进行修改操作
      userEntity_room.setRoomid(id);
      userEntity_room.setRoomprice(price);
      userEntity_room.setRoommember(member);
      userEntity_room.setRoomtype(type);
      userEntity_room.setRoomstatus(status);
      userEntity_room.setRoomarea(area);


      //调用修改方法
      int result = userMapper_room.update(userEntity_room);

      //提交事务
      sqlSession.commit();

      //判断插入语句是否执行成功
      if (result > 0) {
        System.out.println("修改成功");
      } else {
        System.out.println("修改失败");
      }

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      //关闭sqlSession
      if (sqlSession != null) {
        sqlSession.close();
      }
    }
  }


  //查
  public static void select(String id){
    //初始化sqlSession
    SqlSession sqlSession = null;

    try {
      // mybatis配置文件路径
      String resource = "mybatis-config.xml";

      // 读取配置文件
      InputStream inputStream = Resources.getResourceAsStream(resource);

      // 创建sqlSessionFactory
      SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

      //创建sqlSession
      sqlSession = sqlSessionFactory.openSession();

      //创建UserMapper_room接口实例
      UserMapper_room userMapper_room = sqlSession.getMapper(UserMapper_room.class);

      //创建UserEntity_room实例
      UserEntity_room userEntity_room = new UserEntity_room();

      //对数据进行查询操作
      userEntity_room.setRoomid(id);


      //调用查询方法
      UserEntity_room result = userMapper_room.select(userEntity_room);



      //判断查询语句是否执行成功
      if (result != null) {
        System.out.println("查询成功");
        System.out.println(result);
      } else {
        System.out.println("查询失败");
      }


    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      //关闭sqlSession
      if (sqlSession != null) {
        sqlSession.close();
      }
    }
  }


}

