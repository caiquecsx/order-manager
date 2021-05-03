package com.caiquecsx.order.service.controller

import com.caiquecsx.order.client.api.GetAllOrderApi
import com.caiquecsx.order.domain.Order
import com.caiquecsx.order.gateway.FindAllOrderGateway
import org.springframework.web.bind.annotation.RestController

@RestController
class GetAllOrder(private val findAllOrderGateway: FindAllOrderGateway) : GetAllOrderApi {
    override fun execute(): List<Order> {
        return findAllOrderGateway.findAll()
    }
}