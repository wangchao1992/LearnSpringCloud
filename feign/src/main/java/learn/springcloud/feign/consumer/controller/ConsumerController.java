package learn.springcloud.feign.consumer.controller;

import learn.springcloud.feign.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.logging.Logger;

/**
 * @BelongsProject: LearnSpringCloud
 * @BelongsPackage: learn.springcloud.feign.consumer.service
 * @Author: bailiu
 * @CreateTime: 2018-11-22 16:42
 */
@RestController
@RequestMapping(path = "/feign")
public class ConsumerController {
    //Logger logger = Logger.getLogger("ConsumerController");
    @Autowired
    HelloService helloService;
    @GetMapping(path = "/consumerHello")
    public String helloConsumer(HttpServletRequest request){
        //logger.info("this is consumerHello");
      return   helloService.helloworld(request);
    }
}
