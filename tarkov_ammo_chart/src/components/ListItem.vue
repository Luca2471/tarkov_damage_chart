<template lang="html">
  <ul v-on:click="handleClick">{{caliber.name}}</ul>
</template>

<script>
import { eventBus } from '../main.js';

export default {
  name: 'list-item',
  props: ['caliber'],
  methods:{
    handleClick(){
      eventBus.$emit('caliber-selected', this.caliber)
    }
  }
}
</script>





<style lang="css" scoped>
</style>
