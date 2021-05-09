package com.caiquecsx.order.gateway

import com.caiquecsx.order.gateway.h2.domain.OrderDatabase

interface FindAllOrderGateway {
    fun findAll(): List<OrderDatabase>
}