package sml.instructions

import sml.Instruction
import sml.Labels
import sml.Machine

class BnzInstruction(label: String, val op: Int, label2: String) : Instruction(label, "bnz") {

    val inst: String = label2

    override fun execute(m: Machine) {
        println(m.prog)
        println(this.label + inst)
        val value = m.registers.getRegister(op)
        if (value != 0) {
            val ins = m.prog.indexOf(m.getInstruction(inst))
            println("ins = " + ins)
            val ins2 = m.prog[ins]
            ins2.execute(m)
        }
    }
}
