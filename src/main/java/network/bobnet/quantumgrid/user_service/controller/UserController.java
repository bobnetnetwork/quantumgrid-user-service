package network.bobnet.quantumgrid.user_service.controller;

import network.bobnet.quantumgrid.user_service.dto.UserDTO;
import network.bobnet.quantumgrid.user_service.entity.User;
import network.bobnet.quantumgrid.user_service.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping(value ="/api/users")
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserDTO> registerUser(@RequestBody UserDTO userDTO) {
        UserDTO registeredUser = userService.registerUser(userDTO);
        return ResponseEntity.ok(registeredUser);
    }

    @PostMapping("/login")
    public ResponseEntity<String> authenticateUser(@RequestParam String username, @RequestParam String password) {
        Optional<User> user = userService.authenticateUser(username, password);
        if (user.isPresent()) {
            return ResponseEntity.ok("User authenticated successfully");
        } else {
            return ResponseEntity.status(401).body("Invalid username or password");
        }
    }

    @PostMapping("/forgot-password")
    public ResponseEntity<String> forgotPassword(@RequestParam String email) {
        userService.generatePasswordResetToken(email);
        return ResponseEntity.ok("Password reset link has been sent to your email.");
    }

    @PostMapping("/reset-password")
    public ResponseEntity<String> resetPassword(@RequestParam String token, @RequestParam String newPassword) {
        userService.resetPassword(token, newPassword);
        return ResponseEntity.ok("Password has been reset successfully.");
    }
}
