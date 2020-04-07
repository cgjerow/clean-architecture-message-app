import com.astraun.beam.core.entities.*
import com.astraun.beam.core.interactors.*

fun main(args: Array<String>)
{
    val uow = UnitOfWorkPluginFactory().generate()
    uow.registerNew(AstraunAccount())
    println("Test")
}