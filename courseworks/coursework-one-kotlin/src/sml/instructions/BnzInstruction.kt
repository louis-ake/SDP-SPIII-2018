package sml.instructions

import sml.Instruction
import sml.Machine

class BnzInstruction(label: String, val op: Int, label2: String) : Instruction(label, "bnz") {

    val inst = label2

    override fun execute(m: Machine) {
        val value = m.registers.getRegister(op)
        if (value != 0) {
            m.getInstruction(inst)
            m.execute()
        }
    }

    fun toString(label2: String): String {
        return super.toString() + " executing instruction " + label2
    }
}