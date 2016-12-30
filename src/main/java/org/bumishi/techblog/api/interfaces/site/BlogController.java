package org.bumishi.techblog.api.interfaces.site;

import org.apache.commons.lang3.StringUtils;
import org.bumishi.techblog.api.application.SiteConfigService;
import org.bumishi.techblog.api.interfaces.site.facade.SiteBlogFacade;
import org.bumishi.techblog.api.interfaces.site.facade.dto.SiteBlogDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by xieqiang on 2016/11/27.
 */
@Controller
public class BlogController {

    @Autowired
    protected SiteBlogFacade blogFacade;

    @Autowired
    private SiteConfigService siteConfigService;


    @GetMapping(value = {"/", "/blog", "/index.html"})
    public String index(Model model) {
        model.addAttribute("pageModel", blogFacade.pageQuery(1, siteConfigService.pageSize()));
        model.addAttribute("catalog", "java");
        model.addAttribute("page", 1);
        return "catalog";
    }

    @GetMapping("/blog/{id}")
    public String get(@PathVariable("id") String id, Model model, @CookieValue(name = "viewd", required = false) String viewd, HttpServletResponse response) {
        SiteBlogDto blog = blogFacade.getBlog(id);
        if(blog==null){
            return "404";
        }
        model.addAttribute("blog",blog);
        if (StringUtils.isBlank(viewd) || !viewd.equals("1")) {
            blogFacade.addViews(id);
            response.addCookie(new Cookie("viewd", "1"));
        }
        return "blog";
    }

    @GetMapping("/blog/catalog/{catalog}")
    public String catalog(@PathVariable("catalog") String catalog, @RequestParam(value = "page", required = false, defaultValue = "1") int page, Model model) {
        model.addAttribute("pageModel", blogFacade.queryByCatalog(page, siteConfigService.pageSize(), catalog));
        model.addAttribute("catalog", catalog);
        model.addAttribute("page", page);
        return "catalog";
    }



}
