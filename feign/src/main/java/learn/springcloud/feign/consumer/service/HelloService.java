package learn.springcloud.feign.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @BelongsProject: LearnSpringCloud
 * @BelongsPackage: learn.springcloud.feign.consumer.service
 * @Author: wangchao
 * @CreateTime: 2018-11-22 16:38
 */
@Service
@FeignClient(name = "hello-service")
public interface HelloService {
    @RequestMapping("/hello")
    String helloworld(@RequestHeader HttpServletRequest request);
}
