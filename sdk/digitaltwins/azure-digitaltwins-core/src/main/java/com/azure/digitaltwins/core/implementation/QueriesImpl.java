// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.digitaltwins.core.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.digitaltwins.core.implementation.models.ErrorResponseException;
import com.azure.digitaltwins.core.implementation.models.QueriesQueryTwinsResponse;
import com.azure.digitaltwins.core.implementation.models.QuerySpecification;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Queries. */
public final class QueriesImpl {
    /** The proxy service used to perform REST calls. */
    private final QueriesService service;

    /** The service client containing this operation class. */
    private final AzureDigitalTwinsAPIImpl client;

    /**
     * Initializes an instance of QueriesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    QueriesImpl(AzureDigitalTwinsAPIImpl client) {
        this.service = RestProxy.create(QueriesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureDigitalTwinsAPIQueries to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AzureDigitalTwinsAPI")
    private interface QueriesService {
        @Post("/query")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<QueriesQueryTwinsResponse> queryTwins(
                @HostParam("$host") String host,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") QuerySpecification querySpecification,
                Context context);
    }

    /**
     * Executes a query that allows traversing relationships and filtering by property values. Status codes: 200 (OK):
     * Success. 400 (Bad Request): The request is invalid.
     *
     * @param querySpecification A query specification containing either a query statement or a continuation token from
     *     a previous query result.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the results of a query operation and an optional continuation token.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<QueriesQueryTwinsResponse> queryTwinsWithResponseAsync(
            QuerySpecification querySpecification, Context context) {
        if (this.client.getHost() == null) {
            return Mono.error(
                    new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (querySpecification == null) {
            return Mono.error(
                    new IllegalArgumentException("Parameter querySpecification is required and cannot be null."));
        } else {
            querySpecification.validate();
        }
        return service.queryTwins(this.client.getHost(), this.client.getApiVersion(), querySpecification, context);
    }
}
