// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.CheckNameResultInner;
import com.azure.resourcemanager.kusto.models.Reason;
import org.junit.jupiter.api.Assertions;

public final class CheckNameResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CheckNameResultInner model =
            BinaryData
                .fromString(
                    "{\"nameAvailable\":false,\"name\":\"rkujy\",\"message\":\"l\",\"reason\":\"AlreadyExists\"}")
                .toObject(CheckNameResultInner.class);
        Assertions.assertEquals(false, model.nameAvailable());
        Assertions.assertEquals("rkujy", model.name());
        Assertions.assertEquals("l", model.message());
        Assertions.assertEquals(Reason.ALREADY_EXISTS, model.reason());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CheckNameResultInner model =
            new CheckNameResultInner()
                .withNameAvailable(false)
                .withName("rkujy")
                .withMessage("l")
                .withReason(Reason.ALREADY_EXISTS);
        model = BinaryData.fromObject(model).toObject(CheckNameResultInner.class);
        Assertions.assertEquals(false, model.nameAvailable());
        Assertions.assertEquals("rkujy", model.name());
        Assertions.assertEquals("l", model.message());
        Assertions.assertEquals(Reason.ALREADY_EXISTS, model.reason());
    }
}
