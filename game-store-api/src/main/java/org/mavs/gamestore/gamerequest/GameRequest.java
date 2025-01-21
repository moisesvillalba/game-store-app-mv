package org.mavs.gamestore.gamerequest;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GameRequest {
    private String title;
    @Enumerated(EnumType.STRING)
    private RequestStatus status;
}
