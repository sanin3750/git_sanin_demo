package com.test;

import com.sunrise.zjbomc.service.webservice.AddPortalRole;
import com.sunrise.zjbomc.service.webservice.BomcUserAuthorityWS;
import com.sunrise.zjbomc.service.webservice.QueryPortalRolesReq;
import com.sunrise.zjbomc.service.webservice.QueryPortalRolesResp;
import com.sunrise.zjbomc.service.webservice.impl.BomcUserAuthorityWSImplService;

public class CXFTest {
	public static void main(String[] args) {
//		BomcUserAuthorityWSImplService service = new BomcUserAuthorityWSImplService();
//		BomcUserAuthorityWS bu = service.getBomcUserAuthorityWSImplPort();
//		QueryPortalRolesReq req = new QueryPortalRolesReq();
//		req.setPwd("e05c3a1f5c43ceb2aceeb06caf25c0eb");
//		req.setTs("390");
//		req.setRoleType("11111");
//		QueryPortalRolesResp resp = bu.queryPortalRoles(req);
//		System.out.println(resp.getResultCode());
//		System.out.println(resp.getRoleList().get(0).getRoleName());
		
		StringBuffer s = new StringBuffer("123");
		test(s);
		System.out.println(s);
	}
	
	public static void test(StringBuffer s){
		s.append("111");
		
	}
}
