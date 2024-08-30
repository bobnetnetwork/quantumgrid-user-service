package network.bobnet.quantumgrid.user_service.exceptions;

import network.bobnet.quantumgrid.commons.exceptions.AbstractApplicationException;

public class InvalidUserNameOrPasswordException extends AbstractApplicationException {

    public InvalidUserNameOrPasswordException(String message) {
        super(message);
    }
}
