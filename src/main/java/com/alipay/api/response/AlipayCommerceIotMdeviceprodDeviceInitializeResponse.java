package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.mdeviceprod.device.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayCommerceIotMdeviceprodDeviceInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 8474282253246663565L;

	/** 
	 * 设备唯一标识
	 */
	@ApiField("biz_tid")
	private String bizTid;

	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}
	public String getBizTid( ) {
		return this.bizTid;
	}

}
