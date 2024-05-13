package se.group3.backend.dto.mapper;

import se.group3.backend.dto.LobbyDTO;
import se.group3.backend.domain.Lobby;

public class LobbyMapper {

    private LobbyMapper() {
        throw new UnsupportedOperationException("This class cannot be instantiated!");
    }

    public static LobbyDTO toLobbyDTO(Lobby newLobby) {
        return new LobbyDTO(newLobby.getId(), newLobby.getPlayers().stream().map(PlayerMapper::mapPlayerToDTO).toList());
    }
}
