package se2.group3.backend.dto;

import lombok.Getter;

@Getter
public class Player {

    private final String playerName;

    public Player(String playerName) {
        this.playerName = playerName;
    }
}
