<template lang="html">
  <div v-if='caliber'>
    <h3>{{caliber.name}}</h3>
    <p>{{ammotype.ammoTypes.name}}</p>
  </div>

</template>

<script>
import {eventBus} from '../main.js'

export default {
  name: 'ammo-type',
  props:['caliber']

}
</script>

<style lang="css" scoped>
</style>
