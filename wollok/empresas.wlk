class Empresa {

    const nombre
    const cuit
    var empleados = #{}
    var reciboDeHaberes = #{}

    method montoTotalSueldosNetos() {
        return empleados.sum({ e => e.sueldoNeto()})
    }

    method montoTotalSueldoBruto() {
        return empleados.sum({ e => e.sueldoBruto()})
    }

    method montoTotalRetenciones() {
        return empleados.sum({ e => e.retenciones()})
    }

}

class ReciboDeHaberes inherits Empleado {

    const fecEmision

}

class Empleado {

    const nombre
    const direccion
    const estadoCivil
    const fecnac
    const sueldoBasico
    var fechaActual

    method edad() {
        return fechaActual - fecnac
    }

    method sueldoNeto() {
        return self.sueldoBruto() - self.retenciones()
    }

    method sueldoBruto() 
    
    method salarioFamiliar() 

    method retenciones() = self.obraSocial() + self.jubilacion()

    method obraSocial()

    method estaCasado() = true
    
    method jubilacion()
}

class EmpleadoPermanente inherits Empleado {

    const cantHijos
    const antiguedad

    override method salarioFamiliar() {
        return self.cantidadPorHijo(150) + self.asignacionConyuge() + self.sueldoPorAntiguedad()
    }

    override method sueldoBruto() {
          return sueldoBasico + self.salarioFamiliar()
    }

    method cantidadPorHijo(cantidad) = cantHijos * cantidad

    method asignacionConyuge() {
         return if (self.estaCasado()) {
            100
         } else 0
    }

    method sueldoPorAntiguedad() = antiguedad * 50

    override method obraSocial() {
        return self.sueldoBruto() * 10 / 100 + self.cantidadPorHijo(20)
    }

    override method jubilacion(){
        return self.sueldoBruto() * 15 / 100
    }
}

class EmpleadoTemporal inherits Empleado {

    const fecFinalDesignacion
    const cantHorasExtras

    method cantPorHorasExtras(cant) {
        return cantHorasExtras * cant
    }

    override method sueldoBruto() {
          return sueldoBasico + self.cantPorHorasExtras(40)
    }

    override method obraSocial() {
        return self.sueldoBruto() * 10 / 100 + self.retencionPorEdad()
    }

    method retencionPorEdad() {
        return if (self.edad() > 50) {
            25
        } else 0
    }

    override method jubilacion(){
        return self.sueldoBruto() * 10 / 100 + self.cantPorHorasExtras(5)
    }

}

class Contratado inherits Empleado {
    
    const numContrato
    const medioDePago

    override method sueldoBruto() {
        return sueldoBasico
    }

    override method retenciones() = 50

}