package com.caiquecsx.order.client.api

import com.caiquecsx.order.gateway.h2.domain.Order
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("order")
interface GetAllOrderApi {
    @GetMapping()
    fun execute(): List<Order>
}