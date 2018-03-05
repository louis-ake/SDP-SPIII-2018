package sml.instructions

import sml.Instruction
import sml.Machine

class OutInstruction(label: String, val op: Int) : Instruction(label, "out") {

    val value: Int = 0

    override fun execute(m: Machine) {
        val value = m.registers.getRegister(op)
    }

    override fun toString(): String {
        return super.toString() + " register " + op + " contains " + value
    }
}