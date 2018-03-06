package sml.instructions

import sml.Instruction
import sml.Labels
import sml.Machine

class BnzInstruction(label: String, val op: Int, val label2: String) : Instruction(label, "bnz") {

    override fun execute(m: Machine) {
        val value = m.registers.getRegister(op)
        val labels = m.labels.getLabels()
        if (value != 0) { m.pc = labels.indexOf(label2) }
    }

    override fun toString(): String {
        return super.toString() + " executing instruction " + label2 + " if the contents of register " + op + " is not 0"
    }
}
