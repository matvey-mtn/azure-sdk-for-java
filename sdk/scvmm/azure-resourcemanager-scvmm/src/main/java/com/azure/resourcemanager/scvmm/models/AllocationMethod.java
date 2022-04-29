// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AllocationMethod. */
public final class AllocationMethod extends ExpandableStringEnum<AllocationMethod> {
    /** Static value Dynamic for AllocationMethod. */
    public static final AllocationMethod DYNAMIC = fromString("Dynamic");

    /** Static value Static for AllocationMethod. */
    public static final AllocationMethod STATIC = fromString("Static");

    /**
     * Creates or finds a AllocationMethod from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AllocationMethod.
     */
    @JsonCreator
    public static AllocationMethod fromString(String name) {
        return fromString(name, AllocationMethod.class);
    }

    /**
     * Gets known AllocationMethod values.
     *
     * @return known AllocationMethod values.
     */
    public static Collection<AllocationMethod> values() {
        return values(AllocationMethod.class);
    }
}