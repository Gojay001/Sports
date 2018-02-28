package xin.gojay.nmid.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xin.gojay.nmid.entity.User;
import xin.gojay.nmid.service.UserService;
import xin.gojay.nmid.utils.ResponseUtil;

import javax.annotation.Resource;

/**
 * @author Gojay
 * @date 2017/11/30
 */
@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "api/user/signIn", method = RequestMethod.POST)
    @ResponseBody
    public ResponseUtil signIn(User user) {
        return userService.signIn(user);
    }
}
