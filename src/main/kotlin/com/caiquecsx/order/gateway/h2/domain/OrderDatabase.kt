package com.caiquecsx.order.gateway.h2.domain

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
