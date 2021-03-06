package com.braintreegateway;

public class PaymentMethodNonceRequest extends Request {
    private String paymentMethodToken;
    private String merchantAccountId;
    private Boolean authenticationInsight;

    public PaymentMethodNonceRequest() {
    }

    public PaymentMethodNonceRequest paymentMethodToken(String paymentMethodToken) {
        this.paymentMethodToken = paymentMethodToken;
        return this;
    }

    public PaymentMethodNonceRequest merchantAccountId(String merchantAccountId) {
        this.merchantAccountId = merchantAccountId;
        return this;
    }

    public PaymentMethodNonceRequest authenticationInsight(Boolean authenticationInsight) {
        this.authenticationInsight = authenticationInsight;
        return this;
    }

    public String getPaymentMethodToken() {
        return paymentMethodToken;
    }

    public String getMerchantAccountId() {
        return merchantAccountId;
    }

    public Boolean getAuthenticationInsight() {
        return authenticationInsight;
    }

    @Override
    public String toXML() {
        return buildRequest("payment-method-nonce").toXML();
    }

    protected RequestBuilder buildRequest(String root) {
        RequestBuilder builder = new RequestBuilder(root).
            addElement("merchant-account-id", merchantAccountId).
            addElement("authentication-insight", authenticationInsight.toString());

        return builder;
    }
}
