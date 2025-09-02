package io.dataease.api.dto;


import java.io.Serializable;

public class SettingVO implements Serializable {

    public static final long serialVersionUID = 1L;

    private String domain;

    private String account;

    private String appId;

    private String appSecret;

    private String dashboardId;

    private String screenId;

    private String viewResourceId;

    private String viewId;
    private String dfId;

    private String viewBusiFlag;

    private String outerParams;

    private String sendParams;

    private String webParams;

    private String sqlbotDomain;
    private String sqlbotAccount;
    private String sqlbotAppId;
    private String sqlbotAppSecret;

    public String getWebParams() {
        return webParams;
    }

    public void setWebParams(String webParams) {
        this.webParams = webParams;
    }

    public String getSendParams() {
        return sendParams;
    }

    public void setSendParams(String sendParams) {
        this.sendParams = sendParams;
    }

    public String getOuterParams() {
        return outerParams;
    }

    public void setOuterParams(String outerParams) {
        this.outerParams = outerParams;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getDashboardId() {
        return dashboardId;
    }

    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    public String getScreenId() {
        return screenId;
    }

    public void setScreenId(String screenId) {
        this.screenId = screenId;
    }

    public String getViewResourceId() {
        return viewResourceId;
    }

    public void setViewResourceId(String viewResourceId) {
        this.viewResourceId = viewResourceId;
    }

    public String getViewId() {
        return viewId;
    }

    public void setViewId(String viewId) {
        this.viewId = viewId;
    }

    public String getViewBusiFlag() {
        return viewBusiFlag;
    }

    public void setViewBusiFlag(String viewBusiFlag) {
        this.viewBusiFlag = viewBusiFlag;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getDfId() {
        return dfId;
    }

    public void setDfId(String dfId) {
        this.dfId = dfId;
    }

    public String getSqlbotDomain() {
        return sqlbotDomain;
    }

    public void setSqlbotDomain(String sqlbotDomain) {
        this.sqlbotDomain = sqlbotDomain;
    }

    public String getSqlbotAccount() {
        return sqlbotAccount;
    }

    public void setSqlbotAccount(String sqlbotAccount) {
        this.sqlbotAccount = sqlbotAccount;
    }

    public String getSqlbotAppId() {
        return sqlbotAppId;
    }

    public void setSqlbotAppId(String sqlbotAppId) {
        this.sqlbotAppId = sqlbotAppId;
    }

    public String getSqlbotAppSecret() {
        return sqlbotAppSecret;
    }

    public void setSqlbotAppSecret(String sqlbotAppSecret) {
        this.sqlbotAppSecret = sqlbotAppSecret;
    }


    public SettingVO(String domain, String account, String appId, String appSecret, String dashboardId, String screenId, String viewResourceId, String viewId, String viewBusiFlag, String dfId) {
        this.domain = domain;
        this.account = account;
        this.appId = appId;
        this.appSecret = appSecret;
        this.dashboardId = dashboardId;
        this.dfId = dfId;
        this.screenId = screenId;
        this.viewResourceId = viewResourceId;
        this.viewId = viewId;
        this.viewBusiFlag = viewBusiFlag;
    }

    public SettingVO() {
    }
}
