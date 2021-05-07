package com.caiquecsx.order.gateway

import com.caiquecsx.order.gateway.domain.OrderDatabase

interface FindAllOrderGateway {
    fun findAll(): List<OrderDatabase>
}