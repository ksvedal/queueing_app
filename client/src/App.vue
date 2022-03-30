<template>
  <div class="row">
    <div class="col-1"> <br> </div>
    <div class="col-3"> 
      <ProfileCard />
    </div>
  
    <div class="col-7">
      <router-link :to="{ name: 'HomePage' }"> 
        <button class="button full"> Home </button> 
      </router-link>   
      <br> <br>
      <router-view />
    </div>
    <div class="col-1"> 
      <br>
    </div>
  </div>
</template>

<script>
import ProfileCard from '@/components/cards/ProfileCard'


export default {
  components: {
        ProfileCard
    }, 
}
</script>

<style>
@import url('http://fonts.cdnfonts.com/css/american-typewriter');

:root {
  /* Color and styling variables */
  --primary-color: #212121; 
  --secondary-color: #1a1a1a;
  --tertiary-color: #101010;
  --text-color: #ededed;
  --text-color-invert: #242424;
  --pop-color: #eedeb1;
  --pop-color2: #0e0e0e;


  /* Border Styling */
  --border-radius: 4px;
  --border: 1.5px solid;

  /* Content Space Styling */
  --small-margin: 3px;
  --big-margin: 50px;
  --space: 6px;


}

.dark-mode {
  --primary-color: #e2e2e2;
  --secondary-color: #eeeeee;
  --tertiary-color: #cacaca;
  --text-color: #333333;
  --pop-color: #5c9aaa;
  --pop-color2: #ab70bd;
}

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: var(--text-color);
}

* {
  box-sizing: border-box;
  margin: 0;
}

h1 {
  color: var(--text-color);
  text-align: center;
  padding-left: var(--space);
  font-size: 30px;
}

.centeredText {
  text-align: center;
}

/* Mobile: */
  [class*="col-"] {
    width: 100%;
  }

/* Full width: */
@media only screen and (min-width: 600px) {
  .col-1 { width: 8.33%; }
  .col-2 { width: 16.66%; }
  .col-3 { width: 25%; }
  .col-4 { width: 33.33%; }
  .col-5 { width: 41.66%; }
  .col-6 { width: 50%; }
  .col-7 { width: 58.33%; }
  .col-8 { width: 66.66%; }
  .col-9 { width: 75%; }
  .col-10 { width: 83.33%; }
  .col-11 { width: 91.66%; }
  .col-12 { width: 100%; }
}

[class*="col-"] {
  float: left;
  padding-left: var(--space);
}

.row {
  margin-top: var(--big-margin);
  padding-right: var(--space);
}

.row::after {
  content: "";
  clear: both;
  display: table;
}

body { 
  margin: 0;
  padding-bottom: 1%;
  background-color: var(--primary-color); 
  color: var(--text-color); 
  font-family: Avenir, Helvetica, Arial, sans-serif;
  font-size: 11px; 
}

/* BUTTONS */

.button {
  padding: 12px 20px 12px 20px;
  outline: 0;
  cursor: pointer;
  margin: var(--small-margin);
  border: var(--border) var(--tertiary-color);
  border-radius: var(--border-radius);
  color: var(--text-color);
  background-color: var(--secondary-color);
  user-select: none;
  -webkit-appearance: none;
  -webkit-user-select: none;
  touch-action: manipulation;
  text-decoration: none;
  object-fit: contain;
}

.button:hover {
  color: var(--text-color-invert);
  background-color: var(--pop-color);
  border: var(--border) var(--pop-color2);
  border-radius: var(--border-radius);
}

.full {
  width: 100%;
}

/* Additional styling */

.display {
    font-size: 15px;
    grid-column: 1/4;
    padding: 12px 20px 12px 20px;
    margin: var(--small-margin);
    background-color: var(--secondary-color);
    border: var(--border) var(--tertiary-color);
    border-radius: var(--border-radius);
}

.right {
  float: right;
  padding-bottom: 0px;
}

input[type], select {
  width: 100%;
  padding: 12px 20px 12px 20px;
  outline: 0;
  margin-bottom: var(--space);
  background-color: var(--secondary-color);
  color: var(--text-color);
  border-radius: var(--border-radius);
  border: var(--border) var(--tertiary-color);
  box-sizing: border-box;
  word-wrap: break-word;
}

/* IMAGE */
.fill {
    display: flex;
    justify-content: center;
    align-items: center;
    overflow: hidden
}
.fill img {
    width: 100%;
    object-fit: contain;
}

</style>
