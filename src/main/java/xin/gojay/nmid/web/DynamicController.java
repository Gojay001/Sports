package xin.gojay.nmid.web;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xin.gojay.nmid.entity.Dynamic;
import xin.gojay.nmid.utils.ResponseUtil;

/**
 * @author Gojay
 * @date 2018/3/21
 */
@Controller
@RequestMapping("/api/dynamic")
public class DynamicController {
    @RequestMapping(value = "/createDynamic", method = RequestMethod.POST)
    public ResponseUtil createDynamic(@Param("userId") String userId,
                                      @Param("words") String words,
                                      @Param("dynamicPic") String dynamicPic) {
        Dynamic dynamic = new Dynamic();
        dynamic.setUserId(userId);
        dynamic.setWords(words);
        dynamic.setDynamicPic(dynamicPic);
        return null;
    }
}
