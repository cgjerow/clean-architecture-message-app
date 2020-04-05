package com.astraun.beam.core.entities

interface UserCommands 
{
    fun createNewUser(user: CreateUserRequest): User;
    fun deactivateUser()
}