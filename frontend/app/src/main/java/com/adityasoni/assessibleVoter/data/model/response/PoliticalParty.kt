package com.adityasoni.assessibleVoter.data.model.response

data class PoliticalParty(
    val id: Int,
    val party_name: String,
    val party_code: String,
    val leader: String
)