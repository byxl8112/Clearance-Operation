package com.cccs7.co.service.strategies;

import com.cccs7.co.bean.po.Article;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * <p> 发布服务策略接口 </p>
 *
 * @Author cccs7/cs7eric - csq020611@gmail.com
 * @Description 发布服务策略接口
 * @Date 2023/10/20 13:47
 */
public interface PublishingStrategy {

    /**
     * 发布服务
     *
     * @param article 文章
     */
    void publish(Article article,  MongoTemplate mongoTemplate);
}
