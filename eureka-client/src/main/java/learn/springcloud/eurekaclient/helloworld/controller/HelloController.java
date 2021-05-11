package learn.springcloud.eurekaclient.helloworld.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @BelongsProject: LearnSpringCloud
 * @BelongsPackage: learn.springcloud.eurekaclient.helloworld.controller
 * @Author: godchao
 * @CreateTime: 2018-11-22 14:42
 */
@RestController
@RequestMapping
public class HelloController {
//    private Logger logger = Logger.getLogger("HelloController");

    @RequestMapping(path = "/hello")
    public String index(HttpServletRequest request){
        System.out.println(request.getRequestURI());
//        logger.info("this is "+request.getRequestURI());
        return "HelloWorld";
    }
}
