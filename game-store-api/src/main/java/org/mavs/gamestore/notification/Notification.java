package org.mavs.gamestore.notification;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Notification {
    private String message;
    private String receiver;
    private NotificationLevel level;
    private NotificationStatus status;
}
