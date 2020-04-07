package com.astraun.beam.core.entities

interface MessageChannel
{
    fun send(message: String)
}