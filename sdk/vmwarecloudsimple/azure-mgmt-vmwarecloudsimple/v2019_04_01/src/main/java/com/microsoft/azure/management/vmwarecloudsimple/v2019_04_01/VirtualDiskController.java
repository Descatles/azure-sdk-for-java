/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Virtual disk controller model.
 */
public class VirtualDiskController {
    /**
     * Controller's id.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The display name of Controller.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * dik controller subtype (VMWARE_PARAVIRTUAL, BUS_PARALLEL, LSI_PARALLEL,
     * LSI_SAS).
     */
    @JsonProperty(value = "subType", access = JsonProperty.Access.WRITE_ONLY)
    private String subType;

    /**
     * disk controller type (SCSI).
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get controller's id.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the display name of Controller.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get dik controller subtype (VMWARE_PARAVIRTUAL, BUS_PARALLEL, LSI_PARALLEL, LSI_SAS).
     *
     * @return the subType value
     */
    public String subType() {
        return this.subType;
    }

    /**
     * Get disk controller type (SCSI).
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}