<template lang="html">
  <div v-if="caliber">
    <h4>Caliber: {{ caliber.name }}</h4>
    <ul v-for="(ammunitionType, key, index) in caliber.ammoTypes">
      Ammo Type: {{ ammunitionType.name }} - Damage: {{ ammunitionType.damage }} - Pen Value: {{ ammunitionType.penValue }} - Armor Damage: {{ ammunitionType.armorDamage }} - frag chance: {{ ammunitionType.fragChance }}% - effectviveness against armor: class 1: [{{ ammunitionType.armorLevel1Effectiveness }}], class 2: [{{ ammunitionType.armorLvl2Effectiveness }}], class 3: [{{ ammunitionType.armorLvl3Effectiveness }}], cass 4: [{{ ammunitionType.armorLvl4Effectiveness }}], class 5: [{{ ammunitionType.armorLvl5Effectiveness }}], class 6: [{{ ammunitionType.armorLvl6Effectiveness }}]
    </ul>
  </div>
</template>

<script>
import {eventBus} from '../main.js'

export default {
  name: "ammo-types-list",
  props: ['caliber'],
}
</script>

<style lang="css" scoped>
</style>
