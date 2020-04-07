package com.astraun.beam.core.entities

interface Account : Entity
{
    fun deactivate()
    fun activate()
    fun getPreferredContactMethod(): Contactable
}