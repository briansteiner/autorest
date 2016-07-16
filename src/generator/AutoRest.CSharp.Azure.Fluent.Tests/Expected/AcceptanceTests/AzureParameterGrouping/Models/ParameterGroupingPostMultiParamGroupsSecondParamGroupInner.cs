// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.Azure.AcceptanceTestsAzureParameterGrouping.Models
{
    using System;
    using System.Linq;
    using System.Collections.Generic;
    using Newtonsoft.Json;
    using Microsoft.Rest;
    using Microsoft.Rest.Serialization;
    using Microsoft.Rest.Azure;

    /// <summary>
    /// Additional parameters for the parameterGrouping_postMultiParamGroups
    /// operation.
    /// </summary>
    public partial class ParameterGroupingPostMultiParamGroupsSecondParamGroupInner
    {
        /// <summary>
        /// Initializes a new instance of the
        /// ParameterGroupingPostMultiParamGroupsSecondParamGroupInner class.
        /// </summary>
        public ParameterGroupingPostMultiParamGroupsSecondParamGroupInner() { }

        /// <summary>
        /// Initializes a new instance of the
        /// ParameterGroupingPostMultiParamGroupsSecondParamGroupInner class.
        /// </summary>
        /// <param name="queryTwo">Query parameter with default</param>
        public ParameterGroupingPostMultiParamGroupsSecondParamGroupInner(string headerTwo = default(string), int? queryTwo = default(int?))
        {
            HeaderTwo = headerTwo;
            QueryTwo = queryTwo;
        }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "")]
        public string HeaderTwo { get; set; }

        /// <summary>
        /// Gets or sets query parameter with default
        /// </summary>
        [JsonProperty(PropertyName = "")]
        public int? QueryTwo { get; set; }

    }
}
