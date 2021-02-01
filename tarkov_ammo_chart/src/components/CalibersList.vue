<template lang="html">
<div class="">
  <ul>
    <list-item v-for="(caliber, index) in calibers" :caliber="caliber" :key="index"></list-item>
  </ul>
</div>
</template>

<script>
import ListItem from './ListItem.vue';

export default {
  name: 'calibers-list',
  props: ['calibers'],
  components:{
    "list-item": ListItem
  }
}
</script>

<style lang="css" scoped>

</style>
