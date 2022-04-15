// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.Context;

/** Samples for Notification ListByService. */
public final class NotificationListByServiceSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2021-08-01/examples/ApiManagementListNotifications.json
     */
    /**
     * Sample code: ApiManagementListNotifications.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementListNotifications(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.notifications().listByService("rg1", "apimService1", null, null, Context.NONE);
    }
}