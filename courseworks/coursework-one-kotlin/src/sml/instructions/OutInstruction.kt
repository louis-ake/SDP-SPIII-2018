package sml.instructions

import sml.Instruction
import sml.Machine

class OutInstruction(label: String, val op: Int) : Instruction(label, "out") {

    override fun execute(m: Machine) {
        val value = m.registers.getRegister(op)
    }

    fun toString(value: Int): String {
        return super.toString() + " register " + op + " contains " + value
    }
}