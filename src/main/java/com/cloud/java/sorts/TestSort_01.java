package com.cloud.java.sorts;

import com.cloud.model.Article;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @CreateTime: 2023-05-18  14:35
 * @Description: 排序
 * @Version: 1.0
 */
public class TestSort_01 {

    public static void main(String[] args) {
        List<Article> list = initData();
        sort_method_1(list);
        System.out.println("------------------------------测试数据------------------------------");
        sort_method_2(list);
    }

    /**
     * 初始化数据
     */
    public static List<Article> initData() {
        List<Article> list = new ArrayList<>();
        list.add(new Article("文章一","2022-11-01","Y","Y"));
        list.add(new Article("文章二","2021-11-02","Y","Y"));
        list.add(new Article("文章三","2022-11-01","Y","N"));
        list.add(new Article("文章一","2020-11-02","Y","N"));
        list.add(new Article("文章一","2021-11-01","N","Y"));
        list.add(new Article("文章一","2021-11-02","N","Y"));
        list.add(new Article("文章一","2021-11-01","N","N"));
        list.add(new Article("文章一","2021-11-02","N","N"));
        return list;
    }

    /**
     * 按照推荐、置顶、发布时间来排序
     * @param list
     */
    public static void sort_method_1(List<Article> list) {
        List<Article> articleList = list.stream()
                .sorted(Comparator.comparing(Article::getRecommend, Comparator.reverseOrder())
                        .thenComparing(Article::getTop, Comparator.reverseOrder())
                        .thenComparing(Article::getReleaseTime, Comparator.reverseOrder())).collect(Collectors.toList());
        articleList.stream().forEach(System.out::println);
    }


    public static void sort_method_2(List<Article> list) {
        List<Article> articleList = list.stream()
                .sorted(Comparator.comparing(Article::getRecommend, Comparator.reverseOrder())
                        .thenComparing(Article::getTop, Comparator.reverseOrder())
                        .thenComparing(Article::getReleaseTime, Comparator.reverseOrder()).reversed()).collect(Collectors.toList());
        articleList.stream().forEach(System.out::println);
    }
}
