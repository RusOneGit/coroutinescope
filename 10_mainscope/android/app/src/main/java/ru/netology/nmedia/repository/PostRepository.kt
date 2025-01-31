package ru.netology.nmedia.repository

import kotlinx.coroutines.flow.Flow
import ru.netology.nmedia.dto.Post
import ru.netology.nmedia.model.PhotoModel

interface PostRepository {
    val data: Flow<List<Post>>
    fun getNewerCount(newerId: Long): Flow<Int>
    suspend fun getAll()
    suspend fun save(post: Post)
    suspend fun saveWithAttach(post: Post, photoModel: PhotoModel)
    suspend fun removeById(id: Long)
    suspend fun likeById(id: Long)
    suspend fun viewOn()
}
