package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.product.sign.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2018-01-10 12:04:47
 */
public class AlipayInsSceneProductSignConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 4678323245383373548L;

	/** 
	 * 支付宝代扣协议ID
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
	public String getAgreementNo( ) {
		return this.agreementNo;
	}

}