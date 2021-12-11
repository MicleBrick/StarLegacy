package net.starlegacy.feature.multiblock.areashield

import net.starlegacy.util.Vec3i

internal class AreaShield30Test : AreaShieldTest() {
    override fun getMultiblock() = AreaShield30
    override fun getExpectedNoteBlockOffset(): Vec3i = Vec3i(0, -1, 0)
    override fun getExpectedRadius() = 30
}
