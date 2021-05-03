package com.caiquecsx.order.client.api

import com.caiquecsx.order.domain.Order
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("order")
interface RegisterNewOrderApi {
    @PostMapping("/register")
    fun registry(@RequestBody order: Order): String
}