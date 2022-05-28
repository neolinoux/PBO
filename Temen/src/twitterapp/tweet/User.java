package twitterapp.tweet;

import java.util.ArrayList;
import java.util.List;

import twitterapp.mention.Notifier;

public class User implements Follower {
    private String username;
    private List<User> followers;
    private TweetData tweet;
    private List<TweetData> timeline;
    private List<Notifier> notifiers;

    public User() {
        followers = new ArrayList<User>();
        timeline = new ArrayList<TweetData>();
        notifiers = new ArrayList<Notifier>();
    }

    public void follow(User user) {
        followers.add(user);
    }

    public void unfollow(User user) {
        followers.remove(user);
    }

    public void postTweet(TweetData tweet) {
        this.tweet = tweet;
        System.out.println("Account " + username + " has posted a tweet!");
        notifyTweet();
    }

    public void notifyTweet() {
        for (Follower follower : followers) {
            follower.update(tweet);
        }
        update(tweet);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }

    public void setTweet(TweetData tweet) {
        this.tweet = tweet;
    }

    public void setTimeline(List<TweetData> timeline) {
        this.timeline = timeline;
    }

    public List<User> getFollowers() {
        return this.followers;
    }

    public TweetData getTweet() {
        return this.tweet;
    }

    public List<TweetData> getTimeline() {
        return this.timeline;
    }

    @Override
    public void update(TweetData tweet) {
        timeline.add(tweet);
        display();
    }

    public void display() {
        System.out.println(username + "'s Timeline : ");
        for (TweetData post : timeline) {
            System.out.println(post);
        }
    }

    public void setNotifiers(Notifier notifiers) {
        this.notifiers.add(notifiers);
    }

    public void mention(User user) {
        for (Notifier notifier : notifiers) {
            notifier.mention(username, user);
        }
    }
}
