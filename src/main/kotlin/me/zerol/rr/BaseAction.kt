package me.zerol.rr

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.xdebugger.XDebugSession
import com.intellij.xdebugger.XDebuggerManager
import com.jetbrains.cidr.execution.debugger.CidrDebugProcess
import com.jetbrains.cidr.execution.debugger.backend.DebuggerDriver
import javax.swing.Icon

fun getSession(e: AnActionEvent): XDebugSession? {
    val session = e.getData(XDebugSession.DATA_KEY)
    if (session != null) {
        return session
    }
    e.project?.let {
        return XDebuggerManager.getInstance(it).currentSession
    }
    return null
}


abstract class BaseAction(icon: Icon) : AnAction(icon) {
    abstract val cmd: String

    class DebugCommand(private val cmd: String) : CidrDebugProcess.SuspendedDebuggerCommand<Void> {
        override fun call(driver: DebuggerDriver): Void? {
            driver.executeInterpreterCommand(cmd)
            return null
        }
    }

    override fun actionPerformed(e: AnActionEvent) {
        val session = getSession(e) ?: return
        val debugProcess = session.debugProcess as? CidrDebugProcess ?: return
        debugProcess.postCommand(DebugCommand(cmd))
    }
}