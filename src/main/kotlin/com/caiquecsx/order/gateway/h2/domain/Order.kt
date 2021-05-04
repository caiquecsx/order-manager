package com.caiquecsx.order.gateway.h2.domain

import javax.persistence.*

@Entity
data class Order(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int,
        @Column
        var items: String,
        @Column
        var totalPrice: String
)
