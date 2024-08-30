package network.bobnet.quantumgrid.user_service.controller;

import com.github.fge.jsonpatch.JsonPatch;
import lombok.AllArgsConstructor;
import network.bobnet.quantumgrid.user_service.dto.ProfileDTO;
import network.bobnet.quantumgrid.user_service.service.ProfileService;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(value ="/api/profiles")
public class ProfileController {

    private final ProfileService profileService;
    private final ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<ProfileDTO> getMyProfile() {
        Long myId = 0L; //TODO:
        return ResponseEntity.ok(modelMapper.map(profileService.getProfile(myId), ProfileDTO.class));
    }

    @GetMapping(value = "/{user-id}")
    public ResponseEntity<ProfileDTO> getProfile(@PathVariable(value = "user-id") Long userId) {
        return ResponseEntity.ok(modelMapper.map(profileService.getProfile(userId), ProfileDTO.class));
    }

    @PatchMapping("/{user-id}")
    public ResponseEntity<ProfileDTO> patchProfile(
            @PathVariable(value = "user-id") Long userId,
            @RequestBody JsonPatch patch
    ) {
        return ResponseEntity.ok(modelMapper.map(profileService.patchProfile(userId, patch), ProfileDTO.class));
    }
}
