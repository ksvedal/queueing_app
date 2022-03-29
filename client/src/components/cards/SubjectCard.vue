<template>
  <div class="subjectCard">
      <div class="display"> {{ subject.subject }} </div>
  </div>
</template>

<script>
export default {
    name: "SubjectCard",
    props: {
        subject: {
            type: Object,
            required: true
        }
    }
}
</script>