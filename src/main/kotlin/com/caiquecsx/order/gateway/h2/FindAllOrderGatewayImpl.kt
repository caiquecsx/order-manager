package com.caiquecsx.order.gateway.h2

import com.caiquecsx.order.gateway.FindAllOrderGateway
import com.caiquecsx.order.gateway.h2.domain.OrderDatabase
import org.springframework.stereotype.Service

@Service
class FindAllOrderGatewayImpl(val orderRepository: OrderRepository): FindAllOrderGateway {
    override fun findAll(): List<OrderDatabase> {
        return orderRepository.findAll().toMutableList()
    }
}