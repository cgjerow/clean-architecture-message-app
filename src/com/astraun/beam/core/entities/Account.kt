package com.astraun.beam.core.entities

interface Account 
{
    fun deactivate()
    fun reactivate()
    fun getPreferredContactMethod(): Contactable

    // Danger Zone
    fun unsafeHardDelete()
    fun unsafeDisassociateContexts()
}