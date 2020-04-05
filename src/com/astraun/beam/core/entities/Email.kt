package com.astraun.beam.core.entities

interface Email : Contactable, Messageable
{
    override
    fun toString(): String
    fun update(email: Email)
    fun isPrimary(): Boolean
    fun makePrimary()
    override
    fun getContactDetails(): String
    {
        return this.toString()
    }
}