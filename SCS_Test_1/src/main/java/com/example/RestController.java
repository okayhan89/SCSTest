package com.example;

import org.json.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@RequestMapping("/rest")
	public @ResponseBody String rest() throws JSONException {

		JSONObject obj = new JSONObject();

		obj.put("name", "yeobi");
		obj.put("age", "27");

		System.out.println(obj.toString());

		return obj.toString();
		//return obj.toJSONString();
	}
}
