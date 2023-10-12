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

import io.tonapi.models.AccountAddress

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param address 
 * @param owner 
 * @param balance 
 */


data class JettonHoldersAddressesInner (

    @Json(name = "address")
    val address: kotlin.String,

    @Json(name = "owner")
    val owner: AccountAddress,

    @Json(name = "balance")
    val balance: kotlin.String

)

