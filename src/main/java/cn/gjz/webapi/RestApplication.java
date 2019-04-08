package cn.gjz.webapi;

import cn.gjz.controller.UserLoginController;
import cn.gjz.controller.hello;
import cn.gjz.dao.UserDao;
import cn.gjz.service.UserLoginService;
import cn.gjz.service.serviceImp.UserLoginServiceImp;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * @auther GuJunzhou
 * @date 2019/3/21 11:06
 */

@ApplicationPath("/")
public class RestApplication extends ResourceConfig {
    public RestApplication(){
        // 服务类所在的包路径，主路径
        packages("cn.gjz.service");
        packages("cn.gjz.controller");
        //用戶自定义资源路径
        register(UserLoginController.class);
        register(hello.class);
        register(UserLoginService.class);
        register(UserLoginServiceImp.class);

    }

}
