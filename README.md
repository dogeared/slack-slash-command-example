## Slack Slash Command Example

This repo demonstrates 3 approaches to handling Form POSTs in a similar way to handling JSON POSTs in a Spring Boot
app.

Check out (and please vote for) the Spring Boot Jira issue that would make all 3 of these approaches unnecessary.

For a deeper explanation, read the 
[blog post](https://afitnerd.com/2017/05/24/what-if-spring-boot-handled-forms-like-json/) about it.

You can also see a lively conversation that kicked all this off on 
[r/java](https://www.reddit.com/r/java/comments/6coo2x/what_if_spring_handled_form_posts_automatically/).

## Build & Run

```
mvn clean install
java -jar slack-slash-command-example-0.0.1-SNAPSHOT.jar 
```

## Exercise

The follow examples use [HTTPie](https://httpie.org)

### Automatic HttpMessageConverter approach

```
http -f POST localhost:8080/api/v1/slack3 \
  token=token team_id=team_id team_domain=team_domain channel_id=channel_id \
  channel_name=channel_name user_id=user_id user_name=user_name \
  command=command text=text response_url=response_url
```

### HandlerMethodArgumentResolver approach

```
http -f POST localhost:8080/api/v1/slack2 \
  token=token team_id=team_id team_domain=team_domain channel_id=channel_id \
  channel_name=channel_name user_id=user_id user_name=user_name \
  command=command text=text response_url=response_url
```

### HttpMessageConverter approach - custom

```
http -f POST localhost:8080/api/v1/slack \
  token=token team_id=team_id team_domain=team_domain channel_id=channel_id \
  channel_name=channel_name user_id=user_id user_name=user_name \
  command=command text=text response_url=response_url
```