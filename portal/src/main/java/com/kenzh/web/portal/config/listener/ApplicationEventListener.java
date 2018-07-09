package com.kenzh.web.portal.config.listener;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * 类描述:
 * 项目初始化的监听器
 *
 * @author zhaoxuan
 * @create 2018-07-02 20:46
 */
public class ApplicationEventListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {

        if (event instanceof ApplicationEnvironmentPreparedEvent){// 初始化环境变量

        }else if(event instanceof ApplicationPreparedEvent){// 初始化完成
        }else if(event instanceof ContextRefreshedEvent){// 应用刷新

        }else if(event instanceof ApplicationReadyEvent){// 上下文已经准备

        }else if(event instanceof ContextStartedEvent){// 应用启动

        }else if(event instanceof ContextStoppedEvent){ // 应用停止

        }else if(event instanceof ContextClosedEvent){ // 应用关闭
        }else {

        }
    }
}