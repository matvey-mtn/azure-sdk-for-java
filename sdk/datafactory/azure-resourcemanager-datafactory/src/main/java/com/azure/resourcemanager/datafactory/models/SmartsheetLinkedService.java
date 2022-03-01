// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.SmartsheetLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Linked service for Smartsheet. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Smartsheet")
@Fluent
public final class SmartsheetLinkedService extends LinkedService {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SmartsheetLinkedService.class);

    /*
     * Smartsheet linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private SmartsheetLinkedServiceTypeProperties innerTypeProperties = new SmartsheetLinkedServiceTypeProperties();

    /**
     * Get the innerTypeProperties property: Smartsheet linked service properties.
     *
     * @return the innerTypeProperties value.
     */
    private SmartsheetLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public SmartsheetLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SmartsheetLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SmartsheetLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SmartsheetLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the apiToken property: The api token for the Smartsheet source.
     *
     * @return the apiToken value.
     */
    public SecretBase apiToken() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().apiToken();
    }

    /**
     * Set the apiToken property: The api token for the Smartsheet source.
     *
     * @param apiToken the apiToken value to set.
     * @return the SmartsheetLinkedService object itself.
     */
    public SmartsheetLinkedService withApiToken(SecretBase apiToken) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SmartsheetLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withApiToken(apiToken);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the SmartsheetLinkedService object itself.
     */
    public SmartsheetLinkedService withEncryptedCredential(Object encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SmartsheetLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model SmartsheetLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }
}