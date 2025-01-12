// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.ConfigurationDataType;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of a configuration. */
@Fluent
public final class ServerConfigurationProperties {
    /*
     * Value of the configuration.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /*
     * Source of the configuration.
     */
    @JsonProperty(value = "source", access = JsonProperty.Access.WRITE_ONLY)
    private String source;

    /*
     * Description of the configuration.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * Default value of the configuration.
     */
    @JsonProperty(value = "defaultValue", access = JsonProperty.Access.WRITE_ONLY)
    private String defaultValue;

    /*
     * Data type of the configuration.
     */
    @JsonProperty(value = "dataType", access = JsonProperty.Access.WRITE_ONLY)
    private ConfigurationDataType dataType;

    /*
     * Allowed values of the configuration.
     */
    @JsonProperty(value = "allowedValues", access = JsonProperty.Access.WRITE_ONLY)
    private String allowedValues;

    /*
     * If configuration change requires restart.
     */
    @JsonProperty(value = "requiresRestart", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean requiresRestart;

    /*
     * Provisioning state of the configuration.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /** Creates an instance of ServerConfigurationProperties class. */
    public ServerConfigurationProperties() {
    }

    /**
     * Get the value property: Value of the configuration.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Value of the configuration.
     *
     * @param value the value value to set.
     * @return the ServerConfigurationProperties object itself.
     */
    public ServerConfigurationProperties withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the source property: Source of the configuration.
     *
     * @return the source value.
     */
    public String source() {
        return this.source;
    }

    /**
     * Get the description property: Description of the configuration.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the defaultValue property: Default value of the configuration.
     *
     * @return the defaultValue value.
     */
    public String defaultValue() {
        return this.defaultValue;
    }

    /**
     * Get the dataType property: Data type of the configuration.
     *
     * @return the dataType value.
     */
    public ConfigurationDataType dataType() {
        return this.dataType;
    }

    /**
     * Get the allowedValues property: Allowed values of the configuration.
     *
     * @return the allowedValues value.
     */
    public String allowedValues() {
        return this.allowedValues;
    }

    /**
     * Get the requiresRestart property: If configuration change requires restart.
     *
     * @return the requiresRestart value.
     */
    public Boolean requiresRestart() {
        return this.requiresRestart;
    }

    /**
     * Get the provisioningState property: Provisioning state of the configuration.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model ServerConfigurationProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServerConfigurationProperties.class);
}
