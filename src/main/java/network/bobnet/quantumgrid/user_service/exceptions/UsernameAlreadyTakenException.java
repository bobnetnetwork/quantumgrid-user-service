package network.bobnet.quantumgrid.user_service.exceptions;

import network.bobnet.quantumgrid.commons.exceptions.AbstractApplicationException;

public class UsernameAlreadyTakenException extends AbstractApplicationException {
    public UsernameAlreadyTakenException(String message) {
        super(message);
    }
}
