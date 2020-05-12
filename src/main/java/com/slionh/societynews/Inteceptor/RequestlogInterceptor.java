package com.slionh.societynews.Inteceptor;

import com.slionh.societynews.entity.Requestlog;
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
public class RequestlogInterceptor implements HandlerInterceptor {
    @Resource
    private CountService countService;
    List<Requestlog> logs = new ArrayList();

    public RequestlogInterceptor() {
    }

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Requestlog requestlog = new Requestlog();
        String ip = IpUtil.getIpAddr(request);
        String url = String.valueOf(request.getRequestURL());
        String reference = request.getHeader("referer");
        requestlog.setIp(ip);
        requestlog.setUrl(url);
        requestlog.setOther(reference);
        this.logs.add(requestlog);
        if (this.logs.size() > 4) {
            this.countService.insertRequestlogList(this.logs);
            this.logs.clear();
        }

        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }
}
