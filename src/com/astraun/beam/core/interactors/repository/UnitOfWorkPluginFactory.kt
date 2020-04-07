package com.astraun.beam.core.interactors

class UnitOfWorkPluginFactory
{
    fun generate(): UnitOfWork
    {
        return BeamUnitOfWork()
    }
}
