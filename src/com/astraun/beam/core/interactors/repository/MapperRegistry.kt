package com.astraun.beam.core.interactors

import com.astraun.beam.core.entities.Account
import com.astraun.beam.core.entities.Entity
import kotlin.reflect.KClass
import kotlin.reflect.full.createInstance

class MapperRegistry
{
    private val mappers = mapOf<KClass<out Entity>,KClass<out DataMapper>>( Account::class to AccountMapper::class ) // TODO initialize this from some metadata
    fun get(className: KClass<Entity>): DataMapper
    {
        val mapper = this.mappers[className]
        if (mapper == null) throw MapperRegistryException("No data mapper registered for type: $className")
        else return mapper.createInstance()
    }
}

abstract class DataMapper
{
    abstract fun find(query: String): List<Entity>
    abstract fun insert(entity: Entity)
    abstract fun update(entity: Entity)
    abstract fun delete(entity: Entity)
}

class MapperRegistryException(s: String) : Exception(s) {}