// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.redisenterprise.models.Database;
import com.azure.resourcemanager.redisenterprise.models.EvictionPolicy;
import com.azure.resourcemanager.redisenterprise.models.Persistence;
import com.azure.resourcemanager.redisenterprise.models.Protocol;
import com.azure.resourcemanager.redisenterprise.models.RdbFrequency;

/** Samples for Databases Update. */
public final class DatabasesUpdateSamples {
    /*
     * x-ms-original-file: specification/redisenterprise/resource-manager/Microsoft.Cache/stable/2022-01-01/examples/RedisEnterpriseDatabasesUpdate.json
     */
    /**
     * Sample code: RedisEnterpriseDatabasesUpdate.
     *
     * @param manager Entry point to RedisEnterpriseManager.
     */
    public static void redisEnterpriseDatabasesUpdate(
        com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager manager) {
        Database resource = manager.databases().getWithResponse("rg1", "cache1", "default", Context.NONE).getValue();
        resource
            .update()
            .withClientProtocol(Protocol.ENCRYPTED)
            .withEvictionPolicy(EvictionPolicy.ALL_KEYS_LRU)
            .withPersistence(new Persistence().withRdbEnabled(true).withRdbFrequency(RdbFrequency.ONE_TWOH))
            .apply();
    }
}