package io.dataease.api.dto;


import java.io.Serializable;

public class SettingVO implements Serializable {

    public static final long serialVersionUID = 1L;

    private String domain;

    private String account;

    private String dashboardId;

    private String screenId;

    private String viewResourceId;

    private String viewId;

    private String viewBusiFlag;

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

    public SettingVO(String domain, String account, String dashboardId, String screenId, String viewResourceId, String viewId, String viewBusiFlag) {
        this.domain = domain;
        this.account = account;
        this.dashboardId = dashboardId;
        this.screenId = screenId;
        this.viewResourceId = viewResourceId;
        this.viewId = viewId;
        this.viewBusiFlag = viewBusiFlag;
    }

    public SettingVO() {
    }
}
