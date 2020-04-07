package com.astraun.beam.core.entities

public class IdGeneratorPlugin
{
    fun generate(): UUID
    {
        return JavaUUIDWrapper()
    }

    fun generate(id: String): UUID
    {
        return JavaUUIDWrapper(id)
    }
}