package com.edaakyil.kotlin.app.demo.company.employee

abstract class Employee(var citizenId: String = "", var name: String = "", var address: String = "") {
    abstract fun calculateInsurancePayment(): Double
}