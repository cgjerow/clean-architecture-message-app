package com.astraun.beam.core.entities

interface Entity
{
    fun getId(): String
}

abstract class BeamEntity : Entity
{
    private val id: UUID

    constructor()
    {
        this.id = IdGeneratorPlugin().generate()
    }

    constructor(id: String)
    {
        this.id = IdGeneratorPlugin().generate(id)
    }

    override fun getId(): String
    {
        return this.id.toString()
    }
}