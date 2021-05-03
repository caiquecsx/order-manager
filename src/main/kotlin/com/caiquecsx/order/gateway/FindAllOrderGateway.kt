package com.caiquecsx.order.gateway

import com.caiquecsx.order.domain.Order

interface FindAllOrderGateway {
    fun findAll(): List<Order>
}