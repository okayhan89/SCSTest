package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import net.minidev.json.JSONArray;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ScsTest1ApplicationTests {

	@Test
	public void contextLoads() throws Exception, SQLException {
		/*
		 * JSONObject obj = new JSONObject();
		 * 
		 * 
		 * obj.put("name", "yeobi"); obj.put("name", "yeobi2");
		 * 
		 * JSONObject obj2 = new JSONObject();
		 * 
		 * obj2.put("age", "15"); obj2.put("age1", "17");
		 * 
		 * 
		 * obj.put("age", obj2);
		 * 
		 * System.out.println(obj.toString());
		 * System.out.println(obj.toJSONString());
		 */

		String dbName = "ad_00b76e85c3373bf";
		String userName = "bcdf2bac3b23de";
		String password = "8bac561a";
		String hostname = "us-cdbr-iron-east-04.cleardb.net";
		String port = "3306";
		String jdbcUrl = "jdbc:mysql://" + hostname + ":" + port + "/" + dbName + "?&user=" + userName + "&password="
				+ password;

		// String jdbcUrl =
		// "jdbc:mysql://us-cdbr-iron-east-04.cleardb.net/ad_089f357c5f6b4e9?user=bbe6e5ccdab542&password=5025b3d1";

		try {
			System.out.println("Loading driver...111");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded!");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Cannot find the driver in the classpath!", e);
		}
		Connection con = null;
		Statement setupStatement = null;
		Statement readStatement = null;
		ResultSet resultSet = null;
		String results = "";
		int numresults = 0;
		String statement = null;

		System.out.println("1");
		con = DriverManager.getConnection(jdbcUrl);
		String SQL = "select * from sample_table";
		Statement stmt = (Statement) con.createStatement();
		System.out.println("3");
		ResultSet rs = stmt.executeQuery(SQL);

		System.out.println("2");
		ResultSetMetaData rsmd = null;
		rsmd = rs.getMetaData();
		int numberofColumn = rsmd.getColumnCount();
		System.out.println(numberofColumn + "test");
		List<Float> row = null;
		List<ArrayList<Float>> result = new ArrayList();

		int count = 0;

		/*
		 * while (rs.next()) { System.out.println("11"); row = new
		 * ArrayList<Float>(); for (int j = 1; j <= numberofColumn; j++) {
		 * System.out.println("222"); System.out.print(rs.getString(j) + "  ");
		 * row.add(Float.parseFloat(rs.getString(j)));
		 * 
		 * System.out.println(row.toString()); }
		 * System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
		 * 
		 * result.add(count, (ArrayList<Float>) row); count++;
		 * System.out.println(count); System.out.println(result.toString());
		 * 
		 * }
		 */
		JSONObject obj = new JSONObject();
		JSONObject name = new JSONObject();
		JSONObject content = new JSONObject();
		JSONArray jarr = new JSONArray();
		
		while (rs.next()) {
			System.out.println("name : " + rs.getString("name") + "\tContent : " + rs.getString("content"));
			for (int j = 1; j <= numberofColumn; j++) {
				System.out.println("-----");
				// jarr.add(rs.getString("name"));
				name.put("name", rs.getString("name"));
				content.put("content", rs.getString("content"));
				System.out.println("-----!-----");
			}

			obj.put("json", name);

		}

		System.out.println(obj.toString());
		// System.out.println(result.toString());

	}

}
