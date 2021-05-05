package com.caiquecsx.order.domain

import com.caiquecsx.order.gateway.h2.domain.OrderDatabase

data class Order(
        var id: Int,
        var items: String,
        var totalPrice: String
)

fun Order.toOrderDatabase() = OrderDatabase(
        items = items,
        totalPrice = totalPrice
)
