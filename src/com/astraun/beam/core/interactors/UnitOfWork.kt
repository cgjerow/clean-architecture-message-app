package com.astraun.beam.core.interactors

import com.astraun.beam.core.entities.Entity

interface UnitOfWork
{
    fun registerNew(entity: Entity): Unit
    fun registerDirty(entity: Entity): Unit
    fun registerClean(entity: Entity): Unit
    fun registerDelete(entity: Entity): Unit
    fun commit(): Unit
    fun rollback(): Unit
}