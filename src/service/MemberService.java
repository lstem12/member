package service;

import java.util.HashMap;
import java.util.Map;

import dao.MemberDAO;

public class MemberService {
	private MemberDAO memberDAO = new MemberDAO();
	public Map<String,Object> insertMember(Map<String,String> params) {
		System.out.println(params);
		int result = memberDAO.insertMember(params);
		Map<String,Object> rMap = new HashMap<>();
		rMap.put("msg", "성공");
		if(result!=1) {
			rMap.put("msg", "실패");
		}
		rMap.put("result", result);
		
		return rMap;
	}
}
