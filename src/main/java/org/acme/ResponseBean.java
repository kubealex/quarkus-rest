package org.acme;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class ResponseBean {
    private String emeaOpenDemoSession;
    private String hostName;
    private Long pid;
    private String userId;
    private String groupId;
    private String osVersion;
    private String osArchitecture;
    private String secretContent;
    private String applicationProperty;

    public ResponseBean() {
        this("VARIABLE IS NOT DEFINED");
    }

    public ResponseBean(String emeaOpenDemoSession) {
        this.emeaOpenDemoSession = emeaOpenDemoSession;
    }

    public void setSessionName(String emeaOpenDemoSession) {
        if (emeaOpenDemoSession != null)
            this.emeaOpenDemoSession = emeaOpenDemoSession;
    }

    public String getSessionName() {
        return this.emeaOpenDemoSession;
    }

    public void setSecretContent(String secretContent) {
        this.secretContent = secretContent;
    }

    public String getSecretContent() {
        return this.secretContent;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getOsArchitecture() {
        return osArchitecture;
    }

    public void setOsArchitecture(String osArchitecture) {
        this.osArchitecture = osArchitecture;
    }

    public String getApplicationProperty() {
        return applicationProperty;
    }

    public void setApplicationProperty(String applicationProperty) {
        this.applicationProperty = applicationProperty;
    }

}
