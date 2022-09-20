package com.jack.weatherapp.common

interface EventHandler<E> {
    fun obtainEvent(event: E)
}