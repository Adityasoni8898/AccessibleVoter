package com.adityasoni.assessibleVoter.data.api

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import com.adityasoni.assessibleVoter.data.model.request.GenerationResponse
import com.adityasoni.assessibleVoter.data.model.request.SubmitVoteBody
import com.adityasoni.assessibleVoter.data.model.request.UserData
import com.adityasoni.assessibleVoter.data.model.response.PoliticalParty

interface ApiService {
    @POST("/save-user-data")
    suspend fun postUserData(
        @Body
        userData: UserData
    ): GenerationResponse

    @GET("/political-parties")
    suspend fun getPoliticalParty(): List<PoliticalParty>

    @POST("/votes")
    suspend fun submitVote(
        @Body
        submitVoteBody: SubmitVoteBody
    )
}