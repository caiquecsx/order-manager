package com.caiquecsx.order.gateway.h2

import com.caiquecsx.order.gateway.FindAllOrderGateway
import com.caiquecsx.order.gateway.h2.domain.Order
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

@Service
class FindAllOrderGatewayImpl(val orderRepository: OrderRepository): FindAllOrderGateway {
    override fun findAll(): List<Order> {
        return orderRepository.findAll().toMutableList()
    }
}