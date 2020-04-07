package com.astraun.beam.core.entities

class AstraunAccount : Entity, Account
{
    private var active = false;
    private var preferredContactMethod: Contactable

    public constructor(id: String, active: Boolean, preferredContactMethod: Contactable) : super(id)
    {
        this.active = active
        this.preferredContactMethod = preferredContactMethod
    }


    override fun deactivate()
    {
        if (!this.active)
        {
            // Maybe throw an exception that the Account is already inactive. Not sure it's warranted
        }
        this.active = false;
    }

    override fun activate()
    {
        if (this.active)
        {
            // Maybe throw an exception that the Account is already active. Not sure it's warranted
        }
        this.active = true;
    }

    override fun getPreferredContactMethod(): Contactable
    {
        return this.preferredContactMethod
    }
}