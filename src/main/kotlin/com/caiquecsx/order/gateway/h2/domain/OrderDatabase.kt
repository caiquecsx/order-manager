package com.caiquecsx.order.gateway.h2.domain

import com.caiquecsx.order.domain.Order
import javax.persistence.*

@Entity
@Table(name = "order_table")
data class OrderDatabase(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Int = 0,
        var items: String = "",
        var totalPrice: String = ""
)

fun OrderDatabase.toOrderDomain() = Order(
        id = id,
        items = items,
        totalPrice = totalPrice
)
