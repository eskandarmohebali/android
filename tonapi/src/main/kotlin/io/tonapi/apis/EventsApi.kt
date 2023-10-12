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

package io.tonapi.apis

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import io.tonapi.models.Event
import io.tonapi.models.GetBlockchainBlockDefaultResponse

import com.squareup.moshi.Json

import io.tonapi.infrastructure.ApiClient
import io.tonapi.infrastructure.ApiResponse
import io.tonapi.infrastructure.ClientException
import io.tonapi.infrastructure.ClientError
import io.tonapi.infrastructure.ServerException
import io.tonapi.infrastructure.ServerError
import io.tonapi.infrastructure.MultiValueMap
import io.tonapi.infrastructure.PartConfig
import io.tonapi.infrastructure.RequestConfig
import io.tonapi.infrastructure.RequestMethod
import io.tonapi.infrastructure.ResponseType
import io.tonapi.infrastructure.Success
import io.tonapi.infrastructure.toMultiValue

class EventsApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://tonapi.io")
        }
    }

    /**
     * 
     * Get an event either by event ID or a hash of any transaction in a trace. An event is built on top of a trace which is a series of transactions caused by one inbound message. TonAPI looks for known patterns inside the trace and splits the trace into actions, where a single action represents a meaningful high-level operation like a Jetton Transfer or an NFT Purchase. Actions are expected to be shown to users. It is advised not to build any logic on top of actions because actions can be changed at any time.
     * @param eventId event ID or transaction hash in hex (without 0x) or base64url format
     * @param acceptLanguage  (optional, default to "en")
     * @return Event
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getEvent(eventId: kotlin.String, acceptLanguage: kotlin.String? = "en") : Event {
        val localVarResponse = getEventWithHttpInfo(eventId = eventId, acceptLanguage = acceptLanguage)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Event
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * Get an event either by event ID or a hash of any transaction in a trace. An event is built on top of a trace which is a series of transactions caused by one inbound message. TonAPI looks for known patterns inside the trace and splits the trace into actions, where a single action represents a meaningful high-level operation like a Jetton Transfer or an NFT Purchase. Actions are expected to be shown to users. It is advised not to build any logic on top of actions because actions can be changed at any time.
     * @param eventId event ID or transaction hash in hex (without 0x) or base64url format
     * @param acceptLanguage  (optional, default to "en")
     * @return ApiResponse<Event?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getEventWithHttpInfo(eventId: kotlin.String, acceptLanguage: kotlin.String?) : ApiResponse<Event?> {
        val localVariableConfig = getEventRequestConfig(eventId = eventId, acceptLanguage = acceptLanguage)

        return request<Unit, Event>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getEvent
     *
     * @param eventId event ID or transaction hash in hex (without 0x) or base64url format
     * @param acceptLanguage  (optional, default to "en")
     * @return RequestConfig
     */
    fun getEventRequestConfig(eventId: kotlin.String, acceptLanguage: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        acceptLanguage?.apply { localVariableHeaders["Accept-Language"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/v2/events/{event_id}".replace("{"+"event_id"+"}", encodeURIComponent(eventId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
