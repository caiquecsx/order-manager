package com.caiquecsx.order.domain

import javax.persistence.*

data class Order(
        var id: Int,
        var items: String,
        var totalPrice: String
)
