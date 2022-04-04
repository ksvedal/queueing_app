import {mount} from '@/vue/test-utils.js'
import SubjectCard from '@/components/cards/SubjectCard.vue'

describe('SubjectCard', () => {
  it('renders SubjectCard data successfully', () => {
    const selectedSubject = {
        id: 1,
        subject: 'rowing',
        assignments: "2",
        active: 1,
    }

    mount(SubjectCard, {
        props: {
            selectedSubject
        }
    })
  })
})
