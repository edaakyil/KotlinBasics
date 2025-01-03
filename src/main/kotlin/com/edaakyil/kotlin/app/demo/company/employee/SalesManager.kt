package com.edaakyil.kotlin.app.demo.company.employee

class SalesManager(var saleExtra: Double = 0.0) : Manager() {
    override fun calculateInsurancePayment() = super.calculateInsurancePayment() + saleExtra
}