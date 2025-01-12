// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * the recurrence frequency. How often the schedule profile should take effect. This value must be Week, meaning each
 * week will have the same set of profiles. For example, to set a daily schedule, set **schedule** to every day of the
 * week. The frequency property specifies that the schedule is repeated weekly.
 */
public enum RecurrenceFrequency {
    /** Enum value None. */
    NONE("None"),

    /** Enum value Second. */
    SECOND("Second"),

    /** Enum value Minute. */
    MINUTE("Minute"),

    /** Enum value Hour. */
    HOUR("Hour"),

    /** Enum value Day. */
    DAY("Day"),

    /** Enum value Week. */
    WEEK("Week"),

    /** Enum value Month. */
    MONTH("Month"),

    /** Enum value Year. */
    YEAR("Year");

    /** The actual serialized value for a RecurrenceFrequency instance. */
    private final String value;

    RecurrenceFrequency(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a RecurrenceFrequency instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed RecurrenceFrequency object, or null if unable to parse.
     */
    @JsonCreator
    public static RecurrenceFrequency fromString(String value) {
        if (value == null) {
            return null;
        }
        RecurrenceFrequency[] items = RecurrenceFrequency.values();
        for (RecurrenceFrequency item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
