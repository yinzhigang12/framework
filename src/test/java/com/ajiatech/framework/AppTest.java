package com.ajiatech.framework;

import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.ajiatech.pojo.AjiaOrder;
import com.ajiatech.pojo.AjiaShipping;

public class AppTest {
	@Test
	public void testUpdateOrderStatus()
	{
		InputStream is = getClass().getClassLoader().getSystemResourceAsStream("mybatis-config.xml");
		SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlSession = fac.openSession();
		AjiaOrder order = new AjiaOrder();
		order.setOrderId("49136231503987843822");
		order.setStatus(9);
		sqlSession.update("com.ajiatech.mapper.AjiaOrderMapper.updateStatusByOrderId",order);
		sqlSession.commit();
		sqlSession.close();
	}
	
	public void testSelectOrderByUserId()
	{
		InputStream is = getClass().getClassLoader().getSystemResourceAsStream("mybatis-config.xml");
		SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlSession = fac.openSession();
		List<AjiaOrder> orders = sqlSession.selectList("com.ajiatech.mapper.AjiaOrderMapper.selectByUserId",14L);
		System.out.println(orders);
		sqlSession.close();
	}
	
	public void testSelectOrder()
	{
		InputStream is = getClass().getClassLoader().getSystemResourceAsStream("mybatis-config.xml");
		SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlSession = fac.openSession();
		AjiaOrder order = sqlSession.selectOne("com.ajiatech.mapper.AjiaOrderMapper.selectByPrimaryKey","20161001490667343075");
		System.out.println(order);
		sqlSession.close();
	}
	public void testInserOrder()
	{
		InputStream is = getClass().getClassLoader().getSystemResourceAsStream("mybatis-config.xml");
		SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlSession = fac.openSession();
		String orderId = getOrderId();
		Object object = new AjiaOrder(orderId, 14L, 1L, 4000.00, 1, "10", 1, new Date(), new Date(), null, null, null, null, "顺丰速运", "a32443-d234343", "快点发货", "李四", 0);
		sqlSession.insert("com.ajiatech.mapper.AjiaOrderMapper.insert",object);
		sqlSession.commit();
		sqlSession.close();
	}
	
	/**
	 * 生成20位字符串
	 * @return
	 */
	private String getOrderId()
	{
		Random random = new Random();
		int rn = random.nextInt(9000000)+1000000;
		return ""+rn+System.currentTimeMillis();
	}
	
	public void testSelectDefault()
	{
		InputStream is = getClass().getClassLoader().getSystemResourceAsStream("mybatis-config.xml");
		SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlSession = fac.openSession();
		AjiaShipping shippings = sqlSession.selectOne("selectDefault",14L);
		System.out.println(shippings);
		sqlSession.close();
	}
	
	public void testSelectShippingList()
	{
		InputStream is = getClass().getClassLoader().getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlSession = fac.openSession();
		List<AjiaShipping> shippings = sqlSession.selectList("selectByUserId",1L);
		System.out.println(shippings);
		sqlSession.close();
	}
	
	
	public void testSelectShipping()
	{
		InputStream is = getClass().getClassLoader().getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlSession = fac.openSession();
		AjiaShipping shipping = sqlSession.selectOne("selectByPrimaryKey",14L);
		System.out.println(shipping);
		sqlSession.close();
	}	
	
	public void testInsertShipping()
	{
		AjiaShipping shipping = new AjiaShipping(0L,26L,"yinzhigang","1000000","12345678","云南","昆明","盘龙","北京路金江小区","675300",new Date(),new Date(),1,0);
		
		InputStream is = getClass().getClassLoader().getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlSession = fac.openSession();
		sqlSession.insert("insert",shipping);
		sqlSession.commit();
		sqlSession.close();
	}
	
	public void testDeleteShipping()
	{
		InputStream is = getClass().getClassLoader().getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlSession = fac.openSession();
		sqlSession.delete("deleteByPrimaryKey",3L);
		sqlSession.commit();
		sqlSession.close();
	}
	
	public void testUpdateShipping()
	{
		AjiaShipping shipping = new AjiaShipping(0L,26L,"尹志刚","15887224884","12345678","云南","昆明","盘龙","北京路金江小区","675300",new Date(),new Date(),1,0);
		
		InputStream is = getClass().getClassLoader().getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlSession = fac.openSession();
		sqlSession.update("updateByPrimaryKey",shipping);
		sqlSession.commit();
		sqlSession.close();
	}
	
	public void testConnect()
	{
		InputStream is = getClass().getClassLoader().getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlSession = fac.openSession();
		System.out.println(sqlSession);
		sqlSession.close();
	}

}
