/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2018_07_01.implementation.FrontendIPConfigurationInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2018_07_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.SubResource;

/**
 * Type representing FrontendIPConfiguration.
 */
public interface FrontendIPConfiguration extends HasInner<FrontendIPConfigurationInner>, Indexable, Refreshable<FrontendIPConfiguration>, HasManager<NetworkManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the inboundNatPools value.
     */
    List<SubResource> inboundNatPools();

    /**
     * @return the inboundNatRules value.
     */
    List<SubResource> inboundNatRules();

    /**
     * @return the loadBalancingRules value.
     */
    List<SubResource> loadBalancingRules();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the outboundRules value.
     */
    List<SubResource> outboundRules();

    /**
     * @return the privateIPAddress value.
     */
    String privateIPAddress();

    /**
     * @return the privateIPAllocationMethod value.
     */
    IPAllocationMethod privateIPAllocationMethod();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the publicIPAddress value.
     */
    PublicIPAddress publicIPAddress();

    /**
     * @return the publicIPPrefix value.
     */
    SubResource publicIPPrefix();

    /**
     * @return the subnet value.
     */
    Subnet subnet();

    /**
     * @return the zones value.
     */
    List<String> zones();

}