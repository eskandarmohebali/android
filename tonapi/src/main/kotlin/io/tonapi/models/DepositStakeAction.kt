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
import io.tonapi.models.PoolImplementationType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * validator's participation in elections
 *
 * @param amount 
 * @param staker 
 * @param pool 
 * @param implementation 
 */


data class DepositStakeAction (

    @Json(name = "amount")
    val amount: kotlin.Long,

    @Json(name = "staker")
    val staker: AccountAddress,

    @Json(name = "pool")
    val pool: AccountAddress,

    @Json(name = "implementation")
    val implementation: PoolImplementationType

)

