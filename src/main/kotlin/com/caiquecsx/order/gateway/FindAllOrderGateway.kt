package com.caiquecsx.order.gateway

import com.caiquecsx.order.gateway.h2.domain.Order

interface FindAllOrderGateway {
    fun findAll(): List<Order>
}