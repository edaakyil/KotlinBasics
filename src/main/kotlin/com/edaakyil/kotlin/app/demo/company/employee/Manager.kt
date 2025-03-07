package com.edaakyil.kotlin.app.demo.company.employee

open class Manager(var salary: Double = 0.0, var department: String = "") : Employee() {
    override fun calculateInsurancePayment() = salary * 30
}