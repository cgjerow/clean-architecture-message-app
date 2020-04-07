package com.astraun.beam.core.entities

import java.lang.IllegalArgumentException

interface Email : Contactable
{
    override
    fun toString(): String
    fun update(email: String)
    fun isPrimary(): Boolean
    fun setPrimaryStatus(isPrimary: Boolean)
    override
    fun getContactDetails(): String
    {
        return this.toString()
    }
}

class BasicEmail : Email
{
    private var primary = false
    private var email: String
        set(value)
        {
            if (!value.contains('@')) throw IllegalArgumentException("Invalid email format.")
            field = value
        }

    constructor(email: String)
    {
        this.email = email
    }

    override fun toString(): String
    {
        return this.email
    }

    override fun update(email: String)
    {
        this.email = email
    }

    override fun isPrimary(): Boolean
    {
        return this.primary
    }

    override fun setPrimaryStatus(isPrimary: Boolean)
    {
        this.primary = isPrimary
    }
}