package org.example.testing

import io.kotest.core.config.AbstractProjectConfig
import io.kotest.core.names.DuplicateTestNameMode
import io.kotest.core.spec.IsolationMode

object KotestConfig : AbstractProjectConfig() {
    // Setting it to `IsolationMode.InstancePerLeaf` makes it work like JUnit.
    override val isolationMode = IsolationMode.InstancePerLeaf

    override val duplicateTestNameMode = DuplicateTestNameMode.Error
}
