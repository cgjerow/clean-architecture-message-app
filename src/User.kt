package com.astraun.beam.core.entities

interface User : Context
{
    fun getDisplayName(): String;
    fun getPrimaryEmail(): Email;
    fun setPrimaryEmail(email: Email);
    fun getAccounts(): List<Account>;
    fun deactivate(): Unit;
    fun reactivate(): Unit;

    // Danger Zone
    fun unsafeDeleteUser(): Unit;
    fun unsafeDisassociateContexts(): Unit;
}