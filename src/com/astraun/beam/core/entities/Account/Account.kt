package com.astraun.beam.core.entities

interface Account 
{
    fun deactivate()
    fun activate()
    fun getPreferredContactMethod(): Contactable

    // Danger Zone
    // fun unsafeDisassociateContexts()
}