package com.guigu.model;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
/**
 * @Date: 2022/3/10 15:06
 * @Description: Menu
 * @Version 1.0.0
 */
@Data
@Builder
public class Menu {
    /**
     * 主键ID
     */
    public Integer id;

    /**
     * 名称
     */
    public String name;

    /**
     * 父节点ID， 根节点为0
     */
    public Integer parentId;

    /**
     * 子节点集合
     */
    public List<Menu> childrenList;

    public Menu(Integer id, String name, Integer parentId) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
    }

    public Menu(Integer id, String name, Integer parentId, List<Menu> childrenList) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.childrenList = childrenList;
    }

}
