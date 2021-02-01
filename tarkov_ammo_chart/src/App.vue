<template lang="html">
  <div>
    <h1>Calibers list</h1>
    <div class="main-cpontainer">
      <calibers-list :calibers='calibers'></calibers-list>
      <ammo-types-list :caliber='selectedCaliber'></ammo-types-list>
    </div>
    <ul>
    </ul>
  </div>
</template>

<script>
import CalibersList from './components/CalibersList.vue';
import AmmoTypesList from './components/AmmoTypesList.vue';
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

      eventBus.$on('caliber-selected', (caliber) => {
        this.selectedCaliber = caliber
      })
    },

  components: {
  "calibers-list": CalibersList,
  "ammo-types-list": AmmoTypesList
  }
}
</script>
<style lang="css" scoped>
  .main-container {
    display: flex;
    justify-content: space-between;
  }
</style>
