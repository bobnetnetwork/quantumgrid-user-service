package network.bobnet.quantumgrid.user_service.exceptions;

import network.bobnet.quantumgrid.commons.exceptions.AbstractApplicationException;

public class ExpiredResetTokenException extends AbstractApplicationException {
    public ExpiredResetTokenException(String message) {
        super(message);
    }
}
