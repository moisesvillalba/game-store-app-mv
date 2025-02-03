package org.mavs.gamestore.user;


import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "\"user\"") // Usar comillas dobles para escapar la palabra reservada
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String profilePictureUrl;
}
