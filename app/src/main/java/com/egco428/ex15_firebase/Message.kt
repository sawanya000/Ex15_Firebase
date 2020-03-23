package com.egco428.ex15_firebase

class Message(val id: String, val message: String, val rating: Float) {
    constructor():this("","",0f)
}