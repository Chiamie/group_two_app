
package org.example.dtos.requests;

import lombok.Data;
import org.example.data.models.Type;

@Data
public class RegisterVendorRequest {
    private String contactInfo;
    private String name;
    private Type type;
}