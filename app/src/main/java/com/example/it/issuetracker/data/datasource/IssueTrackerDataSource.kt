package com.example.it.issuetracker.data.datasource

import com.example.it.issuetracker.domain.model.Issue

interface IssueTrackerDataSource {

    suspend fun getIssue(): Result<List<Issue>>
}