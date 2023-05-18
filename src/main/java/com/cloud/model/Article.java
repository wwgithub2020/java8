package com.cloud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @CreateTime: 2023-05-18  14:35
 * @Description: TODO
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    /**
     * 文章标题
     */
    private String title;

    /**
     * 发布时间
     */
    private String releaseTime;

    /**
     * 是否推荐：Y 推荐；N 不推荐
     */
    private String recommend;

    /**
     * 是否置顶: Y 置顶；N 不置顶
     */
    private String top;
}
