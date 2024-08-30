package network.bobnet.quantumgrid.user_service.dto;

import lombok.*;
import network.bobnet.quantumgrid.user_service.entity.User;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link User}
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 8152951028038958254L;

    private Long id;
    private String username;
    private String password;
    private String email;
    private String role;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Long createdBy;
    private Long updatedBy;
}
