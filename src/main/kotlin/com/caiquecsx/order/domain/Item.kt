package com.caiquecsx.order.domain

import com.caiquecsx.order.gateway.h2.domain.ItemDatabase

data class Item(
    var id: Int,
    var description: String,
    var value: String
)

fun Item.toDatabase() = ItemDatabase(
    id = id,
    description = description,
    value = value
)