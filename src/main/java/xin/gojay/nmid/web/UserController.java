package xin.gojay.nmid.web;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping(value = "api/user/createUser", method = RequestMethod.POST)
    @ResponseBody
    public ResponseUtil createUser(@Param("id") int id,
                               @Param("userName") String userName,
                               @Param("gender") String gender,
                               @Param("password") String password,
                               @Param("nickName") String nickName,
                               @Param("college") String college) {
        User user = new User();
        user.setId(id);
        user.setUserName(userName);
        user.setGender(gender);
        user.setPassword(password);
        user.setNickName(nickName);
        user.setCollege(college);
        return userService.createUser(user);
    }

    @RequestMapping(value = "api/user/searchUser/{id}/{password}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseUtil searchUser(@PathVariable("id") int id,
                                   @PathVariable("password") String password) {
        User user = new User(id, password);
        return userService.searchUser(user);
    }

    @RequestMapping(value = "api/user/searchActivity/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseUtil searchActivity(@PathVariable("userId") int userId) {
        return userService.searchActivity(userId);
    }
}
