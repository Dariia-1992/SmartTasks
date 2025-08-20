package com.smarttasks.domain.repository

import com.smarttasks.domain.model.Task
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Flowable

interface TaskRepository {
    fun getTasks(): Flowable<List<Task>>
    fun addTask(task: Task): Completable
    fun deleteTask(id: Long): Completable
}