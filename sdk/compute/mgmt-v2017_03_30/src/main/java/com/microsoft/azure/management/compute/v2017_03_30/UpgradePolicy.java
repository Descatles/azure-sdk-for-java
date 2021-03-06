/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_03_30;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes an upgrade policy - automatic, manual, or rolling.
 */
public class UpgradePolicy {
    /**
     * Specifies the mode of an upgrade to virtual machines in the scale
     * set.&lt;br /&gt;&lt;br /&gt; Possible values are:&lt;br /&gt;&lt;br
     * /&gt; **Manual** - You  control the application of updates to virtual
     * machines in the scale set. You do this by using the manualUpgrade
     * action.&lt;br /&gt;&lt;br /&gt; **Automatic** - All virtual machines in
     * the scale set are  automatically updated at the same time. Possible
     * values include: 'Automatic', 'Manual', 'Rolling'.
     */
    @JsonProperty(value = "mode")
    private UpgradeMode mode;

    /**
     * The configuration parameters used while performing a rolling upgrade.
     */
    @JsonProperty(value = "rollingUpgradePolicy")
    private RollingUpgradePolicy rollingUpgradePolicy;

    /**
     * Whether OS upgrades should automatically be applied to scale set
     * instances in a rolling fashion when a newer version of the image becomes
     * available.
     */
    @JsonProperty(value = "automaticOSUpgrade")
    private Boolean automaticOSUpgrade;

    /**
     * Get the mode value.
     *
     * @return the mode value
     */
    public UpgradeMode mode() {
        return this.mode;
    }

    /**
     * Set the mode value.
     *
     * @param mode the mode value to set
     * @return the UpgradePolicy object itself.
     */
    public UpgradePolicy withMode(UpgradeMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get the rollingUpgradePolicy value.
     *
     * @return the rollingUpgradePolicy value
     */
    public RollingUpgradePolicy rollingUpgradePolicy() {
        return this.rollingUpgradePolicy;
    }

    /**
     * Set the rollingUpgradePolicy value.
     *
     * @param rollingUpgradePolicy the rollingUpgradePolicy value to set
     * @return the UpgradePolicy object itself.
     */
    public UpgradePolicy withRollingUpgradePolicy(RollingUpgradePolicy rollingUpgradePolicy) {
        this.rollingUpgradePolicy = rollingUpgradePolicy;
        return this;
    }

    /**
     * Get the automaticOSUpgrade value.
     *
     * @return the automaticOSUpgrade value
     */
    public Boolean automaticOSUpgrade() {
        return this.automaticOSUpgrade;
    }

    /**
     * Set the automaticOSUpgrade value.
     *
     * @param automaticOSUpgrade the automaticOSUpgrade value to set
     * @return the UpgradePolicy object itself.
     */
    public UpgradePolicy withAutomaticOSUpgrade(Boolean automaticOSUpgrade) {
        this.automaticOSUpgrade = automaticOSUpgrade;
        return this;
    }

}
