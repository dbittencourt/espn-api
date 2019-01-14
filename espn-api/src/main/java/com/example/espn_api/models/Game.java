package com.example.espn_api.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.Date;

public class Game {
    @Id
    public String gameId;
    public String url;
    public String date;
    public String homeName;
    public int homeScore;
    public String visitorName;
    public int visitorScore;

    public Game() {}

    public Game(String gameId, String url, String date, String homeName, int homeScore, String visitorName,
                int visitorScore)
    {
        this.gameId = gameId;
        this.url = url;
        this.date = date;
        this.homeName = homeName;
        this.homeScore = homeScore;
        this.visitorName = visitorName;
        this.visitorScore = visitorScore;
    }

    public String getGameId() {
        return gameId;
    }

    public void setId(String id) {
        this.gameId = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public int getVisitorScore() {
        return visitorScore;
    }

    public void setVisitorScore(int visitorScore) {
        this.visitorScore = visitorScore;
    }
}
