package xin.gojay.nmid.dao;

import org.springframework.stereotype.Repository;
import xin.gojay.nmid.entity.User;

/**
 * @author Gojay
 * @date 2017/11/30
 */
@Repository
public interface UserDao {
    /**
     * 根据用户id查询用户信息
     * @param id 用户id
     * @return 用户信息
     */
    User getUserById(Integer id);

    /**
     * 储存用户信息
     * @param user 用户实体
     * @return 成功标志
     */
    int insertUser(User user);
}
