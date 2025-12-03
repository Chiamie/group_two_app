package org.example.exceptions.vendor;

public class VendorNotFound extends RuntimeException {
    public VendorNotFound(String message) {
        super(message);
    }
}
