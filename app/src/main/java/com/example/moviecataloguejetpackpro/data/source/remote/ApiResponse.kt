package com.example.moviecataloguejetpackpro.data.source.remote

import com.example.moviecataloguejetpackpro.data.source.remote.StatusResponse.*

class ApiResponse<T>(val statusResponse: StatusResponse, val body: T, val message: String?) {
    companion object {
        fun <T> success(body: T): ApiResponse<T> = ApiResponse(SUCCESS, body, null)

        fun <T> empty(msg: String, body: T): ApiResponse<T> = ApiResponse(EMPTY, body, msg)

        fun <T> error(msg: String, body: T): ApiResponse<T> = ApiResponse(ERROR, body, msg)
    }
}