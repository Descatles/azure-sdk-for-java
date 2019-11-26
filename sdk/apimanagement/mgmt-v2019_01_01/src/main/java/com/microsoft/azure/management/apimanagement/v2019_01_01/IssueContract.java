/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.apimanagement.v2019_01_01.implementation.IssueContractInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.apimanagement.v2019_01_01.implementation.ApiManagementManager;
import org.joda.time.DateTime;

/**
 * Type representing IssueContract.
 */
public interface IssueContract extends HasInner<IssueContractInner>, Indexable, Refreshable<IssueContract>, Updatable<IssueContract.Update>, HasManager<ApiManagementManager> {
    /**
     * @return the apiId value.
     */
    String apiId();

    /**
     * @return the createdDate value.
     */
    DateTime createdDate();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the state value.
     */
    State state();

    /**
     * @return the title value.
     */
    String title();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the userId value.
     */
    String userId();

    /**
     * The entirety of the IssueContract definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithApi, DefinitionStages.WithIfMatch, DefinitionStages.WithDescription, DefinitionStages.WithTitle, DefinitionStages.WithUserId, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of IssueContract definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a IssueContract definition.
         */
        interface Blank extends WithApi {
        }

        /**
         * The stage of the issuecontract definition allowing to specify Api.
         */
        interface WithApi {
           /**
            * Specifies resourceGroupName, serviceName, apiId.
            * @param resourceGroupName The name of the resource group
            * @param serviceName The name of the API Management service
            * @param apiId API identifier. Must be unique in the current API Management service instance
            * @return the next definition stage
            */
            WithIfMatch withExistingApi(String resourceGroupName, String serviceName, String apiId);
        }

        /**
         * The stage of the issuecontract definition allowing to specify IfMatch.
         */
        interface WithIfMatch {
           /**
            * Specifies ifMatch.
            * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity
            * @return the next definition stage
            */
            WithDescription withIfMatch(String ifMatch);
        }

        /**
         * The stage of the issuecontract definition allowing to specify Description.
         */
        interface WithDescription {
           /**
            * Specifies description.
            * @param description Text describing the issue
            * @return the next definition stage
            */
            WithTitle withDescription(String description);
        }

        /**
         * The stage of the issuecontract definition allowing to specify Title.
         */
        interface WithTitle {
           /**
            * Specifies title.
            * @param title The issue title
            * @return the next definition stage
            */
            WithUserId withTitle(String title);
        }

        /**
         * The stage of the issuecontract definition allowing to specify UserId.
         */
        interface WithUserId {
           /**
            * Specifies userId.
            * @param userId A resource identifier for the user created the issue
            * @return the next definition stage
            */
            WithCreate withUserId(String userId);
        }

        /**
         * The stage of the issuecontract definition allowing to specify ApiId.
         */
        interface WithApiId {
            /**
             * Specifies apiId.
             * @param apiId A resource identifier for the API the issue was created for
             * @return the next definition stage
             */
            WithCreate withApiId(String apiId);
        }

        /**
         * The stage of the issuecontract definition allowing to specify CreatedDate.
         */
        interface WithCreatedDate {
            /**
             * Specifies createdDate.
             * @param createdDate Date and time when the issue was created
             * @return the next definition stage
             */
            WithCreate withCreatedDate(DateTime createdDate);
        }

        /**
         * The stage of the issuecontract definition allowing to specify State.
         */
        interface WithState {
            /**
             * Specifies state.
             * @param state Status of the issue. Possible values include: 'proposed', 'open', 'removed', 'resolved', 'closed'
             * @return the next definition stage
             */
            WithCreate withState(State state);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<IssueContract>, DefinitionStages.WithApiId, DefinitionStages.WithCreatedDate, DefinitionStages.WithState {
        }
    }
    /**
     * The template for a IssueContract update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<IssueContract>, UpdateStages.WithIfMatch, UpdateStages.WithApiId, UpdateStages.WithCreatedDate, UpdateStages.WithState {
    }

    /**
     * Grouping of IssueContract update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the issuecontract update allowing to specify IfMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies ifMatch.
             * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity
             * @return the next update stage
             */
            Update withIfMatch(String ifMatch);
        }

        /**
         * The stage of the issuecontract update allowing to specify ApiId.
         */
        interface WithApiId {
            /**
             * Specifies apiId.
             * @param apiId A resource identifier for the API the issue was created for
             * @return the next update stage
             */
            Update withApiId(String apiId);
        }

        /**
         * The stage of the issuecontract update allowing to specify CreatedDate.
         */
        interface WithCreatedDate {
            /**
             * Specifies createdDate.
             * @param createdDate Date and time when the issue was created
             * @return the next update stage
             */
            Update withCreatedDate(DateTime createdDate);
        }

        /**
         * The stage of the issuecontract update allowing to specify State.
         */
        interface WithState {
            /**
             * Specifies state.
             * @param state Status of the issue. Possible values include: 'proposed', 'open', 'removed', 'resolved', 'closed'
             * @return the next update stage
             */
            Update withState(State state);
        }

    }
}