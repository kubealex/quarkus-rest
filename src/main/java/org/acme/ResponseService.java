package org.acme;

import java.io.IOException;
import java.net.InetAddress;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@RequestScoped
public class ResponseService {

    @Inject 
    Utils utils;

    @ConfigProperty(name = "customField", defaultValue = "application.properties not found")
    private String applicationProperty; 

    public ResponseBean setResponseBean(ResponseBean responseBean) throws InterruptedException, IOException 
    {
        responseBean.setSessionName(System.getenv("SESSION_NAME"));
        responseBean.setSecretContent(utils.getSecretContent());
        responseBean.setApplicationProperty(applicationProperty);
        responseBean.setHostName(InetAddress.getLocalHost().getHostName());
        responseBean.setPid(ProcessHandle.current().pid());
        responseBean.setUserId(utils.getUid(System.getProperty("user.name")));
        responseBean.setGroupId(utils.getGid(System.getProperty("user.name")));
        responseBean.setOsVersion(System.getProperty("os.version"));
        responseBean.setOsArchitecture(System.getProperty("os.arch"));
        
        return responseBean;
    }


}
