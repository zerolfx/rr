package me.zerol.rr

import com.intellij.icons.AllIcons

class ReverseResumeAction : BaseAction(VerticalMirroredIcon(AllIcons.Actions.Resume)) {
    override val cmd = "reverse-continue"
}

class ReverseStepIntoAction : BaseAction(HorizontalMirroredIcon(AllIcons.Actions.TraceInto)) {
    override val cmd = "reverse-step"
}

class ReverseStepOverAction : BaseAction(VerticalMirroredIcon(HorizontalMirroredIcon(AllIcons.Actions.TraceOver))) {
    override val cmd = "reverse-next"
}

class ReverseStepOutAction : BaseAction(HorizontalMirroredIcon(AllIcons.Actions.StepOut)) {
    override val cmd = "reverse-finish"
}