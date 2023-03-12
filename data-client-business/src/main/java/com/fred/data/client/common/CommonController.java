package com.fred.data.client.common;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {
	
	/**
	 * <注册consul心跳接口>
	 * <功能详情描述>
	 * @author zhenglonghua 2022年7月11日
	 * @return
	 * @exception/throws
	 * @see
	 * @since 1.0.0
	 */
	@RequestMapping(value = "/health/check")
	public String health() {
		return "sucess";
	}

}
