package network.bobnet.quantumgrid.user_service.dto;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link network.bobnet.quantumgrid.user_service.entity.Profile}
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProfileDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1599860329426542981L;

    private Long userId;
    private String firstName;
    private String lastName;
    private String bio;
    private String profilePicture;
    private LocalDateTime createdAt;
    private Long createdBy;
    private LocalDateTime updatedAt;
    private Long updatedBy;
}
