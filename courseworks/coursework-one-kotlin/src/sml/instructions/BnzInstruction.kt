package sml.instructions

import sml.Instruction
import sml.Labels
import sml.Machine

class BnzInstruction(label: String, val op: Int, val label2: String) : Instruction(label, "bnz") {

    override fun execute(m: Machine) {
        println(m.prog)
        println(this.label + label2)
        val value = m.registers.getRegister(op)
        val labels = m.labels.getLabels()
        if (value != 0) {
            m.pc = labels.indexOf(label2)
        }
    }
}
