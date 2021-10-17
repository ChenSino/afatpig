package com.chen.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * @author chenkun
 * @Description Security配置
 * @date 2021/10/12 下午5:24
 */
@Configuration
@Slf4j
//@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        log.debug("进入自定义config");
        http
                .csrf()
                .disable()
                .authorizeRequests()
                //数据库角色表的角色码必须加ROLE_开头,例ROLE_USER
//                .antMatchers("/index/**").hasRole("USER")
//                .antMatchers(HttpMethod.GET).permitAll()
                .antMatchers("/get/**").permitAll()
//                .antMatchers("/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .sessionManagement()
                //防止session篡改
                .sessionFixation().migrateSession()
                //Spring Security不会创建session或使用session(这里有四种模式,自由选择)
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS).
                //session超时进入超时页面
                        invalidSessionUrl("/timeOut")
                //登陆配置信息
                .and()
                .formLogin(form -> {
                    form.loginPage("/login").permitAll();
                })
//                .loginPage("/login")
//                .successForwardUrl("/index")
//                .permitAll()
//                //权限不足时转向403页面
//                .and()
//                .exceptionHandling()
//                .accessDeniedPage("/403")
//                //配置登出处理
//                .and()
//                .logout()
//                .invalidateHttpSession(true)
//                .permitAll()
        ;
    }
}
