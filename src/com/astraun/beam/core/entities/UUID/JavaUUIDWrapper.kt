package com.astraun.beam.core.entities

internal class JavaUUIDWrapper : UUID
{

    private val uuid: java.util.UUID

    public constructor()
    {
        uuid = java.util.UUID.randomUUID()
    }

    public constructor(id: String)
    {
        uuid = java.util.UUID.fromString(id)
    }

    override fun toString(): String
    {
        return this.uuid.toString()
    }

    override fun equals(uuid: UUID): Boolean
    {
        return this == uuid
    }
    
}