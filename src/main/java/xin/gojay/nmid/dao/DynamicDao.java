package xin.gojay.nmid.dao;

import xin.gojay.nmid.entity.Dynamic;

import java.util.List;

/**
 * @author Gojay
 * @date 2018/3/21
 */
public interface DynamicDao {

    /**
     * 根据动态ID获取动态记录
     * @param dynamicId 动态ID
     * @return 动态消息
     */
    Dynamic getDynamic(int dynamicId);

    /**
     * 获取所有动态消息记录
     * @return 动态消息列表
     */
    List<Dynamic> getAllDynamic();

    /**
     * 加入一条动态消息记录
     * @param dynamic 动态消息
     * @return 成功标志
     */
    int insertDynamic(Dynamic dynamic);
}
