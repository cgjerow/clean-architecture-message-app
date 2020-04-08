package com.astraun.beam.core.interactors

import com.astraun.beam.core.entities.AstraunAccount
import com.astraun.beam.core.entities.BasicEmail
import com.astraun.beam.core.entities.Entity

class AccountMapper : DataMapper()
{
    override fun find(query: String): List<Entity>
    {
        return listOf(AstraunAccount("123456",true, BasicEmail("test@hello.com")))
    }

    override fun insert(entity: Entity)
    {
        println(entity)
    }

    override fun update(entity: Entity)
    {
        println(entity)
    }

    override fun delete(entity: Entity)
    {
        println(entity)
    }
}