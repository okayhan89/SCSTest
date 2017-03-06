package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import net.minidev.json.JSONObject;



@RunWith(SpringRunner.class)
@SpringBootTest
public class ScsTest1ApplicationTests {

	@Test
	public void contextLoads() {
		/*JSONObject obj = new JSONObject();

		
		obj.put("name", "yeobi");
		obj.put("name", "yeobi2");

		JSONObject obj2 = new JSONObject();
		
		obj2.put("age", "15");
		obj2.put("age1", "17");
		
		
		obj.put("age", obj2);
		
		System.out.println(obj.toString());
		System.out.println(obj.toJSONString());*/
		String jdbcUrl = "jdbc:mysql://us-cdbr-iron-east-04.cleardb.net/ad_089f357c5f6b4e9?user=bbe6e5ccdab542&password=5025b3d1";
		
		
	}

}
