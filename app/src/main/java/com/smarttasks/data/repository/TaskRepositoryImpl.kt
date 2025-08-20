package com.smarttasks.data.repository

import com.smarttasks.data.local.db.TaskDao
import com.smarttasks.data.remote.api.TaskApi
import com.smarttasks.domain.model.Task
import com.smarttasks.domain.repository.TaskRepository
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Flowable
import javax.inject.Inject

class TaskRepositoryImpl @Inject constructor(
    private val taskDao: TaskDao,
    private val api: TaskApi
) : TaskRepository {

    override fun getTasks(): Flowable<List<Task>> {
        TODO("Not yet implemented")
    }

    override fun addTask(task: Task): Completable {
        TODO("Not yet implemented")
    }

    override fun deleteTask(id: Long): Completable {
        TODO("Not yet implemented")
    }
}