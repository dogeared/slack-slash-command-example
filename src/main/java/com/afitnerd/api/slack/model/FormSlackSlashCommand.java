package com.afitnerd.api.slack.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FormSlackSlashCommand extends AbstractFormSlackSlashCommand {

    private String token;
    private String command;
    private String text;

    @JsonProperty("team_id")
    private String teamId;

    @JsonProperty("team_domain")
    private String teamDomain;

    @JsonProperty("channel_id")
    private String channelId;

    @JsonProperty("channel_name")
    private String channelName;

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("user_name")
    private String userName;

    @JsonProperty("response_url")
    private String responseUrl;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String team_id) {
        this.teamId = team_id;
    }

    public String getTeamDomain() {
        return teamDomain;
    }

    public void setTeamDomain(String teamDomain) {
        this.teamDomain = teamDomain;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getResponseUrl() {
        return responseUrl;
    }

    public void setResponseUrl(String responseUrl) {
        this.responseUrl = responseUrl;
    }

    public String toString() {
        return
                getToken() + "|" + getCommand() + "|" + getText() + "|" + getTeamId() + "|" + getTeamDomain() + "|" +
                        getChannelId() + "|" + getChannelName() + "|" + getUserId() + "|" + getUserName() + "|" +
                        getResponseUrl();
    }
}
