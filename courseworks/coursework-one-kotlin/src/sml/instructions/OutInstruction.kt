package sml.instructions

import sml.Instruction
import sml.Machine

class OutInstruction(label: String, val op1: Int) : Instruction(label, "out") {

    override fun execute(m: Machine) {
        val value = m.registers.getRegister(op1)
    }

    fun toString(value: Int): String {
        return super.toString() + " register " + op1 + " contains " + value
    }
}