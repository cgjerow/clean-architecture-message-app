package com.astraun.beam.core.entities.com.astraun.beam.core.entities

import com.astraun.beam.core.entities.*

interface User : Entity, Context
{
    fun getDisplayName(): String
    fun getPrimaryEmail(): Email
    fun setPrimaryEmail(email: Email)
    fun getAccounts(): List<Account>
    fun deactivate()
    fun reactivate()
}