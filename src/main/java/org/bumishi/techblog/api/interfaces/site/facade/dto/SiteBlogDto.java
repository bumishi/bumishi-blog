package org.bumishi.techblog.api.interfaces.site.facade.dto;

import java.util.Date;

/**
 * @author qiang.xie
 * @date 2016/12/27
 */
public class SiteBlogDto {

    private String id;

    /**
     * 标题
     */
    private String title;

    /**
     * 副标题
     */
    private String secondTitle;

    /**
     * 分类id
     */
    private String catalog;

    /**
     * 分类展示文本
     */
    private String catalogDisplay;

    /**
     * 作者
     */
    private String auther;

    /**
     * 发布时间
     */
    private Date publishTime;

    /**
     * 封面图片，主要迎合微信公众号
     */
    private String img;


    /**
     * 内容
     */
    private String display;

    /**
     * 文章概要
     */
    private String summary;

    /**
     * 文章链接
     */
    private String link;

    /**
     * 阅读量
     */
    private long views;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSecondTitle() {
        return secondTitle;
    }

    public void setSecondTitle(String secondTitle) {
        this.secondTitle = secondTitle;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public String getCatalogDisplay() {
        return catalogDisplay;
    }

    public void setCatalogDisplay(String catalogDisplay) {
        this.catalogDisplay = catalogDisplay;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public long getViews() {
        return views;
    }

    public void setViews(long views) {
        this.views = views;
    }
}