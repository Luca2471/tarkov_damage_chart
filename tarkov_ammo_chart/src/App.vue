<template lang="en">
  <div>
    <div>
      <body>
        <header>
          <section>
            <h1> Escape From Tarkov Ammo Chart</h1>
            <h2 class="game-version">Ammo Chart is updated for game version: 0.12.9</h2>
            <img src="./assets/EscapeFromTarkov.png" alt="Escape From Tarkov Logo">
          </section>
        </header>
      </body>
    </div>
    <div class="main-cpontainer">
    <h1>Calibers list:</h1>
      <calibers-list class="calibers-list"  :calibers='calibers'></calibers-list>
      <ammo-types-list :caliber='selectedCaliber'></ammo-types-list>
    </div>
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


    html {
      background-color: 	#A9A9A9;
    }

  * {
    font-family: Arial, Helvetica, sans-serif;
    box-sizing: border-box;
    background-color: #A9A9A9;
    margin: 0 auto;
  }

  header {
    text-align: center;
    font-size: 25px;
  }


  .game-version {
    font-size: 17px;
  }

   .main-container {
    display: flex;
    justify-content: space-between;
  }

</style>
