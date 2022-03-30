import { createStore } from "vuex";

export default createStore({
  state: {
    selectedSubject: null,
  },
  mutations: {
    SET_SELECTEDSUBJECT(subject) {
      this.state.selectedSubject = subject;
    },
  },
  actions: {
    setSelectedSubject(subject) {
        this.state.selectedSubject = subject;
    },
    getSelectedSubject() {
        return this.state.selectedSubject;
    }
  }, 
})