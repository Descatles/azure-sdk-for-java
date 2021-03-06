/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.implementation;

import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.CassandraTableGetPropertiesResource;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.CassandraTableGetPropertiesOptions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.ARMResourceProperties;

/**
 * An Azure Cosmos DB Cassandra table.
 */
@JsonFlatten
public class CassandraTableGetResultsInner extends ARMResourceProperties {
    /**
     * The resource property.
     */
    @JsonProperty(value = "properties.resource")
    private CassandraTableGetPropertiesResource resource;

    /**
     * The options property.
     */
    @JsonProperty(value = "properties.options")
    private CassandraTableGetPropertiesOptions options;

    /**
     * Get the resource value.
     *
     * @return the resource value
     */
    public CassandraTableGetPropertiesResource resource() {
        return this.resource;
    }

    /**
     * Set the resource value.
     *
     * @param resource the resource value to set
     * @return the CassandraTableGetResultsInner object itself.
     */
    public CassandraTableGetResultsInner withResource(CassandraTableGetPropertiesResource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the options value.
     *
     * @return the options value
     */
    public CassandraTableGetPropertiesOptions options() {
        return this.options;
    }

    /**
     * Set the options value.
     *
     * @param options the options value to set
     * @return the CassandraTableGetResultsInner object itself.
     */
    public CassandraTableGetResultsInner withOptions(CassandraTableGetPropertiesOptions options) {
        this.options = options;
        return this;
    }

}
