package classes

fun main() {
    val vehicle = Vehicle("Toyota", 2)
    vehicle.on()
    vehicle.off()
    println(vehicle)
}

class Vehicle(private var model : String, private var wheels : Int) {
    fun getModel() : String {
        return model
    }

    fun getWheels() : Int {
        return wheels
    }

    fun setModel(model : String) {
        this.model = model
    }

    fun setWheels(wheels : Int) {
        this.wheels = wheels
    }

    fun on() {
        println("Vehicle is on")
    }

    fun off() {
        println("Vehicle is off")
    }

    override fun toString(): String {
        return "Vehicle(model='$model', wheels=$wheels)"
    }
}