package network.bobnet.quantumgrid.user_service.exceptions;

import network.bobnet.quantumgrid.commons.exceptions.AbstractApplicationException;

public class UserNotFoundException extends AbstractApplicationException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
