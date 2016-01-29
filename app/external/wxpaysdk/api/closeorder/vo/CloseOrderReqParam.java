package external.wxpaysdk.api.closeorder.vo;

import extend.voinfo.annotation.XmlField;

/**
 * 关闭订单请求参数
 * 
 * @author Joeson Chan<chenxuegui.cxg@alibaba-inc.com>
 * @since 2016年1月26日
 *
 */
public class CloseOrderReqParam {

    /**
     * 微信分配的公众账号ID（企业号corpid即为此appId）
     */
    @XmlField(value = "appid")
    private String appId;

    /**
     * 微信支付分配的商户号
     */
    @XmlField(value = "mch_id")
    private String mchId;

    /**
     * 商户系统内部的订单号，当没提供transaction_id时需要传这个。
     */
    @XmlField(value = "out_trade_no")
    private String outTradeNo;
    
    /**
     * 随机字符串，不长于32位。
     */
    @XmlField(value = "nonce_str")
    private String nonceStr;
    
    /**
     * 签名
     */
    @XmlField(value = "sign")
    private String sign;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

}