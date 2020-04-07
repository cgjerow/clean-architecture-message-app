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

    override fun insert(entity: Entity) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun update(entity: Entity) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(entity: Entity) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}