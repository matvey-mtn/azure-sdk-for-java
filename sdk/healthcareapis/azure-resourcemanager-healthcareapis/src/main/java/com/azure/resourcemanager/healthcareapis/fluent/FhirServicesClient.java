// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.healthcareapis.fluent.models.FhirServiceInner;
import com.azure.resourcemanager.healthcareapis.models.FhirServicePatchResource;

/** An instance of this class provides access to all the operations defined in FhirServicesClient. */
public interface FhirServicesClient {
    /**
     * Lists all FHIR Services for the given workspace.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of Fhir services as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FhirServiceInner> listByWorkspace(String resourceGroupName, String workspaceName);

    /**
     * Lists all FHIR Services for the given workspace.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of Fhir services as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FhirServiceInner> listByWorkspace(String resourceGroupName, String workspaceName, Context context);

    /**
     * Gets the properties of the specified FHIR Service.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param fhirServiceName The name of FHIR Service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified FHIR Service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FhirServiceInner get(String resourceGroupName, String workspaceName, String fhirServiceName);

    /**
     * Gets the properties of the specified FHIR Service.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param fhirServiceName The name of FHIR Service resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified FHIR Service along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FhirServiceInner> getWithResponse(
        String resourceGroupName, String workspaceName, String fhirServiceName, Context context);

    /**
     * Creates or updates a FHIR Service resource with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param fhirServiceName The name of FHIR Service resource.
     * @param fhirservice The parameters for creating or updating a Fhir Service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the description of Fhir Service.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<FhirServiceInner>, FhirServiceInner> beginCreateOrUpdate(
        String resourceGroupName, String workspaceName, String fhirServiceName, FhirServiceInner fhirservice);

    /**
     * Creates or updates a FHIR Service resource with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param fhirServiceName The name of FHIR Service resource.
     * @param fhirservice The parameters for creating or updating a Fhir Service resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the description of Fhir Service.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<FhirServiceInner>, FhirServiceInner> beginCreateOrUpdate(
        String resourceGroupName,
        String workspaceName,
        String fhirServiceName,
        FhirServiceInner fhirservice,
        Context context);

    /**
     * Creates or updates a FHIR Service resource with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param fhirServiceName The name of FHIR Service resource.
     * @param fhirservice The parameters for creating or updating a Fhir Service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the description of Fhir Service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FhirServiceInner createOrUpdate(
        String resourceGroupName, String workspaceName, String fhirServiceName, FhirServiceInner fhirservice);

    /**
     * Creates or updates a FHIR Service resource with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param fhirServiceName The name of FHIR Service resource.
     * @param fhirservice The parameters for creating or updating a Fhir Service resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the description of Fhir Service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FhirServiceInner createOrUpdate(
        String resourceGroupName,
        String workspaceName,
        String fhirServiceName,
        FhirServiceInner fhirservice,
        Context context);

    /**
     * Patch FHIR Service details.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param fhirServiceName The name of FHIR Service resource.
     * @param workspaceName The name of workspace resource.
     * @param fhirservicePatchResource The parameters for updating a Fhir Service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the description of Fhir Service.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<FhirServiceInner>, FhirServiceInner> beginUpdate(
        String resourceGroupName,
        String fhirServiceName,
        String workspaceName,
        FhirServicePatchResource fhirservicePatchResource);

    /**
     * Patch FHIR Service details.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param fhirServiceName The name of FHIR Service resource.
     * @param workspaceName The name of workspace resource.
     * @param fhirservicePatchResource The parameters for updating a Fhir Service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the description of Fhir Service.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<FhirServiceInner>, FhirServiceInner> beginUpdate(
        String resourceGroupName,
        String fhirServiceName,
        String workspaceName,
        FhirServicePatchResource fhirservicePatchResource,
        Context context);

    /**
     * Patch FHIR Service details.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param fhirServiceName The name of FHIR Service resource.
     * @param workspaceName The name of workspace resource.
     * @param fhirservicePatchResource The parameters for updating a Fhir Service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the description of Fhir Service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FhirServiceInner update(
        String resourceGroupName,
        String fhirServiceName,
        String workspaceName,
        FhirServicePatchResource fhirservicePatchResource);

    /**
     * Patch FHIR Service details.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param fhirServiceName The name of FHIR Service resource.
     * @param workspaceName The name of workspace resource.
     * @param fhirservicePatchResource The parameters for updating a Fhir Service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the description of Fhir Service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FhirServiceInner update(
        String resourceGroupName,
        String fhirServiceName,
        String workspaceName,
        FhirServicePatchResource fhirservicePatchResource,
        Context context);

    /**
     * Deletes a FHIR Service.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param fhirServiceName The name of FHIR Service resource.
     * @param workspaceName The name of workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String fhirServiceName, String workspaceName);

    /**
     * Deletes a FHIR Service.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param fhirServiceName The name of FHIR Service resource.
     * @param workspaceName The name of workspace resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String fhirServiceName, String workspaceName, Context context);

    /**
     * Deletes a FHIR Service.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param fhirServiceName The name of FHIR Service resource.
     * @param workspaceName The name of workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String fhirServiceName, String workspaceName);

    /**
     * Deletes a FHIR Service.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param fhirServiceName The name of FHIR Service resource.
     * @param workspaceName The name of workspace resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String fhirServiceName, String workspaceName, Context context);
}