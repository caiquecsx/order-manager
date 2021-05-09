package com.caiquecsx.order.domain

import com.caiquecsx.order.gateway.h2.domain.OrderDatabase
import org.springframework.data.annotation.CreatedDate
import java.util.*

data class Order(
        var id: Int,
        var items: List<Item>,
        var totalPrice: String,
        var clientId: Int = Int.MIN_VALUE,
        var createdDate: Date
)

fun Order.toOrderDatabase() = OrderDatabase(
        items = items.map { it.toDatabase() },
        totalPrice = totalPrice,
        clientId = clientId,
        createdDate = createdDate
)
