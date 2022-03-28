// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.securityinsights.fluent.models.OfficePowerBICheckRequirementsProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Represents Office PowerBI requirements check request. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("OfficePowerBI")
@Fluent
public final class OfficePowerBICheckRequirements extends DataConnectorsCheckRequirements {
    /*
     * Office Power BI requirements check properties.
     */
    @JsonProperty(value = "properties")
    private OfficePowerBICheckRequirementsProperties innerProperties;

    /**
     * Get the innerProperties property: Office Power BI requirements check properties.
     *
     * @return the innerProperties value.
     */
    private OfficePowerBICheckRequirementsProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}