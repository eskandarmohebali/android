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

import io.tonapi.models.BlockRaw

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param shardblk 
 * @param shardProof 
 * @param proof 
 * @param state 
 */


data class GetRawAccountState200Response (

    @Json(name = "id")
    val id: BlockRaw,

    @Json(name = "shardblk")
    val shardblk: BlockRaw,

    @Json(name = "shard_proof")
    val shardProof: kotlin.String,

    @Json(name = "proof")
    val proof: kotlin.String,

    @Json(name = "state")
    val state: kotlin.String

)

