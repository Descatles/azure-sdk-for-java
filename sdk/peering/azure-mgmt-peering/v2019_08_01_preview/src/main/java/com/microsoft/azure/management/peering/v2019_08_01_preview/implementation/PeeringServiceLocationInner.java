/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2019_08_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * PeeringService location.
 */
@JsonFlatten
public class PeeringServiceLocationInner extends ProxyResource {
    /**
     * Country of the customer.
     */
    @JsonProperty(value = "properties.country")
    private String country;

    /**
     * State of the customer.
     */
    @JsonProperty(value = "properties.state")
    private String state;

    /**
     * Azure region for the location.
     */
    @JsonProperty(value = "properties.azureRegion")
    private String azureRegion;

    /**
     * Get country of the customer.
     *
     * @return the country value
     */
    public String country() {
        return this.country;
    }

    /**
     * Set country of the customer.
     *
     * @param country the country value to set
     * @return the PeeringServiceLocationInner object itself.
     */
    public PeeringServiceLocationInner withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get state of the customer.
     *
     * @return the state value
     */
    public String state() {
        return this.state;
    }

    /**
     * Set state of the customer.
     *
     * @param state the state value to set
     * @return the PeeringServiceLocationInner object itself.
     */
    public PeeringServiceLocationInner withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get azure region for the location.
     *
     * @return the azureRegion value
     */
    public String azureRegion() {
        return this.azureRegion;
    }

    /**
     * Set azure region for the location.
     *
     * @param azureRegion the azureRegion value to set
     * @return the PeeringServiceLocationInner object itself.
     */
    public PeeringServiceLocationInner withAzureRegion(String azureRegion) {
        this.azureRegion = azureRegion;
        return this;
    }

}