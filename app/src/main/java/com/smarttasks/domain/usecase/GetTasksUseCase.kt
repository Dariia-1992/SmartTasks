package com.smarttasks.domain.usecase

import com.smarttasks.domain.model.Task
import com.smarttasks.domain.repository.TaskRepository
import io.reactivex.rxjava3.core.Flowable
import javax.inject.Inject

class GetTasksUseCase @Inject constructor(
    private val repository: TaskRepository
){
    fun execute(): Flowable<List<Task>>{
        return repository.getTasks()
    }
}