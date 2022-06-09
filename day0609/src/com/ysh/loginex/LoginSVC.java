package com.ysh.loginex;

import java.util.*;

public class LoginSVC {

	private HashMap<String, String> loginDatas;
	private HashMap<String, UserVO> userDatas;

	public LoginSVC() {

		loginDatas = new HashMap<String, String>();
		userDatas = new HashMap<String, UserVO>();

		loginDatas.put("java", "java");
		userDatas.put("java", new UserVO("java", "java", "영등포동", 20, "홍길동"));
										// ID	password   dong   age	 name
	}

	public UserVO login(String id, String password) {

		UserVO user = null;

		if (loginDatas.containsKey(id)) {
			if (loginDatas.get(id).equals(password)) {
				user = userDatas.get(id);
			}
		}
		return user;

	}

}
