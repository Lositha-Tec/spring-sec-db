package lk.tea_leaves_collector.configuration;


import lk.tea_leaves_collector.asset.user_management.user.entity.User;
import lk.tea_leaves_collector.asset.user_management.user.service.UserService;
import lk.tea_leaves_collector.asset.user_management.user_session_log.entity.UserSessionLog;
import lk.tea_leaves_collector.asset.user_management.user_session_log.entity.enums.UserSessionLogStatus;
import lk.tea_leaves_collector.asset.user_management.user_session_log.service.UserSessionLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

@Component( "customAuthenticationSuccessHandler" )
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    @Autowired
    private UserSessionLogService userSessionLogService;
    @Autowired
    private UserService userService;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) throws IOException, ServletException {
        //do some logic here if you want something to be done whenever
        User authUser = userService.findByUserName(SecurityContextHolder.getContext().getAuthentication().getName());
//if user already have failure attempt clean before a save new session log

        //the user successfully logs in.
        UserSessionLog userSessionLog = new UserSessionLog();
        userSessionLog.setUser(authUser);
        userSessionLog.setUserSessionLogStatus(UserSessionLogStatus.LOGGED);
        userSessionLog.setCreatedAt(LocalDateTime.now());
        userSessionLogService.persist(userSessionLog);

             /*
        //default session is ok ->>>>>
        HttpSession session = request.getSession();
        session.setAttribute("username", authUser.getUsername());
        session.setAttribute("authorities", authentication.getAuthorities());

        */

        //set our response to OK status
        response.setStatus(HttpServletResponse.SC_OK);

        //since we have created our custom success handler, its up to us to where we will redirect the user after
        // successfully login
        response.sendRedirect("/mainWindow");
    }
}
