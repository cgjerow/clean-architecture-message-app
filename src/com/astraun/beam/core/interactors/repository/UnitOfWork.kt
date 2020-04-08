package com.astraun.beam.core.interactors

import com.astraun.beam.core.entities.Entity
import kotlin.reflect.full.superclasses
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

interface UnitOfWork
{
    fun registerNew(entity: Entity)
    fun registerDirty(entity: Entity)
    fun registerClean(entity: Entity)
    fun registerDelete(entity: Entity)
    fun commit()
    fun rollback()
}

abstract class EntityUnitOfWork : UnitOfWork
{
    private val dirtyObjects = mutableListOf<Entity>()
    private val removedObjects = mutableListOf<Entity>()
    private val newObjects = mutableListOf<Entity>()

    private val mapperFactory: EntityDataMapperFactory

    constructor(mapperFactory: EntityDataMapperFactory)
    {
        this.mapperFactory = mapperFactory
    }

    override fun registerNew(obj: Entity)
    {
        assertNotNull(obj.getId(),"id not null")
        assertTrue(!dirtyObjects.contains(obj),"object not dirty")
        assertTrue(!removedObjects.contains(obj),"object not removed")
        assertTrue(!newObjects.contains(obj),"object not already registered new")
        newObjects.add(obj)
    }

    override fun registerDirty(obj: Entity)
    {
        assertNotNull(obj.getId(), "id not null")
        assertTrue(!removedObjects.contains(obj), "object not removed")
        if (!dirtyObjects.contains(obj) && !newObjects.contains(obj)) {
            dirtyObjects.add(obj)
        }
    }

    override fun registerDelete(obj: Entity)
    {
        assertNotNull(obj.getId(), "id not null")
        if (newObjects.remove(obj)) return
        dirtyObjects.remove(obj)
        if (!removedObjects.contains(obj)) removedObjects.add(obj)
    }

    override fun registerClean(obj: Entity)
    {
        assertNotNull(obj.getId(), "id not null")
    }

    override fun commit()
    {
        insertNew()
        updateDirty()
        deleteRemoved()
    }

    override fun rollback()
    {

    }


    private fun insertNew()
    {
        newObjects.forEach { entity ->
            this.mapperFactory.build(entity::class.superclasses).insert(entity)
        }
    }

    private fun updateDirty()
    {

    }

    private fun deleteRemoved()
    {

    }

}

class BeamUnitOfWork : EntityUnitOfWork
{
    constructor(mapperFactory: EntityDataMapperFactory) : super(mapperFactory) {}
}