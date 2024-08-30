package network.bobnet.quantumgrid.user_service.exceptions;

import network.bobnet.quantumgrid.commons.exceptions.AbstractApplicationException;

public class EmailAlreadyRegisteredException extends AbstractApplicationException {
    public EmailAlreadyRegisteredException(String message) {
        super(message);
    }
}
