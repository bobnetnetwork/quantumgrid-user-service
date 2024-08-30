package network.bobnet.quantumgrid.user_service.service;

import com.github.fge.jsonpatch.JsonPatch;
import network.bobnet.quantumgrid.commons.exceptions.NotFoundException;
import network.bobnet.quantumgrid.commons.service.AbstractService;
import network.bobnet.quantumgrid.user_service.entity.Profile;
import network.bobnet.quantumgrid.user_service.entity.User;
import network.bobnet.quantumgrid.user_service.repository.ProfileRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfileService extends AbstractService<Profile> {

    private final ProfileRepository profileRepository;

    public ProfileService(ProfileRepository profileRepository) {
        super(Profile.class, profileRepository);
        this.profileRepository = profileRepository;
    }

    public void createProfile(User user) {
        Profile profile = Profile.builder()
                .userId(user.getId())
                .build();

        profileRepository.save(profile);
    }

    public Profile getProfile(Long userId) {
        Optional<Profile> profile = profileRepository.findByUserId(userId);
        if(profile.isPresent()) {
            return profile.get();
        } else {
            throw new NotFoundException("User profile not found!");
        }
    }

    public Profile patchProfile(Long userId, JsonPatch patch) {
        return patchEntity(userId, patch);
    }
}
