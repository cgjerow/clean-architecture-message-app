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