package sml.instructions

import sml.Instruction
import sml.Machine

class OutInstruction(label: String, val op: Int) : Instruction(label, "out") {

    override fun execute(m: Machine) {
        val value = m.registers.getRegister(op)
        println(this.label + ": register " + op + " value is " + value)
    }
}