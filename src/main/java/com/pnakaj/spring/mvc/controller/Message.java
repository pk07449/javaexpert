package com.pnakaj.spring.mvc.controller;

/**
 * Created by pankaj on 9/4/2017.
 */
public class Message {
    private String player;
    private String s;
    public Message(String player, String s) {
        this.player = player;
        this.s = s;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
