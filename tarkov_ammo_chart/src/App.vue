<template lang="html">
  <div>
    <h1>Calibers list</h1>
    <div class="main-cpontainer">
      <calibers-list :calibers='calibers'></calibers-list>
    </div>
    <ul>
    </ul>
  </div>
</template>

<script>
import CalibersList from './components/CalibersList.vue';
import AmmoType from './components/AmmoType.vue';
import { eventBus } from './main.js'

export default {
  name: 'app',
  data() {
    return {
      calibers: [],
      selectedCaliber: null
    };
  },
  mounted(){
      fetch('http://localhost:8080/calibers')
      .then(res => res.json())
      .then(calibers => this.calibers = calibers)

      eventBus.$on('calibers-selected', (caliber) => {
        this.selectedCaliber = caliber
      })
    },

    mounted(){
        fetch('http://localhost:8080/ammotypes')
        .then(res => res.json())
        .then(ammotypes => this.ammotypes = ammotypes)

        eventBus.$on('ammotype-selected', (ammotype) => {
          this.selectedAmmoType = ammotype
        })
      },

  components: {
  "calibers-list": CalibersList,
  "Ammo-type": AmmoType
  }
}
</script>

<style lang="css" scoped>
</style>
