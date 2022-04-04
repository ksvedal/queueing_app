import {mount} from '@/vue/test-utils'
import UserCard from '@/components/cards/UserCard'

describe('UserCard', () => {
  it('renders UserCard data successfully', () => {
    mount(UserCard)
  })
})
