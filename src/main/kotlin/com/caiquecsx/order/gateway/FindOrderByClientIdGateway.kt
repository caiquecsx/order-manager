package com.caiquecsx.order.gateway

import com.caiquecsx.order.gateway.h2.domain.OrderDatabase

interface FindOrderByClientIdGateway {
    fun execute(clientId: Int): List<OrderDatabase>
}