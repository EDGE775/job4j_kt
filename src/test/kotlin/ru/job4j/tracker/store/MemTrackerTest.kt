package ru.job4j.tracker.store

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

import ru.job4j.tracker.model.Item

internal class MemTrackerTest {

    private fun initStore(): Store = MemTracker()

    @Test
    fun add_whenAddNewItem_thenTrackerHasSameItem() {
        val store = initStore()
        val item = Item(name = "test1")

        store.add(item)

        val result = store.findById(item.id)
        assertThat(result?.name).isEqualTo(item.name)
    }

    @Test
    fun findAll_whenPutSeveralItems_thenFindTheseItems() {
        val store = initStore()
        val item1 = Item(name = "test1")
        val item2 = Item(name = "test2")
        val item3 = Item(name = "test3")
        store.add(item1)
        store.add(item2)
        store.add(item3)

        val result = store.findAll()

        assertThat(result).containsExactlyInAnyOrderElementsOf(arrayListOf(item1, item2, item3))
    }

    @Test
    fun findByName_whenFindByName_thenReturnAllWithThisName() {
        val store = initStore()
        val item1 = Item(name = "test2")
        val item2 = Item(name = "test2")
        store.add(item1)
        store.add(item2)

        val result = store.findByName("test2")

        assertThat(result).containsExactlyInAnyOrderElementsOf(arrayListOf(item1, item2))
    }

    @Test
    fun replace_whenReplaceItem_thenItemWasReplase() {
        val store = initStore()
        val item1 = Item(name = "test1")
        val item2 = Item(name = "test2")
        store.add(item1)
        store.add(item2)

        val item3 = Item(name = "test3")
        store.replace(item1.id, item3)

        assertThat(store.findAll())
            .hasSize(2)
            .doesNotContain(item1)
            .contains(item3)
    }

    @Test
    fun delete_whenDeleteSingleItem_thenStoreIsEmpty() {
        val store = initStore()
        val item1 = Item(name = "test1")
        store.add(item1)

        store.delete(item1.id)

        assertThat(store.findAll()).isEmpty()
    }

    @Test
    fun findById_whenFindByItemId_thenReturnThisItem() {
        val store = initStore()
        val item1 = Item(name = "test1")
        store.add(item1)

        assertThat(store.findById(item1.id)).isEqualTo(item1)
    }
}