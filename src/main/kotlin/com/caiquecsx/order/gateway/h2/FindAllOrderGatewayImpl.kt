package com.caiquecsx.order.gateway.h2

import com.caiquecsx.order.domain.Order
import com.caiquecsx.order.gateway.FindAllOrderGateway
import org.springframework.stereotype.Component

@Component
class FindAllOrderGatewayImpl(val orderRepository: OrderRepository): FindAllOrderGateway {

    override fun findAll(): List<Order> {
        return orderRepository.findAll().toMutableList()
    }
}