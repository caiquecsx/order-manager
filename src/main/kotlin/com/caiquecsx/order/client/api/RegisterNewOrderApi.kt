package com.caiquecsx.order.client.api

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("order")
interface RegisterNewOrderApi {
    @PostMapping("/register")
    fun registry(): String
}