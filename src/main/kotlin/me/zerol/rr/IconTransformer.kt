package me.zerol.rr

import java.awt.Component
import java.awt.Graphics
import javax.swing.Icon

class VerticalMirroredIcon(private val icon: Icon) : Icon {
    override fun paintIcon(c: Component?, g: Graphics?, x: Int, y: Int) {
        val g2d = g?.create() as java.awt.Graphics2D
        g2d.translate(x + icon.iconWidth, y)
        g2d.scale(-1.0, 1.0)
        icon.paintIcon(c, g2d, 0, 0)
        g2d.dispose()
    }

    override fun getIconWidth(): Int {
        return icon.iconWidth
    }

    override fun getIconHeight(): Int {
        return icon.iconHeight
    }
}

class HorizontalMirroredIcon(private val icon: Icon) : Icon {
    override fun paintIcon(c: Component?, g: Graphics?, x: Int, y: Int) {
        val g2d = g?.create() as java.awt.Graphics2D
        g2d.translate(x, y + icon.iconHeight)
        g2d.scale(1.0, -1.0)
        icon.paintIcon(c, g2d, 0, 0)
        g2d.dispose()
    }

    override fun getIconWidth(): Int {
        return icon.iconWidth
    }

    override fun getIconHeight(): Int {
        return icon.iconHeight
    }
}