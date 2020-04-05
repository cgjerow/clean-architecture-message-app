package com.astraun.beam.core.entities.com.astraun.beam.core.entities

import com.astraun.beam.core.entities.Account
import com.astraun.beam.core.entities.Context
import com.astraun.beam.core.entities.Email

interface User : Context
{
    fun getDisplayName(): String
    fun getPrimaryEmail(): Email
    fun setPrimaryEmail(email: Email)
    fun getAccounts(): List<Account>
    fun deactivate()
    fun reactivate()

    // Danger Zone
    fun unsafeDeleteUser()
    fun unsafeDisassociateContexts()
}