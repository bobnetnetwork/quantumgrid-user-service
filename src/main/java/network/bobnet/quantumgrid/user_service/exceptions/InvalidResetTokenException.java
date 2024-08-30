package network.bobnet.quantumgrid.user_service.exceptions;

import network.bobnet.quantumgrid.commons.exceptions.AbstractApplicationException;

public class InvalidResetTokenException extends AbstractApplicationException {
    public InvalidResetTokenException(String message) {
        super(message);
    }
}
