package org.bumishi.techblog.api.domain.model.event;

import org.bumishi.toolbox.model.NavigationNode;

/**
 * catalog新增或修改事件，用于通知缓存更新
 *
 * @author qiang.xie
 * @date 2017/1/7
 */
public class CatalogUpdateEvent {

    private NavigationNode catalog;

    public CatalogUpdateEvent(NavigationNode catalog) {
        this.catalog = catalog;
    }

    public NavigationNode getCatalog() {
        return catalog;
    }
}
