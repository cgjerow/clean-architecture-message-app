package com.astraun.beam.core.entities

interface Email : Contactable, Messageable
{
    override
    fun toString(): String;
    fun update(email: Email): Unit;
    fun isPrimary(): Boolean;
    fun makePrimary(): Unit;
    override
    fun getContactDetails(): String
    {
        return this.toString();
    }
}