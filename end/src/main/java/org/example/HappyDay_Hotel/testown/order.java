package org.example.HappyDay_Hotel.testown;


import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.HappyDay_Hotel.entity.UserEntity_order;
import org.example.HappyDay_Hotel.mapper.UserMapper_order;

public class order {


  public static void main(String[] args) {

    //add();

    //delete();

    //update();

    select();

  }

  //增
  public static void add(String id, String start, String end, String clientid, String roomid){
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

      //创建UserMapper_order接口实例
      UserMapper_order userMapper_order = sqlSession.getMapper(UserMapper_order.class);

      //创建UserEntity_order实例
      UserEntity_order userEntity_order = new UserEntity_order();

      //对数据进行插入操作
      userEntity_order.setOrderid(id);
      userEntity_order.setOrderstart(start);
      userEntity_order.setOrderend(end);
      userEntity_order.setClientid(clientid);
      userEntity_order.setRoomid(roomid);


      //调用插入方法
      int result = userMapper_order.insert(userEntity_order);

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

      //创建UserMapper_order接口实例
      UserMapper_order userMapper_order = sqlSession.getMapper(UserMapper_order.class);

      //创建UserEntity_order实例
      UserEntity_order userEntity_order = new UserEntity_order();

      //对数据进行删除操作
      userEntity_order.setOrderid(id);


      //调用删除方法
      int result = userMapper_order.delete(userEntity_order);

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
  public static void update(String id, String start, String end, String clientid, String roomid){
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

      //创建UserMapper_order接口实例
      UserMapper_order userMapper_order = sqlSession.getMapper(UserMapper_order.class);

      //创建UserEntity_order实例
      UserEntity_order userEntity_order = new UserEntity_order();

      //对数据进行修改操作
      userEntity_order.setOrderid(id);
      userEntity_order.setOrderstart(start);
      userEntity_order.setOrderend(end);
      userEntity_order.setClientid(clientid);
      userEntity_order.setRoomid(roomid);


      //调用修改方法
      int result = userMapper_order.update(userEntity_order);

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
  public static String select(String id){
    //初始化sqlSession
    SqlSession sqlSession = null;
     String a = "";
    try {
      // mybatis配置文件路径
      String resource = "mybatis-config.xml";

      // 读取配置文件
      InputStream inputStream = Resources.getResourceAsStream(resource);

      // 创建sqlSessionFactory
      SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

      //创建sqlSession
      sqlSession = sqlSessionFactory.openSession();

      //创建UserMapper_order接口实例
      UserMapper_order userMapper_order = sqlSession.getMapper(UserMapper_order.class);

      //创建UserEntity_order实例
      UserEntity_order userEntity_order = new UserEntity_order();

      //对数据进行查询操作
      userEntity_order.setOrderid(id);


      //调用查询方法
      UserEntity_order result = userMapper_order.select(userEntity_order);
      a = result.getOrderid()+result.getOrderstart()+result.getOrderend()+result.getClientid()+result.getRoomid();

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
    return a;

  }


}

