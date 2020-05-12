package com.slionh.societynews.Inteceptor;

import com.slionh.societynews.entity.Newscount;
import com.slionh.societynews.service.CountService;
import com.slionh.societynews.util.IpUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Component
public class NewsCountInterceptor implements HandlerInterceptor {
    @Resource
    private CountService countService;
    List<Newscount> logs = new ArrayList();

    public NewsCountInterceptor() {
    }

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Newscount newscount = new Newscount();
        String ip = IpUtil.getIpAddr(request);
        String url = String.valueOf(request.getRequestURL());
        String newsId = String.valueOf(request.getParameter("newsId"));
        String reference = request.getHeader("referer");
        newscount.setIp(ip);
        newscount.setNewsid(newsId);
        newscount.setReferer(reference);
        this.logs.add(newscount);
        if (this.logs.size() > 4) {
            this.countService.insertNewsCountList(this.logs);
            this.logs.clear();
        }

        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }
}
