package com.astraun.beam.core.entities

class IdGeneratorPluginFactory
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