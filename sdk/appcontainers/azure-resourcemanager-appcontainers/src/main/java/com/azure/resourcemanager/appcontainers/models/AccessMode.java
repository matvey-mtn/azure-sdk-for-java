// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AccessMode. */
public final class AccessMode extends ExpandableStringEnum<AccessMode> {
    /** Static value ReadOnly for AccessMode. */
    public static final AccessMode READ_ONLY = fromString("ReadOnly");

    /** Static value ReadWrite for AccessMode. */
    public static final AccessMode READ_WRITE = fromString("ReadWrite");

    /**
     * Creates or finds a AccessMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AccessMode.
     */
    @JsonCreator
    public static AccessMode fromString(String name) {
        return fromString(name, AccessMode.class);
    }

    /**
     * Gets known AccessMode values.
     *
     * @return known AccessMode values.
     */
    public static Collection<AccessMode> values() {
        return values(AccessMode.class);
    }
}