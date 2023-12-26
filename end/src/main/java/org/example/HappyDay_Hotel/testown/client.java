package org.example.HappyDay_Hotel.testown;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.HappyDay_Hotel.entity.UserEntity_client;
import org.example.HappyDay_Hotel.mapper.UserMapper_client;



public class client {


  public static void main(String[] args) {

//    add("123a5","123","123","123","123");

    //delete();

    //update();

//    select();

  }

  //增
  public static void add(String id ,String name, String card, String phone, String password){
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

      //创建UserMapper_client接口实例
      UserMapper_client userMapper_client = sqlSession.getMapper(UserMapper_client.class);

      //创建UserEntity_client实例
      UserEntity_client userEntity_client = new UserEntity_client();

      //对数据进行插入操作
      userEntity_client.setClientid(id);
      userEntity_client.setClientname(name);
      userEntity_client.setClientcard(card);
      userEntity_client.setClientphone(phone);
      userEntity_client.setClientpassword(password);


      //调用插入方法
      int result = userMapper_client.insert(userEntity_client);

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

      //创建UserMapper_client接口实例
      UserMapper_client userMapper_client = sqlSession.getMapper(UserMapper_client.class);

      //创建UserEntity_client实例
      UserEntity_client userEntity_client = new UserEntity_client();

      //对数据进行删除操作
      userEntity_client.setClientid(id);


      //调用删除方法
      int result = userMapper_client.delete(userEntity_client);

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
  public static void update(String id, String name, String card, String phone, String password){
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

      //创建UserMapper_client接口实例
      UserMapper_client userMapper_client = sqlSession.getMapper(UserMapper_client.class);

      //创建UserEntity_client实例
      UserEntity_client userEntity_client = new UserEntity_client();

      //对数据进行修改操作
      userEntity_client.setClientid(id);
      userEntity_client.setClientname(name);
      userEntity_client.setClientcard(card);
      userEntity_client.setClientphone(phone);
      userEntity_client.setClientpassword(password);


      //调用修改方法
      int result = userMapper_client.update(userEntity_client);

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

      //创建UserMapper_client接口实例
      UserMapper_client userMapper_client = sqlSession.getMapper(UserMapper_client.class);

      //创建UserEntity_client实例
      UserEntity_client userEntity_client = new UserEntity_client();

      //对数据进行查询操作
      userEntity_client.setClientid(id);


      //调用查询方法
      UserEntity_client result = userMapper_client.select(userEntity_client);



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
