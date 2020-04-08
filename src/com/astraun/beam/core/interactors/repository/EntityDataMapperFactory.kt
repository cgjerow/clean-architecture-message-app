package com.astraun.beam.core.interactors

import com.astraun.beam.core.entities.Account
import com.astraun.beam.core.entities.Entity
import kotlin.reflect.KClass
import kotlin.reflect.full.createInstance

class EntityDataMapperFactory
{
    private val mappers = mapOf<KClass<out Entity>, KClass<out DataMapper>>(Account::class to AccountMapper::class) // TODO initialize this from some metadata

    fun build(supertypes: List<KClass<*>>): DataMapper {
        return this.findMapper(supertypes).createInstance()
    }


    private fun findMapper(superclasses: List<KClass<*>>): KClass<out DataMapper>
    {
        for (type in superclasses)
        {
            val mapper = this.mappers[type];
            if (mapper != null) return mapper
        }
        throw MapperRegistryException("No data mapper registered for object with these superclasses: $superclasses")
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