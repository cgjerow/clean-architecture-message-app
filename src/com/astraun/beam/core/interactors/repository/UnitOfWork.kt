package com.astraun.beam.core.interactors

import com.astraun.beam.core.entities.Entity

interface UnitOfWork
{
    fun registerNew(entity: Entity)
    fun registerDirty(entity: Entity)
    fun registerClean(entity: Entity)
    fun registerDelete(entity: Entity)
    fun commit()
    fun rollback()
}

class BeamUnitOfWork : UnitOfWork
{
    private val dirtyObjects = mutableListOf<Entity>()
    private val removedObjects = mutableListOf<Entity>()
    private val newObjects = mutableListOf<Entity>()

    override fun registerNew(obj: Entity)
    {
//        Assert.notNull("id not null", obj.getId())
//        Assert.isTrue("object not dirty", !dirtyObjects.contains(obj))
//        Assert.isTrue("object not removed", !removedObjects.contains(obj))
//        Assert.isTrue("object not already registered new", !newObjects.contains(obj))
        newObjects.add(obj)
    }

    override fun registerDirty(obj: Entity)
    {
//        Assert.notNull("id not null", obj.getId())
//        Assert.isTrue("object not removed", !removedObjects.contains(obj))
        if (!dirtyObjects.contains(obj) && !newObjects.contains(obj)) {
            dirtyObjects.add(obj)
        }
    }

    override fun registerDelete(obj: Entity)
    {
//        Assert.notNull("id not null", obj.getId())
        if (newObjects.remove(obj)) return
        dirtyObjects.remove(obj)
        if (!removedObjects.contains(obj)) removedObjects.add(obj)
    }

    override fun registerClean(obj: Entity)
    {
//        Assert.notNull("id not null", obj.getId())
    }

    override fun commit()
    {
//        insertNew()
//        updateDirty()
//        deleteRemoved()
    }

    override fun rollback()
    {

    }


    fun insertNew()
    {
//        for (Iterator objects = newObjects.iterator()  objects.hasNext()) {
//            DomainObject obj = (DomainObject) objects.next()
//            MapperRegistry.getMapper(obj.getClass()).insert(obj)
//        }
    }

    fun updateDirty()
    {

    }

    fun deleteRemoved()
    {

    }

}