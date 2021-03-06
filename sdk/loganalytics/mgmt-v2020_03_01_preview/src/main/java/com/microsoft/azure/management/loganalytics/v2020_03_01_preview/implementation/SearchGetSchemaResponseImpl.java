/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation;

import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.SearchGetSchemaResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.SearchMetadata;
import java.util.List;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.SearchSchemaValue;

class SearchGetSchemaResponseImpl extends WrapperImpl<SearchGetSchemaResponseInner> implements SearchGetSchemaResponse {
    private final LogAnalyticsManager manager;
    SearchGetSchemaResponseImpl(SearchGetSchemaResponseInner inner, LogAnalyticsManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public LogAnalyticsManager manager() {
        return this.manager;
    }

    @Override
    public SearchMetadata metadata() {
        return this.inner().metadata();
    }

    @Override
    public List<SearchSchemaValue> value() {
        return this.inner().value();
    }

}
