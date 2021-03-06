/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Observable;
import com.microsoft.azure.management.storage.v2019_06_01.implementation.QueueServicesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing QueueServices.
 */
public interface QueueServices extends SupportsCreating<QueueServiceProperties.DefinitionStages.Blank>, HasInner<QueueServicesInner> {
    /**
     * List all queue services for the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ListQueueServices> listAsync(String resourceGroupName, String accountName);

    /**
     * Gets the properties of a storage account’s Queue service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<QueueServiceProperties> getServicePropertiesAsync(String resourceGroupName, String accountName);

}
