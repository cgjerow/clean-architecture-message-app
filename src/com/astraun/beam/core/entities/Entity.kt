package com.astraun.beam.core.entities

public abstract class Entity
{
    private val id: UUID

    public constructor()
    {
        this.id = IdGeneratorPlugin().generate()
    }

    public constructor(id: String)
    {
        this.id = IdGeneratorPlugin().generate(id)
    }
}