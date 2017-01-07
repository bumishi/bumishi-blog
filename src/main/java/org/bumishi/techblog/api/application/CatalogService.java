package org.bumishi.techblog.api.application;

import org.bumishi.toolbox.model.NavigationNode;
import org.bumishi.toolbox.model.TreeModel;
import org.bumishi.toolbox.model.repositry.NavigationNodeRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author qiang.xie
 * @date 2016/12/26
 */
@Service
@CacheConfig(cacheNames = "catalog")
public class CatalogService {


    @Autowired
    @Qualifier("catalogJdbcRepositry")
    protected NavigationNodeRepositry navigationNodeRepositry;

    @Cacheable
    public List<NavigationNode> listWithTree(boolean includeDisable) {
        return (List<NavigationNode>) new TreeModel(navigationNodeRepositry.list()).buildTree(includeDisable);
    }

    @Cacheable
    public List<NavigationNode> listByOrder() {
        List<NavigationNode> list = navigationNodeRepositry.list();
        TreeModel.sortByTree(list);
        return list;
    }

    @Cacheable
    public NavigationNode getCatalog(String id){
        return navigationNodeRepositry.get(id);
    }
}
