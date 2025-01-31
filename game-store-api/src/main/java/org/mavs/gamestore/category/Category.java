package org.mavs.gamestore.category;

import lombok.*;
import org.mavs.gamestore.common.BaseEntity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Category extends BaseEntity {
    private String name;
    private String description;
}
