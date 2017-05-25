package com.afitnerd.api.slack.config;

import com.afitnerd.api.slack.model.SlackSlashCommand;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

public class SlackSlashCommandMethodArgumentResolver implements HandlerMethodArgumentResolver {

    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return methodParameter.getParameterType().equals(SlackSlashCommand.class);
    }

    @Override
    public Object resolveArgument(
        MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer,
        NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory
    ) throws Exception {

        SlackSlashCommand ret = new SlackSlashCommand();

        ret.setChannelId(nativeWebRequest.getParameter("channel_id"));
        ret.setChannelName(nativeWebRequest.getParameter("channel_name"));
        ret.setCommand(nativeWebRequest.getParameter("command"));
        ret.setResponseUrl(nativeWebRequest.getParameter("response_url"));
        ret.setTeamDomain(nativeWebRequest.getParameter("team_domain"));
        ret.setTeamId(nativeWebRequest.getParameter("team_id"));
        ret.setText(nativeWebRequest.getParameter("text"));
        ret.setToken(nativeWebRequest.getParameter("token"));
        ret.setUserId(nativeWebRequest.getParameter("user_id"));
        ret.setUserName(nativeWebRequest.getParameter("user_name"));

        return ret;
    }

    private boolean isNotSet(String value) {
        return value == null;
    }
}