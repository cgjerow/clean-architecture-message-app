package com.astraun.beam.core.entities

interface Account 
{
    fun deactivate(): Unit
    fun reactivate(): Unit
    fun getPreferredContactMethod(): Contactable

    // Danger Zone
    fun unsafeHardDelete(): Unit
    fun unsafeDisassociateContexts(): Unit
}