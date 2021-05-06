package com.caiquecsx.order.domain

import com.caiquecsx.order.gateway.h2.domain.OrderDatabase

data class Order(
        var id: Int,
        var items: List<Item>,
        var totalPrice: String
)

fun Order.toOrderDatabase() = OrderDatabase(
        items = items.map { it.toDatabase() },
        totalPrice = totalPrice
)
