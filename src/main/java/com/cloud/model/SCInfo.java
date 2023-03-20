package com.cloud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Date: 2022/4/21 08:53
 * @Description: SCInfo
 * @Version 1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SCInfo {
    /**
     * 学号
     */
    private String sno;

    /**
     * 课程号
     */
    private String cno;

    /**
     * 得分
     */
    private Double score;
}
