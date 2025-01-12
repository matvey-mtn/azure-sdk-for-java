// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** This property specifies the IP Version the hub is currently utilizing. */
public final class IpVersion extends ExpandableStringEnum<IpVersion> {
    /** Static value ipv4 for IpVersion. */
    public static final IpVersion IPV4 = fromString("ipv4");

    /** Static value ipv6 for IpVersion. */
    public static final IpVersion IPV6 = fromString("ipv6");

    /** Static value ipv4ipv6 for IpVersion. */
    public static final IpVersion IPV4IPV6 = fromString("ipv4ipv6");

    /**
     * Creates a new instance of IpVersion value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public IpVersion() {
    }

    /**
     * Creates or finds a IpVersion from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IpVersion.
     */
    @JsonCreator
    public static IpVersion fromString(String name) {
        return fromString(name, IpVersion.class);
    }

    /**
     * Gets known IpVersion values.
     *
     * @return known IpVersion values.
     */
    public static Collection<IpVersion> values() {
        return values(IpVersion.class);
    }
}
