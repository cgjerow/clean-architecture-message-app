package com.astraun.beam.core.entities

interface UUID 
{
    override fun toString(): String
    fun equals(uuid: UUID): Boolean
}