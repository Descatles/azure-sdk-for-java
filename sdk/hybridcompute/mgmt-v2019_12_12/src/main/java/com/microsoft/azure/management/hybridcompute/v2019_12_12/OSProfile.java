/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hybridcompute.v2019_12_12;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies the operating system settings for the hybrid machine.
 */
public class OSProfile {
    /**
     * Specifies the host OS name of the hybrid machine.
     */
    @JsonProperty(value = "computerName", access = JsonProperty.Access.WRITE_ONLY)
    private String computerName;

    /**
     * Get specifies the host OS name of the hybrid machine.
     *
     * @return the computerName value
     */
    public String computerName() {
        return this.computerName;
    }

}
