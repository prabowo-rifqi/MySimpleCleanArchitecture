package com.rifqi.mysimplecleanarchitecture.di

import com.rifqi.mysimplecleanarchitecture.data.IMessageDataSource
import com.rifqi.mysimplecleanarchitecture.data.MessageDataSource
import com.rifqi.mysimplecleanarchitecture.data.MessageRepository
import com.rifqi.mysimplecleanarchitecture.domain.IMessageRepository
import com.rifqi.mysimplecleanarchitecture.domain.MessageInteractor
import com.rifqi.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}