package com.rifqi.mysimplecleanarchitecture.data

import com.rifqi.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}