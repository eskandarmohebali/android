/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package io.tonapi.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param address 
 * @param name 
 * @param description 
 */


data class NftItemCollection (

    @Json(name = "address")
    val address: kotlin.String,

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "description")
    val description: kotlin.String

)

