<template lang="html">
  <li v-on:click="handleClick">{{caliber.name}}</li>
</template>

<script>
import { eventBus } from '../main.js';

export default {
  name: 'list-item',
  props: ['caliber'],
  methods:{
    handleClick(){
      eventBus.$emit('name-selected', this.caliber)
    }
  }
}
</script>





<style lang="css" scoped>
</style>
