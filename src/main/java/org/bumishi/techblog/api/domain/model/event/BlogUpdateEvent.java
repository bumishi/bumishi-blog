package org.bumishi.techblog.api.domain.model.event;

import org.bumishi.techblog.api.domain.model.Blog;

/**
 * 博客新增或修改事件，用于通知缓存更新
 *
 * @author qiang.xie
 * @date 2017/1/7
 */
public class BlogUpdateEvent {

    private Blog blog;

    public BlogUpdateEvent(Blog blog) {
        this.blog = blog;
    }

    public Blog getBlog() {
        return blog;
    }
}
