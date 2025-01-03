package com.edaakyil.kotlin.app.demo.company.hr

import com.edaakyil.kotlin.app.demo.company.employee.Employee

class HumanResources {
    fun payInsurance(employee: Employee) {
        println("Citizen Id: ${employee.citizenId}")
        println("Name: ${employee.name}")
        println("Address: ${employee.address}")
        println("Insurance Payment: ${employee.calculateInsurancePayment()}")
    }
}