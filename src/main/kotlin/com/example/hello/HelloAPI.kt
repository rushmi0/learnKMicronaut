package com.example.hello

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import jakarta.inject.Inject

// * Constructor based injection

@Controller("api/hello")
class HelloAPI @Inject constructor(
    private val service: HelloAPIService
) {

    @Get(produces = [MediaType.TEXT_PLAIN])
    fun helloAPI(): String {
        return service.helloAPIFromService()
    }

}