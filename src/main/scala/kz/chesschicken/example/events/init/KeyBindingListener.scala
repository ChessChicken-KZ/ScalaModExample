package kz.chesschicken.example.events.init

import kz.chesschicken.example.events.init.KeyBindingListener.{keyBinding, keyBinding2, keyBinding3}
import net.minecraft.client.options.KeyBinding
import net.modificationstation.stationapi.api.client.event.option.KeyBindingRegister
import net.modificationstation.stationapi.api.common.event.EventListener

object KeyBindingListener {

  var keyBinding: KeyBinding = _
  var keyBinding2: KeyBinding = _
  var keyBinding3: KeyBinding = _

}

class KeyBindingListener {

  @EventListener def registerKeyBindings(event: KeyBindingRegister): Unit = {
    val list = event.keyBindings
    keyBinding = new KeyBinding("key.examplemod.test", 21)
    keyBinding2 = new KeyBinding("key.examplemod.test2", 22)
    keyBinding3 = new KeyBinding("key.examplemod.hurtme", 23)
    list.add(keyBinding)
    list.add(keyBinding2)
    list.add(keyBinding3)
  }

}
