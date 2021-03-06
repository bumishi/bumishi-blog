package org.bumishi.techblog.api.interfaces.manage.facade.command;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by xieqiang on 2016/12/4.
 */
public class WriteBlogCommand {

    /**主标题*/
    @NotBlank
    @Length(min = 5,max = 50)
    private String title;

    /**副标题*/
    @Length(max = 30)
    private String secondTitle;

    /**分类*/
    @NotBlank
    @Length(max = 30)
    private String catalog;

    /**markdownd原内容*/
    @NotBlank
    private String md;

    /**
     * 展示内容
     * */
    @NotBlank
    private String display;

    @NotBlank
    /**封面图片，主要迎合微信公众号*/
    private String img;

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

    public String getMd() {
        return md;
    }

    public void setMd(String md) {
        this.md = md;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
}
