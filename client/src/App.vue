<template>
  <div class="row">
    <div class="col-1"> <br> </div>
    <div class="col-3"> 
      <ProfileCard /> 

      <router-link :to="{ name: 'HomePage' }"> 
        <button class="button full"> Home </button> 
      </router-link>  
      <router-link to="/login">
        <button class="button full"> Log out </button> 
      </router-link>
      <br> <br>
    </div>
    <div class="col-7">
      <router-view />
    </div>
    <div class="col-1"> 
      <br>
    </div>
  </div>
</template>

<script>
import ProfileCard from '@/components/cards/ProfileCard'
import store from '@/store/index.js'

export default {
  components: {
        ProfileCard
  }, 
  data() {
    return {
      administratorStatus: false,
    }
  },
  created() {
    this.administratorStatus = store.getters.GET_ADMINISTRATORSTATUS
  }
}
</script>

<style>
@import url('http://fonts.cdnfonts.com/css/american-typewriter');

:root {
  /* Color and styling variables */
  --primary-color: #1d1d1d; 
  --secondary-color: #161616;
  --tertiary-color: #101010;
  --text-color: #ededed;
  --text-color-invert: #242424;
  --pop-color: #eedeb1;
  --pop-color2: #0e0e0e;

  /* Border Styling */
  --border-radius: 4px;
  --border: 0px solid;

  /* Content Space Styling */
  --small-margin: 2px;
  --big-margin: 20px;
  --space: 10px;
}

.dark-mode {
  --primary-color: #e2e2e2;
  --secondary-color: #eeeeee;
  --tertiary-color: #f5f5f5;
  --text-color: #333333;
  --pop-color: #ffffff;
  --pop-color2: #fafafa;
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
  font-size: 30px;
}

h3 {
  text-align: center;
}

.centeredText {
  text-align: center;
}

.center {
  text-align: center;
}

.full {
  width: 100%;
  object-fit: contain;
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
  font-size: 14px; 
}

/* BUTTONS */

.button {
  padding: 12px 20px 12px 20px;
  outline: 0;
  margin-top: var(--small-margin);
  margin-bottom: var(--small-margin);
  border: var(--border) var(--tertiary-color);
  border-radius: var(--border-radius);
  color: var(--text-color);
  background-color: var(--secondary-color);
  user-select: none;
  -webkit-appearance: none;
  -webkit-user-select: none;
  touch-action: manipulation;
  text-decoration: none;
}

.button.black {
  background-color: var(--tertiary-color) ;
}

.button.small {
  padding: 6px 10px 6px 10px;
}

button:disabled,
button[disabled]{
  background-color: var(--primary-color);
}

button:disabled:hover,
button[disabled]:hover{
  color: var(--text-color);
  background-color: var(--primary-color);
  cursor: initial;
}

.button:hover {
  cursor: pointer;
  color: var(--text-color-invert);
  background-color: var(--pop-color);
  border: var(--border) var(--pop-color2);
  border-radius: var(--border-radius);
}

/* Additional styling */

.display {
    font-size: 20px;
    padding: 12px 20px 12px 20px;
    margin-top: var(--space);  
    margin-bottom: var(--space);
    background-color: var(--secondary-color);
    border: var(--border) var(--tertiary-color);
    border-radius: var(--border-radius);
}

input[type], select {
  width: 100%;
  padding: 12px 20px 12px 20px;
  outline: 0;
  margin-bottom: var(--small-margin);
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
    height: auto;
    object-fit: contain;
    border-radius: 100%;
    border: var(--border) var(--tertiary-color);
  }

</style>
