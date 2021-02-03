<template lang="html">
<div class="">
  <ul>
    <list-item v-for="(caliber, index) in calibers" :caliber="caliber"></list-item>
  </ul>
</div>
</template>

<script>
import ListItem from './ListItem.vue';

export default {
  name: 'calibers-list',
  props: ['calibers'],
  components: {
    'list-item': ListItem
  }
}
</script>

<style lang="css" scoped>

ul {
  display:inline-block;
  margin: 0;
  justify-content: flex-start;
  align-items: center;
  padding:10px;
  height: 20%;
  position:relative;
}

</style>
