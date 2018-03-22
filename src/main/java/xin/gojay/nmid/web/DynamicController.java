package xin.gojay.nmid.web;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import xin.gojay.nmid.entity.Dynamic;
import xin.gojay.nmid.service.DynamicService;
import xin.gojay.nmid.utils.ResponseUtil;

/**
 * @author Gojay
 * @date 2018/3/21
 */
@Controller
@RequestMapping("/api/dynamic")
public class DynamicController {
    private final DynamicService dynamicService;

    @Autowired
    public DynamicController(DynamicService dynamicService) {
        this.dynamicService = dynamicService;
    }

    @RequestMapping(value = "/getDynamic/{dynamicId}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseUtil getDynamic(@PathVariable int dynamicId) {
        return dynamicService.getDynamic(dynamicId);
    }

    @RequestMapping(value = "/getAllDynamic", method = RequestMethod.GET)
    @ResponseBody
    public ResponseUtil getAllDynamic() {
        return dynamicService.getAllDynamic();
    }

    @RequestMapping(value = "/createDynamic", method = RequestMethod.POST)
    @ResponseBody
    public ResponseUtil createDynamic(@Param("userId") String userId,
                                      @Param("words") String words,
                                      MultipartHttpServletRequest request) {
        Dynamic dynamic = new Dynamic();
        dynamic.setUserId(userId);
        dynamic.setWords(words);
        return dynamicService.createDynamic(dynamic, request);
    }
}
