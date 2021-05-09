package com.caiquecsx.order.client.api

import com.caiquecsx.order.domain.Order
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("order")
interface GetOrderByClientIdApi {
    @GetMapping("/{clientId}")
    fun execute(@PathVariable(value = "clientId") clientId: Int): List<Order>
}