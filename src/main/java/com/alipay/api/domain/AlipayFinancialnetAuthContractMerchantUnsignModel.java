package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构商户解约服务
 *
 * @author auto create
 * @since 1.0, 2019-01-11 17:24:35
 */
public class AlipayFinancialnetAuthContractMerchantUnsignModel extends AlipayObject {

	private static final long serialVersionUID = 8359576578212412772L;

	/**
	 * 场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
