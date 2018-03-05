package sml.instructions

import sml.Instruction
import sml.Machine

class BnzInstruction(label: String, val op: Int, label2: String) : Instruction(label, "bnz") {

    val inst = label2

    override fun execute(m: Machine) {
        println(m.prog)
        println(this.label + inst)
        val value = m.registers.getRegister(op)
        if (value != 0) {
            m.prog.add(m.getInstruction(inst))
        }
        println(m.prog)
    }
}