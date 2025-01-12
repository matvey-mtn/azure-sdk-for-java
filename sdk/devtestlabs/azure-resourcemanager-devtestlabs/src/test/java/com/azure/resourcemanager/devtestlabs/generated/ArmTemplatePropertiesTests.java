// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.fluent.models.ArmTemplateProperties;

public final class ArmTemplatePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ArmTemplateProperties model =
            BinaryData
                .fromString(
                    "{\"displayName\":\"bzpfzab\",\"description\":\"cuh\",\"publisher\":\"tcty\",\"icon\":\"klbb\",\"contents\":\"dataplwzbhvgyugu\",\"createdDate\":\"2021-08-08T10:54:54Z\",\"parametersValueFilesInfo\":[{\"fileName\":\"ss\",\"parametersValueInfo\":\"dataukkfplgmgs\"},{\"fileName\":\"kjz\",\"parametersValueInfo\":\"dataes\"},{\"fileName\":\"vlopwiyighx\",\"parametersValueInfo\":\"datadwzbaiue\"}],\"enabled\":false}")
                .toObject(ArmTemplateProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ArmTemplateProperties model = new ArmTemplateProperties();
        model = BinaryData.fromObject(model).toObject(ArmTemplateProperties.class);
    }
}
